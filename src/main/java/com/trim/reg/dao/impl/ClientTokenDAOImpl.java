package com.trim.reg.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.ClientTokenDAO;
import com.trim.reg.model.ClientToken;

@Repository
public class ClientTokenDAOImpl implements ClientTokenDAO{

	@Autowired
	private SessionFactory sessionFactory;
	/*method get Current*/
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void addToken(ClientToken clientToken) {
		// TODO Auto-generated method stub
		 getCurrentSession().save(clientToken);
	}

	
	
	
}
