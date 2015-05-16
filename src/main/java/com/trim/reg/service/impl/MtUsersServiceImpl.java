package com.trim.reg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trim.reg.dao.MtUsersDAO;
import com.trim.reg.model.MtUsers;
import com.trim.reg.service.MtUsersService;

@Service
@Transactional
public class MtUsersServiceImpl implements MtUsersService{

	@Autowired
	private MtUsersDAO mtUsersDAO;
	
	@Override
	public void addMtUsers(MtUsers mtUsers) {
		// TODO Auto-generated method stub
		mtUsersDAO.addMtUsers(mtUsers);
	}

	@Override
	public MtUsers getMtUsers(int ID) {
		// TODO Auto-generated method stub
		return mtUsersDAO.getMtUsers(ID);
	}

	@Override
	public void updateMtUsers(MtUsers mtUsers) {
		// TODO Auto-generated method stub
		mtUsersDAO.updateMtUsers(mtUsers);
	}

	@Override
	public void deleteMtUsers(int ID) {
		// TODO Auto-generated method stub
		mtUsersDAO.deleteMtUsers(ID);
	}

	@Override
	public List<MtUsers> getMtUsersList() {
		// TODO Auto-generated method stub
		return mtUsersDAO.getMtUsersList();
	}

}
