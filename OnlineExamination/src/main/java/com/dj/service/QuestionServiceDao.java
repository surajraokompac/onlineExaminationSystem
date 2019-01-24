package com.dj.service;

import java.util.List;

import com.dj.domain.QuestionDomain;

public interface QuestionServiceDao {
	String addQuestion(QuestionDomain questionDomain);
	boolean editQuestion(QuestionDomain questionDomain);
	List<QuestionDomain> getAllQuestionList();
	List<QuestionDomain> getQuestionByQtype(String qtype);
	List<QuestionDomain>  getQuestionById(Integer qid);
}
