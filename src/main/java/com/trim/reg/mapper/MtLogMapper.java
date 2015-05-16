package com.trim.reg.mapper;

import com.trim.reg.dto.MtLogDTO;
import com.trim.reg.model.MtLog;

public class MtLogMapper {

	public static MtLog getMtLog(MtLogDTO dto){
		MtLog mtlog = new MtLog();
		mtlog.setID(dto.getID());
		mtlog.setUSERNAME(dto.getUSERNAME());
		mtlog.setDESCRIPTION(dto.getDESCRIPTION());
		return mtlog;
	}
	
	public static MtLogDTO getDTO(MtLog mtlog){
		MtLogDTO dto = new MtLogDTO();
		dto.setID(mtlog.getID());
		dto.setUSERNAME(mtlog.getUSERNAME());
		dto.setDESCRIPTION(mtlog.getDESCRIPTION());
		return dto;
	}
}
