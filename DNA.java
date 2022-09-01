import java.util.*;
import java.util.regex.Pattern;

public class DNA{
    public static String inputDna;

    public static void rev_comp(String strand){
        char[] ch=strand.toCharArray();
        //System.out.print(ch);
        //char[] rev=new char[ch.length];
        //System.out.print(rev.length);
        System.out.print("Compliment DNA : ");
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='A')System.out.print("T");
            else if(ch[i]=='G')System.out.print("C");
            else if(ch[i]=='C')System.out.print("G");
            else System.out.print("A");
        }
        //System.out.print(rev);

    }

    public static void validate(String inp_strand){
        if(Pattern.matches("[ATGC]+",inp_strand)){
            System.out.print("\nYOU HAVE ENTERED : ");
            System.out.println(inp_strand+"\n");
            rev_comp(inp_strand);
        }
        else{
            System.out.println("!!!!! Please Enter correct Sequence !!!!!");
            DNA d=new DNA();
            take_input();
        }
    }

    public static void take_input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the strand :");
        inputDna=sc.next();
        inputDna=inputDna.toUpperCase();
        //System.out.println(strand);
        validate(inputDna);
    }

    public static void main(String args[]){
        take_input();
    }
}