package gym.chronicle.kafka;

import lombok.Data;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @KafkaListener(topics = "spring-boot-topic", groupId = "asd")
    public void consume(String message) {
        GsonJsonParser parser = new GsonJsonParser();

        System.out.println("message = " + message);
    }

    @Data
    private static class Dto {
        private Long id;
    }
}
