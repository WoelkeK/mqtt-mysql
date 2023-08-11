package pl.medos.mqttmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medos.mqttmysql.repository.entity.MqttMessageEntity;

public interface MqttMessageRepository extends JpaRepository<MqttMessageEntity, Long> {
}
