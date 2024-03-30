import java.util.*;
public class Lab2A5{
	public static void main(String [] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 System.out.println("Enter the Operator:");
	 String ope=sc.next();
	 if(ope.equals("+")){
	 	System.out.println("Sum="+(a+b));
	 }else if(ope.equals("-")){
	 	System.out.println("Differnce="+(a-b));
	 }else if(ope.equals("*")){
	 	System.out.println("Multipliation="+(a*b));
	 }else if(ope.equals("/")){
	 	System.out.println("Division="+(a/b));
	 }else{
	 	System.out.println("Invalid Operator");
	 }
	}
}


//