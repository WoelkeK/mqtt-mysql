package pl.medos.mqttmysql.model;

import lombok.*;


public class MqttMessage {

    private Long id;
    private String topic;
    private String content;

    public MqttMessage() {
    }

    public MqttMessage(Long id, String topic, String content) {
        this.id = id;
        this.topic = topic;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MqttMessage{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
