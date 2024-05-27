package gym.chronicle.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class SenderController {
    @Autowired
    Sender sender;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message) {
        sender.send(message);
        return "Message sent to the Kafka Topic quickstart_events Successfully";
    }
}
