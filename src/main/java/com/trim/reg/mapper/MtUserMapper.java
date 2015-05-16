package com.trim.reg.mapper;

import com.trim.reg.dto.MtUserDTO;
import com.trim.reg.model.MtUsers;

public class MtUserMapper {
	
	public static MtUsers getMtUsers(MtUserDTO dto){
		MtUsers mtusers = new MtUsers();
		mtusers.setID(dto.getID());
		mtusers.setEMAIL(dto.getEMAIL());
		mtusers.setUSERNAME(dto.getUSERNAME());
		return mtusers;
	}
	
	public static MtUserDTO getDTO(MtUsers mtusers){
		MtUserDTO dto =  new MtUserDTO();
		dto.setID(mtusers.getID());
		dto.setNAME(mtusers.getNAME());
		dto.setUSERNAME(mtusers.getUSERNAME());
		return dto;
	}
}
