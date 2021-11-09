package africa.semicolon.BlogProject.data.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.time.format.DateTimeFormatter.ofPattern;

public class Comment {
    private Author author;
    private String body;
    private String timeOfCreation;
    private List<Comment> comments;

    public void setCommentDateAndTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        timeOfCreation = dateTimeFormatter.format(currentDateAndTime);
    }
}
