package africa.semicolon.BlogProject.data.repositories;

import africa.semicolon.BlogProject.data.models.Author;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorRepositoryImplTest {
    AuthorRepository authorRepository;

    @BeforeEach
    void setUp() {
        authorRepository = new AuthorRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveNewAuthor() {
        Author author = new Author();
        author.setUserName("olatoye");
        author.setUserEmail("toye@email.com");
        author.setAuthorName("Olatoye David");

        Author savedAuthor = authorRepository.save(author);
        assertEquals(savedAuthor, author);
        assertEquals(1, authorRepository.findAllAuthors().size());
    }

    public Author createAuthorHelper() {
        Author author = new Author();
        author.setUserName("olatoye");
        author.setUserEmail("toye@email.com");
        author.setAuthorName("Olatoye David");

        return author;
    }

    @Test
    void findAuthorByUserName() {
        Author author = authorRepository.save(createAuthorHelper());
        assertEquals(author.getUserName(), authorRepository.findAuthorByUserName(author.getUserName()).getUserName());
    }

    @Test
    void findAuthor() {
        Author author = authorRepository.save(createAuthorHelper());
        assertEquals(author.getAuthorName(), authorRepository.findAuthor(author).getAuthorName());
    }

    @Test
    void findAuthorByPostHeadline() {
    }

    @Test
    void findAllAuthors() {
        Author firstAuthor = new Author();
        firstAuthor.setUserName("olatoye");
        firstAuthor.setUserEmail("toye@email.com");
        firstAuthor.setAuthorName("Olatoye David");
        authorRepository.save(firstAuthor);

        Author secondAuthor = new Author();
        secondAuthor.setUserName("david");
        secondAuthor.setUserEmail("toye_david@email.com");
        secondAuthor.setAuthorName("David Olatoye");
        authorRepository.save(secondAuthor);

        assertEquals(2, authorRepository.findAllAuthors().size());
    }

    @Test
    void deleteAuthorByUserName() {
        Author author = authorRepository.save(createAuthorHelper());
        assertEquals(1, authorRepository.findAllAuthors().size());

        authorRepository.deleteAuthorByUserName(author.getUserName());
        assertEquals(0, authorRepository.findAllAuthors().size());

    }

    @Test
    void deleteAuthor() {
        Author firstAuthor = new Author();
        firstAuthor.setUserName("olatoye");
        firstAuthor.setUserEmail("toye@email.com");
        firstAuthor.setAuthorName("Olatoye David");
        authorRepository.save(firstAuthor);

        Author secondAuthor = new Author();
        secondAuthor.setUserName("david");
        secondAuthor.setUserEmail("toye_david@email.com");
        secondAuthor.setAuthorName("David Olatoye");
        authorRepository.save(secondAuthor);

        assertEquals(2, authorRepository.findAllAuthors().size());

        authorRepository.deleteAuthor(secondAuthor);
        assertEquals(1, authorRepository.findAllAuthors().size());
    }

    @Test
    void deleteAll() {
        authorRepository.save(createAuthorHelper());
        assertEquals(1, authorRepository.findAllAuthors().size());

        authorRepository.deleteAll();
        assertEquals(0, authorRepository.findAllAuthors().size());
    }
}