package java8feature;

import java.util.function.Function;

//traditional way of method
class Submission implements Maths{ @Override
	public void sum() {System.out.println("submission class of numbers");}
}
interface Maths{ void sum();
}
class Minus implements Maths{ @Override
	public void sum()	{System.out.println("Minus class of numbers");	}
}


// use lambda expression to convert polymorphism way to functional way
public class lambdaExpression
{
	public static void main(String[] args)
	{

		Maths mt = () -> System.out.println("Minus class of numbers");
		mt.sum();

		// use prebuild function interface
		Function<String,Integer> si = (String s) -> s.length();
		System.out.println(si.apply("sakshi"));
	}
}