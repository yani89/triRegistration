package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.ClientFamilyDAO;
import com.trim.reg.model.ClientFamily;

@Repository
public class ClientFamilyDAOImpl implements ClientFamilyDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	/*method get Current*/
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ClientFamily> getListClientFamily() {
		// TODO Auto-generated method stub
		
		List<ClientFamily> result = getCurrentSession().createQuery("from ClientFamily").list();
		return result;
	}

}
