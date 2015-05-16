package com.trim.reg.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="mt_users")
public class MtUsers {

	private static final long serialVersionUID = 6311364761937265306L;
	static Logger logger = LoggerFactory.getLogger(MtUsers.class);
//	
//	CREATE TABLE `mt_users` (
//			  `ID` int(20) NOT NULL AUTO_INCREMENT,
//			  `NAME` varchar(200) NOT NULL,
//			  `USERNAME` varchar(200) NOT NULL,
//			  `EMAIL` varchar(100) NOT NULL,
//			  `PASSWORD` varchar(255) NOT NULL,
//			  `ROLE` varchar(50) NOT NULL,
//			  `SALT` varchar(200) NOT NULL,
//			  `STATUS` int(2) NOT NULL,
//			  `FIRST_LOGIN` int(2) NOT NULL,
//			  `REG_DATE` date NOT NULL,
//			  `MODIF_DATE` date NOT NULL,
//			  PRIMARY KEY (`ID`)
//			) ENGINE=InnoDB DEFAULT CHARSET=latin1;
	@Id
	@GeneratedValue
	private Integer ID;
	private String NAME;
	private String USERNAME;
	private String EMAIL;
	private String PASSWORD;
	private String ROLE;
	private String SALT;
	private String STATUS;
	private Integer FIRST_LOGIN;
	private Date REG_DATE;
	private Date MODIF_DATE;
	
	
	public static Logger getLogger() {
		return logger;
	}
	public static void setLogger(Logger logger) {
		MtUsers.logger = logger;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getROLE() {
		return ROLE;
	}
	public void setROLE(String rOLE) {
		ROLE = rOLE;
	}
	public String getSALT() {
		return SALT;
	}
	public void setSALT(String sALT) {
		SALT = sALT;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public Integer getFIRST_LOGIN() {
		return FIRST_LOGIN;
	}
	public void setFIRST_LOGIN(Integer fIRST_LOGIN) {
		FIRST_LOGIN = fIRST_LOGIN;
	}
	public Date getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(Date rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public Date getMODIF_DATE() {
		return MODIF_DATE;
	}
	public void setMODIF_DATE(Date mODIF_DATE) {
		MODIF_DATE = mODIF_DATE;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
