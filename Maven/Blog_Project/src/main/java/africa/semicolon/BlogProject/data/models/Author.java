package africa.semicolon.BlogProject.data.models;

import java.util.List;

public class Author {
    private String username;
    private String userEmail;
    private String authorName;
    List<Post> posts;
    List<Comment> comments;
}
