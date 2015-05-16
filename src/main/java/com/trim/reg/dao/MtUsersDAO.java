package com.trim.reg.dao;

import java.util.List;

import com.trim.reg.model.MtUsers;

public interface MtUsersDAO{
	
	public void addMtUsers(MtUsers mtUsers);
	public MtUsers getMtUsers(int ID);
	public void updateMtUsers(MtUsers mtUsers);
	public void deleteMtUsers(int ID);
	public List<MtUsers> getMtUsersList();
}