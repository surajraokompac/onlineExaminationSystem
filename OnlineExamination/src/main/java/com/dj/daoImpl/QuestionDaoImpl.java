package com.dj.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dj.dao.QuestionDao;
import com.dj.domain.QuestionDomain;
@Repository
@Transactional
public class QuestionDaoImpl implements QuestionDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	public String addQuestion(QuestionDomain questionDomain) {
		hibernateTemplate.save(questionDomain);
		return hibernateTemplate.toString();
		
	}
	@Override
	public boolean editQuestion(QuestionDomain questionDomain) {
		
		return false;
	}
	@Override
	public List<QuestionDomain> getAllQuestionList() {
		/*return hibernateTemplate.execute(new HibernateCallback<List<QuestionDomain>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<QuestionDomain> doInHibernate(Session session) throws HibernateException {
			     return session.createSQLQuery("select * from Question").list();
			     
			}
		});*/
		@SuppressWarnings("unchecked")
		List<QuestionDomain> list = (List<QuestionDomain>) hibernateTemplate.find("from com.dj.domain.QuestionDomain");
		return list;
		
	}
	@Override
	public List<QuestionDomain> getQuestionByQtype(String qtype) {
		String hql="from com.dj.domain.QuestionDomain qd where qd.qType=? ";
		List<QuestionDomain> list = (List<QuestionDomain>) hibernateTemplate.find(hql, qtype);
		/*@SuppressWarnings("unchecked")
		List<QuestionDomain> namedParam = (List<QuestionDomain>) hibernateTemplate.findByNamedParam(hql, qtype, qtype);
		QuestionDomain domain = namedParam.get(0);
		System.out.println("getQuestionByQtype::"+domain);*/
		return list;
	}
	@Override
	public List<QuestionDomain> getQuestionById(Integer qid) {
		String string = String.valueOf(qid);
		/*String query="from com.dj.domain.QuestionDomain where QuestionDomain.qid=:qid ";
		@SuppressWarnings("unchecked")
		List<QuestionDomain> list = (List<QuestionDomain>) hibernateTemplate.findByNamedParam(query,"qid", qid);
		System.out.println("list::"+list);
		QuestionDomain domain = list.get(0);
		System.out.println("getQuestionByQtype::"+domain);*/
		DetachedCriteria criteria = DetachedCriteria.forClass(QuestionDomain.class);
		criteria.add(Restrictions.eq("qid", qid));
		List<QuestionDomain> findByCriteria = (List<QuestionDomain>) hibernateTemplate.findByCriteria(criteria);
		System.out.println("suraj::::"+findByCriteria);
		return findByCriteria;
	}

}
