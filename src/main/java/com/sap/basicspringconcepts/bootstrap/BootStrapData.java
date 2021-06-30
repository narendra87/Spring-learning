package com.sap.basicspringconcepts.bootstrap;

import com.sap.basicspringconcepts.domain.Author;
import com.sap.basicspringconcepts.domain.Book;
import com.sap.basicspringconcepts.domain.Publisher;
import com.sap.basicspringconcepts.repositories.AuthorRepository;
import com.sap.basicspringconcepts.repositories.BookRepository;
import com.sap.basicspringconcepts.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("test1","abc1");
        Book book1 = new Book("book1","123456789");
        Publisher publisher1 = new Publisher("Krishna","Koilsa Azamgarh");
        publisherRepository.save(publisher1);
        publisher1.getBooks().add(book1);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(publisher1);
        authorRepository.save(author1);
        bookRepository.save(book1);
        Author author2 = new Author("test2","abc2");
        Book book2 = new Book("book2","1234345678");
     publisher1.getBooks().add(book2);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(publisher1);
        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher1);
        System.out.println("Boot strap started");
        System.out.println("No of books:"+ bookRepository.count());
        System.out.println("No of publisher:"+ publisherRepository.count());

    }
}
