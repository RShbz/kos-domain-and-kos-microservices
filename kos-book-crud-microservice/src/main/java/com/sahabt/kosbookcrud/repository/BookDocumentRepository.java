package com.sahabt.kosbookcrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sahabt.kosbookcrud.document.BookDocument;

public interface BookDocumentRepository extends MongoRepository<BookDocument,String>{

}
