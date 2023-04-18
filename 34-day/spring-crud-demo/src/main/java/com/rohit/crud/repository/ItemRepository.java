package com.rohit.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rohit.crud.domain.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {

}
