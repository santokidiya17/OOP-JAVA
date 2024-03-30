import java.util.*;
public class Lab4_3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[] = new int[4];
		int arr=0;
		for(int i=0;i<4;i++){
			System.out.println("Enter Number:");
			a[i]=sc.nextInt();
			arr=arr+a[i];
		}
		double avg=(arr)/4.0;
		System.out.println("AVERGARE:"+avg);
	}
}