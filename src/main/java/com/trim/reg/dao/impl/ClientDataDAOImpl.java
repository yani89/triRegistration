package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.ClientDataDAO;
import com.trim.reg.model.ClientData;


@Repository
public class ClientDataDAOImpl implements ClientDataDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	/*method get Current*/
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ClientData> getClientDataList() {
		// TODO Auto-generated method stub
		List<ClientData> result = getCurrentSession().createQuery("from ClientData").list();
		return result;
	}

}
