package com.trim.reg.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MtLogDTO {
	private static final long serialVersionUID = -6518171412015203128L;
	
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
