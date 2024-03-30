import java.util.*;
public class Lab3Astr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
        String str=sc.next();
        String sec="";
        int d=str.length();
        for(int i=d-1;i>=0;i--){
                sec = sec+str.charAt(i);
        }
        if(str.equals(sec)){
        	System.out.println("PALINDROME");
        }else{
        	System.out.println("NOT PALINDROME");
        }
    }
} 
