package com.trim.reg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trim.reg.dao.MtLoginAttemptsDAO;
import com.trim.reg.model.MtLoginAttempts;
import com.trim.reg.service.MtLoginAttemptsService;

@Service
@Transactional
public class MtLoginAttemptsServiceImpl implements MtLoginAttemptsService{

	@Autowired
	private MtLoginAttemptsDAO mtLoginAttemptsDAO;
	
	@Override
	public List<MtLoginAttempts> getMtLoginAttemptList() {
		// TODO Auto-generated method stub
		return mtLoginAttemptsDAO.getMtLoginAttemptsList();
	}

}
