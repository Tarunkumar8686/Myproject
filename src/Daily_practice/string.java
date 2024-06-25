package Daily_practice;

public class string {

	public static void main(java.lang.String[] args) {

		String s ="Tarun";
		String s1 ="kumar";
		String s3 = "tarun";
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.lastIndexOf(1));
		System.out.println(s);
		System.out.println(s.contains("run"));
		System.out.println(s.replace('a','n'));
		System.out.println(s.endsWith("it"));
		System.out.println(s.replace('n','a'));
		System.out.println(s.concat("Kumar"));
		System.out.println(s.substring(2));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s3));
		
		System.out.println(s.isEmpty());
		System.out.println(s.trim());
		
	}

}
