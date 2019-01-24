package com.dj.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.dao.QuestionDao;
import com.dj.domain.QuestionDomain;
import com.dj.service.QuestionServiceDao;
@Service("questionServiceDao")
public class QuestionServiceDaoImpl implements QuestionServiceDao {
	@Autowired
	QuestionDao questionDao;
	
	public String addQuestion(QuestionDomain questionDomain) {
		return questionDao.addQuestion(questionDomain);
	}

	@Override
	public boolean editQuestion(QuestionDomain questionDomain) {
		return questionDao.editQuestion(questionDomain);
	}

	public List<QuestionDomain> getAllQuestionList() {
		return questionDao.getAllQuestionList();
	}

	@Override
	public List<QuestionDomain> getQuestionByQtype(String qtype) {
		return questionDao.getQuestionByQtype(qtype);
	}

	@Override
	public List<QuestionDomain>  getQuestionById(Integer qid) {
		return questionDao.getQuestionById(qid);
	}

}
