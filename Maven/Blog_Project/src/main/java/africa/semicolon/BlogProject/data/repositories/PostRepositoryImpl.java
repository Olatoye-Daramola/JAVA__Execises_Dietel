package africa.semicolon.BlogProject.data.repositories;

import africa.semicolon.BlogProject.data.models.Author;
import africa.semicolon.BlogProject.data.models.Post;

import java.util.*;

public class PostRepositoryImpl implements PostRepository{
    Map<Integer, Post> database = new HashMap<>();

    @Override
    public Post save(Post post) {
        Integer postId = null;
        if (post.getPostId() == null) {
            postId = database.size() + 1;
            post.setPostId(postId);
        }
        postId = post.getPostId();
        database.put(postId, post);
        return database.get(postId);
    }

    @Override
    public Post updatePost(Post post) {
        return null;
    }

    @Override
    public Post findPostByHeadline(String headline) {
        return null;
    }

    @Override
    public Post findPostByAuthor(Author author) {
        return null;
    }

    @Override
    public List<Post> findAllPosts() {
        List<Post> allPosts = new ArrayList<>();
        Set<Integer> keys = database.keySet();
        for(Integer key : keys) {
            allPosts.add(database.get(key));
        }
        return allPosts;
    }

    @Override
    public void deletePostByAuthorUserName(String userName) {

    }

    @Override
    public void deletePost(Post post) {

    }

    @Override
    public void deleteAll() {

    }
}
