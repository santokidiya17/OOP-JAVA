import java.util.Scanner;
public class Lab3A4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		int count=0;
		for(int i=1;i<=(a/2);i++){
			//System.out.println("*");
			if(a%i==0){
				count++;
			}
		}if(count>=2){
				System.out.println("Given Number Is Not Prime Nmuber");
			}
			else{
				System.out.println("Given Number Is Prime Nmuber");
			}
		}
	}
