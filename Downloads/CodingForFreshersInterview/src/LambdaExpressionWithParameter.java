public class LambdaExpressionWithParameter
{
	public static void main(String[] args)
	{

		Lmbda lm = ( a,  b) -> ( a + b );
		int result = lm.addition(30,20);
		 System.out.println(result);


		 //lambda expression with multiple statement
		Lmbda lm2 = ( a,  b) -> {
			int c = a + b;
			return c;};
		}
}

interface Lmbda{
	int addition(int a,int b);
}
