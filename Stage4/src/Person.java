import java.util.ArrayList;

public class Person {
String name;
String surname;
String dob;
String nationality;
int visaInfo;
ArrayList <String> occupations = new ArrayList<String>();

	public Person(String name, String surname, String dob, String nationality)		//person from UK 
	{
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
	}
	public Person(String name, String surname, String dob, String nationality, int visaInfo)	//person not from UK
	{
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.visaInfo = visaInfo;
	}
	public Person(String name, String surname, String dob, String nationality, int visaInfo, ArrayList<String> Occupations)	//with occupations, not from UK
	{
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.visaInfo = visaInfo;
		this.occupations = occupations;
	}
	public Person(String name, String surname, String dob, String nationality, ArrayList<String> Occupations)	//with occupations, from UK
	{
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.occupations = occupations;
	}
	
//getters and setters//
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	public String getDob()
	{
		return this.dob;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	public String getNationality()
	{
		return this.nationality;
	}
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	public int getVisaInfo()
	{
		return this.visaInfo;
	}
	public void setVisaInfo(int visaInfo)
	{
		this.visaInfo = visaInfo;
	}
	
	public ArrayList<String> getOccupations()
	{
		return occupations;
	}
	
	public String toString()
	{
		return this.name + ", " + this.surname + ", " + this.dob + ", " + this.nationality;
	}
	
//methods//	
	public String setOccupation(String occupation)
	{
		boolean hasDuplicate = false;			  //find any duplicates//
		boolean hasCaptain = false;				  //check if already has Captain//
		boolean hasCrew = false;				  //check if already has Crew//

		for(String current1Occupation : occupations)
		{
			if(current1Occupation == occupation)
			{
				hasDuplicate = true;					//flag the duplicate//
			}
			else if(current1Occupation == "Captain")	//flag the Captain occupation already stored//
			{
				hasCaptain = true;
			}
			else if(current1Occupation == "Crew")	//flag the Crew occupation already stored//
			{
				hasCrew = true;
			}
		}
		
		if(hasDuplicate == true)									
		{
			return "Error: This person already has that occupation";	//prevent duplicate//
		}
		else if(hasCaptain == true && occupation == "Crew")
		{
			return "Error: this person is already a Captain. Cannot be Captain and Crew!"; //prevent Captain+Crew//
		}
		else if(hasCrew == true && occupation == "Captain")
		{
			return "Error: this person is already a Crew. Cannot be Captain and Crew!"; //prevent Captain+Crew//
		}
		else
		{
			occupations.add(occupation);
			return "Occupation added successfully!";
		}
	}
}
