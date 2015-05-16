package com.trim.reg.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cl_client_family")
public class ClientFamily {
	
	@Id
	@GeneratedValue
	private BigDecimal ID_CF;
	private String IDT_CLIENT;
	private String NAMA_LENGKAP_P;
	private String HUBUNGAN_P;
	private String TMP_LAHIR_P;
	private String NEGARA_LAHIR_P;
	private String TGL_LAHIR_P;
	private String TIPE_ID_P;
	private String NOMOR_ID_P;
	private String MASA_BERLAKU_ID_P;
	private String KEWARGANEGARAAN_P;
	private String ALAMAT_IDEN_P;
	private String NEGARA_IDEN_P;
	private String PROPINSI_IDEN_P;
	private String KOTA_IDEN_P;
	private String RTRW_IDEN_P;
	private String KODE_POS_IDEN_P;
	private String LAMA_TINGGAL_IDEN_P;
	private String STATUS_KEPEMILIKAN_IDEN_P;
	private String ALAMAT_SKRG_P;
	private String NEGARA_SKRG_P;
	private String PROPINSI_SKRG_P;
	private String KOTA_SKRG_P;
	private String RTRW_SKRG_P;
	private String KODE_POS_SKRG_P;
	private String LAMA_TINGGAL_SKRG_P;
	private String STATUS_KEPEMILIKAN_SKRG_P;
	private String NO_HP_P;
	private String PEKERJAAN_P;
	private String JABATAN_P;
	private String NAMA_PERUSAHAAN_P;
	private String ALAMAT_KANTOR1_P;
	private String ALAMAT_KANTOR2_P;
	private String KOTA_KANTOR_P;
	private String KODEPOS_KANTOR_P;
	private String NEGARA_KANTOR_P;
	private String LAMA_BEKERJA_P;
	private String BIDANG_USAHA_P;
	private String TELPON_KANTOR_P;
	private String TELEPON_P;
	private String EMAIL_P;
	private String FAX_OFFICE_P;
	private String PENGHASILAN_THN_P;
	private String TAMBAHAN_THN_P;
	private String SUMBER_PENGHASILAN_TAMBAHAN;
	private String CREATE_DATE;
	private String UPDATE_DATE;
	
