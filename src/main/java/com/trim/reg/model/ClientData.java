package com.trim.reg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cl_client_data")
public class ClientData {
//	CREATE TABLE `cl_client_data` (
//			  `ID_CD` bigint(200) NOT NULL AUTO_INCREMENT,
//			  `IDT_Client` varchar(200) NOT NULL,
//			  `Nama_lengkap` varchar(250) DEFAULT NULL,
//			  `Jenis_kelamin` varchar(10) DEFAULT NULL,
//			  `Tmp_lahir` varchar(250) DEFAULT NULL,
//			  `Tgl_lahir` varchar(200) DEFAULT NULL,
//			  `Kewarganegaraan` varchar(200) DEFAULT NULL,
//			  `Agama` varchar(100) DEFAULT NULL,
//			  `Status_nikah` varchar(100) DEFAULT NULL,
//			  `Alamat_iden` varchar(250) DEFAULT NULL,
//			  `Negara_iden` varchar(250) DEFAULT NULL,
//			  `Provinsi_iden` varchar(250) DEFAULT NULL,
//			  `Kota_iden` varchar(200) DEFAULT NULL,
//			  `RT/RW_iden` varchar(100) DEFAULT NULL,
//			  `Kode_pos_iden` varchar(100) DEFAULT NULL,
//			  `Lama_tinggal_iden` varchar(100) DEFAULT NULL,
//			  `Status_kepemilikan_iden` varchar(200) DEFAULT NULL,
//			  `Alamat_skrg` varchar(200) DEFAULT NULL,
//			  `Negara_skrg` varchar(200) DEFAULT NULL,
//			  `Provinsi_skrg` varchar(200) DEFAULT NULL,
//			  `Kota_skrg` varchar(200) DEFAULT NULL,
//			  `RT/RW_skrg` varchar(100) DEFAULT NULL,
//			  `Kode_pos_skrg` varchar(100) DEFAULT NULL,
//			  `Lama_tinggal_skrg` varchar(100) DEFAULT NULL,
//			  `Status_kepemilikan_skrg` varchar(200) DEFAULT NULL,
//			  `Tipe_identitas` varchar(200) DEFAULT NULL,
//			  `No_identitas` varchar(200) DEFAULT NULL,
//			  `Masa_berlaku_identitas` varchar(100) DEFAULT NULL,
//			  `File_identitas` varchar(300) DEFAULT NULL,
//			  `Status_npwp` varchar(250) DEFAULT NULL,
//			  `No_npwp` varchar(250) DEFAULT NULL,
//			  `Tgl_registrasi_npwp` varchar(250) DEFAULT NULL,
//			  `Status_almt_npwp_ktp` varchar(250) DEFAULT NULL,
//			  `File_npwp` varchar(300) DEFAULT NULL,
//			  `Nama_ibu` varchar(200) DEFAULT NULL,
//			  `Pendidikan` varchar(200) DEFAULT NULL,
//			  `Email` varchar(250) NOT NULL,
//			  `No_telpon` varchar(200) DEFAULT NULL,
//			  `No_hp` varchar(200) DEFAULT NULL,
//			  `Nama_ahli_waris_1` varchar(200) DEFAULT NULL,
//			  `Nama_ahli_waris_2` varchar(200) DEFAULT NULL,
//			  `Nama_ahli_waris_3` varchar(200) DEFAULT NULL,
//			  `Nama_ahli_waris_4` varchar(200) DEFAULT NULL,
//			  `Hubungan_waris_1` varchar(200) DEFAULT NULL,
//			  `Hubungan_waris_2` varchar(200) DEFAULT NULL,
//			  `Hubungan_waris_3` varchar(200) DEFAULT NULL,
//			  `Hubungan_waris_4` varchar(200) DEFAULT NULL,
//			  `SID` varchar(100) DEFAULT NULL,
//			  `Tipe_FPR` varchar(100) DEFAULT NULL,
//			  `Status` varchar(100) DEFAULT NULL,
//			  `Tipe_want` varchar(100) DEFAULT NULL,
//			  `Activated` varchar(20) DEFAULT 'N',
//			  `Create_date` varchar(100) DEFAULT NULL,
//			  `Update_date` varchar(100) DEFAULT NULL,
//			  PRIMARY KEY (`ID_CD`),
//			  UNIQUE KEY `IDT_Client` (`IDT_Client`)
//			) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

