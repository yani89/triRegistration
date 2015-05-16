package com.trim.reg.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="inv_retail_detail")
public class InvRetailDetail {
//	CREATE TABLE `inv_retail_detail` (
//			  `CIF_NO` varchar(10) NOT NULL,
//			  `FIRST_NAME` varchar(60) DEFAULT NULL,
//			  `MID_NAME` varchar(60) DEFAULT NULL,
//			  `LAST_NAME` varchar(60) DEFAULT NULL,
//			  `NICK_NAME` varchar(60) DEFAULT NULL,
//			  `BIRTH_PLACE` varchar(40) DEFAULT NULL,
//			  `BIRTH_DATE` varchar(20) DEFAULT NULL,
//			  `SEX` varchar(5) DEFAULT NULL,
//			  `RELIGION` varchar(5) DEFAULT NULL,
//			  `MARITAL_STATUS` varchar(5) DEFAULT NULL,
//			  `ID_TYPE` varchar(5) DEFAULT NULL,
//			  `ID_INT` varchar(60) DEFAULT NULL,
//			  `NPWP` varchar(60) DEFAULT NULL,
//			  `NPWP_REG_DATE` varchar(20) DEFAULT NULL,
//			  `NATIONALITY` varchar(5) DEFAULT NULL,
//			  `MOTHER_NAME` varchar(60) DEFAULT NULL,
//			  `INT_OF_HEIR` int(8) DEFAULT NULL,
//			  `LIABILITY_INT` int(8) DEFAULT NULL,
//			  `EDUCATION` varchar(5) DEFAULT NULL,
//			  `EDUCATION_OTHER` varchar(30) DEFAULT NULL,
//			  `HOME_PHONE` varchar(60) DEFAULT NULL,
//			  `MOBILE_PHONE` varchar(60) DEFAULT NULL,
//			  `FAX_INT` varchar(60) DEFAULT NULL,
//			  `EMAIL` varchar(60) DEFAULT NULL,
//			  `ADDRESS1` varchar(80) DEFAULT NULL,
//			  `ADDRESS2` varchar(80) DEFAULT NULL,
//			  `ADDRESS3` varchar(80) DEFAULT NULL,
//			  `CITY` varchar(30) DEFAULT NULL,
//			  `PROVINCE` varchar(7) DEFAULT NULL,
//			  `STATE` varchar(40) DEFAULT NULL,
//			  `POSTAL_CODE` varchar(10) DEFAULT NULL,
//			  `OTHER_ADDRESS1` varchar(80) DEFAULT NULL,
//			  `OTHER_ADDRESS2` varchar(80) DEFAULT NULL,
//			  `OTHER_ADDRESS3` varchar(80) DEFAULT NULL,
//			  `OTHER_CITY` varchar(30) DEFAULT NULL,
//			  `OTHER_PROVINCE` varchar(7) DEFAULT NULL,
//			  `OTHER_STATE` varchar(40) DEFAULT NULL,
//			  `OTHER_POSTAL_CODE` varchar(10) DEFAULT NULL,
//			  `HOME_STATUS` varchar(5) DEFAULT NULL,
//			  `LIVING_YEAR` int(8) DEFAULT NULL,
//			  `COR_ADDRRESS_STAT` varchar(5) DEFAULT NULL,
//			  `COR_ADDRESS1` varchar(160) DEFAULT NULL,
//			  `COR_ADDRESS2` varchar(80) DEFAULT NULL,
//			  `COR_ADDRESS3` varchar(80) DEFAULT NULL,
//			  `COR_CITY` varchar(30) DEFAULT NULL,
//			  `COR_PROVICE` varchar(7) DEFAULT NULL,
//			  `COR_STATE` varchar(40) DEFAULT NULL,
//			  `COR_POSTAL_CODE` varchar(10) DEFAULT NULL,
//			  `JOBS` varchar(5) DEFAULT NULL,
//			  `JOBS_OTHER` varchar(30) DEFAULT NULL,
//			  `JOB_COMPANY_TITLE` varchar(60) DEFAULT NULL,
//			  `WORKING_YEAR` int(8) DEFAULT NULL,
//			  `OFFICE_ADDRESS1` varchar(60) DEFAULT NULL,
//			  `OFFICE_ADDRESS2` varchar(60) DEFAULT NULL,
//			  `OFFICE_ADDRESS3` varchar(60) DEFAULT NULL,
//			  `JOBS_POSITION` varchar(5) DEFAULT NULL,
//			  `OFFICE_PHONE` varchar(60) DEFAULT NULL,
//			  `OFFICE_FAX` varchar(60) DEFAULT NULL,
//			  `OFFICE_EMAIL` varchar(60) DEFAULT NULL,
//			  `WORK_SECTOR` varchar(5) DEFAULT NULL,
//			  `YEAR_OMZET` varchar(5) DEFAULT NULL,
//			  `YEAR_OMZET_OTHER` varchar(30) DEFAULT NULL,
//			  `PRIMARY_INCOME` varchar(5) DEFAULT NULL,
//			  `PRIMARY_SOURCE` varchar(5) DEFAULT NULL,
//			  `PRIMARY_SOURCE_OTHER` varchar(30) DEFAULT NULL,
//			  `ADDON_INCOME` varchar(5) DEFAULT NULL,
//			  `ADDON_INCOME_OTHER` varchar(30) DEFAULT NULL,
//			  `ADDON_SOURCE_INCOME` varchar(60) DEFAULT NULL,
//			  `ADDON_SOURCE_INCOME_OTHER` varchar(30) DEFAULT NULL,
//			  `SOURCE_OF_FUND` varchar(5) DEFAULT NULL,
//			  `SOURCE_OF_FUND_OTHER` varchar(60) DEFAULT NULL,
//			  `INVESTMENT_OBJECTIVE` varchar(50) DEFAULT NULL,
//			  `INVESTMENT_OBJECTIVE_OTHER` varchar(30) DEFAULT NULL,
//			  `WORK_SECTOR_OTHER` varchar(30) DEFAULT NULL,
//			  `INT_CUSTODIAN_BANK` int(8) DEFAULT NULL,
//			  `INT_SETTLEMENT_BANK` int(8) DEFAULT NULL,
//			  `PARENT_FIRST_NAME` varchar(60) DEFAULT NULL,
//			  `PARENT_MID_NAME` varchar(60) DEFAULT NULL,
//			  `PARENT_LAST_NAME` varchar(60) DEFAULT NULL,
//			  `PARENT_BIRTH_PLACE` varchar(40) DEFAULT NULL,
//			  `PARENT_BIRTH_DATE` varchar(20) DEFAULT NULL,
//			  `PARENT_HOME_PHONE` varchar(60) DEFAULT NULL,
//			  `PARENT_MOBILE_PHONE` varchar(60) DEFAULT NULL,
//			  `PARENT_ADDRESS1` varchar(60) DEFAULT NULL,
//			  `PARENT_ADDRESS2` varchar(60) DEFAULT NULL,
//			  `PARENT_ADDRESS3` varchar(60) DEFAULT NULL,
//			  `PARENT_CITY` varchar(30) DEFAULT NULL,
//			  `PARENT_PROVINCE` varchar(7) DEFAULT NULL,
//			  `PARENT_STATE` varchar(40) DEFAULT NULL,
//			  `PARENT_POSTAL_CODE` varchar(10) DEFAULT NULL,
//			  `PARENT_OTHER_ADDRESS1` varchar(60) DEFAULT NULL,
//			  `PARENT_OTHER_ADDRESS2` varchar(60) DEFAULT NULL,
//			  `PARENT_OTHER_ADDRESS3` varchar(60) DEFAULT NULL,
//			  `PARENT_OTHER_CITY` varchar(30) DEFAULT NULL,
//			  `PRANTE_OTHER_PROVINCE` varchar(7) DEFAULT NULL,
//			  `PARENT_OTHER_STATE` varchar(40) DEFAULT NULL,
//			  `PARENT_OTHER_POSTAL_CODE` varchar(10) DEFAULT NULL,
//			  `PARENT_JOBS` varchar(5) DEFAULT NULL,
//			  `PARENT_JOBS_OTHER` varchar(30) DEFAULT NULL,
//			  `PARENT_COMP_TITLE` varchar(60) DEFAULT NULL,
//			  `PARENT_WORKING_YEAR` int(8) DEFAULT NULL,
//			  `PARENT_OFFICE_ADDRESS1` varchar(60) DEFAULT NULL,
//			  `PARENT_OFFICE_ADDRESS2` varchar(60) DEFAULT NULL,
//			  `PARENT_OFFICE_ADDRESS3` varchar(60) DEFAULT NULL,
//			  `PARENT_JOB_POSITION` varchar(5) DEFAULT NULL,
//			  `PARENT_OFFICE_PHONE` varchar(60) DEFAULT NULL,
//			  `PARENT_OFFICE_FAX` varchar(60) DEFAULT NULL,
//			  `PARENT_OFFICE_EMAIL` varchar(60) DEFAULT NULL,
//			  `PARENT_WORK_SECTOR` varchar(5) DEFAULT NULL,
//			  `PARENT_WORK_SECTOR_OTHER` char(30) DEFAULT NULL,
//			  `PARENT_OMZET_YEAR` varchar(5) DEFAULT NULL,
//			  `PARENT_PRIMARY_INCOME` varchar(5) DEFAULT NULL,
//			  `PARENT_SOURCE_INCOME` varchar(5) DEFAULT NULL,
//			  `PARNET_SOURCE_INCOME_OTHER` varchar(30) DEFAULT NULL,
//			  `PARENT_OMZET_OTHER` varchar(30) DEFAULT NULL,
//			  `PARENT_ADDON_SOURCE_INCOME` varchar(60) DEFAULT NULL,
//			  `PARENT_ADDON_SOURCE_OTHER` varchar(30) DEFAULT NULL,
//			  `PARENT_ADDON_INCOME` varchar(5) DEFAULT NULL,
//			  `ID_EXPIRE_DATE` varchar(20) DEFAULT NULL,
//			  `NATIONALITY_OTHERS` varchar(60) DEFAULT NULL,
//			  `HEIR_NAME1` varchar(60) DEFAULT NULL,
//			  `HEIR_NAME2` varchar(60) DEFAULT NULL,
//			  `HEIR_NAME3` varchar(60) DEFAULT NULL,
//			  `HEIR_NAME4` varchar(60) DEFAULT NULL,
//			  `HEIR_RELATION1` varchar(60) DEFAULT NULL,
//			  `HEIR_RELATION2` varchar(60) DEFAULT NULL,
//			  `HEIR_RELATION3` varchar(60) DEFAULT NULL,
//			  `HEIR_RELATION4` varchar(60) DEFAULT NULL,
//			  `MARITAL_STATUS_OTHER` varchar(60) DEFAULT NULL,
//			  `JOB_PRO` varchar(30) DEFAULT NULL,
//			  `WORK_SECTOR_PRO` varchar(30) DEFAULT NULL,
//			  `PARENT_JOB_PRO` varchar(30) DEFAULT NULL,
//			  `PARENT_WORK_SECTOR_PRO` varchar(30) DEFAULT NULL,
//			  `BANK_CUSTODI_1` varchar(100) DEFAULT NULL,
//			  `BANK_CUSTODI_2` varchar(100) DEFAULT NULL,
//			  `BANK_SETTLEMENT_CHOOSE` varchar(5) DEFAULT NULL,
//			  `BANK_SETTLE_NAME_1` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_CAB_1` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_REK_1` varchar(40) DEFAULT NULL,
//			  `BANK_SETTLE_NM_REK_1` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_NAME_2` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_CAB_2` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_REK_2` varchar(40) DEFAULT NULL,
//			  `BANK_SETTLE_NM_REK_2` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_NAME_3` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_CAB_3` varchar(80) DEFAULT NULL,
//			  `BANK_SETTLE_REK_3` varchar(40) DEFAULT NULL,
//			  `BANK_SETTLE_NM_REK_3` varchar(80) DEFAULT NULL,
//			  `OTHER_FAM_NAME` varchar(150) DEFAULT NULL,
//			  `OTHER_FAM_RELATION` varchar(60) DEFAULT NULL,
//			  `OTHER_FAM_ADDRESS` varchar(250) DEFAULT NULL,
//			  `OTHER_FAM_TELP` varchar(30) DEFAULT NULL,
//			  `INV_NO` varchar(15) DEFAULT NULL,
//			  `FPR_NO` varchar(10) DEFAULT NULL,
//			  `USER_LAST_UPDATE` varchar(60) DEFAULT NULL,
//			  `USER_LAST_DT_UP` varchar(20) DEFAULT NULL,
//			  `USER_APPROVAL` varchar(60) DEFAULT NULL,
//			  `USER_DATE_APPROV` varchar(20) DEFAULT NULL,
//			  `PROFILE_RISK_ANSWER` varchar(50) DEFAULT NULL,
//			  `PROFILE_RISK_SCORE` int(8) DEFAULT NULL,
//			  `PROFILE_RISK_DETAIL_VAL` varchar(50) DEFAULT NULL,
//			  `PROFILE_RISK_TYPE` varchar(5) DEFAULT NULL,
//			  `ALOK_TRIM` varchar(300) DEFAULT NULL,
//			  `ALOK_OTHER` varchar(80) DEFAULT NULL,
//			  `ALOK_OTHER_VAL` varchar(150) DEFAULT NULL,
//			  `WANCARA_RESULT` varchar(10) DEFAULT NULL,
//			  `WANCARA_RES_OTHER` varchar(150) DEFAULT NULL,
//			  `WANCARA_ANALIS` varchar(300) DEFAULT NULL,
//			  `WANCARA_REVIEWER` varchar(300) DEFAULT NULL,
//			  `WANCARA_CATATAN` varchar(300) DEFAULT NULL,
//			  `KET_KONDISI` varchar(400) DEFAULT NULL,
//			  `QUEST_CODE` varchar(8) DEFAULT NULL,
//			  `Q1_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q1_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q1_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q1_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q1_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q1_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q2_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q2_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q2_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q2_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q2_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q2_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q3_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q3_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q3_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q3_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q3_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q3_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q4_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q4_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q4_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q4_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q4_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q4_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q5_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q5_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q5_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q5_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q5_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q5_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q6_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q6_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q6_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q6_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q6_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q6_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q7_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q7_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q7_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q7_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q7_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q7_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q8_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q8_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q8_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q8_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q8_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q8_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q9_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q9_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q9_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q9_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q9_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q9_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q10_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q10_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q10_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q10_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q10_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q10_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q11_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q11_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q11_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q11_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q11_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q11_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `Q12_ANSWER_TYPE` varchar(5) DEFAULT NULL,
//			  `Q12_ANSWER_1` varchar(300) DEFAULT NULL,
//			  `Q12_ANSWER_2` varchar(300) DEFAULT NULL,
//			  `Q12_ANSWER_3` varchar(300) DEFAULT NULL,
//			  `Q12_ANSWER_4` varchar(300) DEFAULT NULL,
//			  `Q12_ANSWER_5` varchar(300) DEFAULT NULL,
//			  `LIFETIME_EXP` varchar(5) DEFAULT NULL,
//			  `DOCUMENT_LIST` varchar(30) DEFAULT NULL,
//			  `DIAJUKAN_OLEH` varchar(150) DEFAULT NULL,
//			  `DICEK_OLEH` varchar(150) DEFAULT NULL,
//			  `PEJABAT_BERWENANG` varchar(150) DEFAULT NULL,
//			  `APPROVED_CEK` varchar(1) DEFAULT NULL,
//			  `USER_CHECKER` varchar(150) DEFAULT NULL,
//			  `CHECKER_UPDATE` varchar(20) DEFAULT NULL,
//			  PRIMARY KEY (`CIF_NO`),
//			  UNIQUE KEY `EMAIL` (`EMAIL`)
//			) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	private String CIF_NO, FIRST_NAME, MID_NAME, LAST_NAME, NICK_NAME, BIRTH_PLACE, BIRTH_DATE,
	SEX, RELIGION, MARITAL_STATUS, ID_TYPE, ID_INT, NPWP, NPWP_REG_DATE, NATIONALITY, MOTHER_NAME, INT_OF_HEIR, LIABILITY_INT,
	EDUCATION, EDUCATION_OTHER, HOME_PHONE, MOBILE_PHONE, FAX_INT, EMAIL, ADDRESS1, ADDRESS2, ADDRESS3,
	CITY, PROVINCE, STATE, POSTAL_CODE, OTHER_ADDRESS1, OTHER_ADDRESS2, OTHER_ADDRESS3,
	OTHER_CITY, OTHER_PROVINCE, OTHER_STATE, OTHER_POSTAL_CODE, HOME_STATUS, LIVING_YEAR, COR_ADDRESS_STAT,
	COR_ADDRESS1, COR_ADDRESS2, COR_ADDRESS3, COR_CITY, COR_PROVICE, COR_STATE, COR_POSTAL_CODE, JOBS,
	JOBS_OTHER, JOB_COMPANY_TITLE, WORKING_YEAR, OFFICE_ADDRESS1, OFFICE_ADDRESS2, OFFICE_ADDRESS3,
	JOBS_POSITION, OFFICE_FAX, OFFICE_EMAIL, WORK_SECTOR, YEAR_OMZET, YEAR_OMZET_OTHER, PRIMARY_INCOME, PRIMARY_SOURCE, PRIMARY_SOURCE_OTHER,
	ADDON_INCOME, ADDON_INCOME_OTHER, ADDON_SOURCE_INCOME, ADDON_SOURCE_INCOME_OTHER, SOURCE_OF_FUND, SOURCE_OF_FUND_OTHER,
	INVESTMENT_OBJECTIVE, INVESTMENT_OBJECTIVE_OTHER, WORK_SECTOR_OTHER, PARENT_FIRST_NAME, PARENT_MID_NAME, PARENT_LAST_NAME,
	PARENT_BIRTH_PLACE, PARENT_BIRTH_DATE, PARENT_HOME_PHONE, PARENT_MOBILE_PHONE, PARENT_ADDRESS1, PARENT_ADDRESS2, PARENT_ADDRESS3,
	PARENT_CITY, PARENT_PROVINCE, PARENT_STATE, PARENT_POSTAL_CODE, PARENT_OTHER_ADDRESS1, PARENT_OTHER_ADDRESS2, PARENT_OTHER_ADDRESS3,
	PARENT_OTHER_CITY, PRANTE_OTHER_PROVINCE, PRANTE_OTHER_STATE, PARENT_OTHER_POSTAL_CODE, PARENT_JOBS, PARENT_JOBS_OTHER, PARENT_COMP_TITLE,
	PARENT_WORKING_YEAR, PARENT_OFFICE_ADDRESS1, PARENT_OFFICE_ADDRESS2, PARENT_OFFICE_ADDRESS3, PARENT_JOB_POSITION, PARENT_OFFICE_PHONE, PARENT_OFFICE_FAX,
	PARENT_OFFICE_EMAIL, PARENT_WORK_SECTOR, PARENT_WORK_SECTOR_OTHER, PARENT_OMZET_YEAR, PARENT_PRIMARY_INCOME, PARENT_SOURCE_INCOME, PARNET_SOURCE_INCOME_OTHER,
	PARENT_OMZET_OTHER, PARENT_ADDON_SOURCE_INCOME, PARENT_ADDON_SOURCE_OTHER, PARENT_ADDON_INCOME,
	ID_EXPIRE_DATE, NATIONALITY_OTHERS, HEIR_NAME1, HEIR_NAME2, HEIR_NAME3, HEIR_NAME4, HEIR_RELATION1, HEIR_RELATION2, HEIR_RELATION3, HEIR_RELATION4,
	MARITAL_STATUS_OTHER, JOB_PRO, WORK_SECTOR_PRO, PARENT_JOB_PRO, PARENT_WORK_SECTOR_PRO, BANK_CUSTODI_1, BANK_CUSTODI_2,
	BANK_SETTLEMENT_CHOOSE, BANK_SETTLE_NAME_1, BANK_SETTLE_CAB_1, BANK_SETTLE_REK_1, BANK_SETTLE_NM_REK_1,BANK_SETTLE_NAME_2,
	BANK_SETTLE_CAB_2, BANK_SETTLE_REK_2, BANK_SETTLE_NM_REK_2, BANK_SETTLE_NAME_3, BANK_SETTLE_CAB_3, BANK_SETTLE_REK_3, BANK_SETTLE_NM_REK_3,
	OTHER_FAM_NAME, OTHER_FAM_RELATION, OTHER_FAM_ADDRESS, OTHER_FAM_TELP, INV_NO, FPR_NO, USER_LAST_UPDATE,USER_LAST_DT_UP,USER_APPROVAL,
	USER_DATE_APPROV,PROFILE_RISK_ANSWER,PROFILE_RISK_SCORE,PROFILE_RISK_DETAIL_VAL,PROFILE_RISK_TYPE,ALOK_TRIM,ALOK_OTHER,ALOK_OTHER_VAL,WANCARA_RESULT,
	WANCARA_RES_OTHER,WANCARA_ANALIS,WANCARA_REVIEWER,WANCARA_CATATAN,KET_KONDISI,QUEST_CODE,Q1_ANSWER_TYPE,Q1_ANSWER_1,Q1_ANSWER_2,Q1_ANSWER_3,Q1_ANSWER_4,Q1_ANSWER_5,Q2_ANSWER_TYPE,
	Q2_ANSWER_1,Q2_ANSWER_2,Q2_ANSWER_3,Q2_ANSWER_4,Q2_ANSWER_5,Q3_ANSWER_TYPE,Q3_ANSWER_1,Q3_ANSWER_2,Q3_ANSWER_3,Q3_ANSWER_4,Q3_ANSWER_5,Q4_ANSWER_TYPE,Q4_ANSWER_1,
	Q4_ANSWER_2,Q4_ANSWER_3,Q4_ANSWER_4,Q4_ANSWER_5,
	Q5_ANSWER_TYPE,Q5_ANSWER_1,Q5_ANSWER_2,Q5_ANSWER_3,Q5_ANSWER_4,Q5_ANSWER_5,
	Q6_ANSWER_TYPE,Q6_ANSWER_1,Q6_ANSWER_2,Q6_ANSWER_3,Q6_ANSWER_4,Q6_ANSWER_5,
	Q7_ANSWER_TYPE,Q7_ANSWER_1,Q7_ANSWER_2,Q7_ANSWER_3,Q7_ANSWER_4,Q7_ANSWER_5,
	Q8_ANSWER_TYPE,Q8_ANSWER_1,Q8_ANSWER_2,Q8_ANSWER_3,Q8_ANSWER_4,Q8_ANSWER_5,
	Q9_ANSWER_TYPE,Q9_ANSWER_1,Q9_ANSWER_2,Q9_ANSWER_3,Q9_ANSWER_4,Q9_ANSWER_5,
	Q10_ANSWER_TYPE,Q10_ANSWER_1,Q10_ANSWER_2,Q10_ANSWER_3,Q10_ANSWER_4,Q10_ANSWER_5,
	Q11_ANSWER_TYPE,Q11_ANSWER_1,Q11_ANSWER_2,Q11_ANSWER_3,Q11_ANSWER_4,Q11_ANSWER_5,
	Q12_ANSWER_TYPE,Q12_ANSWER_1,Q12_ANSWER_2,Q12_ANSWER_3,Q12_ANSWER_4,Q12_ANSWER_5,
	LIFETIME_EXP,DOCUMENT_LIST,DIAJUKAN_OLEH,DICEK_OLEH,PEJABAT_BERWENANG,APPROVED_CEK,USER_CHECKER,CHECKER_UPDATE;
	
