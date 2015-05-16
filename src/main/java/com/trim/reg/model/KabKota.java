package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="kab_kota")
public class KabKota {
//	CREATE TABLE `kab_kota` (
//			  `id_kab_kota` int(11) NOT NULL AUTO_INCREMENT,
//			  `id_provinsi` int(11) NOT NULL,
//			  `kab_kota` varchar(100) NOT NULL,
//			  `ket` varchar(200) NOT NULL,
//			  PRIMARY KEY (`id_kab_kota`)
//			) ENGINE=MyISAM AUTO_INCREMENT=441 DEFAULT CHARSET=utf8;
	@Id
	@GeneratedValue
	private Integer ID_KAB_KOTA;
	private Integer ID_PROVINSI;
	private String KAB_KOTA, KET;
	
	public Integer getID_KAB_KOTA() {
		return ID_KAB_KOTA;
	}
	public void setID_KAB_KOTA(Integer iD_KAB_KOTA) {
		ID_KAB_KOTA = iD_KAB_KOTA;
	}
	public Integer getID_PROVINSI() {
		return ID_PROVINSI;
	}
	public void setID_PROVINSI(Integer iD_PROVINSI) {
		ID_PROVINSI = iD_PROVINSI;
	}
	public String getKAB_KOTA() {
		return KAB_KOTA;
	}
	public void setKAB_KOTA(String kAB_KOTA) {
		KAB_KOTA = kAB_KOTA;
	}
	public String getKET() {
		return KET;
	}
	public void setKET(String kET) {
		KET = kET;
	}
}
