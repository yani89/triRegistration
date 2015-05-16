package com.trim.reg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mt_login_attempts")
public class MtLoginAttempts {
//	CREATE TABLE `mt_login_attempts` (
//			  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//			  `ip_address` varbinary(16) NOT NULL,
//			  `login` varchar(100) CHARACTER SET latin1 NOT NULL,
//			  `time` int(11) unsigned DEFAULT NULL,
//			  PRIMARY KEY (`id`)
//			) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

	@Id
	@GeneratedValue
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
	
}
