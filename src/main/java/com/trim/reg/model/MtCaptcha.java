package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="mt_captcha")
public class MtCaptcha {
//	CREATE TABLE `mt_captcha` (
//			  `captcha_id` bigint(13) unsigned NOT NULL AUTO_INCREMENT,
//			  `captcha_time` bigint(10) unsigned NOT NULL,
//			  `ip_address` varchar(16) NOT NULL DEFAULT '0',
//			  `word` varchar(20) NOT NULL,
//			  PRIMARY KEY (`captcha_id`),
//			  KEY `word` (`word`)
//			) ENGINE=InnoDB AUTO_INCREMENT=343 DEFAULT CHARSET=latin1;
	@Id
	@GeneratedValue
	private Integer captcha_id;
	private Integer captcha_time;
	private String ip_address, word;
	
	public Integer getCaptcha_id() {
		return captcha_id;
	}
	public void setCaptcha_id(Integer captcha_id) {
		this.captcha_id = captcha_id;
	}
	public Integer getCaptcha_time() {
		return captcha_time;
	}
	public void setCaptcha_time(Integer captcha_time) {
		this.captcha_time = captcha_time;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
}
