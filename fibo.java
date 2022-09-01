/*fibo*/
import java.util.*;
public class fibo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int t=0;
		System.out.println("The Fibonacci Series is :");
		System.out.println(a);
		System.out.println(b);

		for(int i=1;i<=n;i++){
			t=b;
			b=a+b;
			a=t;
			System.out.println(b);

		}
		sc.close();
	}
}