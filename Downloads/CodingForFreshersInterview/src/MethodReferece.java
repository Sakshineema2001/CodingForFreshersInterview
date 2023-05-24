import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}
public class MethodReferece
{

	public void display(String msg){
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args)
	{
		//1. Method reference to call  a static Method
		//using lambda expression
		Function<Integer,Double> fnl = (input) -> Math.sqrt(input);
		System.out.println(fnl.apply(6));

		//using Method reference
		Function<Integer,Double> fnmr = Math::sqrt;
		System.out.println(fnmr.apply(6));

		//2, method reference to an instance method of an object
		MethodReferece methodReferece = new MethodReferece();
		//lambdaExpression
		Printable printable = (msg) -> methodReferece.display(msg);
		printable.print("heloooo");
	}
}
