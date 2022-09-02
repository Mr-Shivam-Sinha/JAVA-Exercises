import java.util.Scanner;

public class overload
{
	public int display(int a, char ch) {
        
		double res = 0;
        
		if (ch == 'c') {
			res = Math.cbrt(a);
			return (int) res;
				   }
		else {
			res = Math.sqrt(a);
			return (int) res;
			}
        
		
	}
		

	public int display(int a) {

		int isPronic = 0;
		for (int i = 1; i <= a - 1; i++) {
			if (i * (i + 1) == a) {
				isPronic = 1;
				break;				
            }
        }
        
        return isPronic;
    }

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		overload obj = new overload();


		System.out.print("Enter a number: ");
		int num = in.nextInt();
		System.out.println("\nch is 'c'");
		obj.display(num, 'c');
		System.out.println("\nch is not 'c'");
		obj.display(num, 'z');
		

		System.out.print("Enter the number to check: ");
		int r= obj.display(num);
        
		if (r == 1)
			System.out.println(num + " is a pronic number");
		else
			System.out.println(num + " is not a pronic number");
		
	in.close();
    }
}