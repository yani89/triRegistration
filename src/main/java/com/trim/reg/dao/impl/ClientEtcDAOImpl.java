package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.ClientEtcDAO;
import com.trim.reg.model.ClientEtc;

@Repository
public class ClientEtcDAOImpl implements ClientEtcDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	/*method get Current*/
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<ClientEtc> getClientEtcList(){
		List<ClientEtc> result = getCurrentSession().createQuery("from ClientEtc").list();
		return result;
	}
}
