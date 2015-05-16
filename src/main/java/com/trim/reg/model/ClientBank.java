package com.trim.reg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cl_client_bank")
public class ClientBank {
//	CREATE TABLE `cl_client_bank` (
//			  `ID_CB` int(200) NOT NULL AUTO_INCREMENT,
//			  `IDT_Client` varchar(200) NOT NULL,
//			  `Bank` varchar(250) DEFAULT NULL,
//			  `Pertanyaan` varchar(250) DEFAULT NULL,
//			  `Jawaban` varchar(250) DEFAULT NULL,
//			  `TIN/SSN` varchar(250) DEFAULT NULL,
//			  `Deposit_dana` varchar(200) DEFAULT NULL,
//			  `Deposit_saham` varchar(200) DEFAULT NULL,
//			  `Deposit_lot` varchar(200) DEFAULT NULL,
//			  `Deposit_obligasi` varchar(200) DEFAULT NULL,
//			  `Deposit_rating` varchar(200) DEFAULT NULL,
//			  `Kon_transaksi_email` varchar(200) DEFAULT NULL,
//			  `Kon_user_email` varchar(200) DEFAULT NULL,
//			  `Bank_penarikan` varchar(200) DEFAULT NULL,
//			  `Cabang` varchar(200) DEFAULT NULL,
//			  `No_rekening` varchar(200) DEFAULT NULL,
//			  `Nama_rekening` varchar(250) DEFAULT NULL,
//			  `Create_date` varchar(250) DEFAULT NULL,
//			  `Update_date` varchar(250) DEFAULT NULL,
//			  PRIMARY KEY (`ID_CB`),
//			  UNIQUE KEY `IDT_Client` (`IDT_Client`)
//			) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
	
	@Id
	@GeneratedValue
	private Integer ID_CB;
	private String IDT_CLIENT;
	private String BANK;
	private String PERTANYAAN;
	private String JAWABAN;
	private String TIN;
	private String DEPOSIT_DANA;
	private String DEPOSIT_SAHAM;
	private String DEPOSIT_LOT;
	private String DEPOSIT_OBLIGASI;
	private String DEPOSIT_RATING;
	private String KON_TRANSAKSI_EMAIL;
	private String KON_USER_EMAIL;
	private String BANK_PENARIKAN;
	private String CABANG;
	private String NO_REKENING;
	private String NAMA_REKENING;
	private String CREATE_DATE;
	private String UPDATE_DATE;
	
	public Integer getID_CB() {
		return ID_CB;
	}
	public void setID_CB(Integer iD_CB) {
		ID_CB = iD_CB;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getBANK() {
		return BANK;
	}
	public void setBANK(String bANK) {
		BANK = bANK;
	}
	public String getPERTANYAAN() {
		return PERTANYAAN;
	}
	public void setPERTANYAAN(String pERTANYAAN) {
		PERTANYAAN = pERTANYAAN;
	}
	public String getJAWABAN() {
		return JAWABAN;
	}
	public void setJAWABAN(String jAWABAN) {
		JAWABAN = jAWABAN;
	}
	public String getTIN() {
		return TIN;
	}
	public void setTIN(String tIN) {
		TIN = tIN;
	}
	public String getDEPOSIT_DANA() {
		return DEPOSIT_DANA;
	}
	public void setDEPOSIT_DANA(String dEPOSIT_DANA) {
		DEPOSIT_DANA = dEPOSIT_DANA;
	}
	public String getDEPOSIT_SAHAM() {
		return DEPOSIT_SAHAM;
	}
	public void setDEPOSIT_SAHAM(String dEPOSIT_SAHAM) {
		DEPOSIT_SAHAM = dEPOSIT_SAHAM;
	}
	public String getDEPOSIT_LOT() {
		return DEPOSIT_LOT;
	}
	public void setDEPOSIT_LOT(String dEPOSIT_LOT) {
		DEPOSIT_LOT = dEPOSIT_LOT;
	}
	public String getDEPOSIT_OBLIGASI() {
		return DEPOSIT_OBLIGASI;
	}
	public void setDEPOSIT_OBLIGASI(String dEPOSIT_OBLIGASI) {
		DEPOSIT_OBLIGASI = dEPOSIT_OBLIGASI;
	}
	public String getDEPOSIT_RATING() {
		return DEPOSIT_RATING;
	}
	public void setDEPOSIT_RATING(String dEPOSIT_RATING) {
		DEPOSIT_RATING = dEPOSIT_RATING;
	}
	public String getKON_TRANSAKSI_EMAIL() {
		return KON_TRANSAKSI_EMAIL;
	}
	public void setKON_TRANSAKSI_EMAIL(String kON_TRANSAKSI_EMAIL) {
		KON_TRANSAKSI_EMAIL = kON_TRANSAKSI_EMAIL;
	}
	public String getKON_USER_EMAIL() {
		return KON_USER_EMAIL;
	}
	public void setKON_USER_EMAIL(String kON_USER_EMAIL) {
		KON_USER_EMAIL = kON_USER_EMAIL;
	}
	public String getBANK_PENARIKAN() {
		return BANK_PENARIKAN;
	}
	public void setBANK_PENARIKAN(String bANK_PENARIKAN) {
		BANK_PENARIKAN = bANK_PENARIKAN;
	}
	public String getCABANG() {
		return CABANG;
	}
	public void setCABANG(String cABANG) {
		CABANG = cABANG;
	}
	public String getNO_REKENING() {
		return NO_REKENING;
	}
	public void setNO_REKENING(String nO_REKENING) {
		NO_REKENING = nO_REKENING;
	}
	public String getNAMA_REKENING() {
		return NAMA_REKENING;
	}
	public void setNAMA_REKENING(String nAMA_REKENING) {
		NAMA_REKENING = nAMA_REKENING;
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
