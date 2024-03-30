import java.util.*;
public class Lab3A1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter total marks:");
		double total=sc.nextDouble();
		System.out.println("Enter the marks of 5 subjects :");
		double m1=sc.nextDouble();
		while(m1>total){
			System.out.println("enter valid marks :");
			m1=sc.nextDouble();
		}
		double m2=sc.nextDouble();
		while(m2>total){
			System.out.println("enter valid marks :");
			m2=sc.nextDouble();
		}
		double m3=sc.nextDouble();
		while(m3>total){
			System.out.println("enter valid marks :");
			m3=sc.nextDouble();
		}
		double m4=sc.nextDouble();
		while(m4>total){
			System.out.println("enter valid marks :");
			m4=sc.nextDouble();
		}
		double m5=sc.nextDouble();
		while(m5>total){
			System.out.println("enter valid marks :");
			m5=sc.nextDouble();
		}
		double per=((m1+m2+m3+m4+m5)/(5*total))*100;
		System.out.println(per);
		if(per>=60){
			System.out.println("First Division");
		}else if(per>50){
			System.out.println("Second Division");
		}else if(per>40){
			System.out.println("Third Division");
		}else{
			System.out.println("FAIL");
		}
	}
}