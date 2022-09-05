import java.util.*;
public class replace{  
	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String replace=sc.nextLine();
		System.out.println("Enter the number of times you want to run the loop");
		int n=sc.nextInt();
		int i=0;
		do{
			replace=replace.replaceAll("a","aRbFR");
			replace=replace.replaceAll("b","LFaLb");
			i=i+1;
			}while(replace.contains("a") && i<n);
	System.out.println("\n");
	System.out.println("String after replacement :\n");
	System.out.println(replace);
	System.out.println("\n");
	System.out.println("String after removing 'a' and 'b': \n");
	replace=replace.replaceAll("a","");
	replace=replace.replaceAll("b","");
	System.out.println(replace);
	sc.close();
	}
}