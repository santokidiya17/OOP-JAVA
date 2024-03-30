import java.util.Scanner;

class ComplexNumber{
	int real;
    int imaginary;

    ComplexNumber(int real,int imaginary){
    	this.real = real;
    	this.imaginary = imaginary;
    }
    void addComplex(ComplexNumber N){
    	int r = this.real + N.real;
    	int i = this.imaginary + N.imaginary;
    	System.out.println(r+" "+i+"i");
    }
}

public class Lab5_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number 1:");
		int r1 = sc.nextInt();
		int i1 = sc.nextInt();
        System.out.println("Enter the number 2:");
		int r2 = sc.nextInt();
		int i2 = sc.nextInt();
         
        ComplexNumber n1 = new ComplexNumber(r1,i1);
		ComplexNumber n2 = new ComplexNumber(r2,i2);
		n1.addComplex(n1);

	}
}