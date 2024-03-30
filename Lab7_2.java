interface A{
	final int a = 10;
	void mA();
}
interface A1 extends A{
	final int a1 = 10;
	void mA1();
}
interface A2 extends A{
	final int a2 = 10;
	void mA2();
}
interface A12 extends A2,A1{
	final int a12 = 10;
	void mA12();
}
class B implements A12{
	public void mA(){
		System.out.println(a);
	}
	public void mA1(){
		System.out.println(a1);
	}
	public void mA2(){
		System.out.println(a2);
	}
	public void mA12(){
		System.out.println(a12);
	}
}
public class Lab7_2{
	public static void main(String[] args) {
		B b1 = new B();
		b1.mA();
		b1.mA1();
		b1.mA2();
		b1.mA12();
	}
}