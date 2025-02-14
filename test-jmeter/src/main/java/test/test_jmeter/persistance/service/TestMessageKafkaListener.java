package test.test_jmeter.persistance.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.kafka.annotation.KafkaListener;

public interface TestMessageKafkaListener {

    public void listenGroupTestMessage(String message) throws JsonProcessingException;
}
