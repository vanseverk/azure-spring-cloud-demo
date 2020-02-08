package be.faros.demos.azure.springcloudazure.dogservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    private final String dogMessage;

    public DogController(@Value("${dog.message:woof}") String dogMessage) {
        this.dogMessage = dogMessage;
    }

    @GetMapping("/talk")
    public String talk() {
        return String.format("The dog says %s", dogMessage);
    }
}
