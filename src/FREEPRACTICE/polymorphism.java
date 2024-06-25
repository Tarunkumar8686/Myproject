package FREEPRACTICE;

public class polymorphism 
{
	
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
	class Pig extends polymorphism{
		public void animalSound() {
			System.out.println("The pig says : we we" );
		}
		
	}
	class Dog extends polymorphism{
		public void animalSound() {
			System.out.println("The Dog says: bow bow");
		}
	}
	public static void main(String[] args) {
		
	 polymorphism animal = new polymorphism();

	 polymorphism myPig = new polymorphism();
	 polymorphism myDog = new polymorphism();
	 
	 animal.animalSound();
	 myPig.animalSound();
	 myDog.animalSound();
	}

}
