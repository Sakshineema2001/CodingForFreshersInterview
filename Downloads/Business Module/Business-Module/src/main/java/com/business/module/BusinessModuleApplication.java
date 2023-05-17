package com.business.module;

import com.business.module.model.Role;
import com.business.module.model.User;
import com.business.module.model.UserRoles;
import com.business.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BusinessModuleApplication implements CommandLineRunner
{

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args)
	{
		SpringApplication.run(BusinessModuleApplication.class, args);
	}

		@Override
		public void run (String...args) throws Exception {
		System.out.println("starting code..........");

//		User user = new User();
//		user.setFirstName("sakshi");
//		user.setLastName("Neema");
//		user.setPassword(this.bCryptPasswordEncoder.encode("sakshi@2001"));
//		user.setUsername("sakshi2001");
//		user.setEmail("sakshineema2000@gmail.com");
//		user.setProfile("default.png");
//
//		Role role = new Role();
//		role.setRoleId(12l);
//		role.setRoleName("Admin");
//
//		Set<UserRoles> userRolesSet = new HashSet<>();
//		UserRoles userRoles = new UserRoles();
//		userRoles.setRole(role);
//		userRoles.setUser(user);
//
//		userRolesSet.add(userRoles);
//		User user1 = this.userService.createUser(user, userRolesSet);
//		System.out.println(user1.getUsername());

	}

}
