package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cl_client_urgent")
public class ClientUrgent {
//	CREATE TABLE `cl_client_urgent` (
//			  `ID_CU` int(200) NOT NULL AUTO_INCREMENT,
//			  `IDT_Client` varchar(200) DEFAULT NULL,
//			  `Nama_lengkap_d` varchar(200) DEFAULT NULL,
//			  `Hubungan_d` varchar(200) DEFAULT NULL,
//			  `No_hp_d` varchar(50) DEFAULT NULL,
//			  `Alamat_d` varchar(250) DEFAULT NULL,
//			  `Create_date` varchar(250) DEFAULT NULL,
//			  `Update_date` varchar(250) DEFAULT NULL,
//			  PRIMARY KEY (`ID_CU`),
//			  UNIQUE KEY `IDT_Client` (`IDT_Client`)
//			) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;



	@Id
	@GeneratedValue
	private Integer ID_CU;
	private String IDT_CLIENT, NAMA_LENGKAP_D, HUBUNGAN_D, NO_HP_D, ALAMAT_D, CREATE_DATE, UPDATE_DATE;
	
	public Integer getID_CU() {
		return ID_CU;
	}
	public void setID_CU(Integer iD_CU) {
		ID_CU = iD_CU;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getNAMA_LENGKAP_D() {
		return NAMA_LENGKAP_D;
	}
	public void setNAMA_LENGKAP_D(String nAMA_LENGKAP_D) {
		NAMA_LENGKAP_D = nAMA_LENGKAP_D;
	}
	public String getHUBUNGAN_D() {
		return HUBUNGAN_D;
	}
	public void setHUBUNGAN_D(String hUBUNGAN_D) {
		HUBUNGAN_D = hUBUNGAN_D;
	}
	public String getNO_HP_D() {
		return NO_HP_D;
	}
	public void setNO_HP_D(String nO_HP_D) {
		NO_HP_D = nO_HP_D;
	}
	public String getALAMAT_D() {
		return ALAMAT_D;
	}
	public void setALAMAT_D(String aLAMAT_D) {
		ALAMAT_D = aLAMAT_D;
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
