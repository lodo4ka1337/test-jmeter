package test.test_jmeter.persistance.model.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.UUID;

public class TestMessageJsonString {

    @JsonProperty
    private UUID msgid;
    @JsonProperty
    private Timestamp timerq;
    @JsonProperty
    private String methodrq;
    @JsonProperty
    private String urirq;

    public UUID getMsgid() {
        return msgid;
    }

    public void setMsgid(UUID msgid) {
        this.msgid = msgid;
    }

    public Timestamp getTimerq() {
        return timerq;
    }

    public void setTimerq(Timestamp timerq) {
        this.timerq = timerq;
    }

    public String getMethodrq() {
        return methodrq;
    }

    public void setMethodrq(String methodrq) {
        this.methodrq = methodrq;
    }

    public String getUrirq() {
        return urirq;
    }

    public void setUrirq(String urirq) {
        this.urirq = urirq;
    }

    @Override
    public String toString() {
        return "TestMessageJsonString{" +
                "msgid=" + msgid +
                ", timerq=" + timerq +
                ", methodrq='" + methodrq + '\'' +
                ", urirq='" + urirq + '\'' +
                '}';
    }

    public TestMessageJsonString() {
    }
}
