/*take set of integers and identify if the series is in arithmatic progression*/
//import java.util.*;

public class ap{
	public static void main(String[] args){
		String bool="true";
		//Scanner sc=new Scanner(System.in);
		int[] a = {1,2,3,4,5,6,4,8,9,10};
		int d=a[1]-a[0];
		for(int i=0;i<=7;i++){
			System.out.print(a[i]);
			if (a[i+1]-a[i]!=d){
				bool="false";
			}
		}
		
		
		if(bool=="true"){
			System.out.println("\nAP series\n");
					}
		else{
			System.out.println("\nTry Again\n");
		}
		
	}
	
}