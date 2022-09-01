import java.util.*;

class disp{
    public int display(int a, String ch){
        if(ch.equals("c")){
            return a*a*a;
        }
        else{
            return a*a;
        }
    }

}

public class cube_sq{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        disp d=new disp();        
        System.out.println("Enter number");
        int num=sc.nextInt();
        System.out.println("Enter operation");
        String cho=sc.next();
        int res=d.display(num,cho);
        System.out.println(res);
        sc.close();
    }
}