package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.data.models.Sender;
import africa.semicolon.cheetah.dtos.requests.RegisterSenderRequest;
import africa.semicolon.cheetah.dtos.responses.RegisterSenderResponse;

import java.util.Collection;
import java.util.List;

public interface SenderService {
    RegisterSenderResponse registerSenderResponse(RegisterSenderRequest senderRequest);

    List<Sender> getSenders();

    void deleteAllSenders();

    Sender findSenderByEmail(String enail);
}
