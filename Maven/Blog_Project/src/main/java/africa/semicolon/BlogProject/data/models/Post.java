package africa.semicolon.BlogProject.data.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Post {
    private Author author;
    private String headline;
    private String body;
    private String timeOfCreation;
    private List<Comment> comments;

    public void setPostDateAndTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        timeOfCreation = dateTimeFormatter.format(currentDateAndTime);
    }
}
