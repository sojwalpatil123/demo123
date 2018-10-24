package com.ServiceInterface;

import java.util.List;

import com.model.Login;
import com.model.User;

public interface ServiceI {
	public Login findAllByUsernameAndPassword(String username,String password);
	public User SaveData(User u);
	public List<User> getAll();
	public User edit(User u);
	public List<User> Update(User u);
	public List<User> delete(User u);

}
