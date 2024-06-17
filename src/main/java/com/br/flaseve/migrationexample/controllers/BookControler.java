package com.br.flaseve.migrationexample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.flaseve.migrationexample.datas.vo.BookVO;
import com.br.flaseve.migrationexample.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/app/book")
public class BookControler {

    @Autowired
    BookService service;
    

    @GetMapping(value="/{id}", produces = "application/json")
    public BookVO getMethodName(@PathVariable(value="id") Long id) {
        BookVO vo = service.findById(id);
        return vo;
    }
    
}
