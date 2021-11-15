package africa.semicolon.BlogProject.data.repositories;

import africa.semicolon.BlogProject.data.models.Author;

import java.util.*;

public class AuthorRepositoryImpl implements AuthorRepository {
    private final Map<String, Author> database = new HashMap<>();

    @Override
    public Author save(Author author) {
        database.put(author.getUserName(), author);
        return database.get(author.getUserName());
    }

    @Override
    public Author findAuthorByUserName(String userName) {
        return database.get(userName);
    }

    @Override
    public Author findAuthor(Author author) {
        return findAuthorByUserName(author.getUserName());
    }

    @Override
    public Author findAuthorByPostHeadline(String postHeadline) {
        return null;
    }

    @Override
    public List<Author> findAllAuthors() {
        List<Author> all = new ArrayList<>();
        Set<String> keys = database.keySet();
        for (String key : keys) {
            all.add(database.get(key));
        }
        return all;
    }

    @Override
    public void deleteAuthorByUserName(String userName) {
        database.remove(userName);
    }

    @Override
    public void deleteAuthor(Author author) {
        deleteAuthorByUserName(author.getUserName());
    }

    @Override
    public void deleteAll() {
        database.clear();
    }
}
