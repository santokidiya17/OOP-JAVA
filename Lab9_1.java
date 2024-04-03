class MyThread1 implements Runnable{
      public void run(){
      	while(true){
      		System.out.println("Good Morning");
      	try{
      		Thread.sleep(1000);
      	}catch(Exception e){
      		e.printStackTrace();
      	}
          }
      }
}
class MyThread2 implements Runnable{
       public void run(){
      	while(true){
      		System.out.println("Good Afternoon");
      	try{
      		Thread.sleep(3000);
      	}catch(Exception e){
      		e.printStackTrace();
      	}
      	}
      }
}
public class Lab9_1{
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		Thread t2 = new Thread(t1);
		t2.start();
		MyThread2 t3 = new MyThread2();
		Thread t4 = new Thread(t3);
		t4.start();
	}
}