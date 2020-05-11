package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.Date;

public class dateTest {
@Test
	public void testGetD1() {
	 LocalDate X=LocalDate.of(2020, 5, 10);
     Date testD= new Date();
     testD.setWord("来年");
     testD.setYear(1);
     testD.setMonth(0);
     testD.setDay(0);
    
     testD.calculate(X);
     LocalDate b=LocalDate.of(2021, 5, 10);
     assertEquals(b,testD.getD1());
 
}
}