	public BigDecimal getID_CF() {
		return ID_CF;
	}
	public void setID_CF(BigDecimal iD_CF) {
		ID_CF = iD_CF;
	}
	public String getIDT_CLIENT() {
		return IDT_CLIENT;
	}
	public void setIDT_CLIENT(String iDT_CLIENT) {
		IDT_CLIENT = iDT_CLIENT;
	}
	public String getNAMA_LENGKAP_P() {
		return NAMA_LENGKAP_P;
	}
	public void setNAMA_LENGKAP_P(String nAMA_LENGKAP_P) {
		NAMA_LENGKAP_P = nAMA_LENGKAP_P;
	}
	public String getHUBUNGAN_P() {
		return HUBUNGAN_P;
	}
	public void setHUBUNGAN_P(String hUBUNGAN_P) {
		HUBUNGAN_P = hUBUNGAN_P;
	}
	public String getTMP_LAHIR_P() {
		return TMP_LAHIR_P;
	}
	public void setTMP_LAHIR_P(String tMP_LAHIR_P) {
		TMP_LAHIR_P = tMP_LAHIR_P;
	}
	public String getNEGARA_LAHIR_P() {
		return NEGARA_LAHIR_P;
	}
	public void setNEGARA_LAHIR_P(String nEGARA_LAHIR_P) {
		NEGARA_LAHIR_P = nEGARA_LAHIR_P;
	}
	public String getTGL_LAHIR_P() {
		return TGL_LAHIR_P;
	}
	public void setTGL_LAHIR_P(String tGL_LAHIR_P) {
		TGL_LAHIR_P = tGL_LAHIR_P;
	}
	public String getTIPE_ID_P() {
		return TIPE_ID_P;
	}
	public void setTIPE_ID_P(String tIPE_ID_P) {
		TIPE_ID_P = tIPE_ID_P;
	}
	public String getNOMOR_ID_P() {
		return NOMOR_ID_P;
	}
	public void setNOMOR_ID_P(String nOMOR_ID_P) {
		NOMOR_ID_P = nOMOR_ID_P;
	}
	public String getMASA_BERLAKU_ID_P() {
		return MASA_BERLAKU_ID_P;
	}
	public void setMASA_BERLAKU_ID_P(String mASA_BERLAKU_ID_P) {
		MASA_BERLAKU_ID_P = mASA_BERLAKU_ID_P;
	}
	public String getKEWARGANEGARAAN_P() {
		return KEWARGANEGARAAN_P;
	}
	public void setKEWARGANEGARAAN_P(String kEWARGANEGARAAN_P) {
		KEWARGANEGARAAN_P = kEWARGANEGARAAN_P;
	}
	public String getALAMAT_IDEN_P() {
		return ALAMAT_IDEN_P;
	}
	public void setALAMAT_IDEN_P(String aLAMAT_IDEN_P) {
		ALAMAT_IDEN_P = aLAMAT_IDEN_P;
	}
	public String getNEGARA_IDEN_P() {
		return NEGARA_IDEN_P;
	}
	public void setNEGARA_IDEN_P(String nEGARA_IDEN_P) {
		NEGARA_IDEN_P = nEGARA_IDEN_P;
	}
	public String getPROPINSI_IDEN_P() {
		return PROPINSI_IDEN_P;
	}
	public void setPROPINSI_IDEN_P(String pROPINSI_IDEN_P) {
		PROPINSI_IDEN_P = pROPINSI_IDEN_P;
	}
	public String getKOTA_IDEN_P() {
		return KOTA_IDEN_P;
	}
	public void setKOTA_IDEN_P(String kOTA_IDEN_P) {
		KOTA_IDEN_P = kOTA_IDEN_P;
	}
	public String getRTRW_IDEN_P() {
		return RTRW_IDEN_P;
	}
	public void setRTRW_IDEN_P(String rTRW_IDEN_P) {
		RTRW_IDEN_P = rTRW_IDEN_P;
	}
	public String getKODE_POS_IDEN_P() {
		return KODE_POS_IDEN_P;
	}
	public void setKODE_POS_IDEN_P(String kODE_POS_IDEN_P) {
		KODE_POS_IDEN_P = kODE_POS_IDEN_P;
	}
	public String getLAMA_TINGGAL_IDEN_P() {
		return LAMA_TINGGAL_IDEN_P;
	}
	public void setLAMA_TINGGAL_IDEN_P(String lAMA_TINGGAL_IDEN_P) {
		LAMA_TINGGAL_IDEN_P = lAMA_TINGGAL_IDEN_P;
	}
	public String getSTATUS_KEPEMILIKAN_IDEN_P() {
		return STATUS_KEPEMILIKAN_IDEN_P;
	}
	public void setSTATUS_KEPEMILIKAN_IDEN_P(String sTATUS_KEPEMILIKAN_IDEN_P) {
		STATUS_KEPEMILIKAN_IDEN_P = sTATUS_KEPEMILIKAN_IDEN_P;
	}
	public String getALAMAT_SKRG_P() {
		return ALAMAT_SKRG_P;
	}
	public void setALAMAT_SKRG_P(String aLAMAT_SKRG_P) {
		ALAMAT_SKRG_P = aLAMAT_SKRG_P;
	}
	public String getNEGARA_SKRG_P() {
		return NEGARA_SKRG_P;
	}
	public void setNEGARA_SKRG_P(String nEGARA_SKRG_P) {
		NEGARA_SKRG_P = nEGARA_SKRG_P;
	}
	public String getPROPINSI_SKRG_P() {
		return PROPINSI_SKRG_P;
	}
	public void setPROPINSI_SKRG_P(String pROPINSI_SKRG_P) {
		PROPINSI_SKRG_P = pROPINSI_SKRG_P;
	}
	public String getKOTA_SKRG_P() {
		return KOTA_SKRG_P;
	}
	public void setKOTA_SKRG_P(String kOTA_SKRG_P) {
		KOTA_SKRG_P = kOTA_SKRG_P;
	}
	public String getRTRW_SKRG_P() {
		return RTRW_SKRG_P;
	}
	public void setRTRW_SKRG_P(String rTRW_SKRG_P) {
		RTRW_SKRG_P = rTRW_SKRG_P;
	}
	public String getKODE_POS_SKRG_P() {
		return KODE_POS_SKRG_P;
	}
	public void setKODE_POS_SKRG_P(String kODE_POS_SKRG_P) {
		KODE_POS_SKRG_P = kODE_POS_SKRG_P;
	}
	public String getLAMA_TINGGAL_SKRG_P() {
		return LAMA_TINGGAL_SKRG_P;
	}
	public void setLAMA_TINGGAL_SKRG_P(String lAMA_TINGGAL_SKRG_P) {
		LAMA_TINGGAL_SKRG_P = lAMA_TINGGAL_SKRG_P;
	}
	public String getSTATUS_KEPEMILIKAN_SKRG_P() {
		return STATUS_KEPEMILIKAN_SKRG_P;
	}
	public void setSTATUS_KEPEMILIKAN_SKRG_P(String sTATUS_KEPEMILIKAN_SKRG_P) {
		STATUS_KEPEMILIKAN_SKRG_P = sTATUS_KEPEMILIKAN_SKRG_P;
	}
	public String getNO_HP_P() {
		return NO_HP_P;
	}
	public void setNO_HP_P(String nO_HP_P) {
		NO_HP_P = nO_HP_P;
	}
	public String getPEKERJAAN_P() {
		return PEKERJAAN_P;
	}
	public void setPEKERJAAN_P(String pEKERJAAN_P) {
		PEKERJAAN_P = pEKERJAAN_P;
	}
	public String getJABATAN_P() {
		return JABATAN_P;
	}
	public void setJABATAN_P(String jABATAN_P) {
		JABATAN_P = jABATAN_P;
	}
	public String getNAMA_PERUSAHAAN_P() {
		return NAMA_PERUSAHAAN_P;
	}
	public void setNAMA_PERUSAHAAN_P(String nAMA_PERUSAHAAN_P) {
		NAMA_PERUSAHAAN_P = nAMA_PERUSAHAAN_P;
	}
	public String getALAMAT_KANTOR1_P() {
		return ALAMAT_KANTOR1_P;
	}
	public void setALAMAT_KANTOR1_P(String aLAMAT_KANTOR1_P) {
		ALAMAT_KANTOR1_P = aLAMAT_KANTOR1_P;
	}
	public String getALAMAT_KANTOR2_P() {
		return ALAMAT_KANTOR2_P;
	}
	public void setALAMAT_KANTOR2_P(String aLAMAT_KANTOR2_P) {
		ALAMAT_KANTOR2_P = aLAMAT_KANTOR2_P;
	}
	public String getKOTA_KANTOR_P() {
		return KOTA_KANTOR_P;
	}
	public void setKOTA_KANTOR_P(String kOTA_KANTOR_P) {
		KOTA_KANTOR_P = kOTA_KANTOR_P;
	}
	public String getKODEPOS_KANTOR_P() {
		return KODEPOS_KANTOR_P;
	}
	public void setKODEPOS_KANTOR_P(String kODEPOS_KANTOR_P) {
		KODEPOS_KANTOR_P = kODEPOS_KANTOR_P;
	}
	public String getNEGARA_KANTOR_P() {
		return NEGARA_KANTOR_P;
	}
	public void setNEGARA_KANTOR_P(String nEGARA_KANTOR_P) {
		NEGARA_KANTOR_P = nEGARA_KANTOR_P;
	}
	public String getLAMA_BEKERJA_P() {
		return LAMA_BEKERJA_P;
	}
	public void setLAMA_BEKERJA_P(String lAMA_BEKERJA_P) {
		LAMA_BEKERJA_P = lAMA_BEKERJA_P;
	}
	public String getBIDANG_USAHA_P() {
		return BIDANG_USAHA_P;
	}
	public void setBIDANG_USAHA_P(String bIDANG_USAHA_P) {
		BIDANG_USAHA_P = bIDANG_USAHA_P;
	}
	public String getTELPON_KANTOR_P() {
		return TELPON_KANTOR_P;
	}
	public void setTELPON_KANTOR_P(String tELPON_KANTOR_P) {
		TELPON_KANTOR_P = tELPON_KANTOR_P;
	}
	public String getTELEPON_P() {
		return TELEPON_P;
	}
	public void setTELEPON_P(String tELEPON_P) {
		TELEPON_P = tELEPON_P;
	}
	public String getEMAIL_P() {
		return EMAIL_P;
	}
	public void setEMAIL_P(String eMAIL_P) {
		EMAIL_P = eMAIL_P;
	}
	public String getFAX_OFFICE_P() {
		return FAX_OFFICE_P;
	}
	public void setFAX_OFFICE_P(String fAX_OFFICE_P) {
		FAX_OFFICE_P = fAX_OFFICE_P;
	}
	public String getPENGHASILAN_THN_P() {
		return PENGHASILAN_THN_P;
	}
	public void setPENGHASILAN_THN_P(String pENGHASILAN_THN_P) {
		PENGHASILAN_THN_P = pENGHASILAN_THN_P;
	}
	public String getTAMBAHAN_THN_P() {
		return TAMBAHAN_THN_P;
	}
	public void setTAMBAHAN_THN_P(String tAMBAHAN_THN_P) {
		TAMBAHAN_THN_P = tAMBAHAN_THN_P;
	}
	public String getSUMBER_PENGHASILAN_TAMBAHAN() {
		return SUMBER_PENGHASILAN_TAMBAHAN;
	}
	public void setSUMBER_PENGHASILAN_TAMBAHAN(String sUMBER_PENGHASILAN_TAMBAHAN) {
		SUMBER_PENGHASILAN_TAMBAHAN = sUMBER_PENGHASILAN_TAMBAHAN;
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
