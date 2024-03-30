import java.util.*;
public class Lab4_4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter Number:");
			a[i]=sc.nextInt();
		}
		for(int j=n-1;j>=0;j--){
			System.out.println(a[j]);
		}	
	}
}