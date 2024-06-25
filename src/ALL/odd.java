package ALL;

public class odd 
{
	public static void odd (int a) {
		for(int i =1;i<=a;i++) {
			
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		odd(50);
		
	}

}
