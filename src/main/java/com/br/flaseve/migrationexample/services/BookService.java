package com.br.flaseve.migrationexample.services;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.flaseve.migrationexample.datas.vo.BookVO;
import com.br.flaseve.migrationexample.exceptions.ResourceNotFoundException;
import com.br.flaseve.migrationexample.mapper.Mapper;
import com.br.flaseve.migrationexample.models.Book;
import com.br.flaseve.migrationexample.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    Logger logger = Logger.getLogger(BookService.class.getName());
    
    public BookVO findById(Long id){
        
        logger.info("Finding a Book");

        Book entity = repository.findById(id).
            orElseThrow(() -> new ResourceNotFoundException("No records not found fotr this ID")); 

        BookVO vo = Mapper.parseObject(entity, BookVO.class); 

        return vo; 
    }
}
