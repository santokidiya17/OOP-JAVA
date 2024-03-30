class Obj{
      
      static int count = 0;
      Obj(){
      	count++;
      }
}

public class Lab5_6{
	public static void main(String[] args) {
		Obj o1 = new Obj();
		Obj o2 = new Obj();
		Obj o3 = new Obj();
		System.out.println(o3.count);
	}
}