import java.util.Scanner;
public class Lab4_8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of pattern:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=n-1;i>0;i--){
			for(int k=0;k<i;k++){
			System.out.print("*");
		   }
		   System.out.println("");
		}
	}
}