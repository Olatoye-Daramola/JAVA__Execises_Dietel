package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Sender;

import java.util.*;

public class SenderRepositoryImpl implements SenderRepository {
    Map<String, Sender> database = new HashMap<String, Sender>();

    @Override
    public Sender save(Sender sender) {
        database.put(sender.getEmailAddress(), sender);
        return sender;
    }

    @Override
    public Optional<Sender> findSenderByEmail(String senderEmail) {
        if(database.containsKey(senderEmail)) return Optional.of(database.get(senderEmail));
        return Optional.empty();
    }

    @Override
    public void deleteBySenderEmail(String senderEmail) {
        database.remove(senderEmail);
    }

    @Override
    public void deleteBySender(Sender sender) {
        deleteBySenderEmail(sender.getEmailAddress());
    }

    @Override
    public void deleteAll() {
        database.clear();
    }

    @Override
    public List<Sender> findAll() {
        List<Sender> senderList = new ArrayList<>();
        Set<String> keys = database.keySet();
        for (String key : keys) {
            senderList.add(database.get(key));
        }
        return senderList;
    }
}
