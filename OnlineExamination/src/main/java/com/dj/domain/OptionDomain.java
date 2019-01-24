/*package com.dj.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Optiontable")
public class OptionDomain {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="OPTION_SEQ")
	@SequenceGenerator(name="OPTION_SEQ",allocationSize=1,initialValue=1,sequenceName="OPTION_SEQ")
	private Integer oid;
	private String oDescription;
	@ManyToOne
	@JoinColumn(name="qid",referencedColumnName="qid")
	QuestionDomain questionDomain;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getoDescription() {
		return oDescription;
	}
	public void setoDescription(String oDescription) {
		this.oDescription = oDescription;
	}
	public QuestionDomain getQuestionDomain() {
		return questionDomain;
	}
	public void setQuestionDomain(QuestionDomain questionDomain) {
		this.questionDomain = questionDomain;
	}
	
}
*/