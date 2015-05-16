package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.ClientBankDAO;
import com.trim.reg.model.ClientBank;

@Repository
public class ClientBankDAOImpl implements ClientBankDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	/*method get Current*/
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ClientBank> getClientBankList() {
		// TODO Auto-generated method stub
		List<ClientBank> result = getCurrentSession().createQuery("from ClientBank").list();
		return result;
	}

}