	@Id
	@GeneratedValue
	private Integer ID_CD;
	private String IDT_Client;
	private String NAMA_LENGKAP;
	private String JENIS_KELAMIN;
	private String TMP_LAHIR;
	private String TGL_LAHIR;
	private String KEWARGANEGARAAN;
	private String AGAMA;
	private String STATUS_NIKAH;
	private String ALAMAT_IDEN;
	private String NEGARA_IDEN;
	private String PROVINSI_IDEN;
	private String KOTA_IDEN;
	private String RTRW_IDEN;
	private String KODE_POS_IDEN;
	private String LAMA_TINGGAL_IDEN;
	private String STATUS_KEPEMILIKAN_IDEN;
	private String ALAMAT_SKRG;
	private String NEGARA_SKRG;
	private String PROVINSI_SKRG;
	private String KOTA_SKRG;
	private String RTRW_SKRG;
	private String KODE_POS_SKRG;
	private String LAMA_TINGGAL_SKRG;
	private String STATUS_KEPEMILIKAN_SKRG;
	private String TIPE_IDENTITAS;
	private String NO_IDENTITAS;
	private String MASA_BERLAKU_IDENTITAS;
	private String FILE_IDENTITAS;
	private String STATUS_NPWP;
	private String NO_NPWP;
	private String TGL_REGISTRASI_NPWP;
	private String STATUS_ALMT_NPWP_KTP;
	private String FILE_NPWP;
	private String NAMA_IBU;
	private String PENDIDIKAN;
	private String EMAIL;
	private String NO_TELPON;
	private String NO_HP;
	private String NAMA_AHLI_WARIS_1;
	private String NAMA_AHLI_WARIS_2;
	private String NAMA_AHLI_WARIS_3;
	private String NAMA_AHLI_WARIS_4;
	private String HUBUNGAN_WARIS_1;
	private String HUBUNGAN_WARIS_2;
	private String HUBUNGAN_WARIS_3;
	private String HUBUNGAN_WARIS_4;
	private String SID;
	private String TIPE_FPR;
	private String STATUS;
	private String TIPE_WANT;
	private String ACTIVATED;
	private String CREATE_DATE;
	private String UPDATE_DATE;
	
