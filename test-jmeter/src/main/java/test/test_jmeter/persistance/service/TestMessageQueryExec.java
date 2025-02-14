package test.test_jmeter.persistance.service;

import test.test_jmeter.persistance.model.entities.TestMessage;

public interface TestMessageQueryExec {
    TestMessage addMessage(TestMessage testMessage);
}
