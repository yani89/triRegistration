package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cl_client_worker")
public class ClientWorker {
//	CREATE TABLE `cl_client_worker` (
//			  `ID_CW` int(200) NOT NULL AUTO_INCREMENT,
//			  `IDT_Client` varchar(200) DEFAULT NULL,
//			  `Pekerjaan` varchar(250) DEFAULT NULL,
//			  `Pekerjaan_others` varchar(150) DEFAULT NULL,
//			  `Nama_perusahaan` varchar(250) DEFAULT NULL,
//			  `Negara_kantor` varchar(100) DEFAULT NULL,
//			  `Alamat_kantor1` varchar(250) DEFAULT NULL,
//			  `Alamat_kantor2` varchar(200) DEFAULT NULL,
//			  `Kota_kantor` varchar(250) DEFAULT NULL,
//			  `Kode_pos` varchar(100) DEFAULT NULL,
//			  `Telpon_kantor` varchar(100) DEFAULT NULL,
//			  `Fax_kantor` varchar(100) DEFAULT NULL,
//			  `Email_kantor` varchar(250) DEFAULT NULL,
//			  `Jabatan` varchar(250) DEFAULT NULL,
//			  `Lama_kerja` varchar(100) DEFAULT NULL,
//			  `Bidang_usaha` varchar(250) DEFAULT NULL,
//			  `Penghasilan_thn` varchar(250) DEFAULT NULL,
//			  `Tambahan_thn` varchar(250) DEFAULT NULL,
//			  `Sumber_penghasilan` varchar(250) DEFAULT NULL,
//			  `Sumber_dana_transaksi` varchar(250) DEFAULT NULL,
//			  `Tujuan_investasi` varchar(250) DEFAULT NULL,
//			  `Tujuan_investasi_others` varchar(200) DEFAULT NULL,
//			  `Rata_transaksi_bln` varchar(250) DEFAULT NULL,
//			  `Create_date` varchar(250) DEFAULT NULL,
//			  `Update_date` varchar(250) DEFAULT NULL,
//			  PRIMARY KEY (`ID_CW`),
//			  UNIQUE KEY `IDT_Client` (`IDT_Client`)
//			) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
	@Id
	@GeneratedValue
	private Integer ID_CW;
	private String IDT_CLIENT, PEKERJAAN, PEKERJAAN_OTHERS, NAMA_PERUSAHAAN, NEGARA_KANTOR, ALAMAT_KANTOR1, ALAMAT_KANTOR2, KOTA_KANTOR, KODE_POS
	,TELPON_KANTOR, FAX_KANTOR, EMAIL_KANTOR, JABATAN, LAMA_KERJA, BIDANG_USAHA, PENGHASILAN_THN, TAMBAHAN_THN, SUMBER_PENGHASILAN
	,SUMBER_DANA_TRANSAKSI, TUJUAN_INVESTASI, TUJUAN_INVESTASI_OTHERS, RATA_TRANSAKSI_BLN, CREATE_DATE, UPDATE_DATE;
	
