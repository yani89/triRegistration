package com.trim.reg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mt_log")
public class MtLog {
//	CREATE TABLE `mt_log` (
//			  `ID` int(255) NOT NULL AUTO_INCREMENT,
//			  `USERNAME` varchar(200) NOT NULL,
//			  `DAY` varchar(50) NOT NULL,
//			  `DTS` varchar(50) NOT NULL,
//			  `ACTION` varchar(100) NOT NULL,
//			  `DESCRIPTION` text NOT NULL,
//			  PRIMARY KEY (`ID`)
//			) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private Integer ID;
	private String USERNAME;
	private String DAY;
	private String DTS;
	private String ACTION;
	private String DESCRIPTION;
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getDAY() {
		return DAY;
	}
	public void setDAY(String dAY) {
		DAY = dAY;
	}
	public String getDTS() {
		return DTS;
	}
	public void setDTS(String dTS) {
		DTS = dTS;
	}
	public String getACTION() {
		return ACTION;
	}
	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
}
