package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.ClientLoginDAO;
import com.trim.reg.model.ClientLogin;


@Repository
public class ClientLoginDAOImpl implements ClientLoginDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ClientLogin> getClientLogin() {
		// TODO Auto-generated method stub
		List<ClientLogin> result = getCurrentSession().createQuery("from ci_client_login").list();
		return result;
	}

}
