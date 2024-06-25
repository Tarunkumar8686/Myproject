package Daily_practice;

public class Throw_Exception 
{
     static void check(int a) {
    	 
    	 if(a<18) {
    	 throw new ArithmeticException("not eliglible");
    	 }else
    		 System.out.println("eligible");
     }
     
	public static void main(String[] args) {
         check(12);
		System.out.println("hi");
		
	}

}
