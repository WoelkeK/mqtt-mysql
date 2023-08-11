package pl.medos.mqttmysql.service.MqttMessageServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.medos.mqttmysql.model.MqttMessage;
import pl.medos.mqttmysql.repository.MqttMessageRepository;
import pl.medos.mqttmysql.repository.entity.MqttMessageEntity;
import pl.medos.mqttmysql.service.MqttMessageService;
import pl.medos.mqttmysql.service.mapper.Mapper;

import java.util.List;
import java.util.logging.Logger;

@Service
public class MqttMessageServiceImpl implements MqttMessageService {
    private static final Logger LOGGER = Logger.getLogger(MqttMessageServiceImpl.class.getName());
    @Autowired
    private final MqttMessageRepository mqttMessageRepository;
    @Autowired
    private final Mapper mapper;

    public MqttMessageServiceImpl(MqttMessageRepository mqttMessageRepository, Mapper mapper) {
        this.mqttMessageRepository = mqttMessageRepository;
        this.mapper = mapper;
    }

    @Override
    public void saveMessage(MqttMessage message) {
        LOGGER.info("saveMessage()");
        MqttMessageEntity mqttMessageEntity = mapper.convertToType(message, MqttMessageEntity.class);
        mqttMessageRepository.save(mqttMessageEntity);
    }

    @Override
    public List<MqttMessage> getAllMessages() {
        LOGGER.info("getAllMessages()");
        List<MqttMessageEntity> messageEntities = mqttMessageRepository.findAll();
        return messageEntities.stream()
                .map(e -> mapper.convertToType(e, MqttMessage.class)).toList();
    }
}
