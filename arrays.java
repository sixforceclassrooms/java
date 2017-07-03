import java.util.ArrayList;
import java.util.Collections;


public class arrayy {

	private static final ArrayList<String> String = null;

	public static void main(String[] args) {
	
		int a[]=new int[3];                            //array for integer
		a[0]=5;
		a[1]=4;
		a[2]=7;
		
		//int a[]=  {5,7,3,4,1);
		
		for (int i=0;i<a.length;i++)
 		{
			System.out.println(a[i]);
			
		}
			
		
		String b[]={"hai" ,"hello"};                   //String in array           
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			
		}

		ArrayList<String> c=new ArrayList<String>();    //arraylist
		c.add("kgood morning");
		c.add("java");
		Collections.sort(c);                             //sorting the datas in the array list in order
		for (int i=0;i<c.size();i++)
			{
			System.out.println(c.get(i));
			}
		
		
		
	}

}
