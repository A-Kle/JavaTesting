package myProject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{		
		Date birthDate = null;
		String ownerName = "";
		String catName = "";
		Map<Integer, String[]> myMap = new HashMap<Integer, String[]>();
		myMap.put(1, new String[] {"Bolek", "Lolek"});
		
		while(birthDate == null)
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyy");
		    System.out.print("Enter your name: ");
		    ownerName = sc.nextLine();
		    System.out.print("Enter your cats name: ");
		    catName = sc.nextLine();
		    System.out.println("Enter your cats birth date: ");
		       
		    try
		    {
		    	birthDate = sdf.parse(sc.nextLine());
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Birth date format is wrong! Error :" + e);
		    }  
		}
		Cat myCat = new Cat(catName, ownerName, birthDate);
	    System.out.println(myCat.IntroduceYourself());
	}
}
