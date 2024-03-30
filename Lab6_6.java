class A{
	String a="Diya Santoki";
}
class B extends A{
      String a = "Diya";
      String b;

      void print(){
      	System.out.println("this="+this.a+"_____super="+super.a);
      }
}
public class Lab6_6{
	public static void main(String[] args) {
		B b1 = new B();
		b1.print();
	}
}