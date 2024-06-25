package FREEPRACTICE;

public class constructors 
{
	
	int modelyear;
	String modelname;
	
	public constructors(int year, String name) {
		
		modelyear =year;
		modelname= name;
		
	}
	public static void main(String[] args) {
		
	  constructors obj = new constructors(2103, "Tarun");
	  
	  System.out.println(obj.modelname +" "+ obj.modelyear);
	}
}
