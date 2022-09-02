/*Isomorphic
 * aab
 * xxy are isomrophic
 */

import java.util.*;

public class isomorphic{

    

    public static Boolean compare(String st1,String st2){
        // System.out.println(st1);
        // System.out.println(st2);
        char[] starr1 = new char[st1.length()];
        char[] starr2 = new char[st1.length()];
        if(st1.length()==st2.length()){
            starr1 = st1.toCharArray();
            starr2 = st2.toCharArray();
        }
        else{
            System.out.println("Not Isomorphic");
            return false;
        }

        HashMap<Character,Character> count=new HashMap<>();
        char c = 'a';
        for (int i = 0; i < starr1.length; i++) {
          if (count.containsKey(starr1[i])) {
          c = count.get(starr1[i]);
          if (c != starr2[i])
            return false;
      }
      else if (!count.containsValue(starr2[i])) {
        count.put(starr1[i], starr2[i]);
      }
      else {
        return false;
      }
    }
    return true;
  }
    // for (Character key: count.keySet()){  
		// 	System.out.println(key+ " = " + count.get(key));
		// } 



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter String 1 : ");
        String str1=sc.next();
        System.out.print("\nEnter string 2 : ");
        String str2=sc.next();
        System.out.println(isomorphic.compare(str1,str2));
    }
}