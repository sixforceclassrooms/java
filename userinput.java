import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class userinput {

	public static void main(String[] args) throws Exception {

		 InputStreamReader i = new InputStreamReader(System.in);      //Method 1:BufferReader
		    BufferedReader b =new BufferedReader(i);
		    System.out.println("enter your input");
		    String userinput = b.readLine();
		
		    System.out.println(userinput);
	
		Scanner s=new Scanner(System.in);                             //Method 2:Scanner
		
		System .out.println("enter your input");
		//String userinput1 = "";
		//userinput1=s.next();
		//or
		String userinput1=s.next();
	
		System.out.println("user input is "+userinput1);
		
		String userinput3=JOptionPane.showInputDialog("enter input"); //Method 3: JOptionPane
		
		System.out.println(userinput3);
		
		

		 InputStreamReader ir = new InputStreamReader(System.in);      //getting input as integer;
		 BufferedReader br =new BufferedReader(ir);
		 
		 int userinput4=Integer.parseInt(br.readLine());
		int f =userinput4+100;
		System.out.println(f);
		
		   
	}

}
