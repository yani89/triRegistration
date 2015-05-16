package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cl_client_token")
public class ClientToken {
//	CREATE TABLE `cl_client_token` (
//			  `ID_TOKEN` int(250) NOT NULL AUTO_INCREMENT,
//			  `EMAIL` varchar(200) DEFAULT NULL,
//			  `TOKEN` varchar(250) DEFAULT NULL,
//			  `STATUS` int(2) DEFAULT NULL,
//			  `DATE_TOKEN` varchar(50) DEFAULT NULL,
//			  PRIMARY KEY (`ID_TOKEN`)
//			) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private Integer ID_TOKEN;
	private String EMAIL, TOKEN, STATUS, DATE_TOKEN;
	
	public Integer getID_TOKEN() {
		return ID_TOKEN;
	}
	public void setID_TOKEN(Integer iD_TOKEN) {
		ID_TOKEN = iD_TOKEN;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getTOKEN() {
		return TOKEN;
	}
	public void setTOKEN(String tOKEN) {
		TOKEN = tOKEN;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getDATE_TOKEN() {
		return DATE_TOKEN;
	}
	public void setDATE_TOKEN(String dATE_TOKEN) {
		DATE_TOKEN = dATE_TOKEN;
	}
}
