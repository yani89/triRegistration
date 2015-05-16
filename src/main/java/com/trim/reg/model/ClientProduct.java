package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ci_client_product")
public class ClientProduct {
//	CREATE TABLE `cl_client_product` (
//			  `ID_CT` varchar(200) NOT NULL DEFAULT '',
//			  `IDT_Client` varchar(100) DEFAULT NULL,
//			  `Product` varchar(250) DEFAULT NULL,
//			  `Description` varchar(300) DEFAULT NULL,
//			  `Create_date` varchar(250) DEFAULT NULL,
//			  `Update_date` varchar(250) DEFAULT NULL,
//			  PRIMARY KEY (`ID_CT`),
//			  UNIQUE KEY `IDT_Client` (`IDT_Client`)
//			) ENGINE=MyISAM DEFAULT CHARSET=latin1;
	@Id
	@GeneratedValue
	private String ID_CT;
	private String IDT_CLIENT, PRODUCT, DESCRIPTION, CREATE_DATE, UPDATE_DATE;
	
	public String getID_CT() {
		return ID_CT;
	}
	public void setID_CT(String iD_CT) {
		ID_CT = iD_CT;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getPRODUCT() {
		return PRODUCT;
	}
	public void setPRODUCT(String pRODUCT) {
		PRODUCT = pRODUCT;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
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
