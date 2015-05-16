package com.trim.reg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trim.reg.dao.ClientFamilyDAO;
import com.trim.reg.model.ClientFamily;
import com.trim.reg.service.ClientFamilyService;

@Service
@Transactional
public class ClientFamilyServiceImpl implements ClientFamilyService{

	@Autowired
	private ClientFamilyDAO clientFamilyDAO;
	
	@Override
	public List<ClientFamily> getListClientFamily() {
		// TODO Auto-generated method stub
		return clientFamilyDAO.getListClientFamily();
	}

}
