package com.br.flaseve.migrationexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.flaseve.migrationexample.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
