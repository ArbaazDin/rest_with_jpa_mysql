package com.leadows.rest_with_jpa;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  // ---@Service means this class implements some sort of business logic + is Spring boot @Component
@Transactional
public class BooksService {
    
    @Autowired
    private BooksRepository repository;
     
    public List<Books> listAll() {
        return repository.findAll();
    }
     
    public void save(Books book) {
        repository.save(book);
    }
     
    public Books get(Long id) {
        return repository.findById(id).get();
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

