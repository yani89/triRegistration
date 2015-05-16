package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.MtLogDAO;
import com.trim.reg.model.MtLog;

@Repository
public class MtLogDAOImpl implements MtLogDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<MtLog> getMtLogList() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<MtLog> result = getCurrentSession().createQuery("from MtLog").list();
		return result;
	}

}
