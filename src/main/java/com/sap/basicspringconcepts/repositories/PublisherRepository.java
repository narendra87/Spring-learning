package com.sap.basicspringconcepts.repositories;

import com.sap.basicspringconcepts.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher,Long>{

}
