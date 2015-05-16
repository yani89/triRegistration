package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="mt_client_manage")
public class MtClientManagement {
//	CREATE TABLE `mt_client_manage` (
//			  `ID_Manage` bigint(200) NOT NULL AUTO_INCREMENT,
//			  `IDT_Client` varchar(200) NOT NULL,
//			  `Email` varchar(200) DEFAULT NULL,
//			  `STATUS` varchar(100) NOT NULL,
//			  `Update_date` varchar(50) DEFAULT NULL,
//			  `Create_date` varchar(50) DEFAULT NULL,
//			  `Action` int(5) DEFAULT NULL,
//			  PRIMARY KEY (`ID_Manage`)
//			) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private Integer ID_MANAGE;
	private String IDT_CLIENT, EMAIL, STATUS, UPDATE_DATE, CREATE_DATE, ACTION;
	
	public Integer getID_MANAGE() {
		return ID_MANAGE;
	}
	public void setID_MANAGE(Integer iD_MANAGE) {
		ID_MANAGE = iD_MANAGE;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public String getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public String getACTION() {
		return ACTION;
	}
	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}
}
