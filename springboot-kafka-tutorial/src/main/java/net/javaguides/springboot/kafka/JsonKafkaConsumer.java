package net.javaguides.springboot.kafka;

import lombok.extern.log4j.Log4j2;
import net.javaguides.springboot.payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class JsonKafkaConsumer {
    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.group-id}")
    public void consumeMessage(User user) {
        log.info("JSON message received: {}", user.toString());
    }

}
