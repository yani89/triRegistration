package com.trim.reg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trim.reg.dao.MtLogDAO;
import com.trim.reg.model.MtLog;
import com.trim.reg.service.MtLogService;

@Service
@Transactional
public class MtLogServiceImpl implements MtLogService{

	@Autowired
	private MtLogDAO mtLogDAO;
	
	@Override
	public List<MtLog> getMtLogList() {
		// TODO Auto-generated method stub
		return mtLogDAO.getMtLogList();
	}

}
