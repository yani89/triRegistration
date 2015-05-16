package com.trim.reg.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MtLoginAttemptsDTO {
	private static final long serialVersionUID = -6518171412015203128L;
	
	private Integer id;
	private Integer ip_address;
	private String login;
	private Integer time;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIp_address() {
		return ip_address;
	}
	public void setIp_address(Integer ip_address) {
		this.ip_address = ip_address;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	
	public String getString(){
		return String.format("MtLoginAttemptsDTO - id:[%s] ip_address:[%s] login:[%s] time:[%s]", this.id, this.ip_address, this.login, this.time);
	}
}
