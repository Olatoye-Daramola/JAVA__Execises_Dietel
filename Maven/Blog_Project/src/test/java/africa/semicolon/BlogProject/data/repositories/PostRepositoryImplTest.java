package africa.semicolon.BlogProject.data.repositories;

import africa.semicolon.BlogProject.data.models.Author;
import africa.semicolon.BlogProject.data.models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {
    PostRepository postRepository;

    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Author author = new Author();

        Post post = new Post();
        post.setAuthor(author);
        post.setHeadline("Saving effects of clean code");
        post.setBody("Taciti primis ante ac tellus odio aptent vulputate pretium tincidunt hac habitant");

        Post savedPost = postRepository.save(post);
        assertEquals(1, savedPost.getPostId());
        assertEquals(1, postRepository.findAllPosts().size());
    }

    @Test
    void updatePost() {
    }

    @Test
    void findPostByHeadline() {
    }

    @Test
    void findPostByAuthor() {
    }

    @Test
    void findAllPosts() {
    }

    @Test
    void deletePostByAuthorUserName() {
    }

    @Test
    void deletePost() {
    }

    @Test
    void deleteAll() {
    }
}