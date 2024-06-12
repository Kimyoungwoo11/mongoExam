package com.example.mongo.dao;

import com.example.mongo.dto.ScoreDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
//1번 매개변수 - ScoreDTO는 Document와 매핑될 자바객체
//2번 매개변수 - 기본키타입
//인터페이스만 정의하면 spring과 spring data내부에서 ScoreRepository의 모든 메소드와 상속하는 인터페이스의
//모든 메소드를 구현한 구현체를 자동으로 만들어준다.
public interface ScoreRepository extends MongoRepository<ScoreDTO,String> {

}
