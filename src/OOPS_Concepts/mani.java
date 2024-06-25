package OOPS_Concepts;

import FREEPRACTICE.encapsulation;
import encapsulationIntro.Encapsulation;

public class mani
{
	
	public static void main(String[] args) {
//		
//		Developer d = new Developer(20, "tarun00");
//		d.walk(null);
//		d.
		
		Encapsulation obj = new Encapsulation();
		obj.equals(obj);
	}

}

   class Developer extends person{
	   public Developer(int age,String name) {
		   super(age,name);
	   }
   }

class person{
	String name ;
	int age;
	static int count;
	public person() {
		count++;
		System.out.println("");
	}
		public person(int age,String name) {
		this.name= name;
			this.age=age;
		
	}
	
	void walk(String steps) {
		
		System.out.println(name +"  is walking" +  steps);
		
	}
	void eat(String plates ) {
		System.out.println(name +" is eating" +  plates);
	}
	void work() {
		System.out.println("person was working");
	}
}
