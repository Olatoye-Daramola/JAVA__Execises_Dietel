package africa.semicolon.BlogProject.data.models;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private Author author;
    private String headline;
    private String body;
    private LocalDateTime timeOfCreation = LocalDateTime.now();
    private List<Comment> comments;
}
