/*cozalozawoza*/
import java.util.*;
public class cozalozawoza{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if (num%3==0){
			System.out.println("coza");
		}
		else if(num%5==0){
			System.out.println("loza");
		}
		else if(num%7==0){
			System.out.println("woza");
		}
		else{
			System.out.println("wrong");
		}
		sc.close();
	}
}