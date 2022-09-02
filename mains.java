/*Pronic Number*/
import java.util.*;



class pronic{

	public void generate(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int num=sc.nextInt();
	int pronic=0;
	for(int i=0;i<=num;i++){
		pronic=i*(i+1);
		System.out.println(pronic);
		}
		sc.close();
	}

	public void check(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int pronic=0;
		for(int i=0;i<num;i++){
			if(i*(i+1)==num){
				pronic=1;
				break;
			}
		}
		if(pronic==1){
			System.out.println("Pronic");
		}
		else{
			System.out.println("Not Pronic");
		}
		sc.close();

	}
}
	

public class mains{
	public static void main(String args[]){
		pronic pr=new pronic();
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Generate pronic\n2. Check Pronic.\n");
		int choice=sc.nextInt();
		switch(choice){
			case 1:pr.generate();
				break;
			case 2:pr.check();
				break;
			default:System.out.println("Wrong choice");
		}
		sc.close();
	}
}


