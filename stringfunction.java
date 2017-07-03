
public class stringfunction {

	public static void main(String[] args) {

		String a="abcde";
		String b="abcde";
		
		System.out.println(a.toUpperCase());      //predefinrd function is uppercase
		
		
		System.out.println(a.toLowerCase());      //predefinrd function is lowercase
		
		
		int i=b.compareTo(a);                     //predefined functiom is compare 
		if(i<0)
			System.out.println("String b is smaller than a");
		else if(i>0)
		System.out.println("String b is greater than a");
		else
			System.out.println("String a and b are equal");
		
		
		System.out.println(b.substring(4));         //predefined function is substring
		
		System.out.println(a.charAt(3));            //predefined function is charat(index value)
		
		System.out.println(b.replace("de","HAI" ));  //predefined function is repalce
		
		System.out.println(b.indexOf('a'));            //predefined function is indexof
		
		
		if (a.equals(b))                              //predefined function is equal
			System.out.println("both are equal");	
		
	}

}
