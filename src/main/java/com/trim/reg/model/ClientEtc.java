package com.trim.reg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cl_client_etc")
public class ClientEtc {
//	CREATE TABLE `cl_client_etc` (
//			  `ID_CE` int(200) NOT NULL AUTO_INCREMENT,
//			  `IDT_Client` varchar(200) DEFAULT NULL,
//			  `Soal_1` varchar(250) DEFAULT NULL,
//			  `Soal_2` varchar(250) DEFAULT NULL,
//			  `Soal_3` varchar(250) DEFAULT NULL,
//			  `Soal_4` varchar(250) DEFAULT NULL,
//			  `Soal_5` varchar(250) DEFAULT NULL,
//			  `Soal_6` varchar(250) DEFAULT NULL,
//			  `Soal_7` varchar(250) DEFAULT NULL,
//			  `Soal_8` varchar(250) DEFAULT NULL,
//			  `Create_date` varchar(250) DEFAULT NULL,
//			  `Update_date` varchar(250) DEFAULT NULL,
//			  PRIMARY KEY (`ID_CE`),
//			  UNIQUE KEY `IDT_Client` (`IDT_Client`)
//			) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private Integer ID_CE;
	private String IDT_CLIENT;
	private String SOAL_1;
	private String SOAL_2;
	private String SOAL_3;
	private String SOAL_4;
	private String SOAL_5;
	private String SOAL_6;
	private String SOAL_7;
	private String SOAL_8;
	private String CREATE_DATE;
	private String UPDATE_DATE;
	
	public Integer getID_CE() {
		return ID_CE;
	}
	public void setID_CE(Integer iD_CE) {
		ID_CE = iD_CE;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getSOAL_1() {
		return SOAL_1;
	}
	public void setSOAL_1(String sOAL_1) {
		SOAL_1 = sOAL_1;
	}
	public String getSOAL_2() {
		return SOAL_2;
	}
	public void setSOAL_2(String sOAL_2) {
		SOAL_2 = sOAL_2;
	}
	public String getSOAL_3() {
		return SOAL_3;
	}
	public void setSOAL_3(String sOAL_3) {
		SOAL_3 = sOAL_3;
	}
	public String getSOAL_4() {
		return SOAL_4;
	}
	public void setSOAL_4(String sOAL_4) {
		SOAL_4 = sOAL_4;
	}
	public String getSOAL_5() {
		return SOAL_5;
	}
	public void setSOAL_5(String sOAL_5) {
		SOAL_5 = sOAL_5;
	}
	public String getSOAL_6() {
		return SOAL_6;
	}
	public void setSOAL_6(String sOAL_6) {
		SOAL_6 = sOAL_6;
	}
	public String getSOAL_7() {
		return SOAL_7;
	}
	public void setSOAL_7(String sOAL_7) {
		SOAL_7 = sOAL_7;
	}
	public String getSOAL_8() {
		return SOAL_8;
	}
	public void setSOAL_8(String sOAL_8) {
		SOAL_8 = sOAL_8;
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
