public class persistence{  
public static void main(String args[]){  
String replace="fa";
int i=0;
do{
replace=replace.replaceAll("a","aRbFR");
i=i+1;
}while(replace.contains("a") && i<10);
System.out.println(replace); 
}}