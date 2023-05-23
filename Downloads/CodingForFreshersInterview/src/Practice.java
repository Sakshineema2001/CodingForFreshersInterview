import java.util.HashSet;
import java.util.Set;

public class Practice
{
	public static void main(String[] args)
	{
		String str = "abcd";
		System.out.println(isIsogram("sakhi"));
		System.out.println(fibonacci(12));
		System.out.println(swap("123455",2,3));
		permute(str,0,str.length()-1);
	}


	public static Boolean isIsogram(String s){
		boolean isogram = true;
		char[] ch = s.toCharArray();
		Set<Character> chrSet = new HashSet<Character>();
		for(Character c : ch){
			if(chrSet.contains(c)){
				isogram = false;
			}else{
				chrSet.add(c);
			}
		}
		return isogram;
	}

	public static int fibonacci(int n){
		if(n <= 1){
			return n;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2)+fibonacci(n-3);
		}
	}

	public static void  permute(String str,int left , int right){
		if(left == right){
			System.out.println(str);
		}else {
			for(int i =left; i<=right; i++){
				str = swap(str,left,i);
				permute(str,left+1,right);
				str = swap(str,left,i);
			}
		}
	}
	public static String swap(String str, int i, int j){
		char[] ch = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
}
