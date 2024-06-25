package ALL;

import java.util.Scanner;

public class JAVA_PRACTICE {
	static int studentAdd(int x ,int y) {
		System.out.println("sum total   j" +  (x+y));
		return x+y;
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter 2 values nos");
		Scanner sc = new Scanner(System.in);
	int a =	sc.nextInt();
		
	int b = sc.nextInt();	
		
		studentAdd(a, b);
		
		
		
		
		
		
//		int a= 0;
//		
//		 while(a<=10) {
//			 System.out.println(a);
//			 a++;
//		 }
//		
//		int sum =0;
//		for(int i=10;i<=20;i++) {
//			sum=sum+i;
//			System.out.println(+sum);
//		}
//		int i =6;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=5);
//			
//		for(int i =1;i<=10;i++) {
//			if(i==5) {
////				break;
//				continue;
//			}
//			
//			
//			System.out.println(i);
//			
//		}
		
		
		
	}

}
