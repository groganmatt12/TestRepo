import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		///////////example inputs//////////////
//		Person Matt = new Person("Matt", "Grogan", "03/01/1995", "British");
//		Marina MYC = new Marina("Monaco Yacht Club", "Quai Louis II, 98000 Monaco", 150);
//		Boat boat1 = new Boat("Santa Maria", "Portugal", 0.8);
//		boat1.addPerson(Matt);
//		Matt.setOccupation("Captain");
//		Matt.setOccupation("Captain");
 
		String fileInfo = readFile("stage_5_input.txt");
		printCreatedObjects(formatFile(fileInfo));

	}
	
	public static String readFile(String fileName) 
	{
		String fileInfo = "|\n\n";
		File x = new File(fileName);
		try
		{
			Scanner sc = new Scanner(x);
			while(sc.hasNext())
			{
				fileInfo += (sc.nextLine() + "");
				fileInfo += "\n";
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
	
	public static String printCreatedObjects(ArrayList<ArrayList> arrayListOfEverything)
	{
		String arraysOfEverything = "";
		for(ArrayList<Object> outerAl : arrayListOfEverything)
			{
				arraysOfEverything += outerAl;
			}
		System.out.println(arraysOfEverything);
		return arraysOfEverything;
	}
	
	public static ArrayList<ArrayList> formatFile(String fileInfo) 				//takes file as string, decomposes, parses into objects and adds to ArrayLists//
	{
		ArrayList<ArrayList> arrayListOfEverything = new ArrayList<ArrayList>();
		Scanner sc = new Scanner(fileInfo);
		ArrayList<Marina> marinas = new ArrayList<Marina>();
		ArrayList<Boat> boats = new ArrayList<Boat>();
		ArrayList<Person> people = new ArrayList<Person>();
		int readingState = 0;
		String currentLine = sc.nextLine();
		try
		{
			while (sc.hasNext()) 
			{
				if (currentLine.equals("|"))
					{
						currentLine = sc.nextLine();						//allows for re-use if condition is not met//
						if(currentLine.isEmpty())							//new class delimiter..."
						{
							switch (sc.nextLine()) 							//create new classes + first object of each//
							{
							case "Marinas":
								readingState = 1;							//set current reading state to Marinas//
								sc.nextLine(); 								
								currentLine = sc.nextLine();				
								int i = 0;									//i counts through Marina attributes//
								String marinaName = "";
								String marinaAddress = "";
								int marinaCapacity = 0;
								while(!(currentLine.contains("|")))			//until the delimiter is found...//
								{
									if(i == 0)								//save as attributes//
									{
										marinaName = currentLine;
									}
									else if(i == 1)
									{
										marinaAddress = currentLine;
									}
									else if(i == 2)
									{
										marinaCapacity = Integer.parseInt(currentLine);
									}
									else
									{
										System.out.println("'" + currentLine + "'" + " is not an attribute of Marina"); 
									}
									currentLine = sc.nextLine();
									i++;
								}
								marinas.add(new Marina(marinaName, marinaAddress, marinaCapacity));		//add new Marina to Marinas//
								break;
							case "Boats":
								readingState = 2;							//set current reading state to Boats//
								sc.nextLine();			
								currentLine = sc.nextLine();
								int j = 0;									//j counts through Boat attributes//
								String boatName = "";
								String boatOrigin = "";
								double boatSize = 0;
								while(!(currentLine.contains("|")))
								{
									if(j == 0)
									{
										boatName = currentLine;
									}
									else if(j == 1)
									{
										boatOrigin = currentLine;
									}
									else if(j == 2)
									{
										boatSize = Double.parseDouble(currentLine);
									}
									else
									{
										System.out.println("'" + currentLine + "'" + " is not an attribute of Boat"); 
									}
									currentLine = sc.nextLine();
									j++;
								}
								boats.add(new Boat(boatName, boatOrigin, boatSize));			//add new Boat to boats//
								break;
							case "People":
								readingState = 3;							//set current reading state to People//
								sc.nextLine(); 					    		
								currentLine = sc.nextLine();		
								int k = 0;									//k counts through Person attributes//
								String[] personNameParts = null;
								String personName = "";
								String personSurname = "";
								String personDob = "";
								String personNationality = "";
								String personVisaInfo = "";
								while(!(currentLine.contains("|")))			
								{
									if(k == 0)
									{
										if(currentLine.contains(" "))
										{
											
											personNameParts = currentLine.split(" ");
											personName = personNameParts[0];
											personSurname = personNameParts[1];
										}
										else
										{
											personName = currentLine;
										}
									}
									else if(k == 1)
									{
										personDob = currentLine;
									}
									else if(k == 2)
									{
										personNationality = currentLine;
									}
									else if(k == 3)
									{
										personVisaInfo = currentLine;
									}
									else
									{
										System.out.println("'" + currentLine + "'" + " is not an attribute of Person"); 
									}
									currentLine = sc.nextLine();
									k++;
								}
								people.add(new Person(personName, personSurname, personDob, personNationality, personVisaInfo));	//add new Person to people//
								break;
							}
						}
						else														//print remaining objects//
						{
							if (readingState == 1) // print remaining Marinas//
							{
								int i = 0;
								String marinaName = "";
								String marinaAddress = "";
								int marinaCapacity = 0;
								while(!currentLine.contains("|"))
								{
									if(i == 0)								//save as attributes//
									{
										marinaName = currentLine;
									}
									else if(i == 1)
									{
										marinaAddress = currentLine;
									}
									else if(i == 2)
									{
										marinaCapacity = Integer.parseInt(currentLine);
									}
									else
									{
										System.out.println("'" + currentLine + "'" + " is not an attribute of Marina"); 
									}
									currentLine = sc.nextLine();
									i++;
								}	
								marinas.add(new Marina(marinaName, marinaAddress, marinaCapacity));
							}
							if (readingState == 2) // print remaining Boats//
							{
								int j = 0;
								String boatName = "";
								String boatOrigin = "";
								double boatSize = 0;
								while(!currentLine.contains("|"))
								{
									if(j == 0)
									{
										boatName = currentLine;
									}
									else if(j == 1)
									{
										boatOrigin = currentLine;
									}
									else if(j == 2)
									{
										boatSize = Double.parseDouble(currentLine);
									}
									else
									{
										System.out.println("'" + currentLine + "'" + " is not an attribute of Boat"); 
									}
									currentLine = sc.nextLine();
									j++;
								}
								boats.add(new Boat(boatName, boatOrigin, boatSize));
							}
							else if(readingState == 3)
							{
								int k = 0;
								String[] personNameParts = null;
								String personName = "";
								String personSurname = "";
								String personDob = "";
								String personNationality = "";
								String personVisaInfo = "";
								while(!currentLine.contains("|"))
								{
									if(k == 0)
									{
										if(currentLine.contains(" "))
										{											
											personNameParts = currentLine.split(" ");
											personName = personNameParts[0];
											personSurname = personNameParts[1];
										}
										else
										{
											personName = currentLine;
										}
									}
									else if(k == 1)
									{
										personDob = currentLine;
									}
									else if(k == 2)
									{
										personNationality = currentLine;
									}
									else if(k == 3)
									{
										personVisaInfo = currentLine;
									}
									else
									{
										System.out.println("'" + currentLine + "'" + " is not an attribute of Person"); 
									}
									currentLine = sc.nextLine();
									k++;
								}
								people.add(new Person(personName, personSurname, personDob, personNationality, personVisaInfo));	//add new Person to people//
							}
						}
					}
			}
			arrayListOfEverything.add(marinas);
			arrayListOfEverything.add(boats);
			arrayListOfEverything.add(people);
			sc.close();
			return arrayListOfEverything;
		}
		catch(Exception e)		//if an error occurs reading the file//
		{
			System.out.println(e.getMessage() + ", or file end reached");
			return arrayListOfEverything;
		}
	}
}
