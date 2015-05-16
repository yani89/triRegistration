package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ci_client_profile_resiko")
public class ClientProfileResiko {
//	CREATE TABLE `cl_client_profil_resiko` (
//			  `ID_CP` int(200) NOT NULL AUTO_INCREMENT,
//			  `IDT_Client` varchar(200) DEFAULT NULL,
//			  `Jawaban` varchar(300) DEFAULT NULL,
//			  `Skor` varchar(100) DEFAULT NULL,
//			  `Create_date` varchar(250) DEFAULT NULL,
//			  `Update_date` varchar(250) DEFAULT NULL,
//			  PRIMARY KEY (`ID_CP`),
//			  UNIQUE KEY `IDT_Client` (`IDT_Client`)
//			) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private Integer ID_CP;
	private String IDT_CLIENT, JAWABAN, SKOR, CREATE_DATE, UPDATE_DATE;
	
	public Integer getID_CP() {
		return ID_CP;
	}
	public void setID_CP(Integer iD_CP) {
		ID_CP = iD_CP;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getJAWABAN() {
		return JAWABAN;
	}
	public void setJAWABAN(String jAWABAN) {
		JAWABAN = jAWABAN;
	}
	public String getSKOR() {
		return SKOR;
	}
	public void setSKOR(String sKOR) {
		SKOR = sKOR;
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
