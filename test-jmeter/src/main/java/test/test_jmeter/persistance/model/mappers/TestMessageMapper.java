package test.test_jmeter.persistance.model.mappers;

import org.springframework.stereotype.Service;
import test.test_jmeter.persistance.model.entities.TestMessage;
import test.test_jmeter.persistance.model.utils.TestMessageJsonString;

import java.util.function.Function;

@Service
public class TestMessageMapper implements Function<TestMessageJsonString, TestMessage> {

    @Override
    public TestMessage apply(TestMessageJsonString testMessageJsonString) {
        return new TestMessage(
                testMessageJsonString.getMsgid(),
                testMessageJsonString.getTimerq(),
                testMessageJsonString.getMethodrq(),
                testMessageJsonString.getUrirq()
        );
    }
}
