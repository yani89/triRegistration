package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ci_client_login")
public class ClientLogin {
//	CREATE TABLE `cl_client_login` (
//			  `IDT_Client` varchar(100) NOT NULL,
//			  `Prefered_Login_ID` varchar(250) NOT NULL,
//			  `Password` varchar(250) NOT NULL,
//			  `Security_Question` varchar(250) DEFAULT NULL,
//			  `Answer_Question` varchar(250) DEFAULT NULL,
//			  `Create_date` varchar(250) DEFAULT NULL,
//			  `Update_date` varchar(250) DEFAULT NULL,
//			  PRIMARY KEY (`IDT_Client`)
//			) ENGINE=MyISAM DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private String IDT_CLIENT;
	private String PREFERED_LOGIN_ID, PASSWORD, SECURITY_QUESTION, ANSWER_QUESTION, 
	CREATE_DATE, UPDATE_DATE;
	
	
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getPREFERED_LOGIN_ID() {
		return PREFERED_LOGIN_ID;
	}
	public void setPREFERED_LOGIN_ID(String pREFERED_LOGIN_ID) {
		PREFERED_LOGIN_ID = pREFERED_LOGIN_ID;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getSECURITY_QUESTION() {
		return SECURITY_QUESTION;
	}
	public void setSECURITY_QUESTION(String sECURITY_QUESTION) {
		SECURITY_QUESTION = sECURITY_QUESTION;
	}
	public String getANSWER_QUESTION() {
		return ANSWER_QUESTION;
	}
	public void setANSWER_QUESTION(String aNSWER_QUESTION) {
		ANSWER_QUESTION = aNSWER_QUESTION;
	}
	public String getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	
}
