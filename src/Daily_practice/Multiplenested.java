
package Daily_practice;
class outer {
	void print() {
		System.out.println("im outer");
	}
}
public class Multiplenested
{
	void printname() {
		System.out.println("non nested class");
	}
	
	
	
		public static void main(String[] args) {
			Multiplenested	 n = new Multiplenested();
		    outer o =new outer();
			n.printname();
			o.print();
		}
	}


