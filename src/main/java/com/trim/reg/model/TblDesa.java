package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tbl_desa")
public class TblDesa {
//	CREATE TABLE `tbl_desa` (
//			  `id_desa` bigint(100) NOT NULL,
//			  `id_kec` bigint(100) NOT NULL,
//			  `nama_desa` varchar(200) NOT NULL,
//			  PRIMARY KEY (`id_desa`)
//			) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private Integer id_desa, id_kec;
	private String nama_desa;
	
	public Integer getId_desa() {
		return id_desa;
	}
	public void setId_desa(Integer id_desa) {
		this.id_desa = id_desa;
	}
	public Integer getId_kec() {
		return id_kec;
	}
	public void setId_kec(Integer id_kec) {
		this.id_kec = id_kec;
	}
	public String getNama_desa() {
		return nama_desa;
	}
	public void setNama_desa(String nama_desa) {
		this.nama_desa = nama_desa;
	}
}
