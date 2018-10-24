package com.DaoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;



public interface DaoL extends CrudRepository<Login,Integer>{
	
	
	public Login findAllByUsernameAndPassword(String username,String password);

}
