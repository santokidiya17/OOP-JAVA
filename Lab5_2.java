import java.util.Scanner;
class Time{
	Time(){
		int h1=1;
		int m1=1;
	}
	Time(int h,int m);
	{
		int h2 =h;
		int m2=m;
	}
	void addition(time t1, time t2){
		int h=t1.h1+t2.h2;
		int m = t1.m1+t2.m2;
		if(m>59){
			h++;
			m=m-60;
		}
	}
}
public class Lab5_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hour:");
		int hour=sc.nextInt();
		System.out.println("Enter the min:");
		int min=sc.nextInt();
		Time t1=new Time(h,m);

	}
}