interface Transport{
	void deliver();
}
abstract class Animal{

}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
	public void deliver(){
		System.out.println("Camel");
	}
	
}
class Deer extends Animal{
	
}
class Donkey extends Animal implements Transport{
	public void deliver(){
		System.out.println("Donkey");
	}
}
public class Lab7_3{
	public static void main(String[] args) {
		Animal[] A = new Animal[4];
		A[0] = new Tiger();
		A[1] = new Camel();
		Camel C = new Camel();
		C.deliver();
		A[2] = new Deer();
		A[3] = new Donkey();
		Donkey b=new Donkey();
		b.deliver();
	}
}