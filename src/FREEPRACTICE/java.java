package FREEPRACTICE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class java 
{
   public static void main(String[] args) {
	  
	   
//	   int i= 0;
//	   while(i<=10) {
//		   System.out.println(i);
//		   i++;
//	   }
//		 int i =0;
//	   do {
//		   System.out.println(i);
//		   i++;
//	   }while(i<5);
//	   
//	   for(int i =0;i<=20;i++) {
//		   System.out.println("Loop 1to20  :"  +i);
//	   }
//	   
//	   for(int j=1;j<=3;j++) {
//		   
//		   System.out.println(j);
//	   }
	  
////		 
//	   int[][] numbers = {{1,2,3,4,5},{6,7,8,9}};
//	   
//	   for(int i=0;i<numbers.length;++i)
//	   {
//		   for(int j=0;j<numbers[i].length;++j) {
//			   System.out.println(numbers[i][j]);
//			   
//		   }
//	   }
//		
//	   
	   
	   
//	   Scanner sc = new Scanner(System.in);
//	   
//	   System.out.println("Enter name");
//	   
//	   String userName = sc.nextLine();
//	   System.out.println("Username is: " +userName);
//	   
	   
//	   Scanner myObj = new Scanner(System.in);
//
//	    System.out.println("Enter name, age and salary:");
//
//	    // String input
//	    String name = myObj.nextLine();
//
//	    // Numerical input
//	    int age = myObj.nextInt();
//	    double salary = myObj.nextDouble();
//
//	    // Output input by user
//	    System.out.println("Name: " + name); 
//	    System.out.println("Age: " + age); 
//	    System.out.println("Salary: " + salary);
//		}

//	   LocalDateTime dateobj = LocalDateTime.now();
//	   
//	   System.out.println("Before formatting" + dateobj );
//	   
//	   DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//	   
//	   String formattedDate = dateobj.format(myformatobj);
//	   
//	   System.out.println("After formatting :" + formattedDate);
//	   
	   
	   
	   ArrayList<String> cars = new ArrayList<String>();
	   
	   cars.add("volvo");
	   cars.add("vo");
	   cars.add("vol");
	   cars.add("volv");
	   
	   Collections.sort(cars);
	   
	   for(String i : cars)
	   {
		   System.out.println(i);
	   }
	   
		   
	   
	}
	


}