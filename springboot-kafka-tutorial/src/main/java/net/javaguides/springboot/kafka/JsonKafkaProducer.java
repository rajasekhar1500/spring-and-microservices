package net.javaguides.springboot.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.javaguides.springboot.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class JsonKafkaProducer {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    @Value("${spring.kafka.topic-json.name}")
    private String jsonTopic;
    public void sendMessage(User data) {

        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, jsonTopic)
                .build();
        kafkaTemplate.send(message);
        log.info("Message sent: {}", message);
    }
}
