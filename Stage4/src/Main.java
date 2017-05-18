import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		///////////example inputs//////////////
		Person Matt = new Person("Matt", "Grogan", "03/01/1995", "British");
		Marina MYC = new Marina("Monaco Yacht Club", "Quai Louis II, 98000 Monaco", 150);
		Boat boat1 = new Boat("Santa Maria", "Portugal", 0.8);
		boat1.addPerson(Matt);
		Matt.setOccupation("Captain");
		Matt.setOccupation("Captain");
		System.out.println(Matt.getOccupations());
/*
		System.out.println(readFile("stage_5_input.txt"));
		formatFile(readFile("stage_5_input.txt"));
*/
		
	}
	
/*	public static String readFile(String fileName) 
	{
		String fileInfo = "|\n ";
		File x = new File(fileName);
		try
		{
			Scanner sc = new Scanner(x);
			while(sc.hasNext())
			{
				fileInfo += (sc.nextLine() + "");
				fileInfo += ",";
			}
			sc.close();
			return fileInfo;
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			return e.getMessage();
		}	
	}
	
	public static ArrayList<String> formatFile(String fileInfo)
	{
		ArrayList<String> formatString = new ArrayList<>();
		
		return formatString;
	}
*/	


}
