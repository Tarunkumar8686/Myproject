package FREEPRACTICE;

public class Classes_objects 
{
//	
//	int x =5;
//	public class Second
//	{
////	int y=43;
//	
//	public static void main(String[] args) {
//		
//		Classes_objects object = new Classes_objects();
//		
//		System.out.println(object.x);
////		System.out.println(object.y);
//	}
//	
//	
//	int x =4;
//public 	static void main(String[] args) {
//		Classes_objects obj = new Classes_objects();
//		obj.x=30;
//		
//		System.out.println(obj.x=30);
//	}
	
//	static void mystaticMethod() {
//		System.out.println("Static method without creating object");
//	}
//	public void publicMethod()
//	{
//		System.out.println("public method must we create the object");
//	}
//
//	public static void main(String[] args) {
//		
//		mystaticMethod();
//		
//		Classes_objects obj = new Classes_objects();
//		obj.publicMethod();
	
	public void fullThrouble() {
		System.out.println("The car is going as fast it can!");
	
	}
	public void speed(String maxspeed) {
		System.out.println("Max speed is :" +maxspeed);
	}
	public static void main(String[] args) {
		
		Classes_objects car = new Classes_objects();
		car.fullThrouble();
		car.speed("Thousand");
	}
}
	
