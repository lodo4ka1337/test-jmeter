package test.test_jmeter.persistance.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "test")
public class TestMessage {

    @Id
    @Column(name = "msgid", nullable = false)
    private UUID msgId;

    @Column(name = "timerq", nullable = false)
    private Timestamp timerq;

    @Column(name = "methodrq", nullable = false)
    private String methodrq;

    @Column(name = "urirq", nullable = false)
    private String urirq;

    public TestMessage() {

    }

    public TestMessage(UUID msgId, Timestamp timerq, String methodrq, String urirq) {
        this.msgId = msgId;
        this.timerq = timerq;
        this.methodrq = methodrq;
        this.urirq = urirq;
    }

    public UUID getMsgId() {
        return msgId;
    }

    public void setMsgId(UUID msgId) {
        this.msgId = msgId;
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
}
