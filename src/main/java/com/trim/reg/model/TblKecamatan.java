package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tbl_kecamatan")
public class TblKecamatan {
//	CREATE TABLE `tbl_kecamatan` (
//			  `kec_id` int(11) NOT NULL AUTO_INCREMENT,
//			  `kab_id` int(11) NOT NULL,
//			  `kec_name` varchar(200) NOT NULL,
//			  PRIMARY KEY (`kec_id`)
//			) ENGINE=MyISAM AUTO_INCREMENT=9471041 DEFAULT CHARSET=latin1;
	@Id
	@GeneratedValue
	private Integer kec_id, kab_id;
	private String kec_name;
	
	public Integer getKec_id() {
		return kec_id;
	}
	public void setKec_id(Integer kec_id) {
		this.kec_id = kec_id;
	}
	public Integer getKab_id() {
		return kab_id;
	}
	public void setKab_id(Integer kab_id) {
		this.kab_id = kab_id;
	}
	public String getKec_name() {
		return kec_name;
	}
	public void setKec_name(String kec_name) {
		this.kec_name = kec_name;
	}
	
}
