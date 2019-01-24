package com.dj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dj.domain.QuestionDomain;
import com.dj.service.QuestionServiceDao;


@Controller
public class MyController {
	@Autowired
	QuestionServiceDao questionServiceDao;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView viewQuestionPaper() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/addQuestion",method=RequestMethod.GET)
	public ModelAndView addQuestionMethod(@ModelAttribute QuestionDomain questionDomain) {
		System.out.println("dj::"+ questionDomain);
		return new ModelAndView("question");
	}
	
	
	@RequestMapping(value="/submitQuestion",method=RequestMethod.POST)
	public ModelAndView submitQuestion(@ModelAttribute QuestionDomain questionDomain) {
		System.out.println("dj::"+ questionDomain);
		questionServiceDao.addQuestion(questionDomain);
		return new ModelAndView("question");
	}
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public ModelAndView showList() {
		List<QuestionDomain> list = questionServiceDao.getAllQuestionList();
		System.out.println("getAllQuestionList();"+list);
		return new ModelAndView("questionDisplay", "list", list);
		
	}
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public ModelAndView getQuestionsByQtype(@RequestParam("qType") String qType) {
		List<QuestionDomain> list = questionServiceDao.getQuestionByQtype(qType);
		return new ModelAndView("questionDisplay","list",list);
		
	}
	@RequestMapping(value="/showById/{qid}",method=RequestMethod.GET)
	public ModelAndView getQuestionbyId(@PathVariable("qid") Integer qid) {
		List<QuestionDomain>  list = questionServiceDao.getQuestionById(qid);
		System.out.println("getQuestionbyId::"+list);
		return new ModelAndView("questionDisplay","list",list);
		
	}
	
	
}
