package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="provinsi")
public class Propinsi {
//	CREATE TABLE `provinsi` (
//			  `id_provinsi` smallint(3) NOT NULL AUTO_INCREMENT,
//			  `kode_provinsi` smallint(2) NOT NULL,
//			  `provinsi` varchar(100) NOT NULL,
//			  PRIMARY KEY (`id_provinsi`),
//			  UNIQUE KEY `KodePropinsi` (`kode_provinsi`)
//			) ENGINE=MyISAM AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
	@Id
	@GeneratedValue
	private Integer id_propinsi, kode_provinsi;
	private String provinsi;
	
	
	public Integer getId_propinsi() {
		return id_propinsi;
	}
	public void setId_propinsi(Integer id_propinsi) {
		this.id_propinsi = id_propinsi;
	}
	public Integer getKode_provinsi() {
		return kode_provinsi;
	}
	public void setKode_provinsi(Integer kode_provinsi) {
		this.kode_provinsi = kode_provinsi;
	}
	public String getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}
	
}
