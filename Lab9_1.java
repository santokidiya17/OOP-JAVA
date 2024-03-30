class MyThread1 implements Runnable{
      public void run(){
      	System.out.println("Good Morning");
      	Thread.sleep(1000);
      }
}
class MyThread2 implements Runnable{
       public void run(){
      	System.out.println("Good Afternoon");
      	Thread.sleep(3000);
      }
}
public class Lab9_1{
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		Thread t2 = new Thread(t1);
		t2.start();
		MyThread1 t3 = new MyThread1();
		Thread t4 = new Thread(t3);
		t4.start();
	}
}