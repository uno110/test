package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Date;

@Mapper
public interface dateMapper {
  List<Date> findAll();

  Date findOne(String word);

  void save(Date date);

  void update(Date date);

  void delete(String word);

  
}