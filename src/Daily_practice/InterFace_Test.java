package Daily_practice;

 interface printable{
	 int a =20;
	 void print();
	 
 }
 interface showable{
	 void show();
	 
 }


public  class InterFace_Test implements printable,showable
{
public void print() {
	System.out.println("print");
}
public void show () {
	System.out.println("show");
}
	public static void main(String[] args) {

		InterFace_Test t = new InterFace_Test();
		
		
		t.print();
		t.show();
		System.out.println(t.a);
		
	}

}
