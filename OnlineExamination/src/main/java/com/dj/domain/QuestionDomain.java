package com.dj.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Question")
public class QuestionDomain {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="QUS_SEQ")
@SequenceGenerator(name="QUS_SEQ",initialValue=1,allocationSize=1,sequenceName="QUS_SEQ")
private Integer qid;
private String qType;
private String  qDescription;
private String option1;
private String option2;
private String option3;
private String option4;
private String  rightAns;
public Integer getQid() {
	return qid;
}
public void setQid(Integer qid) {
	this.qid = qid;
}
public String getqType() {
	return qType;
}
public void setqType(String qType) {
	this.qType = qType;
}
public String getqDescription() {
	return qDescription;
}
public void setqDescription(String qDescription) {
	this.qDescription = qDescription;
}
public String getRightAns() {
	return rightAns;
}
public void setRightAns(String rightAns) {
	this.rightAns = rightAns;
}
public String getOption1() {
	return option1;
}
public void setOption1(String option1) {
	this.option1 = option1;
}
public String getOption2() {
	return option2;
}
public void setOption2(String option2) {
	this.option2 = option2;
}
public String getOption3() {
	return option3;
}
public void setOption3(String option3) {
	this.option3 = option3;
}
public String getOption4() {
	return option4;
}
public void setOption4(String option4) {
	this.option4 = option4;
}
@Override
public String toString() {
	return "QuestionDomain [qid=" + qid + ", qType=" + qType + ", qDescription=" + qDescription + ", option1=" + option1
			+ ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4 + ", rightAns=" + rightAns + "]";
}



}