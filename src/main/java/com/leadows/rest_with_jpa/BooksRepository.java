package com.leadows.rest_with_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface BooksRepository extends JpaRepository<Books, Long> {

}