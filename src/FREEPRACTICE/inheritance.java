package FREEPRACTICE;

public class inheritance
{
	class Vehcile{
		public String brand = "Ford";
		public void honk() {
			
			System.out.println("Brack");
		}
	}
	class Car extends Vehcile
	{
		private String modelname ="figo";
		
	}
	public static void main(String[] args ) {
		
		Object x;
//		Car fastCar = x.new Car();
//		fastCar.honk();
//		System.out.println(fastCar.brand+"  "+fastCar.modelname);
	}
	

}
