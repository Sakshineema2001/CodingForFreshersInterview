package java8feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamMap
{
	public static void main(String[] args)
	{
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"sakshi","sakshi@gmail.com"));
		users.add(new User(2,"pooja","pooja@gmail.com"));
		users.add(new User(3,"kanak","kanak@gmail.com"));
		users.add(new User(4,"vatsal","vatsal@gmail.com"));

		//traditional way
		List<UsersDto> usersDtos = new ArrayList<UsersDto>();
		for(User user: users){
			usersDtos.add(new UsersDto(user.getId(),user.getName(),user.getEmail()));
		}

		for (UsersDto usersDto1: usersDtos){
			System.out.println(usersDto1);
		}

		System.out.println("**********************************************");
		//using stream map with sorting
		users.stream().map((User user) -> new UsersDto(user.getId(),user.getName(),user.getEmail())).sorted(Comparator.comparing(UsersDto::getName)).forEach(System.out::println);
	}
}

class User{
	public int id;
	public String name;
	public String email;

	public User(int id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		return "User{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
	}
}

class UsersDto{
	public int id;
	public String name;
	public String password;

	public UsersDto(int id, String name, String password)
	{
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "UsersDto{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + '}';
	}
}