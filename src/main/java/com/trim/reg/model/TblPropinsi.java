package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tbl_provinsi")
public class TblPropinsi {
//	CREATE TABLE `tbl_provinsi` (
//			  `prov_id` int(11) NOT NULL AUTO_INCREMENT,
//			  `prov_name` varchar(200) NOT NULL,
//			  PRIMARY KEY (`prov_id`)
//			) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=latin1;
	@Id
	@GeneratedValue
	private Integer prov_id;
	private String prov_name;
	
	public Integer getProv_id() {
		return prov_id;
	}
	public void setProv_id(Integer prov_id) {
		this.prov_id = prov_id;
	}
	public String getProv_name() {
		return prov_name;
	}
	public void setProv_name(String prov_name) {
		this.prov_name = prov_name;
	}
	
}
