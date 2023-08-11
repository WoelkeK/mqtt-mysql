package pl.medos.mqttmysql.service;

import pl.medos.mqttmysql.model.MqttMessage;

public interface MqttMessageService {

    void saveMessage(MqttMessage message);
}
