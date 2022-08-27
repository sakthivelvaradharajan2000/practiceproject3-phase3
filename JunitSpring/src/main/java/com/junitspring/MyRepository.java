package com.junitspring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface MyRepository extends CrudRepository<users, Integer>{

}
