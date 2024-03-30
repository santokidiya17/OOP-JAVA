import java.util.*;
public class Lab3A3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2){
        	if(n1>n3){
        		System.out.println("N1 is maximum");
        	}else{
        		System.out.println("N3 is maximum");
        	}
        }
        else{
        		if(n2>n3){
        			System.out.println("N2 is maximum");
        		}else{
        			System.out.println("N3 is maximum");
        		}
        	}
        }
	}
