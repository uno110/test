package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Date;
import com.example.demo.mapper.dateMapper;

@RestController
@RequestMapping("/api")
public class dateRestController {

@Autowired 
 dateMapper mapper;
@GetMapping("/{word}")
public Date api(@PathVariable String word){
	  
return  mapper.findOne(word);
}            
@GetMapping("/all")
	public List<Date> apiAll() {
	
	return 	mapper.findAll();
	
}
	
}


