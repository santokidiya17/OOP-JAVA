import java.util.*;
public class Lab4_5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
        String str=sc.next();
        System.out.println(str.length());
        String str1 = "";
        for(int i=(str.length()/2);i<str.length();i++){
        	 str1=str1+str.charAt(i);
        }
        System.out.println(str1);
	}
}