package com.trim.reg.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trim.reg.dao.MtUsersDAO;
import com.trim.reg.model.MtUsers;


@Repository
public class MtUsersDAOImpl implements MtUsersDAO{

//	CREATE TABLE `mt_users` (
//			  `ID` int(20) NOT NULL AUTO_INCREMENT,
//			  `NAME` varchar(200) NOT NULL,
//			  `USERNAME` varchar(200) NOT NULL,
//			  `EMAIL` varchar(100) NOT NULL,
//			  `PASSWORD` varchar(255) NOT NULL,
//			  `ROLE` varchar(50) NOT NULL,
//			  `SALT` varchar(200) NOT NULL,
//			  `STATUS` int(2) NOT NULL,
//			  `FIRST_LOGIN` int(2) NOT NULL,
//			  `REG_DATE` date NOT NULL,
//			  `MODIF_DATE` date NOT NULL,
//			  PRIMARY KEY (`ID`)
//			) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	
	@Autowired
	private SessionFactory sessionFactory;
	
	/*method get Current*/
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addMtUsers(MtUsers mtUsers) {
		// TODO Auto-generated method stub
		getCurrentSession().save(mtUsers);
	}

	@Override
	public MtUsers getMtUsers(int ID) {
		// TODO Auto-generated method stub
		MtUsers mtusers = (MtUsers) getCurrentSession().get(MtUsers.class, ID);
		return mtusers;
	}
//	CREATE TABLE `mt_users` (
//			  `ID` int(20) NOT NULL AUTO_INCREMENT,
//			  `NAME` varchar(200) NOT NULL,
//			  `USERNAME` varchar(200) NOT NULL,
//			  `EMAIL` varchar(100) NOT NULL,
//			  `PASSWORD` varchar(255) NOT NULL,
//			  `ROLE` varchar(50) NOT NULL,
//			  `SALT` varchar(200) NOT NULL,
//			  `STATUS` int(2) NOT NULL,
//			  `FIRST_LOGIN` int(2) NOT NULL,
//			  `REG_DATE` date NOT NULL,
//			  `MODIF_DATE` date NOT NULL,
//			  PRIMARY KEY (`ID`)
//			) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	@Override
	public void updateMtUsers(MtUsers mtUsers) {
		// TODO Auto-generated method stub
		MtUsers mtUsersToUpdate = getMtUsers(mtUsers.getID());
		mtUsersToUpdate.setNAME(mtUsers.getNAME());
		mtUsersToUpdate.setUSERNAME(mtUsers.getUSERNAME());
		mtUsersToUpdate.setEMAIL(mtUsers.getEMAIL());
		mtUsersToUpdate.setPASSWORD(mtUsers.getPASSWORD());
		mtUsersToUpdate.setROLE(mtUsers.getROLE());
		mtUsersToUpdate.setMODIF_DATE(mtUsers.getMODIF_DATE());
		getCurrentSession().update(mtUsersToUpdate);
	}

	@Override
	public void deleteMtUsers(int ID) {
		// TODO Auto-generated method stub
		MtUsers mtUsers = getMtUsers(ID);
		if(mtUsers != null)
			getCurrentSession().delete(mtUsers);
	}

	@SuppressWarnings("unchecked")
	public List<MtUsers> getMtUsersList() {
		// TODO Auto-generated method stub
		List<MtUsers> result = getCurrentSession().createQuery("from MtUsers").list();
		return result;
	}



}
