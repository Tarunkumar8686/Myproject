package FREEPRACTICE;

public class encapsulation 


{
	public String name;

	public class Main {
		  public static void main(String[] args) {
			  encapsulation myObj = new encapsulation();
		    myObj.name = "John";  // error
		    System.out.println(myObj.name); // error 
		  }
		}
}
