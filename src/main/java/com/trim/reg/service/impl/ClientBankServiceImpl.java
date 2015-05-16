package com.trim.reg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trim.reg.dao.ClientBankDAO;
import com.trim.reg.model.ClientBank;
import com.trim.reg.service.ClientBankService;

@Service
@Transactional
public class ClientBankServiceImpl implements ClientBankService{

	@Autowired
	private ClientBankDAO clientBankDAO;
	
	@Override
	public List<ClientBank> getClientBankList() {
		// TODO Auto-generated method stub
		return clientBankDAO.getClientBankList();
	}

}
