package com.daehun.springboot.service;

import com.daehun.springboot.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getBookList();
}
