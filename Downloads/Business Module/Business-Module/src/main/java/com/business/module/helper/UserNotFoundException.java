package com.business.module.helper;

public class UserNotFoundException extends Exception
{
	public UserNotFoundException(){
		super("user with this username is not found in database");
	}

	public UserNotFoundException(String msg){
		super(msg);
	}
}
