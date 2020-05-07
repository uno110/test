package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Date;

@Repository
public interface dateRepository  extends JpaRepository <Date,String>{

}
