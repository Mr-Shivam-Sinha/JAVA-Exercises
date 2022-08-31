import java.util.*;

public class cmdLine {

    public static int input;
    public static String str_input;

    public static void choose_pgm(String choice){
        switch(choice){
            case "1": {
                Scanner sc=new Scanner(System.in);
                System.out.print("\nEnter the number of stairs you want to climb :");
                input=sc.nextInt();
                System.out.print(Stairs(input));
                break;
            }
            case "2" : {
                Scanner sc=new Scanner(System.in);
                System.out.print("\nEnter the String :");
                str_input=sc.nextLine();
                System.out.print(sigil(str_input));
                break;
            }
            default:System.exit(0);
        }
    }


    public static String sigil(String str){
        str=str.replaceAll("\\s+", "");
        //System.out.print(str);
        str=str.replaceAll("[aeiou]", "");
        
        return str;
    }


    public static int Stairs(int steps){
        if(steps==0)return 1;
        else if(steps<0)return 0;
        else return Stairs(steps-1)+Stairs(steps-2);       
    }

    public static void main(String args[]){
        String a=args[0];
        choose_pgm(a);
    }
}
