package africa.semicolon.cheetah.controllers;

import africa.semicolon.cheetah.data.models.Sender;
import africa.semicolon.cheetah.dtos.requests.RegisterSenderRequest;
import africa.semicolon.cheetah.dtos.responses.RegisterSenderResponse;
import africa.semicolon.cheetah.services.SenderService;
import africa.semicolon.cheetah.services.SenderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class SenderController {
    private final SenderService senderService = new SenderServiceImpl();

    @PostMapping("/api/v1/sender")
    public RegisterSenderResponse registerSender(@RequestBody RegisterSenderRequest registerSenderRequest) {
        return senderService.registerSenderResponse(registerSenderRequest);
    }

    @GetMapping("/api/v1/sender/{email}")
    public Sender getSenderByEmail(@PathVariable String enail) {
        return senderService.findSenderByEmail(enail);
    }
}
