package com.trim.reg.mapper;

import com.trim.reg.dto.ClientBankDTO;
import com.trim.reg.model.ClientBank;

public class ClientBankMapper {
	
	public static ClientBank getClientBank(ClientBankDTO dto){
		ClientBank clientBank = new ClientBank();
		clientBank.setBANK(dto.getBANK());
		clientBank.setBANK_PENARIKAN(dto.getBANK_PENARIKAN());
		clientBank.setCABANG(dto.getCABANG());
		clientBank.setCREATE_DATE(dto.getCREATE_DATE());
		clientBank.setDEPOSIT_DANA(dto.getDEPOSIT_DANA());
		clientBank.setDEPOSIT_LOT(dto.getDEPOSIT_LOT());
		clientBank.setDEPOSIT_OBLIGASI(dto.getDEPOSIT_OBLIGASI());
		clientBank.setDEPOSIT_RATING(dto.getDEPOSIT_RATING());
		clientBank.setDEPOSIT_SAHAM(dto.getDEPOSIT_SAHAM());
		clientBank.setID_CB(dto.getID_CB());
		clientBank.setIDT_CLIENT(dto.getIDT_CLIENT());
		clientBank.setJAWABAN(dto.getJAWABAN());
		clientBank.setKON_TRANSAKSI_EMAIL(dto.getKON_TRANSAKSI_EMAIL());
		clientBank.setKON_USER_EMAIL(dto.getKON_USER_EMAIL());
		clientBank.setNAMA_REKENING(dto.getNAMA_REKENING());
		clientBank.setNO_REKENING(dto.getNO_REKENING());
		clientBank.setPERTANYAAN(dto.getPERTANYAAN());
		clientBank.setTIN(dto.getTIN());
		clientBank.setUPDATE_DATE(dto.getUPDATE_DATE());
		return clientBank;
	}
	
	public static ClientBankDTO getDTO(ClientBank clientbank){
		ClientBankDTO dto = new ClientBankDTO();
		dto.setBANK(clientbank.getBANK());
		dto.setBANK_PENARIKAN(clientbank.getBANK_PENARIKAN());
		dto.setCABANG(clientbank.getCABANG());
		dto.setCREATE_DATE(clientbank.getCREATE_DATE());
		dto.setDEPOSIT_DANA(clientbank.getDEPOSIT_DANA());
		dto.setDEPOSIT_LOT(clientbank.getDEPOSIT_LOT());
		dto.setDEPOSIT_RATING(clientbank.getDEPOSIT_RATING());
		dto.setDEPOSIT_SAHAM(clientbank.getDEPOSIT_SAHAM());
		dto.setID_CB(clientbank.getID_CB());
		dto.setIDT_CLIENT(clientbank.getIDT_CLIENT());
		dto.setJAWABAN(clientbank.getJAWABAN());
		dto.setKON_TRANSAKSI_EMAIL(clientbank.getKON_TRANSAKSI_EMAIL());
		dto.setKON_USER_EMAIL(clientbank.getKON_USER_EMAIL());
		dto.setNAMA_REKENING(clientbank.getNAMA_REKENING());
		dto.setNO_REKENING(clientbank.getNO_REKENING());
		dto.setPERTANYAAN(clientbank.getPERTANYAAN());
		dto.setTIN(clientbank.getTIN());
		dto.setUPDATE_DATE(clientbank.getUPDATE_DATE());
		return dto;
	}
}
