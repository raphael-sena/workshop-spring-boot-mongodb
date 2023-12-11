package com.raphaelsena.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raphaelsena.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
 
}
