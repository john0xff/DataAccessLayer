package com.phoenixjcam.login.users.dao;

import java.util.List;

import com.phoenixjcam.login.users.model.UserModel;
import com.phoenixjcam.login.users.model.UserRoleModel;

/**
 * Data Access Object Interface - This interface defines the standard operations to be performed on a model object(s).
 * 
 * @author Bart88
 *
 */
public interface UserDao
{
	public UserModel findByUserName(String username);

//	public List<UserRoleModel> getUsers();
}