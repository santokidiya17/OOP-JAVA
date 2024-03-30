import java.util.Scanner;
class Circle{
	int r;
	void setData(){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius:");
	r= sc.nextInt() ;
	}
    double area(){
    	// int r = 10;
	double a = 3.14*r*r;
	return a;
    }
}
public class Lab5_1{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setData();
		double b = c1.area();
		System.out.println(b);
	}
}