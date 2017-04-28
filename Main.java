import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args)
	{
		readFile();
	}

	
	public static void readFile()
	{
		String fileName = "ExData.txt";
		String composedFull = null;
		String composedLine = null;
		BufferedReader br = null;
		try 
		{
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		}
		//try this//
		try{
			StringBuilder sb = new StringBuilder();
		   // composedLine = br.readLine();
			
			while((composedLine = br.readLine()) != null){			//until a blank line is found...
				sb.append(composedLine+"\n");			//build a string from composedLine (from the bufferReader)
				//composedLine = br.readLine();
			}
			composedFull = sb.toString();
		}
		catch (FileNotFoundException e){ 
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally	{
			try{
				br.close();
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		editFile(composedFull);
		
	}
	public static void editFile(String composedFull)
	{
		//decompose composedFull into the relevant objects//
		String[] obj = composedFull.split("&");			//obj[] = split file into two parts, animals and humans//

		ArrayList<person> al= new ArrayList<person>();	//create an arraylist al of type: person//
			String[] people = obj[0].split("%");		//separate individual people by %//
			for(String s : people)						//for each instance of people (each person + full details//
			{
				String[] myString = s.split("\n");		//myString[array] = each attribute of each person (split by new lines)//
				person p = new person(myString);		//pass in myString[array]'s detals as a complete new person//
				al.add(p);								//add this person to the ArrayList AL//
			}		
			
		ArrayList<animal> al1 = new ArrayList<animal>();	//create an ArrayList of type: animal//
			String[] animals = obj[1].split("%");			//decompose each animal by it's separator: %//
			for(String s : animals)
			{
				String[] animalString = s.split("\n");
				animal a = new animal(animalString);
				System.out.println(animalString.toString());
			}
			
		//print through the array of people//
//			for(person p : al)							
//			{
//				System.out.println(p.toString());
//			}
		//print through the array of animals//
			for(animal a : al1)
			{
				System.out.println(a.toString());
			}
	}
		
	}
	



