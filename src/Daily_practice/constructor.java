package Daily_practice;


public class constructor
{
    int a ;
    String b;
    
    constructor(int c, String d){
    	a=c;
    	b=d;
    }
		
	public static void main(String[] args) {

		constructor co = new constructor(35,"moon");
		constructor co1 = new constructor(05,"know");
		System.out.println(co.a +" "+ co.b);
		System.out.println(co1.a+" "+co1.b);
		
	}
	}


