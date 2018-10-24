package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoInterface.Dao;
import com.DaoInterface.DaoL;
import com.ServiceInterface.ServiceI;
import com.model.Login;
import com.model.User;


@Service
public class ServiceImp implements ServiceI {

	@Autowired
	Dao dao;
	@Autowired
	DaoL daol;
	
	public Login findAllByUsernameAndPassword(String username,String password)
	{
		
	Login l=daol.findAllByUsernameAndPassword(username, password);
		
	   return l;
		
	}

	
	
	public List<User> getAll()
	{
		
		List<User> li=(List<User>) dao.findAll();
		return li;
	}
	
	public User SaveData(User u)
	{
		User us=dao.save(u);
		return us;
	}
	
	public User edit(User u)
	{
		
		User ue=dao.findOne(u.getId());
		
		return ue;
		
	}
	
	public List<User> Update(User u)
	{
		dao.save(u);
		return getAll();
	}
	
	public List<User> delete(User u)
	{
		dao.delete(u.getId());
		return getAll();
	}
	
}