	public Integer getID_CD() {
		return ID_CD;
	}
	public void setID_CD(Integer iD_CD) {
		ID_CD = iD_CD;
	}
	public String getIDT_Client() {
		return IDT_Client;
	}
	public void setIDT_Client(String iDT_Client) {
		IDT_Client = iDT_Client;
	}
	public String getNAMA_LENGKAP() {
		return NAMA_LENGKAP;
	}
	public void setNAMA_LENGKAP(String nAMA_LENGKAP) {
		NAMA_LENGKAP = nAMA_LENGKAP;
	}
	public String getJENIS_KELAMIN() {
		return JENIS_KELAMIN;
	}
	public void setJENIS_KELAMIN(String jENIS_KELAMIN) {
		JENIS_KELAMIN = jENIS_KELAMIN;
	}
	public String getTMP_LAHIR() {
		return TMP_LAHIR;
	}
	public void setTMP_LAHIR(String tMP_LAHIR) {
		TMP_LAHIR = tMP_LAHIR;
	}
	public String getTGL_LAHIR() {
		return TGL_LAHIR;
	}
	public void setTGL_LAHIR(String tGL_LAHIR) {
		TGL_LAHIR = tGL_LAHIR;
	}
	public String getKEWARGANEGARAAN() {
		return KEWARGANEGARAAN;
	}
	public void setKEWARGANEGARAAN(String kEWARGANEGARAAN) {
		KEWARGANEGARAAN = kEWARGANEGARAAN;
	}
	public String getAGAMA() {
		return AGAMA;
	}
	public void setAGAMA(String aGAMA) {
		AGAMA = aGAMA;
	}
	public String getSTATUS_NIKAH() {
		return STATUS_NIKAH;
	}
	public void setSTATUS_NIKAH(String sTATUS_NIKAH) {
		STATUS_NIKAH = sTATUS_NIKAH;
	}
	public String getALAMAT_IDEN() {
		return ALAMAT_IDEN;
	}
	public void setALAMAT_IDEN(String aLAMAT_IDEN) {
		ALAMAT_IDEN = aLAMAT_IDEN;
	}
	public String getNEGARA_IDEN() {
		return NEGARA_IDEN;
	}
	public void setNEGARA_IDEN(String nEGARA_IDEN) {
		NEGARA_IDEN = nEGARA_IDEN;
	}
	public String getPROVINSI_IDEN() {
		return PROVINSI_IDEN;
	}
	public void setPROVINSI_IDEN(String pROVINSI_IDEN) {
		PROVINSI_IDEN = pROVINSI_IDEN;
	}
	public String getKOTA_IDEN() {
		return KOTA_IDEN;
	}
	public void setKOTA_IDEN(String kOTA_IDEN) {
		KOTA_IDEN = kOTA_IDEN;
	}
	public String getRTRW_IDEN() {
		return RTRW_IDEN;
	}
	public void setRTRW_IDEN(String rTRW_IDEN) {
		RTRW_IDEN = rTRW_IDEN;
	}
	public String getKODE_POS_IDEN() {
		return KODE_POS_IDEN;
	}
	public void setKODE_POS_IDEN(String kODE_POS_IDEN) {
		KODE_POS_IDEN = kODE_POS_IDEN;
	}
	public String getLAMA_TINGGAL_IDEN() {
		return LAMA_TINGGAL_IDEN;
	}
	public void setLAMA_TINGGAL_IDEN(String lAMA_TINGGAL_IDEN) {
		LAMA_TINGGAL_IDEN = lAMA_TINGGAL_IDEN;
	}
	public String getSTATUS_KEPEMILIKAN_IDEN() {
		return STATUS_KEPEMILIKAN_IDEN;
	}
	public void setSTATUS_KEPEMILIKAN_IDEN(String sTATUS_KEPEMILIKAN_IDEN) {
		STATUS_KEPEMILIKAN_IDEN = sTATUS_KEPEMILIKAN_IDEN;
	}
	public String getALAMAT_SKRG() {
		return ALAMAT_SKRG;
	}
	public void setALAMAT_SKRG(String aLAMAT_SKRG) {
		ALAMAT_SKRG = aLAMAT_SKRG;
	}
	public String getNEGARA_SKRG() {
		return NEGARA_SKRG;
	}
	public void setNEGARA_SKRG(String nEGARA_SKRG) {
		NEGARA_SKRG = nEGARA_SKRG;
	}
	public String getPROVINSI_SKRG() {
		return PROVINSI_SKRG;
	}
	public void setPROVINSI_SKRG(String pROVINSI_SKRG) {
		PROVINSI_SKRG = pROVINSI_SKRG;
	}
	public String getKOTA_SKRG() {
		return KOTA_SKRG;
	}
	public void setKOTA_SKRG(String kOTA_SKRG) {
		KOTA_SKRG = kOTA_SKRG;
	}
	public String getRTRW_SKRG() {
		return RTRW_SKRG;
	}
	public void setRTRW_SKRG(String rTRW_SKRG) {
		RTRW_SKRG = rTRW_SKRG;
	}
	public String getKODE_POS_SKRG() {
		return KODE_POS_SKRG;
	}
	public void setKODE_POS_SKRG(String kODE_POS_SKRG) {
		KODE_POS_SKRG = kODE_POS_SKRG;
	}
	public String getLAMA_TINGGAL_SKRG() {
		return LAMA_TINGGAL_SKRG;
	}
	public void setLAMA_TINGGAL_SKRG(String lAMA_TINGGAL_SKRG) {
		LAMA_TINGGAL_SKRG = lAMA_TINGGAL_SKRG;
	}
	public String getSTATUS_KEPEMILIKAN_SKRG() {
		return STATUS_KEPEMILIKAN_SKRG;
	}
	public void setSTATUS_KEPEMILIKAN_SKRG(String sTATUS_KEPEMILIKAN_SKRG) {
		STATUS_KEPEMILIKAN_SKRG = sTATUS_KEPEMILIKAN_SKRG;
	}
	public String getTIPE_IDENTITAS() {
		return TIPE_IDENTITAS;
	}
	public void setTIPE_IDENTITAS(String tIPE_IDENTITAS) {
		TIPE_IDENTITAS = tIPE_IDENTITAS;
	}
	public String getNO_IDENTITAS() {
		return NO_IDENTITAS;
	}
	public void setNO_IDENTITAS(String nO_IDENTITAS) {
		NO_IDENTITAS = nO_IDENTITAS;
	}
	public String getMASA_BERLAKU_IDENTITAS() {
		return MASA_BERLAKU_IDENTITAS;
	}
	public void setMASA_BERLAKU_IDENTITAS(String mASA_BERLAKU_IDENTITAS) {
		MASA_BERLAKU_IDENTITAS = mASA_BERLAKU_IDENTITAS;
	}
	public String getFILE_IDENTITAS() {
		return FILE_IDENTITAS;
	}
	public void setFILE_IDENTITAS(String fILE_IDENTITAS) {
		FILE_IDENTITAS = fILE_IDENTITAS;
	}
	public String getSTATUS_NPWP() {
		return STATUS_NPWP;
	}
	public void setSTATUS_NPWP(String sTATUS_NPWP) {
		STATUS_NPWP = sTATUS_NPWP;
	}
	public String getNO_NPWP() {
		return NO_NPWP;
	}
	public void setNO_NPWP(String nO_NPWP) {
		NO_NPWP = nO_NPWP;
	}
	public String getTGL_REGISTRASI_NPWP() {
		return TGL_REGISTRASI_NPWP;
	}
	public void setTGL_REGISTRASI_NPWP(String tGL_REGISTRASI_NPWP) {
		TGL_REGISTRASI_NPWP = tGL_REGISTRASI_NPWP;
	}
	public String getSTATUS_ALMT_NPWP_KTP() {
		return STATUS_ALMT_NPWP_KTP;
	}
	public void setSTATUS_ALMT_NPWP_KTP(String sTATUS_ALMT_NPWP_KTP) {
		STATUS_ALMT_NPWP_KTP = sTATUS_ALMT_NPWP_KTP;
	}
	public String getFILE_NPWP() {
		return FILE_NPWP;
	}
	public void setFILE_NPWP(String fILE_NPWP) {
		FILE_NPWP = fILE_NPWP;
	}
	public String getNAMA_IBU() {
		return NAMA_IBU;
	}
	public void setNAMA_IBU(String nAMA_IBU) {
		NAMA_IBU = nAMA_IBU;
	}
	public String getPENDIDIKAN() {
		return PENDIDIKAN;
	}
	public void setPENDIDIKAN(String pENDIDIKAN) {
		PENDIDIKAN = pENDIDIKAN;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getNO_TELPON() {
		return NO_TELPON;
	}
	public void setNO_TELPON(String nO_TELPON) {
		NO_TELPON = nO_TELPON;
	}
	public String getNO_HP() {
		return NO_HP;
	}
	public void setNO_HP(String nO_HP) {
		NO_HP = nO_HP;
	}
	public String getNAMA_AHLI_WARIS_1() {
		return NAMA_AHLI_WARIS_1;
	}
	public void setNAMA_AHLI_WARIS_1(String nAMA_AHLI_WARIS_1) {
		NAMA_AHLI_WARIS_1 = nAMA_AHLI_WARIS_1;
	}
	public String getNAMA_AHLI_WARIS_2() {
		return NAMA_AHLI_WARIS_2;
	}
	public void setNAMA_AHLI_WARIS_2(String nAMA_AHLI_WARIS_2) {
		NAMA_AHLI_WARIS_2 = nAMA_AHLI_WARIS_2;
	}
	public String getNAMA_AHLI_WARIS_3() {
		return NAMA_AHLI_WARIS_3;
	}
	public void setNAMA_AHLI_WARIS_3(String nAMA_AHLI_WARIS_3) {
		NAMA_AHLI_WARIS_3 = nAMA_AHLI_WARIS_3;
	}
	public String getNAMA_AHLI_WARIS_4() {
		return NAMA_AHLI_WARIS_4;
	}
	public void setNAMA_AHLI_WARIS_4(String nAMA_AHLI_WARIS_4) {
		NAMA_AHLI_WARIS_4 = nAMA_AHLI_WARIS_4;
	}
	public String getHUBUNGAN_WARIS_1() {
		return HUBUNGAN_WARIS_1;
	}
	public void setHUBUNGAN_WARIS_1(String hUBUNGAN_WARIS_1) {
		HUBUNGAN_WARIS_1 = hUBUNGAN_WARIS_1;
	}
	public String getHUBUNGAN_WARIS_2() {
		return HUBUNGAN_WARIS_2;
	}
	public void setHUBUNGAN_WARIS_2(String hUBUNGAN_WARIS_2) {
		HUBUNGAN_WARIS_2 = hUBUNGAN_WARIS_2;
	}
	public String getHUBUNGAN_WARIS_3() {
		return HUBUNGAN_WARIS_3;
	}
	public void setHUBUNGAN_WARIS_3(String hUBUNGAN_WARIS_3) {
		HUBUNGAN_WARIS_3 = hUBUNGAN_WARIS_3;
	}
	public String getHUBUNGAN_WARIS_4() {
		return HUBUNGAN_WARIS_4;
	}
	public void setHUBUNGAN_WARIS_4(String hUBUNGAN_WARIS_4) {
		HUBUNGAN_WARIS_4 = hUBUNGAN_WARIS_4;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getTIPE_FPR() {
		return TIPE_FPR;
	}
	public void setTIPE_FPR(String tIPE_FPR) {
		TIPE_FPR = tIPE_FPR;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getTIPE_WANT() {
		return TIPE_WANT;
	}
	public void setTIPE_WANT(String tIPE_WANT) {
		TIPE_WANT = tIPE_WANT;
	}
	public String getACTIVATED() {
		return ACTIVATED;
	}
	public void setACTIVATED(String aCTIVATED) {
		ACTIVATED = aCTIVATED;
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
