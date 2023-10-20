package com.example.boardMongo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

//public interface BoardRepository extends MongoRepository<Board, String> {

//}


public interface BoardRepository extends JpaRepository<Board, String> {

}