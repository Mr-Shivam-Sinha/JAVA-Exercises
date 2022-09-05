//prime
import java.util.*;
public class prime{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num= sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				count=count+1;
				break;
			}
			
		}
		if(count==0){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		sc.close();

	}
}