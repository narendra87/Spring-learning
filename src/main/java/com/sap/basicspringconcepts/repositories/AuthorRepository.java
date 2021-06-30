package com.sap.basicspringconcepts.repositories;

import com.sap.basicspringconcepts.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
