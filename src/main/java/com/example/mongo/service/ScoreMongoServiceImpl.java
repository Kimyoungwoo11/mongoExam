package com.example.mongo.service;

import com.example.mongo.dao.ScoreMongoDAO;
import com.example.mongo.dto.ScoreDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ScoreMongoServiceImpl implements ScoreMongoService{
    private final ScoreMongoDAO dao;

    @Override
    public ScoreDTO findById(String value) {
        return dao.findById(value);
    }

    @Override
    public ScoreDTO findById(String key, String value) {
        return dao.findById(key, value);
    }

    @Override
    public void insertDocument(ScoreDTO doc) {
        dao.insertDocument(doc);
    }

    @Override
    public void insertAllDocument(List<ScoreDTO> docs) {
        dao.insertAllDocument(docs);
    }

    @Override
    public List<ScoreDTO> findCriteria(String key, String value) {
        return dao.findCriteria(key,value);
    }

    @Override
    public void update(ScoreDTO document) {
        dao.update(document);
    }

    @Override
    public void test1() {

    }

    @Override
    public List<ScoreDTO> findAll() {
        return dao.findAll();
    }
    //페이징처리
    @Override
    public List<ScoreDTO> findAll(int pageNo) {
        return dao.findAll(pageNo);
    }
}
