package Daily_practice;

import java.util.Scanner;

public class methods {
	
  static 	void min(int a, int b) {
		if(a>b)
			System.out.println(+a+"is max");
		else
			System.out.println(+b+"is max");
	}

	public static void main(String[] args) {

		methods m = new methods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no");
		
		int c,d;
//		c=76;
//		d=90;
		c=sc.nextInt();
		d=sc.nextInt();
		min(c,d);
		
		
	}

}
