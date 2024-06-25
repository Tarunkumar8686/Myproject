package FREEPRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NEW {

	public static void main(String[] args) 
	{
    
		List<String> studentlist = new ArrayList<String>();
                 
		studentlist.add("s1");
		studentlist.add("s2");
		studentlist.add("s3");
		studentlist.add("s4");
		studentlist.add("s5");
		
//		for(int i =0;i<studentlist.size();i++)
//		{
//			System.out.println(studentlist.get(i));
//		}
//		for(int i =0;i<=3;i++)
//		{
//			System.out.println(studentlist.get(i));
//		}
//		
//		int [] marks = {90,53,63,63,25,63};
//		
//		for(int data : marks)
//		{
//			System.out.println(data);
//		}
		
		List<String > list = new ArrayList<String>();
		
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		
		for(String data : list)
		{
			System.out.println(data);
			if(data.equalsIgnoreCase("a2"))
			{
				break;
			}
		}
		
		}
		
	}
