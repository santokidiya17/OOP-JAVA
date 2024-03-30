import java.util.*;
public class Lab3A2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i,count=0,j,k=0,m=n;
        for(i=0;n!=0;i++){
            j=n%10;
            k=k*10+j;
            n=n/10; 
        }
        if(m==k){
        	System.out.println("PALINDROME");
        }else{
        	System.out.println("NOT PALINDROME");
        }
    }
} 













//string palindrome:
//string str=sc.next();
//string second=" ";
//for(int i=str.length()-1;i>=0;i--){
	//second = second+str.charAt(i);
//}