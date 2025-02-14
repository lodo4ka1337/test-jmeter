package test.test_jmeter.persistance.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import test.test_jmeter.persistance.model.entities.TestMessage;
import test.test_jmeter.persistance.model.mappers.TestMessageMapper;
import test.test_jmeter.persistance.model.utils.TestMessageJsonString;
import test.test_jmeter.persistance.repository.TestMessageRepository;
import test.test_jmeter.persistance.service.TestMessageKafkaListener;
import test.test_jmeter.persistance.service.TestMessageQueryExec;

@Service
public class TestMessageQueryExecImpl implements TestMessageKafkaListener, TestMessageQueryExec {
    private final TestMessageRepository testMessageRepository;
    private final TestMessageMapper testMessageMapper;

    @Autowired
    public TestMessageQueryExecImpl(TestMessageRepository testMessageRepository, TestMessageMapper testMessageMapper) {
        this.testMessageRepository = testMessageRepository;
        this.testMessageMapper = testMessageMapper;
    }

    @Override
    public TestMessage addMessage(TestMessage testMessage) {
        testMessageRepository.save(testMessage);
        return testMessage;
    }

    @Override
    @KafkaListener(topics = "test_topic", groupId = "test_group")
    public void listenGroupTestMessage(String message) throws JsonProcessingException {
        System.out.println("Received Message in group test_group: " + message);

        ObjectMapper objectMapper = new ObjectMapper();
        TestMessageJsonString testMessageJsonString = objectMapper.readValue(message, TestMessageJsonString.class);

        TestMessage testMessage = testMessageMapper.apply(testMessageJsonString);

        testMessageRepository.save(testMessage);
    }

}
