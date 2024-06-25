package FREEPRACTICE;

public class Main {

//	----->  Method calling
	
//static void myMethod() {
	
//	System.out.println("i can call the method");
//}
//	public static void main(String[] args) 
//	{
//		
//		myMethod();
//		myMethod();
//		myMethod();
//		myMethod();
//		
	
	
//	  -------->   parameters
	
//	static void mymethod(String fname) {
//		
//		System.out.println(fname +"Reference");
//	
//	}
//	public static void main(String[] args) {
//		
//		mymethod("jon");
//		mymethod("keeti :  ");
//		mymethod("pree");
//	}
	
	public static void mymethod(String fname, int age) {
		System.out.println(fname + "is" + age);
	
		
	}
		public static void main(String[] args) {
			
			mymethod("tarun  ", 23);
			mymethod("kumar",  35);
			
		
		}
		
		
	

}
