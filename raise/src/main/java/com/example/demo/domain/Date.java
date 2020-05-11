package com.example.demo.domain;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="date")
public class Date {

	
	private int no;
	@Id
	private  String word;
     private int year;
	private int month;
	private int day;
	private LocalDate d1;
	public void setNo(int no) {
		this.no=no;
	}
	@JsonIgnore
	public  int getNo() {
		return no;
	}
	public void setWord(String word ) {
		this.word=word;
	}
	public String getWord() {
		return word;
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
   @JsonIgnore
	public LocalDate getD1() {
		return d1;
	}
	public void  calculate(LocalDate X) {
	   if(word.equals("翌月末")) {
		   LocalDate A=X.plusMonths(2);
	  LocalDate  B=A.with(TemporalAdjusters.firstDayOfMonth());
	   LocalDate C=B.minusDays(1);
	   setD1(C);
	   }else if(word.equals("月末")){
		   LocalDate K=X.plusMonths(1);
		LocalDate  L=K.with(TemporalAdjusters.firstDayOfMonth());
	      LocalDate M=L.minusDays(1);
			setD1(M);  
	   }else {
	LocalDate R=   X.plusYears(getYear());
	  LocalDate R1=   R.plusMonths(getMonth());
	  LocalDate d1=   R1.plusDays(getDay());
	  setD1(d1);
   }
	}
}



