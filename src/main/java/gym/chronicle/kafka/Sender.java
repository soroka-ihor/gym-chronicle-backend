package gym.chronicle.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class Sender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "spring-boot-topic";

    public void send(String message) {
        String json =
                """
                {"id":"1"}
                """;
        kafkaTemplate.send(kafkaTopic, json);
    }

}
