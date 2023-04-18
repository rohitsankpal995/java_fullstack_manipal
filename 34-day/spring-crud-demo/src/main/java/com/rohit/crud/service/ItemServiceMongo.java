package com.rohit.crud.service;

import java.util.ArrayList;
import java.util.List;

import com.rohit.crud.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rohit.crud.domain.Item;

@Service
public class ItemServiceMongo implements ItemService {
    @Autowired
    private ItemRepository repository;

    @Override
    public Integer create(Item item) {
        repository.save(item);
        return 0;
    }

    @Override
    public List<Item> readAll() {
        return repository.findAll();
    }

    @Override
    public Integer update(Item item) {
        repository.save(item);
        return 0;
    }

    @Override
    public Integer delete(Long id) {
        repository.deleteById(id);
        return 0;
    }
}
