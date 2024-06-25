package ALL;

import java.lang.runtime.SwitchBootstraps;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Java_concept {

	public static void main(String[] args) {
		
//		 int age =  23;
//	     String name = "tarun";
//	     System.out.println(name);   // Integers
//			System.out.println(age);
//			
//			float x = 20.35f;
//			double y = 8474.9488;     // RealNumbers
//			
//			System.out.println(x);
//			System.out.println(y);
//			
//			boolean isworking = true;     // Boolean
//			System.out.println(isworking);
//			
//			char gender = 'm';
//			System.out.println(gender);   //  Character
//			
//			
//			String course = "Java";
//			int count = course.length();   //Counting No of character in string using length()
//			System.out.println(count);
//			
//			String mm = "TArun";
//			System.out.println(mm.toLowerCase());  // Converting Upper & LowerCase 
//			System.out.println(mm.toUpperCase());
//			
//			
//			String course1 = "Java";
//			char p = course1.charAt(0);  //Counting single letter Using char
//			System.out.println(p);
//			
//			
//			String Str1,Str2;
//			Str1 = "Tarun";  // 2 String Using Equal() & EqualIgnoreCase()
//			Str2 ="tarun";
//			System.out.println(Str1.equals(Str2));
//			System.out.println(Str1.equalsIgnoreCase(Str2));
//			
//			String str3,str4;
//			str3 = "google";
//			str4 ="Google";       // String contains another String 
//			
//			System.out.println(str3.contains(str4));
//			
//			
//			String oo =" Welcome to Google";
//			System.out.println(oo.contains("google"));
//			
//			String pp =" welcome to Google app";
//			String qq ="google";
//			System.out.println(pp.toLowerCase().contains("qq"));

//		String str ="Qedge";
//		char x = str.charAt(4);
//		System.out.println(x);
//		
//		System.out.println(str.length());
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
		
//		String Exp,act;
//		Exp ="Tarun";
//		act ="tarun";
//		System.out.println(Exp.equals(act));
//		System.out.println(Exp.equalsIgnoreCase(act));
//		
//		String expurl = "gmail";
//		String acturl = "http://www.google.com/intl/en-GB/gmail/about/";
//		
//		System.out.println(expurl.contains(acturl));
		
//		String[] students = {"tarun","kumar","Shiva"};
//		
//		System.out.println(students.length);
//		System.out.println(students[0]);
//		System.out.println(students[1]);
//		System.out.println(students[2]);
//		
//		students[0] ="Srikar";
//		System.out.println("after replacing.."+students[0]);
//		
//		System.out.println(students[0]);
//		
//		int[]marks = {76,45,64,46,64};
//		System.out.println("count of marks : "+marks.length);
//		
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		
//		marks[1] =90;
//		marks[2] = 80;
//		
//		System.out.println(marks[1]);
//		System.out.println(
//				marks[2]);
		
		
//         -----------> ArrayList<--------------
		
//		
//		ArrayList<String> Studentlist = new ArrayList<String>();
//		
//		Studentlist.add("rohit");
//		Studentlist.add("virat");
//		Studentlist.add("dhoni");
//		
//				System.out.println(Studentlist.size());
//				System.out.println(Studentlist.get(0));
//				System.out.println(Studentlist.get(1));
//				
//				Studentlist.set(0, "MS Dhoni");
//				System.out.println("after replacing..."+Studentlist.get(0));
//		System.out.println(Studentlist.get(0));
//		
		
//                 ---------> object<----------
//		      Object[] Empdata = {"Tarun",25,'m',40000};
//		      
//		      System.out.println(Empdata[0]);
//		      System.out.println(Empdata[1]);
		
//		-----> if 
//		int a,b;
//		a=15;
//		b=25;
//		if(a<b) {
//			System.out.println("a is Big");
//		}
//		
//		int c =20;
//		int d =10;
//		if(c>d) {
//			System.out.println("c is big");
//		}
//		
//         ----> if else <-----
		
//		int a = 33;
//		int b =22;
//		if(a>b) {
//			System.out.println("a is big");
//		}else
//		{
//			System.out.println("a is not big");
//		}
//		
//		String name = "Tarun";
//		String sname= "Tarun";
//		if(sname==name) {
//			System.out.println("correct");
//		}else
//			System.out.println("not correct");
//		
		
//		String name = "tarun";
//	    String sname= "Tarun";
//		if(name.equalsIgnoreCase(sname)) {
//			System.out.println("correct");
//		}else
//			System.out.println("not correct");
//		
		
//		----->  Nested if <--------
		
//              Scanner sc = new Scanner(System.in);  // this method is used to edit in console
//              System.out.println("Enter  first value");
//             int a = sc.nextInt();
//             System.out.println("Enter second Value");
//		     int b = sc.nextInt();
//		     
//		     System.out.println(a);
//		System.out.println(b);
//		
//		if(a>b) {
//			System.out.println("a is big ");
//		}else if (b>a) {
//			System.out.println("b is big");
//		}else {
//			System.out.println("both are same");
//			
//		}
			
//		String college;
//		System.out.println("enter the college name");
//		Scanner sc = new Scanner(System.in);
//		college =sc.nextLine();
//		if(college.equalsIgnoreCase("g")) {
//		System.out.println("Gauthami");
//		}else if(college.equalsIgnoreCase("n")){
//			System.out.println("Nishitha");
//			
//		}else {
//			System.out.println("college error");
//		}
//	
//	     -------->   Switch Case             <---------
		
		
//		String course;
//		System.out.println("enter course");
//		
//		Scanner sc = new Scanner(System.in);
//		course = sc.nextLine();
//		
//		switch(course.toLowerCase())
//		{
//		case"s":
//			System.out.println("Sap");
//			break;
//		case"j":
//			System.out.println("Jira");
//		case"r":
//			System.out.println("Rally");
//			default:
//				System.out.println("Invalid course");
//		}
		
//		------->  Looping Statements  <-------
//		
//		int i =1;
//		while(i<=100)
//		{
//			System.out.println(i);
//			
//			i++;                        -------> While loop.      
//		}
//		System.out.println("End the loop");
//		
		
//		int i =100;
//		while(i>=10)
//		{
//			System.out.println(i);
//			i--;
//		}
//		System.out.println("End the loop");

		
//                 ---------->  do while	<--------------	
		
//		int i =101;
//		do {
//			System.out.println(i);
//			i++;                           // Do while at list one time is run those the code is false
//		}
//		while(i<=100);{
//			System.out.println("End the loop");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("yeah i what to continue...");
//		       String c = sc.nextLine();
//		       
//		      while(c.equalsIgnoreCase("y")) {
//		    	  System.out.println("loop executed");
//		    	  System.out.println("yeah i what to continue");
//		    	  c =sc.nextLine();
//		      }
//		System.out.println("loop Ended...");
//		
//		String c ;
//		do {
//			System.out.println("loop Executed");
//			System.out.println("i want to continue..");
//			Scanner sc = new Scanner(System.in);
//			c = sc.nextLine();
//					
//		}while(c.equalsIgnoreCase("y"));
//		System.out.println("loop ended");
//		
//			
		        
//		       --------> For loop  <-----------
		
	/*	Syntax
		for(initialize var ;condition;updata)
		{
		Statement;
		}
		                                     */
//		for(int i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
//			for(int i=100;i>=1;i--)
//			{
//				System.out.println(i);
//			}
//		for(int i=1;i<=100;i=i+2)
//		{
//			System.out.println(i);
//		}
	             
//		int[] marks = {70,45,65,64};
//		int i;
//		for(i=0;i<marks.length;i++)
//		{
//			System.out.println(marks[i]);
//		}
		
//		int[] marks = {90,80,56,64};
//		int i;
//		for(i=0;i<=3;i++) {
//			System.out.println(marks[i]);
//		}
		
   
//       List<String> classlist = new ArrayList<String>();
//       classlist.add("stu1");
//       classlist.add("stu2");
//       classlist.add("stu3");
//       classlist.add("stu4");
//       classlist.add("stu5");
//       
//       for(int i=0;i<=4;i++) {
//    	   System.out.println(classlist.get(i));
//	}
		
//               -----------> For Each Loop  <--------
		// syntax:-
//		for(datatype variable : array/arraylist)
//		{
//			statements;	
//		}
//		
//		int[] marks = {65,75,64,77,89};     // using with array
//		for(int data : marks) {
//			System.out.println(data);
//		}
		
//		List<String> classlist = new ArrayList<String>();
//		
//		classlist.add("st1");
//		classlist.add("stu2");
//		classlist.add("stu3");
//		classlist.add("stu4");
//		classlist.add("stu5");
//		                                     // using Break Statements 
//		for(String data : classlist) {
//			System.out.println(data);
//			if(data.equalsIgnoreCase("stu4"))
//			{
//				break;
//			}
//		}
		
//		String[]  student = {"tarun","kumar","mandha"}
//		   ;
//		   for(String i : student)
//		   {
//			   System.out.println(i);
//		   }
		  //   ----->>>>>> for loop
				String[] bikes = {"h1","h2","h3","h4","h5"};
				
				bikes[3]="k7";
//				
//				System.out.println(bikes.length);
				
//				for(int i=0;i<bikes.length;i++)
//				{
//					System.out.println(i);
//				}
		// ----------------->>>>>>>>>		for each loop
//				for(String i : bikes)
//				{
//					System.out.println(i);
//				}
//						
				
				//    -----> DATE & Time
				
//				LocalDateTime dateobj = LocalDateTime.now();
//				   
//				   System.out.println("Before formatting" + dateobj );
//				   
//				   DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//				   
//				   String formattedDate = dateobj.format(myformatobj);
//				   
//				   System.out.println("After formatting :" + formattedDate);
//				
       }
	}

  
	  
  