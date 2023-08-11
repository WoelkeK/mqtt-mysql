package pl.medos.mqttmysql.service.MqttMessageServiceImpl;

import org.springframework.stereotype.Service;
import pl.medos.mqttmysql.model.MqttMessage;
import pl.medos.mqttmysql.repository.MqttMessageRepository;
import pl.medos.mqttmysql.repository.entity.MqttMessageEntity;
import pl.medos.mqttmysql.service.MqttMessageService;
import pl.medos.mqttmysql.service.mapper.Mapper;

import java.util.logging.Logger;
@Service
public class MqttMessageServiceImpl implements MqttMessageService {
    private static final Logger LOGGER = Logger.getLogger(MqttMessageServiceImpl.class.getName());

    private final MqttMessageRepository mqttMessageRepository;

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
}
