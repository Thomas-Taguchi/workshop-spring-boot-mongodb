package com.thomastaguchi.workshopmongo.repoditory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thomastaguchi.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}