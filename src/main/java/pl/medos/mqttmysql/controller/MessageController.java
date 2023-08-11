package pl.medos.mqttmysql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.medos.mqttmysql.model.MqttMessage;
import pl.medos.mqttmysql.service.MqttMessageService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {
    @Autowired
    private final MqttMessageService mqttMessageService;

    public MessageController(MqttMessageService mqttMessageService) {
        this.mqttMessageService = mqttMessageService;
    }

    @GetMapping("/list")
    public List<MqttMessage> getAllMessages() {

        return mqttMessageService.getAllMessages();

    }
}
