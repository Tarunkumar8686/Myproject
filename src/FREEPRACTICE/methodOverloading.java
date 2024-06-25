package FREEPRACTICE;

public class methodOverloading 
{
	static int plusmethod(int x,int y) {
		return x+y;
	}

	static double plusmethod1(double x,double y) {
		return x+y;
		
	}
	
	public static void main(String[] args) {
		
		
		int mynum = plusmethod(23, 23);
		double mynum1 = plusmethod1(3.4, 2.4);
		
		System.out.println(mynum);
		System.out.println(mynum1);
		
		
	}
}
