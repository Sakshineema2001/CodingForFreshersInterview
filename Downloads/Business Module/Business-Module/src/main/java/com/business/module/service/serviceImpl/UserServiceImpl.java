package com.business.module.service.serviceImpl;

import com.business.module.helper.UserFoundException;
import com.business.module.model.User;
import com.business.module.model.UserRoles;
import com.business.module.repository.RoleRepository;
import com.business.module.repository.UserRepository;
import com.business.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	//create user
	@Override
	public User createUser(User user, Set<UserRoles> userRoles) throws Exception
	{
		User local = userRepository.findByUsername(user.getUsername());
		if(local!=null){
			throw new UserFoundException("user already present");
		}else {
			//user create
             for(UserRoles ur : userRoles){
				 roleRepository.save(ur.getRole());
			 }
			 user.getUserRoles().addAll(userRoles);
			 local = this.userRepository.save(user);
		}
		return local;
	}

	//getting user by username
	@Override
	public User getUserName(String username)
	{
		return userRepository.findByUsername(username);
	}

	//delete user by id
	@Override
	public void deleteUser(Long id)
	{
		userRepository.deleteById(id);
	}

	//getting all users
	@Override
	public List<User> getAllUser()
	{
		return userRepository.findAll();
	}

	//update user


}
