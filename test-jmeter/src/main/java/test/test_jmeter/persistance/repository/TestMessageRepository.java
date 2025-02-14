package test.test_jmeter.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.test_jmeter.persistance.model.entities.TestMessage;

import java.util.UUID;

@Repository
public interface TestMessageRepository extends JpaRepository<TestMessage, UUID> {

}
