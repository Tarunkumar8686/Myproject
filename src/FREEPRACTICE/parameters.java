package FREEPRACTICE;

public class parameters
{

	public static void checkage(int age) {
		
		if(age<10) {
			System.out.println("child");
		}else if(age<25) {
			System.out.println("adult");
		}else {
			System.out.println("old");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		checkage(23);
	}

}
