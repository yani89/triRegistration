package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tbl_kotakabupaten")
public class TblKabupaten {
//	CREATE TABLE `tbl_kotakabupaten` (
//			  `kab_id` int(11) NOT NULL AUTO_INCREMENT,
//			  `prov_id` int(11) NOT NULL,
//			  `kab_name` varchar(200) NOT NULL,
//			  PRIMARY KEY (`kab_id`)
//			) ENGINE=MyISAM AUTO_INCREMENT=9472 DEFAULT CHARSET=latin1;
	@Id
	@GeneratedValue
	private Integer kab_id, prov_id;
	private String kab_name;
	
	public Integer getKab_id() {
		return kab_id;
	}
	public void setKab_id(Integer kab_id) {
		this.kab_id = kab_id;
	}
	public Integer getProv_id() {
		return prov_id;
	}
	public void setProv_id(Integer prov_id) {
		this.prov_id = prov_id;
	}
	public String getKab_name() {
		return kab_name;
	}
	public void setKab_name(String kab_name) {
		this.kab_name = kab_name;
	}
	
}
