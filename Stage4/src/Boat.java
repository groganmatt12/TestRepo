import java.util.ArrayList;


public class Boat implements Vehicle {
String name;
String origin;
Double size;
ArrayList<Person> personList = new ArrayList<Person>();		//people associated with boat

	public Boat(String name, String origin, Double size)
	{
		this.name = name;
		this.origin = origin;
		this.size = size;
	}
	public Boat(String name, String origin, Double size, ArrayList<Person> personList)
	{
		this.name = name;
		this.origin = origin;
		this.size = size;
		this.personList = personList;
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
	public String getOrigin()
	{
		return this.origin;
	}
	public void setOrigin(String origin)
	{
		this.origin = origin;
	}
	public double getSize()
	{
		return this.size;
	}
	public void setSize(Double size)
	{
		this.size = size;
	}
	
	public int getSpeed() {
		
		return 0;
	}

	public void accelerate() {
		
	}

	public void deccelerate() {
		
	}
	

	
//methods//
	public String addPerson(Person newPerson)
	{
		Boolean hasCaptain = false;		
		for(Person currentPerson : personList)
		{			
			if(currentPerson.getOccupations().toString().contains("Captain"))
			{
				hasCaptain = true;
			}
		}
		if(hasCaptain == true && (newPerson.getOccupations().contains("Captain")))
		{
			return "Error: Cannot have two Captains per Boat";
		}
		else
		{
		personList.add(newPerson);
		return "Person added to Boat";
		}
	}
	
	public String checkPerson()					//does the boat have an associated person?//
	{
		if(personList.toString().equals("[]"))
		{
			return "No people on this Boat";
		}
		else
		{
			return "This boat has one or more people";
		}
	}
}
