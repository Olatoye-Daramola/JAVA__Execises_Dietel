package africa.semicolon.BlogProject.data.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.time.format.DateTimeFormatter.ofPattern;

public class Comment {
    private Author author;
    private String body;
    private LocalDateTime timeOfCreation = LocalDateTime.now();
    private List<Comment> comments;
}
