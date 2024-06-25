package Daily_practice;

//public class Bike 
//{
//	static int wheels =2;
//	String colour ="";
//	static void braking() {
//		System.out.println("Bike Stops when brake Applied ");
//	}
//	void mileage(int s) {
//		System.out.println("mileage " +s +"kmph");
//	}
//	
//	public static void main(String[] args) {
//		
//		Bike Fz =new Bike();
//		Bike hero = new Bike();
//		Bike Ct = new Bike();
//		Bike royal = new Bike();
//		
//		hero.braking();
//		royal.braking();
//		
//		hero.mileage(53);
//		royal.mileage(45);
//		
//		
////		System.out.println(""+hero.wheels);
////		System.out.println(""+Fz.wheels);
////		System.out.println(""+Ct.wheels);
////		System.out.println(""+royal.wheels);
////		
////		Fz.colour="Red";
////		hero.colour ="Blue";
////		Ct.colour ="brown";
////		
////		System.out.println(Fz.colour);
////		System.out.println(hero.colour);
////		System.out.println(Ct.colour);
//		
//		
	
	
	public class car{
		static int wheels =4;
		String colour ="";
		static void breaking() {
			System.out.println("Car stops when the break appleid");
		}
	void mileage(int m) {
			System.out.println("mileage "+m +"kmph");
		}
		public static void main(String[] args) 
		{
			car honda = new car();
			car brezza = new car();
			car i20 = new car();
			car santro = new car();
			
			honda.breaking();
			brezza.breaking();
			i20.breaking();
			
			honda.colour="Red";
			i20.colour="Blue";
			brezza.colour="White";
			
			honda.mileage(23);
			i20.mileage(21);
			brezza.mileage(22);
			
			System.out.println(honda.colour);
			System.out.println(car.wheels);
		}
		
	}
	
	
	


