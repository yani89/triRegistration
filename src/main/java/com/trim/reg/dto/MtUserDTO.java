package com.trim.reg.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MtUserDTO implements Serializable {
	private static final long serialVersionUID = -6518171412015203128L;
	
	private Integer ID;
	private String NAME;
	private String USERNAME;
	private String EMAIL;
	private String PASSWORD;
	private String ROLE;
	private String SALT;
	private Integer FIRST_LOGIN;
	private Date REG_DATE;
	private Date MODIF_DATE;
	


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
	public String getString(){
		return String.format("MtUserDTO - id:[%s] username:[%s] email:[%s]", this.ID, this.USERNAME, this.EMAIL);
	}
}