	private Integer INT_CUSTODIAN_BANK, INT_SETTLEMENT_BANK;
	
	public String getCIF_NO() {
		return CIF_NO;
	}


	public void setCIF_NO(String cIF_NO) {
		CIF_NO = cIF_NO;
	}


	public String getFIRST_NAME() {
		return FIRST_NAME;
	}


	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}


	public String getMID_NAME() {
		return MID_NAME;
	}


	public void setMID_NAME(String mID_NAME) {
		MID_NAME = mID_NAME;
	}


	public String getLAST_NAME() {
		return LAST_NAME;
	}


	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}


	public String getNICK_NAME() {
		return NICK_NAME;
	}


	public void setNICK_NAME(String nICK_NAME) {
		NICK_NAME = nICK_NAME;
	}


	public String getBIRTH_PLACE() {
		return BIRTH_PLACE;
	}


	public void setBIRTH_PLACE(String bIRTH_PLACE) {
		BIRTH_PLACE = bIRTH_PLACE;
	}


	public String getBIRTH_DATE() {
		return BIRTH_DATE;
	}


	public void setBIRTH_DATE(String bIRTH_DATE) {
		BIRTH_DATE = bIRTH_DATE;
	}


	public String getSEX() {
		return SEX;
	}


	public void setSEX(String sEX) {
		SEX = sEX;
	}


	public String getRELIGION() {
		return RELIGION;
	}


	public void setRELIGION(String rELIGION) {
		RELIGION = rELIGION;
	}


	public String getMARITAL_STATUS() {
		return MARITAL_STATUS;
	}


	public void setMARITAL_STATUS(String mARITAL_STATUS) {
		MARITAL_STATUS = mARITAL_STATUS;
	}


	public String getID_TYPE() {
		return ID_TYPE;
	}


	public void setID_TYPE(String iD_TYPE) {
		ID_TYPE = iD_TYPE;
	}


	public String getID_INT() {
		return ID_INT;
	}


	public void setID_INT(String iD_INT) {
		ID_INT = iD_INT;
	}


	public String getNPWP() {
		return NPWP;
	}


	public void setNPWP(String nPWP) {
		NPWP = nPWP;
	}


	public String getNPWP_REG_DATE() {
		return NPWP_REG_DATE;
	}


	public void setNPWP_REG_DATE(String nPWP_REG_DATE) {
		NPWP_REG_DATE = nPWP_REG_DATE;
	}


	public String getNATIONALITY() {
		return NATIONALITY;
	}


	public void setNATIONALITY(String nATIONALITY) {
		NATIONALITY = nATIONALITY;
	}


	public String getMOTHER_NAME() {
		return MOTHER_NAME;
	}


	public void setMOTHER_NAME(String mOTHER_NAME) {
		MOTHER_NAME = mOTHER_NAME;
	}


	public String getINT_OF_HEIR() {
		return INT_OF_HEIR;
	}


	public void setINT_OF_HEIR(String iNT_OF_HEIR) {
		INT_OF_HEIR = iNT_OF_HEIR;
	}


	public String getLIABILITY_INT() {
		return LIABILITY_INT;
	}


	public void setLIABILITY_INT(String lIABILITY_INT) {
		LIABILITY_INT = lIABILITY_INT;
	}


	public String getEDUCATION() {
		return EDUCATION;
	}


	public void setEDUCATION(String eDUCATION) {
		EDUCATION = eDUCATION;
	}


	public String getEDUCATION_OTHER() {
		return EDUCATION_OTHER;
	}


	public void setEDUCATION_OTHER(String eDUCATION_OTHER) {
		EDUCATION_OTHER = eDUCATION_OTHER;
	}


	public String getHOME_PHONE() {
		return HOME_PHONE;
	}


	public void setHOME_PHONE(String hOME_PHONE) {
		HOME_PHONE = hOME_PHONE;
	}


	public String getMOBILE_PHONE() {
		return MOBILE_PHONE;
	}


	public void setMOBILE_PHONE(String mOBILE_PHONE) {
		MOBILE_PHONE = mOBILE_PHONE;
	}


	public String getFAX_INT() {
		return FAX_INT;
	}


	public void setFAX_INT(String fAX_INT) {
		FAX_INT = fAX_INT;
	}


	public String getEMAIL() {
		return EMAIL;
	}


	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}


	public String getADDRESS1() {
		return ADDRESS1;
	}


	public void setADDRESS1(String aDDRESS1) {
		ADDRESS1 = aDDRESS1;
	}


	public String getADDRESS2() {
		return ADDRESS2;
	}


	public void setADDRESS2(String aDDRESS2) {
		ADDRESS2 = aDDRESS2;
	}


	public String getADDRESS3() {
		return ADDRESS3;
	}


	public void setADDRESS3(String aDDRESS3) {
		ADDRESS3 = aDDRESS3;
	}


	public String getCITY() {
		return CITY;
	}


	public void setCITY(String cITY) {
		CITY = cITY;
	}


	public String getPROVINCE() {
		return PROVINCE;
	}


	public void setPROVINCE(String pROVINCE) {
		PROVINCE = pROVINCE;
	}


	public String getSTATE() {
		return STATE;
	}


	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}


	public String getPOSTAL_CODE() {
		return POSTAL_CODE;
	}


	public void setPOSTAL_CODE(String pOSTAL_CODE) {
		POSTAL_CODE = pOSTAL_CODE;
	}


	public String getOTHER_ADDRESS1() {
		return OTHER_ADDRESS1;
	}


	public void setOTHER_ADDRESS1(String oTHER_ADDRESS1) {
		OTHER_ADDRESS1 = oTHER_ADDRESS1;
	}


	public String getOTHER_ADDRESS2() {
		return OTHER_ADDRESS2;
	}


	public void setOTHER_ADDRESS2(String oTHER_ADDRESS2) {
		OTHER_ADDRESS2 = oTHER_ADDRESS2;
	}


	public String getOTHER_ADDRESS3() {
		return OTHER_ADDRESS3;
	}


	public void setOTHER_ADDRESS3(String oTHER_ADDRESS3) {
		OTHER_ADDRESS3 = oTHER_ADDRESS3;
	}


	public String getOTHER_CITY() {
		return OTHER_CITY;
	}


	public void setOTHER_CITY(String oTHER_CITY) {
		OTHER_CITY = oTHER_CITY;
	}


	public String getOTHER_PROVINCE() {
		return OTHER_PROVINCE;
	}


	public void setOTHER_PROVINCE(String oTHER_PROVINCE) {
		OTHER_PROVINCE = oTHER_PROVINCE;
	}


	public String getOTHER_STATE() {
		return OTHER_STATE;
	}


	public void setOTHER_STATE(String oTHER_STATE) {
		OTHER_STATE = oTHER_STATE;
	}


	public String getOTHER_POSTAL_CODE() {
		return OTHER_POSTAL_CODE;
	}


	public void setOTHER_POSTAL_CODE(String oTHER_POSTAL_CODE) {
		OTHER_POSTAL_CODE = oTHER_POSTAL_CODE;
	}


	public String getHOME_STATUS() {
		return HOME_STATUS;
	}


	public void setHOME_STATUS(String hOME_STATUS) {
		HOME_STATUS = hOME_STATUS;
	}


	public String getLIVING_YEAR() {
		return LIVING_YEAR;
	}


	public void setLIVING_YEAR(String lIVING_YEAR) {
		LIVING_YEAR = lIVING_YEAR;
	}


	public String getCOR_ADDRESS_STAT() {
		return COR_ADDRESS_STAT;
	}


	public void setCOR_ADDRESS_STAT(String cOR_ADDRESS_STAT) {
		COR_ADDRESS_STAT = cOR_ADDRESS_STAT;
	}


	public String getCOR_ADDRESS1() {
		return COR_ADDRESS1;
	}


	public void setCOR_ADDRESS1(String cOR_ADDRESS1) {
		COR_ADDRESS1 = cOR_ADDRESS1;
	}


	public String getCOR_ADDRESS2() {
		return COR_ADDRESS2;
	}


	public void setCOR_ADDRESS2(String cOR_ADDRESS2) {
		COR_ADDRESS2 = cOR_ADDRESS2;
	}


	public String getCOR_ADDRESS3() {
		return COR_ADDRESS3;
	}


	public void setCOR_ADDRESS3(String cOR_ADDRESS3) {
		COR_ADDRESS3 = cOR_ADDRESS3;
	}


	public String getCOR_CITY() {
		return COR_CITY;
	}


	public void setCOR_CITY(String cOR_CITY) {
		COR_CITY = cOR_CITY;
	}


	public String getCOR_PROVICE() {
		return COR_PROVICE;
	}


	public void setCOR_PROVICE(String cOR_PROVICE) {
		COR_PROVICE = cOR_PROVICE;
	}


	public String getCOR_STATE() {
		return COR_STATE;
	}


	public void setCOR_STATE(String cOR_STATE) {
		COR_STATE = cOR_STATE;
	}


	public String getCOR_POSTAL_CODE() {
		return COR_POSTAL_CODE;
	}


	public void setCOR_POSTAL_CODE(String cOR_POSTAL_CODE) {
		COR_POSTAL_CODE = cOR_POSTAL_CODE;
	}


	public String getJOBS() {
		return JOBS;
	}


	public void setJOBS(String jOBS) {
		JOBS = jOBS;
	}


	public String getJOBS_OTHER() {
		return JOBS_OTHER;
	}


	public void setJOBS_OTHER(String jOBS_OTHER) {
		JOBS_OTHER = jOBS_OTHER;
	}


	public String getJOB_COMPANY_TITLE() {
		return JOB_COMPANY_TITLE;
	}


	public void setJOB_COMPANY_TITLE(String jOB_COMPANY_TITLE) {
		JOB_COMPANY_TITLE = jOB_COMPANY_TITLE;
	}


	public String getWORKING_YEAR() {
		return WORKING_YEAR;
	}


	public void setWORKING_YEAR(String wORKING_YEAR) {
		WORKING_YEAR = wORKING_YEAR;
	}


	public String getOFFICE_ADDRESS1() {
		return OFFICE_ADDRESS1;
	}


	public void setOFFICE_ADDRESS1(String oFFICE_ADDRESS1) {
		OFFICE_ADDRESS1 = oFFICE_ADDRESS1;
	}


	public String getOFFICE_ADDRESS2() {
		return OFFICE_ADDRESS2;
	}


	public void setOFFICE_ADDRESS2(String oFFICE_ADDRESS2) {
		OFFICE_ADDRESS2 = oFFICE_ADDRESS2;
	}


	public String getOFFICE_ADDRESS3() {
		return OFFICE_ADDRESS3;
	}


	public void setOFFICE_ADDRESS3(String oFFICE_ADDRESS3) {
		OFFICE_ADDRESS3 = oFFICE_ADDRESS3;
	}


	public String getJOBS_POSITION() {
		return JOBS_POSITION;
	}


	public void setJOBS_POSITION(String jOBS_POSITION) {
		JOBS_POSITION = jOBS_POSITION;
	}


	public String getOFFICE_FAX() {
		return OFFICE_FAX;
	}


	public void setOFFICE_FAX(String oFFICE_FAX) {
		OFFICE_FAX = oFFICE_FAX;
	}


	public String getOFFICE_EMAIL() {
		return OFFICE_EMAIL;
	}


	public void setOFFICE_EMAIL(String oFFICE_EMAIL) {
		OFFICE_EMAIL = oFFICE_EMAIL;
	}


	public String getWORK_SECTOR() {
		return WORK_SECTOR;
	}


	public void setWORK_SECTOR(String wORK_SECTOR) {
		WORK_SECTOR = wORK_SECTOR;
	}


	public String getYEAR_OMZET() {
		return YEAR_OMZET;
	}


	public void setYEAR_OMZET(String yEAR_OMZET) {
		YEAR_OMZET = yEAR_OMZET;
	}


	public String getYEAR_OMZET_OTHER() {
		return YEAR_OMZET_OTHER;
	}


	public void setYEAR_OMZET_OTHER(String yEAR_OMZET_OTHER) {
		YEAR_OMZET_OTHER = yEAR_OMZET_OTHER;
	}


	public String getPRIMARY_INCOME() {
		return PRIMARY_INCOME;
	}


	public void setPRIMARY_INCOME(String pRIMARY_INCOME) {
		PRIMARY_INCOME = pRIMARY_INCOME;
	}


	public String getPRIMARY_SOURCE() {
		return PRIMARY_SOURCE;
	}


	public void setPRIMARY_SOURCE(String pRIMARY_SOURCE) {
		PRIMARY_SOURCE = pRIMARY_SOURCE;
	}


	public String getPRIMARY_SOURCE_OTHER() {
		return PRIMARY_SOURCE_OTHER;
	}


	public void setPRIMARY_SOURCE_OTHER(String pRIMARY_SOURCE_OTHER) {
		PRIMARY_SOURCE_OTHER = pRIMARY_SOURCE_OTHER;
	}


	public String getADDON_INCOME() {
		return ADDON_INCOME;
	}


	public void setADDON_INCOME(String aDDON_INCOME) {
		ADDON_INCOME = aDDON_INCOME;
	}


	public String getADDON_INCOME_OTHER() {
		return ADDON_INCOME_OTHER;
	}


	public void setADDON_INCOME_OTHER(String aDDON_INCOME_OTHER) {
		ADDON_INCOME_OTHER = aDDON_INCOME_OTHER;
	}


	public String getADDON_SOURCE_INCOME() {
		return ADDON_SOURCE_INCOME;
	}


	public void setADDON_SOURCE_INCOME(String aDDON_SOURCE_INCOME) {
		ADDON_SOURCE_INCOME = aDDON_SOURCE_INCOME;
	}


	public String getADDON_SOURCE_INCOME_OTHER() {
		return ADDON_SOURCE_INCOME_OTHER;
	}


	public void setADDON_SOURCE_INCOME_OTHER(String aDDON_SOURCE_INCOME_OTHER) {
		ADDON_SOURCE_INCOME_OTHER = aDDON_SOURCE_INCOME_OTHER;
	}


	public String getSOURCE_OF_FUND() {
		return SOURCE_OF_FUND;
	}


	public void setSOURCE_OF_FUND(String sOURCE_OF_FUND) {
		SOURCE_OF_FUND = sOURCE_OF_FUND;
	}


	public String getSOURCE_OF_FUND_OTHER() {
		return SOURCE_OF_FUND_OTHER;
	}


	public void setSOURCE_OF_FUND_OTHER(String sOURCE_OF_FUND_OTHER) {
		SOURCE_OF_FUND_OTHER = sOURCE_OF_FUND_OTHER;
	}


	public String getINVESTMENT_OBJECTIVE() {
		return INVESTMENT_OBJECTIVE;
	}


	public void setINVESTMENT_OBJECTIVE(String iNVESTMENT_OBJECTIVE) {
		INVESTMENT_OBJECTIVE = iNVESTMENT_OBJECTIVE;
	}


	public String getINVESTMENT_OBJECTIVE_OTHER() {
		return INVESTMENT_OBJECTIVE_OTHER;
	}


	public void setINVESTMENT_OBJECTIVE_OTHER(String iNVESTMENT_OBJECTIVE_OTHER) {
		INVESTMENT_OBJECTIVE_OTHER = iNVESTMENT_OBJECTIVE_OTHER;
	}


	public String getWORK_SECTOR_OTHER() {
		return WORK_SECTOR_OTHER;
	}


	public void setWORK_SECTOR_OTHER(String wORK_SECTOR_OTHER) {
		WORK_SECTOR_OTHER = wORK_SECTOR_OTHER;
	}


	public String getPARENT_FIRST_NAME() {
		return PARENT_FIRST_NAME;
	}


	public void setPARENT_FIRST_NAME(String pARENT_FIRST_NAME) {
		PARENT_FIRST_NAME = pARENT_FIRST_NAME;
	}


	public String getPARENT_MID_NAME() {
		return PARENT_MID_NAME;
	}


	public void setPARENT_MID_NAME(String pARENT_MID_NAME) {
		PARENT_MID_NAME = pARENT_MID_NAME;
	}


	public String getPARENT_LAST_NAME() {
		return PARENT_LAST_NAME;
	}


	public void setPARENT_LAST_NAME(String pARENT_LAST_NAME) {
		PARENT_LAST_NAME = pARENT_LAST_NAME;
	}


	public String getPARENT_BIRTH_PLACE() {
		return PARENT_BIRTH_PLACE;
	}


	public void setPARENT_BIRTH_PLACE(String pARENT_BIRTH_PLACE) {
		PARENT_BIRTH_PLACE = pARENT_BIRTH_PLACE;
	}


	public String getPARENT_BIRTH_DATE() {
		return PARENT_BIRTH_DATE;
	}


	public void setPARENT_BIRTH_DATE(String pARENT_BIRTH_DATE) {
		PARENT_BIRTH_DATE = pARENT_BIRTH_DATE;
	}


	public String getPARENT_HOME_PHONE() {
		return PARENT_HOME_PHONE;
	}


	public void setPARENT_HOME_PHONE(String pARENT_HOME_PHONE) {
		PARENT_HOME_PHONE = pARENT_HOME_PHONE;
	}


	public String getPARENT_MOBILE_PHONE() {
		return PARENT_MOBILE_PHONE;
	}


	public void setPARENT_MOBILE_PHONE(String pARENT_MOBILE_PHONE) {
		PARENT_MOBILE_PHONE = pARENT_MOBILE_PHONE;
	}


	public String getPARENT_ADDRESS1() {
		return PARENT_ADDRESS1;
	}


	public void setPARENT_ADDRESS1(String pARENT_ADDRESS1) {
		PARENT_ADDRESS1 = pARENT_ADDRESS1;
	}


	public String getPARENT_ADDRESS2() {
		return PARENT_ADDRESS2;
	}


	public void setPARENT_ADDRESS2(String pARENT_ADDRESS2) {
		PARENT_ADDRESS2 = pARENT_ADDRESS2;
	}


	public String getPARENT_ADDRESS3() {
		return PARENT_ADDRESS3;
	}


	public void setPARENT_ADDRESS3(String pARENT_ADDRESS3) {
		PARENT_ADDRESS3 = pARENT_ADDRESS3;
	}


	public String getPARENT_CITY() {
		return PARENT_CITY;
	}


	public void setPARENT_CITY(String pARENT_CITY) {
		PARENT_CITY = pARENT_CITY;
	}


	public String getPARENT_PROVINCE() {
		return PARENT_PROVINCE;
	}


	public void setPARENT_PROVINCE(String pARENT_PROVINCE) {
		PARENT_PROVINCE = pARENT_PROVINCE;
	}


	public String getPARENT_STATE() {
		return PARENT_STATE;
	}


	public void setPARENT_STATE(String pARENT_STATE) {
		PARENT_STATE = pARENT_STATE;
	}


	public String getPARENT_POSTAL_CODE() {
		return PARENT_POSTAL_CODE;
	}


	public void setPARENT_POSTAL_CODE(String pARENT_POSTAL_CODE) {
		PARENT_POSTAL_CODE = pARENT_POSTAL_CODE;
	}


	public String getPARENT_OTHER_ADDRESS1() {
		return PARENT_OTHER_ADDRESS1;
	}


	public void setPARENT_OTHER_ADDRESS1(String pARENT_OTHER_ADDRESS1) {
		PARENT_OTHER_ADDRESS1 = pARENT_OTHER_ADDRESS1;
	}


	public String getPARENT_OTHER_ADDRESS2() {
		return PARENT_OTHER_ADDRESS2;
	}


	public void setPARENT_OTHER_ADDRESS2(String pARENT_OTHER_ADDRESS2) {
		PARENT_OTHER_ADDRESS2 = pARENT_OTHER_ADDRESS2;
	}


	public String getPARENT_OTHER_ADDRESS3() {
		return PARENT_OTHER_ADDRESS3;
	}


	public void setPARENT_OTHER_ADDRESS3(String pARENT_OTHER_ADDRESS3) {
		PARENT_OTHER_ADDRESS3 = pARENT_OTHER_ADDRESS3;
	}


	public String getPARENT_OTHER_CITY() {
		return PARENT_OTHER_CITY;
	}


	public void setPARENT_OTHER_CITY(String pARENT_OTHER_CITY) {
		PARENT_OTHER_CITY = pARENT_OTHER_CITY;
	}


	public String getPRANTE_OTHER_PROVINCE() {
		return PRANTE_OTHER_PROVINCE;
	}


	public void setPRANTE_OTHER_PROVINCE(String pRANTE_OTHER_PROVINCE) {
		PRANTE_OTHER_PROVINCE = pRANTE_OTHER_PROVINCE;
	}


	public String getPRANTE_OTHER_STATE() {
		return PRANTE_OTHER_STATE;
	}


	public void setPRANTE_OTHER_STATE(String pRANTE_OTHER_STATE) {
		PRANTE_OTHER_STATE = pRANTE_OTHER_STATE;
	}


	public String getPARENT_OTHER_POSTAL_CODE() {
		return PARENT_OTHER_POSTAL_CODE;
	}


	public void setPARENT_OTHER_POSTAL_CODE(String pARENT_OTHER_POSTAL_CODE) {
		PARENT_OTHER_POSTAL_CODE = pARENT_OTHER_POSTAL_CODE;
	}


	public String getPARENT_JOBS() {
		return PARENT_JOBS;
	}


	public void setPARENT_JOBS(String pARENT_JOBS) {
		PARENT_JOBS = pARENT_JOBS;
	}


	public String getPARENT_JOBS_OTHER() {
		return PARENT_JOBS_OTHER;
	}


	public void setPARENT_JOBS_OTHER(String pARENT_JOBS_OTHER) {
		PARENT_JOBS_OTHER = pARENT_JOBS_OTHER;
	}


	public String getPARENT_COMP_TITLE() {
		return PARENT_COMP_TITLE;
	}


	public void setPARENT_COMP_TITLE(String pARENT_COMP_TITLE) {
		PARENT_COMP_TITLE = pARENT_COMP_TITLE;
	}


	public String getPARENT_WORKING_YEAR() {
		return PARENT_WORKING_YEAR;
	}


	public void setPARENT_WORKING_YEAR(String pARENT_WORKING_YEAR) {
		PARENT_WORKING_YEAR = pARENT_WORKING_YEAR;
	}


	public String getPARENT_OFFICE_ADDRESS1() {
		return PARENT_OFFICE_ADDRESS1;
	}


	public void setPARENT_OFFICE_ADDRESS1(String pARENT_OFFICE_ADDRESS1) {
		PARENT_OFFICE_ADDRESS1 = pARENT_OFFICE_ADDRESS1;
	}


	public String getPARENT_OFFICE_ADDRESS2() {
		return PARENT_OFFICE_ADDRESS2;
	}


	public void setPARENT_OFFICE_ADDRESS2(String pARENT_OFFICE_ADDRESS2) {
		PARENT_OFFICE_ADDRESS2 = pARENT_OFFICE_ADDRESS2;
	}


	public String getPARENT_OFFICE_ADDRESS3() {
		return PARENT_OFFICE_ADDRESS3;
	}


	public void setPARENT_OFFICE_ADDRESS3(String pARENT_OFFICE_ADDRESS3) {
		PARENT_OFFICE_ADDRESS3 = pARENT_OFFICE_ADDRESS3;
	}


	public String getPARENT_JOB_POSITION() {
		return PARENT_JOB_POSITION;
	}


	public void setPARENT_JOB_POSITION(String pARENT_JOB_POSITION) {
		PARENT_JOB_POSITION = pARENT_JOB_POSITION;
	}


	public String getPARENT_OFFICE_PHONE() {
		return PARENT_OFFICE_PHONE;
	}


	public void setPARENT_OFFICE_PHONE(String pARENT_OFFICE_PHONE) {
		PARENT_OFFICE_PHONE = pARENT_OFFICE_PHONE;
	}


	public String getPARENT_OFFICE_FAX() {
		return PARENT_OFFICE_FAX;
	}


	public void setPARENT_OFFICE_FAX(String pARENT_OFFICE_FAX) {
		PARENT_OFFICE_FAX = pARENT_OFFICE_FAX;
	}


	public String getPARENT_OFFICE_EMAIL() {
		return PARENT_OFFICE_EMAIL;
	}


	public void setPARENT_OFFICE_EMAIL(String pARENT_OFFICE_EMAIL) {
		PARENT_OFFICE_EMAIL = pARENT_OFFICE_EMAIL;
	}


	public String getPARENT_WORK_SECTOR() {
		return PARENT_WORK_SECTOR;
	}


	public void setPARENT_WORK_SECTOR(String pARENT_WORK_SECTOR) {
		PARENT_WORK_SECTOR = pARENT_WORK_SECTOR;
	}


	public String getPARENT_WORK_SECTOR_OTHER() {
		return PARENT_WORK_SECTOR_OTHER;
	}


	public void setPARENT_WORK_SECTOR_OTHER(String pARENT_WORK_SECTOR_OTHER) {
		PARENT_WORK_SECTOR_OTHER = pARENT_WORK_SECTOR_OTHER;
	}


	public String getPARENT_OMZET_YEAR() {
		return PARENT_OMZET_YEAR;
	}


	public void setPARENT_OMZET_YEAR(String pARENT_OMZET_YEAR) {
		PARENT_OMZET_YEAR = pARENT_OMZET_YEAR;
	}


	public String getPARENT_PRIMARY_INCOME() {
		return PARENT_PRIMARY_INCOME;
	}


	public void setPARENT_PRIMARY_INCOME(String pARENT_PRIMARY_INCOME) {
		PARENT_PRIMARY_INCOME = pARENT_PRIMARY_INCOME;
	}


	public String getPARENT_SOURCE_INCOME() {
		return PARENT_SOURCE_INCOME;
	}


	public void setPARENT_SOURCE_INCOME(String pARENT_SOURCE_INCOME) {
		PARENT_SOURCE_INCOME = pARENT_SOURCE_INCOME;
	}


	public String getPARNET_SOURCE_INCOME_OTHER() {
		return PARNET_SOURCE_INCOME_OTHER;
	}


	public void setPARNET_SOURCE_INCOME_OTHER(String pARNET_SOURCE_INCOME_OTHER) {
		PARNET_SOURCE_INCOME_OTHER = pARNET_SOURCE_INCOME_OTHER;
	}


	public String getPARENT_OMZET_OTHER() {
		return PARENT_OMZET_OTHER;
	}


	public void setPARENT_OMZET_OTHER(String pARENT_OMZET_OTHER) {
		PARENT_OMZET_OTHER = pARENT_OMZET_OTHER;
	}


	public String getPARENT_ADDON_SOURCE_INCOME() {
		return PARENT_ADDON_SOURCE_INCOME;
	}


	public void setPARENT_ADDON_SOURCE_INCOME(String pARENT_ADDON_SOURCE_INCOME) {
		PARENT_ADDON_SOURCE_INCOME = pARENT_ADDON_SOURCE_INCOME;
	}


	public String getPARENT_ADDON_SOURCE_OTHER() {
		return PARENT_ADDON_SOURCE_OTHER;
	}


	public void setPARENT_ADDON_SOURCE_OTHER(String pARENT_ADDON_SOURCE_OTHER) {
		PARENT_ADDON_SOURCE_OTHER = pARENT_ADDON_SOURCE_OTHER;
	}


	public String getPARENT_ADDON_INCOME() {
		return PARENT_ADDON_INCOME;
	}


	public void setPARENT_ADDON_INCOME(String pARENT_ADDON_INCOME) {
		PARENT_ADDON_INCOME = pARENT_ADDON_INCOME;
	}


	public String getID_EXPIRE_DATE() {
		return ID_EXPIRE_DATE;
	}


	public void setID_EXPIRE_DATE(String iD_EXPIRE_DATE) {
		ID_EXPIRE_DATE = iD_EXPIRE_DATE;
	}


	public String getNATIONALITY_OTHERS() {
		return NATIONALITY_OTHERS;
	}


	public void setNATIONALITY_OTHERS(String nATIONALITY_OTHERS) {
		NATIONALITY_OTHERS = nATIONALITY_OTHERS;
	}


	public String getHEIR_NAME1() {
		return HEIR_NAME1;
	}


	public void setHEIR_NAME1(String hEIR_NAME1) {
		HEIR_NAME1 = hEIR_NAME1;
	}


	public String getHEIR_NAME2() {
		return HEIR_NAME2;
	}


	public void setHEIR_NAME2(String hEIR_NAME2) {
		HEIR_NAME2 = hEIR_NAME2;
	}


	public String getHEIR_NAME3() {
		return HEIR_NAME3;
	}


	public void setHEIR_NAME3(String hEIR_NAME3) {
		HEIR_NAME3 = hEIR_NAME3;
	}


	public String getHEIR_NAME4() {
		return HEIR_NAME4;
	}


	public void setHEIR_NAME4(String hEIR_NAME4) {
		HEIR_NAME4 = hEIR_NAME4;
	}


	public String getHEIR_RELATION1() {
		return HEIR_RELATION1;
	}


	public void setHEIR_RELATION1(String hEIR_RELATION1) {
		HEIR_RELATION1 = hEIR_RELATION1;
	}


	public String getHEIR_RELATION2() {
		return HEIR_RELATION2;
	}


	public void setHEIR_RELATION2(String hEIR_RELATION2) {
		HEIR_RELATION2 = hEIR_RELATION2;
	}


	public String getHEIR_RELATION3() {
		return HEIR_RELATION3;
	}


	public void setHEIR_RELATION3(String hEIR_RELATION3) {
		HEIR_RELATION3 = hEIR_RELATION3;
	}


	public String getHEIR_RELATION4() {
		return HEIR_RELATION4;
	}


	public void setHEIR_RELATION4(String hEIR_RELATION4) {
		HEIR_RELATION4 = hEIR_RELATION4;
	}


	public String getMARITAL_STATUS_OTHER() {
		return MARITAL_STATUS_OTHER;
	}


	public void setMARITAL_STATUS_OTHER(String mARITAL_STATUS_OTHER) {
		MARITAL_STATUS_OTHER = mARITAL_STATUS_OTHER;
	}


	public String getJOB_PRO() {
		return JOB_PRO;
	}


	public void setJOB_PRO(String jOB_PRO) {
		JOB_PRO = jOB_PRO;
	}


	public String getWORK_SECTOR_PRO() {
		return WORK_SECTOR_PRO;
	}


	public void setWORK_SECTOR_PRO(String wORK_SECTOR_PRO) {
		WORK_SECTOR_PRO = wORK_SECTOR_PRO;
	}


	public String getPARENT_JOB_PRO() {
		return PARENT_JOB_PRO;
	}


	public void setPARENT_JOB_PRO(String pARENT_JOB_PRO) {
		PARENT_JOB_PRO = pARENT_JOB_PRO;
	}


	public String getPARENT_WORK_SECTOR_PRO() {
		return PARENT_WORK_SECTOR_PRO;
	}


	public void setPARENT_WORK_SECTOR_PRO(String pARENT_WORK_SECTOR_PRO) {
		PARENT_WORK_SECTOR_PRO = pARENT_WORK_SECTOR_PRO;
	}


	public String getBANK_CUSTODI_1() {
		return BANK_CUSTODI_1;
	}


	public void setBANK_CUSTODI_1(String bANK_CUSTODI_1) {
		BANK_CUSTODI_1 = bANK_CUSTODI_1;
	}


	public String getBANK_CUSTODI_2() {
		return BANK_CUSTODI_2;
	}


	public void setBANK_CUSTODI_2(String bANK_CUSTODI_2) {
		BANK_CUSTODI_2 = bANK_CUSTODI_2;
	}


	public String getBANK_SETTLEMENT_CHOOSE() {
		return BANK_SETTLEMENT_CHOOSE;
	}


	public void setBANK_SETTLEMENT_CHOOSE(String bANK_SETTLEMENT_CHOOSE) {
		BANK_SETTLEMENT_CHOOSE = bANK_SETTLEMENT_CHOOSE;
	}


	public String getBANK_SETTLE_NAME_1() {
		return BANK_SETTLE_NAME_1;
	}


	public void setBANK_SETTLE_NAME_1(String bANK_SETTLE_NAME_1) {
		BANK_SETTLE_NAME_1 = bANK_SETTLE_NAME_1;
	}


	public String getBANK_SETTLE_CAB_1() {
		return BANK_SETTLE_CAB_1;
	}


	public void setBANK_SETTLE_CAB_1(String bANK_SETTLE_CAB_1) {
		BANK_SETTLE_CAB_1 = bANK_SETTLE_CAB_1;
	}


	public String getBANK_SETTLE_REK_1() {
		return BANK_SETTLE_REK_1;
	}


	public void setBANK_SETTLE_REK_1(String bANK_SETTLE_REK_1) {
		BANK_SETTLE_REK_1 = bANK_SETTLE_REK_1;
	}


	public String getBANK_SETTLE_NM_REK_1() {
		return BANK_SETTLE_NM_REK_1;
	}


	public void setBANK_SETTLE_NM_REK_1(String bANK_SETTLE_NM_REK_1) {
		BANK_SETTLE_NM_REK_1 = bANK_SETTLE_NM_REK_1;
	}


	public String getBANK_SETTLE_NAME_2() {
		return BANK_SETTLE_NAME_2;
	}


	public void setBANK_SETTLE_NAME_2(String bANK_SETTLE_NAME_2) {
		BANK_SETTLE_NAME_2 = bANK_SETTLE_NAME_2;
	}


	public String getBANK_SETTLE_CAB_2() {
		return BANK_SETTLE_CAB_2;
	}


	public void setBANK_SETTLE_CAB_2(String bANK_SETTLE_CAB_2) {
		BANK_SETTLE_CAB_2 = bANK_SETTLE_CAB_2;
	}


	public String getBANK_SETTLE_REK_2() {
		return BANK_SETTLE_REK_2;
	}


	public void setBANK_SETTLE_REK_2(String bANK_SETTLE_REK_2) {
		BANK_SETTLE_REK_2 = bANK_SETTLE_REK_2;
	}


	public String getBANK_SETTLE_NM_REK_2() {
		return BANK_SETTLE_NM_REK_2;
	}


	public void setBANK_SETTLE_NM_REK_2(String bANK_SETTLE_NM_REK_2) {
		BANK_SETTLE_NM_REK_2 = bANK_SETTLE_NM_REK_2;
	}


	public String getBANK_SETTLE_NAME_3() {
		return BANK_SETTLE_NAME_3;
	}


	public void setBANK_SETTLE_NAME_3(String bANK_SETTLE_NAME_3) {
		BANK_SETTLE_NAME_3 = bANK_SETTLE_NAME_3;
	}


	public String getBANK_SETTLE_CAB_3() {
		return BANK_SETTLE_CAB_3;
	}


	public void setBANK_SETTLE_CAB_3(String bANK_SETTLE_CAB_3) {
		BANK_SETTLE_CAB_3 = bANK_SETTLE_CAB_3;
	}


	public String getBANK_SETTLE_REK_3() {
		return BANK_SETTLE_REK_3;
	}


	public void setBANK_SETTLE_REK_3(String bANK_SETTLE_REK_3) {
		BANK_SETTLE_REK_3 = bANK_SETTLE_REK_3;
	}


	public String getBANK_SETTLE_NM_REK_3() {
		return BANK_SETTLE_NM_REK_3;
	}


	public void setBANK_SETTLE_NM_REK_3(String bANK_SETTLE_NM_REK_3) {
		BANK_SETTLE_NM_REK_3 = bANK_SETTLE_NM_REK_3;
	}


	public String getOTHER_FAM_NAME() {
		return OTHER_FAM_NAME;
	}


	public void setOTHER_FAM_NAME(String oTHER_FAM_NAME) {
		OTHER_FAM_NAME = oTHER_FAM_NAME;
	}


	public String getOTHER_FAM_RELATION() {
		return OTHER_FAM_RELATION;
	}


	public void setOTHER_FAM_RELATION(String oTHER_FAM_RELATION) {
		OTHER_FAM_RELATION = oTHER_FAM_RELATION;
	}


	public String getOTHER_FAM_ADDRESS() {
		return OTHER_FAM_ADDRESS;
	}


	public void setOTHER_FAM_ADDRESS(String oTHER_FAM_ADDRESS) {
		OTHER_FAM_ADDRESS = oTHER_FAM_ADDRESS;
	}


	public String getOTHER_FAM_TELP() {
		return OTHER_FAM_TELP;
	}


	public void setOTHER_FAM_TELP(String oTHER_FAM_TELP) {
		OTHER_FAM_TELP = oTHER_FAM_TELP;
	}


	public String getINV_NO() {
		return INV_NO;
	}


	public void setINV_NO(String iNV_NO) {
		INV_NO = iNV_NO;
	}


	public String getFPR_NO() {
		return FPR_NO;
	}


	public void setFPR_NO(String fPR_NO) {
		FPR_NO = fPR_NO;
	}


	public String getUSER_LAST_UPDATE() {
		return USER_LAST_UPDATE;
	}


	public void setUSER_LAST_UPDATE(String uSER_LAST_UPDATE) {
		USER_LAST_UPDATE = uSER_LAST_UPDATE;
	}


	public String getUSER_LAST_DT_UP() {
		return USER_LAST_DT_UP;
	}


	public void setUSER_LAST_DT_UP(String uSER_LAST_DT_UP) {
		USER_LAST_DT_UP = uSER_LAST_DT_UP;
	}


	public String getUSER_APPROVAL() {
		return USER_APPROVAL;
	}


	public void setUSER_APPROVAL(String uSER_APPROVAL) {
		USER_APPROVAL = uSER_APPROVAL;
	}


	public String getUSER_DATE_APPROV() {
		return USER_DATE_APPROV;
	}


	public void setUSER_DATE_APPROV(String uSER_DATE_APPROV) {
		USER_DATE_APPROV = uSER_DATE_APPROV;
	}


	public String getPROFILE_RISK_ANSWER() {
		return PROFILE_RISK_ANSWER;
	}


	public void setPROFILE_RISK_ANSWER(String pROFILE_RISK_ANSWER) {
		PROFILE_RISK_ANSWER = pROFILE_RISK_ANSWER;
	}


	public String getPROFILE_RISK_SCORE() {
		return PROFILE_RISK_SCORE;
	}


	public void setPROFILE_RISK_SCORE(String pROFILE_RISK_SCORE) {
		PROFILE_RISK_SCORE = pROFILE_RISK_SCORE;
	}


	public String getPROFILE_RISK_DETAIL_VAL() {
		return PROFILE_RISK_DETAIL_VAL;
	}


	public void setPROFILE_RISK_DETAIL_VAL(String pROFILE_RISK_DETAIL_VAL) {
		PROFILE_RISK_DETAIL_VAL = pROFILE_RISK_DETAIL_VAL;
	}


	public String getPROFILE_RISK_TYPE() {
		return PROFILE_RISK_TYPE;
	}


	public void setPROFILE_RISK_TYPE(String pROFILE_RISK_TYPE) {
		PROFILE_RISK_TYPE = pROFILE_RISK_TYPE;
	}


	public String getALOK_TRIM() {
		return ALOK_TRIM;
	}


	public void setALOK_TRIM(String aLOK_TRIM) {
		ALOK_TRIM = aLOK_TRIM;
	}


	public String getALOK_OTHER() {
		return ALOK_OTHER;
	}


	public void setALOK_OTHER(String aLOK_OTHER) {
		ALOK_OTHER = aLOK_OTHER;
	}


	public String getALOK_OTHER_VAL() {
		return ALOK_OTHER_VAL;
	}


	public void setALOK_OTHER_VAL(String aLOK_OTHER_VAL) {
		ALOK_OTHER_VAL = aLOK_OTHER_VAL;
	}


	public String getWANCARA_RESULT() {
		return WANCARA_RESULT;
	}


	public void setWANCARA_RESULT(String wANCARA_RESULT) {
		WANCARA_RESULT = wANCARA_RESULT;
	}


	public String getWANCARA_RES_OTHER() {
		return WANCARA_RES_OTHER;
	}


	public void setWANCARA_RES_OTHER(String wANCARA_RES_OTHER) {
		WANCARA_RES_OTHER = wANCARA_RES_OTHER;
	}


	public String getWANCARA_ANALIS() {
		return WANCARA_ANALIS;
	}


	public void setWANCARA_ANALIS(String wANCARA_ANALIS) {
		WANCARA_ANALIS = wANCARA_ANALIS;
	}


	public String getWANCARA_REVIEWER() {
		return WANCARA_REVIEWER;
	}


	public void setWANCARA_REVIEWER(String wANCARA_REVIEWER) {
		WANCARA_REVIEWER = wANCARA_REVIEWER;
	}


	public String getWANCARA_CATATAN() {
		return WANCARA_CATATAN;
	}


	public void setWANCARA_CATATAN(String wANCARA_CATATAN) {
		WANCARA_CATATAN = wANCARA_CATATAN;
	}


	public String getKET_KONDISI() {
		return KET_KONDISI;
	}


	public void setKET_KONDISI(String kET_KONDISI) {
		KET_KONDISI = kET_KONDISI;
	}


	public String getQUEST_CODE() {
		return QUEST_CODE;
	}


	public void setQUEST_CODE(String qUEST_CODE) {
		QUEST_CODE = qUEST_CODE;
	}


	public String getQ1_ANSWER_TYPE() {
		return Q1_ANSWER_TYPE;
	}


	public void setQ1_ANSWER_TYPE(String q1_ANSWER_TYPE) {
		Q1_ANSWER_TYPE = q1_ANSWER_TYPE;
	}


	public String getQ1_ANSWER_1() {
		return Q1_ANSWER_1;
	}


	public void setQ1_ANSWER_1(String q1_ANSWER_1) {
		Q1_ANSWER_1 = q1_ANSWER_1;
	}


	public String getQ1_ANSWER_2() {
		return Q1_ANSWER_2;
	}


	public void setQ1_ANSWER_2(String q1_ANSWER_2) {
		Q1_ANSWER_2 = q1_ANSWER_2;
	}


	public String getQ1_ANSWER_3() {
		return Q1_ANSWER_3;
	}


	public void setQ1_ANSWER_3(String q1_ANSWER_3) {
		Q1_ANSWER_3 = q1_ANSWER_3;
	}


	public String getQ1_ANSWER_4() {
		return Q1_ANSWER_4;
	}


	public void setQ1_ANSWER_4(String q1_ANSWER_4) {
		Q1_ANSWER_4 = q1_ANSWER_4;
	}


	public String getQ1_ANSWER_5() {
		return Q1_ANSWER_5;
	}


	public void setQ1_ANSWER_5(String q1_ANSWER_5) {
		Q1_ANSWER_5 = q1_ANSWER_5;
	}


	public String getQ2_ANSWER_TYPE() {
		return Q2_ANSWER_TYPE;
	}


	public void setQ2_ANSWER_TYPE(String q2_ANSWER_TYPE) {
		Q2_ANSWER_TYPE = q2_ANSWER_TYPE;
	}


	public String getQ2_ANSWER_1() {
		return Q2_ANSWER_1;
	}


	public void setQ2_ANSWER_1(String q2_ANSWER_1) {
		Q2_ANSWER_1 = q2_ANSWER_1;
	}


	public String getQ2_ANSWER_2() {
		return Q2_ANSWER_2;
	}


	public void setQ2_ANSWER_2(String q2_ANSWER_2) {
		Q2_ANSWER_2 = q2_ANSWER_2;
	}


	public String getQ2_ANSWER_3() {
		return Q2_ANSWER_3;
	}


	public void setQ2_ANSWER_3(String q2_ANSWER_3) {
		Q2_ANSWER_3 = q2_ANSWER_3;
	}


	public String getQ2_ANSWER_4() {
		return Q2_ANSWER_4;
	}


	public void setQ2_ANSWER_4(String q2_ANSWER_4) {
		Q2_ANSWER_4 = q2_ANSWER_4;
	}


	public String getQ2_ANSWER_5() {
		return Q2_ANSWER_5;
	}


	public void setQ2_ANSWER_5(String q2_ANSWER_5) {
		Q2_ANSWER_5 = q2_ANSWER_5;
	}


	public String getQ3_ANSWER_TYPE() {
		return Q3_ANSWER_TYPE;
	}


	public void setQ3_ANSWER_TYPE(String q3_ANSWER_TYPE) {
		Q3_ANSWER_TYPE = q3_ANSWER_TYPE;
	}


	public String getQ3_ANSWER_1() {
		return Q3_ANSWER_1;
	}


	public void setQ3_ANSWER_1(String q3_ANSWER_1) {
		Q3_ANSWER_1 = q3_ANSWER_1;
	}


	public String getQ3_ANSWER_2() {
		return Q3_ANSWER_2;
	}


	public void setQ3_ANSWER_2(String q3_ANSWER_2) {
		Q3_ANSWER_2 = q3_ANSWER_2;
	}


	public String getQ3_ANSWER_3() {
		return Q3_ANSWER_3;
	}


	public void setQ3_ANSWER_3(String q3_ANSWER_3) {
		Q3_ANSWER_3 = q3_ANSWER_3;
	}


	public String getQ3_ANSWER_4() {
		return Q3_ANSWER_4;
	}


	public void setQ3_ANSWER_4(String q3_ANSWER_4) {
		Q3_ANSWER_4 = q3_ANSWER_4;
	}


	public String getQ3_ANSWER_5() {
		return Q3_ANSWER_5;
	}


	public void setQ3_ANSWER_5(String q3_ANSWER_5) {
		Q3_ANSWER_5 = q3_ANSWER_5;
	}


	public String getQ4_ANSWER_TYPE() {
		return Q4_ANSWER_TYPE;
	}


	public void setQ4_ANSWER_TYPE(String q4_ANSWER_TYPE) {
		Q4_ANSWER_TYPE = q4_ANSWER_TYPE;
	}


	public String getQ4_ANSWER_1() {
		return Q4_ANSWER_1;
	}


	public void setQ4_ANSWER_1(String q4_ANSWER_1) {
		Q4_ANSWER_1 = q4_ANSWER_1;
	}


	public String getQ4_ANSWER_2() {
		return Q4_ANSWER_2;
	}


	public void setQ4_ANSWER_2(String q4_ANSWER_2) {
		Q4_ANSWER_2 = q4_ANSWER_2;
	}


	public String getQ4_ANSWER_3() {
		return Q4_ANSWER_3;
	}


	public void setQ4_ANSWER_3(String q4_ANSWER_3) {
		Q4_ANSWER_3 = q4_ANSWER_3;
	}


	public String getQ4_ANSWER_4() {
		return Q4_ANSWER_4;
	}


	public void setQ4_ANSWER_4(String q4_ANSWER_4) {
		Q4_ANSWER_4 = q4_ANSWER_4;
	}


	public String getQ4_ANSWER_5() {
		return Q4_ANSWER_5;
	}


	public void setQ4_ANSWER_5(String q4_ANSWER_5) {
		Q4_ANSWER_5 = q4_ANSWER_5;
	}


	public String getQ5_ANSWER_TYPE() {
		return Q5_ANSWER_TYPE;
	}


	public void setQ5_ANSWER_TYPE(String q5_ANSWER_TYPE) {
		Q5_ANSWER_TYPE = q5_ANSWER_TYPE;
	}


	public String getQ5_ANSWER_1() {
		return Q5_ANSWER_1;
	}


	public void setQ5_ANSWER_1(String q5_ANSWER_1) {
		Q5_ANSWER_1 = q5_ANSWER_1;
	}


	public String getQ5_ANSWER_2() {
		return Q5_ANSWER_2;
	}


	public void setQ5_ANSWER_2(String q5_ANSWER_2) {
		Q5_ANSWER_2 = q5_ANSWER_2;
	}


	public String getQ5_ANSWER_3() {
		return Q5_ANSWER_3;
	}


	public void setQ5_ANSWER_3(String q5_ANSWER_3) {
		Q5_ANSWER_3 = q5_ANSWER_3;
	}


	public String getQ5_ANSWER_4() {
		return Q5_ANSWER_4;
	}


	public void setQ5_ANSWER_4(String q5_ANSWER_4) {
		Q5_ANSWER_4 = q5_ANSWER_4;
	}


	public String getQ5_ANSWER_5() {
		return Q5_ANSWER_5;
	}


	public void setQ5_ANSWER_5(String q5_ANSWER_5) {
		Q5_ANSWER_5 = q5_ANSWER_5;
	}


	public String getQ6_ANSWER_TYPE() {
		return Q6_ANSWER_TYPE;
	}


	public void setQ6_ANSWER_TYPE(String q6_ANSWER_TYPE) {
		Q6_ANSWER_TYPE = q6_ANSWER_TYPE;
	}


	public String getQ6_ANSWER_1() {
		return Q6_ANSWER_1;
	}


	public void setQ6_ANSWER_1(String q6_ANSWER_1) {
		Q6_ANSWER_1 = q6_ANSWER_1;
	}


	public String getQ6_ANSWER_2() {
		return Q6_ANSWER_2;
	}


	public void setQ6_ANSWER_2(String q6_ANSWER_2) {
		Q6_ANSWER_2 = q6_ANSWER_2;
	}


	public String getQ6_ANSWER_3() {
		return Q6_ANSWER_3;
	}


	public void setQ6_ANSWER_3(String q6_ANSWER_3) {
		Q6_ANSWER_3 = q6_ANSWER_3;
	}


	public String getQ6_ANSWER_4() {
		return Q6_ANSWER_4;
	}


	public void setQ6_ANSWER_4(String q6_ANSWER_4) {
		Q6_ANSWER_4 = q6_ANSWER_4;
	}


	public String getQ6_ANSWER_5() {
		return Q6_ANSWER_5;
	}


	public void setQ6_ANSWER_5(String q6_ANSWER_5) {
		Q6_ANSWER_5 = q6_ANSWER_5;
	}


	public String getQ7_ANSWER_TYPE() {
		return Q7_ANSWER_TYPE;
	}


	public void setQ7_ANSWER_TYPE(String q7_ANSWER_TYPE) {
		Q7_ANSWER_TYPE = q7_ANSWER_TYPE;
	}


	public String getQ7_ANSWER_1() {
		return Q7_ANSWER_1;
	}


	public void setQ7_ANSWER_1(String q7_ANSWER_1) {
		Q7_ANSWER_1 = q7_ANSWER_1;
	}


	public String getQ7_ANSWER_2() {
		return Q7_ANSWER_2;
	}


	public void setQ7_ANSWER_2(String q7_ANSWER_2) {
		Q7_ANSWER_2 = q7_ANSWER_2;
	}


	public String getQ7_ANSWER_3() {
		return Q7_ANSWER_3;
	}


	public void setQ7_ANSWER_3(String q7_ANSWER_3) {
		Q7_ANSWER_3 = q7_ANSWER_3;
	}


	public String getQ7_ANSWER_4() {
		return Q7_ANSWER_4;
	}


	public void setQ7_ANSWER_4(String q7_ANSWER_4) {
		Q7_ANSWER_4 = q7_ANSWER_4;
	}


	public String getQ7_ANSWER_5() {
		return Q7_ANSWER_5;
	}


	public void setQ7_ANSWER_5(String q7_ANSWER_5) {
		Q7_ANSWER_5 = q7_ANSWER_5;
	}


	public String getQ8_ANSWER_TYPE() {
		return Q8_ANSWER_TYPE;
	}


	public void setQ8_ANSWER_TYPE(String q8_ANSWER_TYPE) {
		Q8_ANSWER_TYPE = q8_ANSWER_TYPE;
	}


	public String getQ8_ANSWER_1() {
		return Q8_ANSWER_1;
	}


	public void setQ8_ANSWER_1(String q8_ANSWER_1) {
		Q8_ANSWER_1 = q8_ANSWER_1;
	}


	public String getQ8_ANSWER_2() {
		return Q8_ANSWER_2;
	}


	public void setQ8_ANSWER_2(String q8_ANSWER_2) {
		Q8_ANSWER_2 = q8_ANSWER_2;
	}


	public String getQ8_ANSWER_3() {
		return Q8_ANSWER_3;
	}


	public void setQ8_ANSWER_3(String q8_ANSWER_3) {
		Q8_ANSWER_3 = q8_ANSWER_3;
	}


	public String getQ8_ANSWER_4() {
		return Q8_ANSWER_4;
	}


	public void setQ8_ANSWER_4(String q8_ANSWER_4) {
		Q8_ANSWER_4 = q8_ANSWER_4;
	}


	public String getQ8_ANSWER_5() {
		return Q8_ANSWER_5;
	}


	public void setQ8_ANSWER_5(String q8_ANSWER_5) {
		Q8_ANSWER_5 = q8_ANSWER_5;
	}


	public String getQ9_ANSWER_TYPE() {
		return Q9_ANSWER_TYPE;
	}


	public void setQ9_ANSWER_TYPE(String q9_ANSWER_TYPE) {
		Q9_ANSWER_TYPE = q9_ANSWER_TYPE;
	}


	public String getQ9_ANSWER_1() {
		return Q9_ANSWER_1;
	}


	public void setQ9_ANSWER_1(String q9_ANSWER_1) {
		Q9_ANSWER_1 = q9_ANSWER_1;
	}


	public String getQ9_ANSWER_2() {
		return Q9_ANSWER_2;
	}


	public void setQ9_ANSWER_2(String q9_ANSWER_2) {
		Q9_ANSWER_2 = q9_ANSWER_2;
	}


	public String getQ9_ANSWER_3() {
		return Q9_ANSWER_3;
	}


	public void setQ9_ANSWER_3(String q9_ANSWER_3) {
		Q9_ANSWER_3 = q9_ANSWER_3;
	}


	public String getQ9_ANSWER_4() {
		return Q9_ANSWER_4;
	}


	public void setQ9_ANSWER_4(String q9_ANSWER_4) {
		Q9_ANSWER_4 = q9_ANSWER_4;
	}


	public String getQ9_ANSWER_5() {
		return Q9_ANSWER_5;
	}


	public void setQ9_ANSWER_5(String q9_ANSWER_5) {
		Q9_ANSWER_5 = q9_ANSWER_5;
	}


	public String getQ10_ANSWER_TYPE() {
		return Q10_ANSWER_TYPE;
	}


	public void setQ10_ANSWER_TYPE(String q10_ANSWER_TYPE) {
		Q10_ANSWER_TYPE = q10_ANSWER_TYPE;
	}


	public String getQ10_ANSWER_1() {
		return Q10_ANSWER_1;
	}


	public void setQ10_ANSWER_1(String q10_ANSWER_1) {
		Q10_ANSWER_1 = q10_ANSWER_1;
	}


	public String getQ10_ANSWER_2() {
		return Q10_ANSWER_2;
	}


	public void setQ10_ANSWER_2(String q10_ANSWER_2) {
		Q10_ANSWER_2 = q10_ANSWER_2;
	}


	public String getQ10_ANSWER_3() {
		return Q10_ANSWER_3;
	}


	public void setQ10_ANSWER_3(String q10_ANSWER_3) {
		Q10_ANSWER_3 = q10_ANSWER_3;
	}


	public String getQ10_ANSWER_4() {
		return Q10_ANSWER_4;
	}


	public void setQ10_ANSWER_4(String q10_ANSWER_4) {
		Q10_ANSWER_4 = q10_ANSWER_4;
	}


	public String getQ10_ANSWER_5() {
		return Q10_ANSWER_5;
	}


	public void setQ10_ANSWER_5(String q10_ANSWER_5) {
		Q10_ANSWER_5 = q10_ANSWER_5;
	}


	public String getQ11_ANSWER_TYPE() {
		return Q11_ANSWER_TYPE;
	}


	public void setQ11_ANSWER_TYPE(String q11_ANSWER_TYPE) {
		Q11_ANSWER_TYPE = q11_ANSWER_TYPE;
	}


	public String getQ11_ANSWER_1() {
		return Q11_ANSWER_1;
	}


	public void setQ11_ANSWER_1(String q11_ANSWER_1) {
		Q11_ANSWER_1 = q11_ANSWER_1;
	}


	public String getQ11_ANSWER_2() {
		return Q11_ANSWER_2;
	}


	public void setQ11_ANSWER_2(String q11_ANSWER_2) {
		Q11_ANSWER_2 = q11_ANSWER_2;
	}


	public String getQ11_ANSWER_3() {
		return Q11_ANSWER_3;
	}


	public void setQ11_ANSWER_3(String q11_ANSWER_3) {
		Q11_ANSWER_3 = q11_ANSWER_3;
	}


	public String getQ11_ANSWER_4() {
		return Q11_ANSWER_4;
	}


	public void setQ11_ANSWER_4(String q11_ANSWER_4) {
		Q11_ANSWER_4 = q11_ANSWER_4;
	}


	public String getQ11_ANSWER_5() {
		return Q11_ANSWER_5;
	}


	public void setQ11_ANSWER_5(String q11_ANSWER_5) {
		Q11_ANSWER_5 = q11_ANSWER_5;
	}


	public String getQ12_ANSWER_TYPE() {
		return Q12_ANSWER_TYPE;
	}


	public void setQ12_ANSWER_TYPE(String q12_ANSWER_TYPE) {
		Q12_ANSWER_TYPE = q12_ANSWER_TYPE;
	}


	public String getQ12_ANSWER_1() {
		return Q12_ANSWER_1;
	}


	public void setQ12_ANSWER_1(String q12_ANSWER_1) {
		Q12_ANSWER_1 = q12_ANSWER_1;
	}


	public String getQ12_ANSWER_2() {
		return Q12_ANSWER_2;
	}


	public void setQ12_ANSWER_2(String q12_ANSWER_2) {
		Q12_ANSWER_2 = q12_ANSWER_2;
	}


	public String getQ12_ANSWER_3() {
		return Q12_ANSWER_3;
	}


	public void setQ12_ANSWER_3(String q12_ANSWER_3) {
		Q12_ANSWER_3 = q12_ANSWER_3;
	}


	public String getQ12_ANSWER_4() {
		return Q12_ANSWER_4;
	}


	public void setQ12_ANSWER_4(String q12_ANSWER_4) {
		Q12_ANSWER_4 = q12_ANSWER_4;
	}


	public String getQ12_ANSWER_5() {
		return Q12_ANSWER_5;
	}


	public void setQ12_ANSWER_5(String q12_ANSWER_5) {
		Q12_ANSWER_5 = q12_ANSWER_5;
	}


	public String getLIFETIME_EXP() {
		return LIFETIME_EXP;
	}


	public void setLIFETIME_EXP(String lIFETIME_EXP) {
		LIFETIME_EXP = lIFETIME_EXP;
	}


	public String getDOCUMENT_LIST() {
		return DOCUMENT_LIST;
	}


	public void setDOCUMENT_LIST(String dOCUMENT_LIST) {
		DOCUMENT_LIST = dOCUMENT_LIST;
	}


	public String getDIAJUKAN_OLEH() {
		return DIAJUKAN_OLEH;
	}


	public void setDIAJUKAN_OLEH(String dIAJUKAN_OLEH) {
		DIAJUKAN_OLEH = dIAJUKAN_OLEH;
	}


	public String getDICEK_OLEH() {
		return DICEK_OLEH;
	}


	public void setDICEK_OLEH(String dICEK_OLEH) {
		DICEK_OLEH = dICEK_OLEH;
	}


	public String getPEJABAT_BERWENANG() {
		return PEJABAT_BERWENANG;
	}


	public void setPEJABAT_BERWENANG(String pEJABAT_BERWENANG) {
		PEJABAT_BERWENANG = pEJABAT_BERWENANG;
	}


	public String getAPPROVED_CEK() {
		return APPROVED_CEK;
	}


	public void setAPPROVED_CEK(String aPPROVED_CEK) {
		APPROVED_CEK = aPPROVED_CEK;
	}


	public String getUSER_CHECKER() {
		return USER_CHECKER;
	}


	public void setUSER_CHECKER(String uSER_CHECKER) {
		USER_CHECKER = uSER_CHECKER;
	}


	public String getCHECKER_UPDATE() {
		return CHECKER_UPDATE;
	}


	public void setCHECKER_UPDATE(String cHECKER_UPDATE) {
		CHECKER_UPDATE = cHECKER_UPDATE;
	}


	public Integer getINT_CUSTODIAN_BANK() {
		return INT_CUSTODIAN_BANK;
	}


	public void setINT_CUSTODIAN_BANK(Integer iNT_CUSTODIAN_BANK) {
		INT_CUSTODIAN_BANK = iNT_CUSTODIAN_BANK;
	}


	public Integer getINT_SETTLEMENT_BANK() {
		return INT_SETTLEMENT_BANK;
	}


	public void setINT_SETTLEMENT_BANK(Integer iNT_SETTLEMENT_BANK) {
		INT_SETTLEMENT_BANK = iNT_SETTLEMENT_BANK;
	}




}
