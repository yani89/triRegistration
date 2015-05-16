package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.MtLoginAttemptsDAO;
import com.trim.reg.model.MtLoginAttempts;

@Repository
public class MtLoginAttemptsDAOImpl implements MtLoginAttemptsDAO {

//	CREATE TABLE `mt_login_attempts` (
//			  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//			  `ip_address` varbinary(16) NOT NULL,
//			  `login` varchar(100) CHARACTER SET latin1 NOT NULL,
//			  `time` int(11) unsigned DEFAULT NULL,
//			  PRIMARY KEY (`id`)
//			) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

	@Autowired
	private SessionFactory sessionFactory;
	
	/*method get Current*/
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MtLoginAttempts> getMtLoginAttemptsList() {
		// TODO Auto-generated method stub
		
		List<MtLoginAttempts> result = getCurrentSession().createQuery("from MtLoginAttempts").list();
		return result;
	}

}
