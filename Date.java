package com.example.demo.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="date")
public class Date {
	private LocalDate d1;
	
	private int no;
	@Id
	private  String word;
	private String name;
     private int year;
	private int month;
	private int day;
    
	public void setNo(int no) {
		this.no=no;
	}
	public  int getNo() {
		return no;
	}
	public void setWord(String word) {
		this.word=word;
	}
	public String getWord() {
		return word;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public  void setYear(int year) {
    	this.year=year;  
	}
	public int getYear() {
		return year;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public int getMonth() {
		return month;
	} 
	public void setDay(int day) {
		this.day=day;
	}
	public int getDay() {
		return day;
	}
   public void setD1(LocalDate d1) {
	   this.d1=d1;
   }
	public LocalDate getD1() {
		return d1;
	}
	public void  calculate(LocalDate X) {
	   LocalDate R=   X.plusYears(getYear());
	  LocalDate R1=   R.plusMonths(getMonth());
	  LocalDate d1=   R1.plusDays(getDay());
	  setD1(d1);
   }

 
}



