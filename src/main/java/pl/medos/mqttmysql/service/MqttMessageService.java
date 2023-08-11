package pl.medos.mqttmysql.service;

import pl.medos.mqttmysql.model.MqttMessage;

import java.util.List;

public interface MqttMessageService {

    void saveMessage(MqttMessage message);

    List<MqttMessage> getAllMessages();
}
