package java8feature;

import java.util.Optional;

public class JavOptionalClass
{
	public static void main(String[] args)
	{

		String email = "gmail@on.com";

		// how to create option object using  of,empty,ofNullable
		Optional<Object> op = Optional.empty();
		System.out.println(op);

		Optional<Object> op2 = Optional.of(email);
		System.out.println(op2);


		//whenever you don't know object is null or not in that case you can use this it will automatically handle nullpointerException
		Optional<Object> op3 = Optional.ofNullable(email);
		System.out.println(op3);
		//using get method we can retrieve the value from optional object
		System.out.println(op3.get());


	}
}
