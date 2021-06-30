package com.sap.basicspringconcepts.repositories;

import com.sap.basicspringconcepts.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
