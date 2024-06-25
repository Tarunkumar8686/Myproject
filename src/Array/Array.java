package Array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		
		int n=sc.nextInt();
		System.out.println("enter ele");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(a[5]);
		
	}

}
