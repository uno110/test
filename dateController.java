package com.example.demo.controller;
import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Date;
import com.example.demo.mapper.dateMapper;
import com.example.demo.repository.dateRepository;

@Controller
@RequestMapping("/")

public class dateController {
	@Autowired
    dateMapper mapper;
	@Autowired
	 dateRepository repository;
  @GetMapping
  public String show () {
	  return "index";
  }
  @GetMapping("/insert")
  public String insert() {
	  return "new";
  }
	
	@PostMapping("/new")
   public String create(@ModelAttribute Date date,Model model) {
	   mapper.save(date);
     
	   return   "redirect:/";
}
  @GetMapping("/edit/{word}")
  public ModelAndView edit(@PathVariable String word, @ModelAttribute Date date ,ModelAndView mav) {
	   mav.addObject("date",mapper.findOne(word) );
      mav.setViewName("edit");
      return mav;
  }
  @PostMapping("/edit") 
  @Transactional
	  public String update( @ModelAttribute("date")Date date,  Model model) {
			mapper.update(date);
				return "redirect:/";
			}
  @PostMapping("/calculate")
  public String cal( @RequestParam("d")LocalDate d ,Model model) {  
	 List<Date> D=repository.findAll();
		for(int i=0;D.size()>i;i++) {
			D.get(i).calculate(d);
			D.get(i).setNo(i+1);
		}
		model.addAttribute("d",d);
	      model.addAttribute("R",repository.findAll());
		 return  "index";
  }
@PostMapping("/delete/{word}")
public String delete(@PathVariable String word ,Model model) {
	mapper.delete(word);
    return "redirect:/";
}
}
