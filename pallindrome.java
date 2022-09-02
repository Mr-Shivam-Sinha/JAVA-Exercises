//Jarvis is busy constructing pallindromes for alphanumeric characters, iron man needs to activate sonic punch
//to kill thanos but needs jarvis' help who is stuck with computing pallindrome. the onus is on you to compute 
//the pallindrome method so that jarvis can save iron man.
//write a function called saveIronman() which will return true if the inp string is a pallindrome.

//import java.util.*;
/*
class checkPal{

}*/

class pallindrome{
  public static void main(String[] args) {

    	String str = "Malyalam", reverseStr = "";
    
    	int strLength = str.length();

    	for (int i = (strLength - 1); i >=0; --i) {
      		reverseStr = reverseStr + str.charAt(i);
    	}

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}


