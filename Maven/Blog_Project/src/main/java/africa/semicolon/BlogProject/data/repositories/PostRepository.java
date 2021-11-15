package africa.semicolon.BlogProject.data.repositories;


import africa.semicolon.BlogProject.data.models.Author;
import africa.semicolon.BlogProject.data.models.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    Post updatePost(Post post);
    Post findPostByHeadline(String headline);
    Post findPostByAuthor(Author author);
    //    TODO:
    List<Post> findAllPosts();
    void deletePostByAuthorUserName(String userName);
    void deletePost(Post post);
    void deleteAll();
}
