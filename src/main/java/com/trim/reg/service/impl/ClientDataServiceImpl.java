package com.trim.reg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trim.reg.dao.ClientDataDAO;
import com.trim.reg.model.ClientData;
import com.trim.reg.service.ClientDataService;

@Service
@Transactional
public class ClientDataServiceImpl implements ClientDataService{

	@Autowired
	private ClientDataDAO clientDataDAO;
	
	@Override
	public List<ClientData> getClientDataList() {
		// TODO Auto-generated method stub
		return clientDataDAO.getClientDataList();
	}

}
