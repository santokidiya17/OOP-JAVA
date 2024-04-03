class MyThreadEven extends Thread{
      public void run(){
      	for (int i=0;i<=20 ;i++){
      		if((i/2)==0){
      			System.out.println(i);
      		}
      		try{
      			Thread.sleep(1000);
      		}catch(Exception e){
      			e.printStackTrace();
      		}
      	}
      }
}
class MyThreadOdd extends Thread{
      public void run(){
      	for (int i=0;i<=20 ;i++){
      		if((i/2)!=0){
      			System.out.println(i);
      		}
      		try{
      			Thread.sleep(1000);
      		}catch(Exception e){
      			e.printStackTrace();
      		}
      	}
      }
}
public class Lab9_2{
	public static void main(String[] args) {
		MyThreadEven e = new MyThreadEven();
		e.start();

		MyThreadOdd o = new MyThreadOdd();
		o.start();
	}
}