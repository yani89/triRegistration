package com.trim.reg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trim.reg.dao.ClientEtcDAO;
import com.trim.reg.model.ClientEtc;
import com.trim.reg.service.ClientEtcService;

@Service
@Transactional
public class ClientEtcServiceImpl implements ClientEtcService{

	@Autowired
	private ClientEtcDAO clientEtcDAO;
	
	@Override
	public List<ClientEtc> getClientEtcList() {
		// TODO Auto-generated method stub
		
		return clientEtcDAO.getClientEtcList();
	}

}
