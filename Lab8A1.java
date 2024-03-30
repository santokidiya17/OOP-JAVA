class RepetitiveMultiplication{
	int multiplication(int x,int y){
          int r= x*y;
          return r;
	}
}
public class Lab8A1{
	public static void main(String[] args) {
		try{

		int x = Integer.parseInt(args [0]);
		int y = Integer.parseInt(args [1]);

		RepetitiveMultiplication a = new RepetitiveMultiplication();
		System.out.println("x*y="+a.multiplication(x,y));

	    }
	    catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println("Array index out of bounds");
	    }
	    catch(NumberFormatException e){
	    	System.out.println("Invalid input");
	    }
	    catch(Exception e){
	         e.printStackTrace();
        }
    }
}