package com.trim.reg.mapper;

import com.trim.reg.dto.MtLoginAttemptsDTO;
import com.trim.reg.model.MtLoginAttempts;

public class MtLoginAttemptsMapper {
	
	public static MtLoginAttempts getMtLoginAttempts(MtLoginAttemptsDTO dto){
		MtLoginAttempts mtlogin = new MtLoginAttempts();
		mtlogin.setId(dto.getId());
		mtlogin.setIp_address(dto.getIp_address());
		mtlogin.setLogin(dto.getLogin());
		mtlogin.setTime(dto.getTime());
		return mtlogin;
	}
	
	public static MtLoginAttemptsDTO getDTO(MtLoginAttempts mtloginattempts){
		MtLoginAttemptsDTO dto= new MtLoginAttemptsDTO();
		dto.setId(mtloginattempts.getId());
		dto.setIp_address(mtloginattempts.getIp_address());
		dto.setLogin(mtloginattempts.getLogin());
		dto.setTime(mtloginattempts.getTime());
		return dto;
	}
}