	public Integer getID_CW() {
		return ID_CW;
	}
	public void setID_CW(Integer iD_CW) {
		ID_CW = iD_CW;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getPEKERJAAN() {
		return PEKERJAAN;
	}
	public void setPEKERJAAN(String pEKERJAAN) {
		PEKERJAAN = pEKERJAAN;
	}
	public String getPEKERJAAN_OTHERS() {
		return PEKERJAAN_OTHERS;
	}
	public void setPEKERJAAN_OTHERS(String pEKERJAAN_OTHERS) {
		PEKERJAAN_OTHERS = pEKERJAAN_OTHERS;
	}
	public String getNAMA_PERUSAHAAN() {
		return NAMA_PERUSAHAAN;
	}
	public void setNAMA_PERUSAHAAN(String nAMA_PERUSAHAAN) {
		NAMA_PERUSAHAAN = nAMA_PERUSAHAAN;
	}
	public String getNEGARA_KANTOR() {
		return NEGARA_KANTOR;
	}
	public void setNEGARA_KANTOR(String nEGARA_KANTOR) {
		NEGARA_KANTOR = nEGARA_KANTOR;
	}
	public String getALAMAT_KANTOR1() {
		return ALAMAT_KANTOR1;
	}
	public void setALAMAT_KANTOR1(String aLAMAT_KANTOR1) {
		ALAMAT_KANTOR1 = aLAMAT_KANTOR1;
	}
	public String getALAMAT_KANTOR2() {
		return ALAMAT_KANTOR2;
	}
	public void setALAMAT_KANTOR2(String aLAMAT_KANTOR2) {
		ALAMAT_KANTOR2 = aLAMAT_KANTOR2;
	}
	public String getKOTA_KANTOR() {
		return KOTA_KANTOR;
	}
	public void setKOTA_KANTOR(String kOTA_KANTOR) {
		KOTA_KANTOR = kOTA_KANTOR;
	}
	public String getKODE_POS() {
		return KODE_POS;
	}
	public void setKODE_POS(String kODE_POS) {
		KODE_POS = kODE_POS;
	}
	public String getTELPON_KANTOR() {
		return TELPON_KANTOR;
	}
	public void setTELPON_KANTOR(String tELPON_KANTOR) {
		TELPON_KANTOR = tELPON_KANTOR;
	}
	public String getFAX_KANTOR() {
		return FAX_KANTOR;
	}
	public void setFAX_KANTOR(String fAX_KANTOR) {
		FAX_KANTOR = fAX_KANTOR;
	}
	public String getEMAIL_KANTOR() {
		return EMAIL_KANTOR;
	}
	public void setEMAIL_KANTOR(String eMAIL_KANTOR) {
		EMAIL_KANTOR = eMAIL_KANTOR;
	}
	public String getJABATAN() {
		return JABATAN;
	}
	public void setJABATAN(String jABATAN) {
		JABATAN = jABATAN;
	}
	public String getLAMA_KERJA() {
		return LAMA_KERJA;
	}
	public void setLAMA_KERJA(String lAMA_KERJA) {
		LAMA_KERJA = lAMA_KERJA;
	}
	public String getBIDANG_USAHA() {
		return BIDANG_USAHA;
	}
	public void setBIDANG_USAHA(String bIDANG_USAHA) {
		BIDANG_USAHA = bIDANG_USAHA;
	}
	public String getPENGHASILAN_THN() {
		return PENGHASILAN_THN;
	}
	public void setPENGHASILAN_THN(String pENGHASILAN_THN) {
		PENGHASILAN_THN = pENGHASILAN_THN;
	}
	public String getTAMBAHAN_THN() {
		return TAMBAHAN_THN;
	}
	public void setTAMBAHAN_THN(String tAMBAHAN_THN) {
		TAMBAHAN_THN = tAMBAHAN_THN;
	}
	public String getSUMBER_PENGHASILAN() {
		return SUMBER_PENGHASILAN;
	}
	public void setSUMBER_PENGHASILAN(String sUMBER_PENGHASILAN) {
		SUMBER_PENGHASILAN = sUMBER_PENGHASILAN;
	}
	public String getSUMBER_DANA_TRANSAKSI() {
		return SUMBER_DANA_TRANSAKSI;
	}
	public void setSUMBER_DANA_TRANSAKSI(String sUMBER_DANA_TRANSAKSI) {
		SUMBER_DANA_TRANSAKSI = sUMBER_DANA_TRANSAKSI;
	}
	public String getTUJUAN_INVESTASI() {
		return TUJUAN_INVESTASI;
	}
	public void setTUJUAN_INVESTASI(String tUJUAN_INVESTASI) {
		TUJUAN_INVESTASI = tUJUAN_INVESTASI;
	}
	public String getTUJUAN_INVESTASI_OTHERS() {
		return TUJUAN_INVESTASI_OTHERS;
	}
	public void setTUJUAN_INVESTASI_OTHERS(String tUJUAN_INVESTASI_OTHERS) {
		TUJUAN_INVESTASI_OTHERS = tUJUAN_INVESTASI_OTHERS;
	}
	public String getRATA_TRANSAKSI_BLN() {
		return RATA_TRANSAKSI_BLN;
	}
	public void setRATA_TRANSAKSI_BLN(String rATA_TRANSAKSI_BLN) {
		RATA_TRANSAKSI_BLN = rATA_TRANSAKSI_BLN;
	}
	public String getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}

}
