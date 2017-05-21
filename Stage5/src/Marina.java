import java.util.ArrayList;

public class Marina {
String name;
String address;
int capacity;
ArrayList<Boat> boatList = new ArrayList<Boat>(); //Boats stored in the Marina//

	public Marina(String name, String address, int capacity)
	{
		this.name = name;
		this.address = address;
		this.capacity = capacity;
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
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public int getCapacity()
	{
		return this.capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public String toString()
	{
		return this.name + "_" + this.address + "_" + this.capacity;
	}
//methods//
	public String addBoatToMarina(Boat newBoat)
	{
		boatList.add(newBoat);
		//System.out.println("Boat added to Marina successfully!");
		return "Boat added to Marina successfully!";
	}
	
	public String numberBoatsInMarina()
	{
		int boatCount = 0;
		for(Boat b : boatList)
		{
			boatCount++;
		}
		return "Number of boats: " + boatCount;
	}
	
	public double checkRemainingSpace()
	{
		double capacity = this.getCapacity();
		double boatsTotalSize = 0;
		double remainingSpace = 0;
		for(Boat boatInstance : boatList)
		{
			boatsTotalSize += Math.ceil(boatInstance.getSize());
		}
		remainingSpace = capacity - boatsTotalSize;
		return remainingSpace;
	}
	
	public String checkCanEnterMarina(Boat newBoat)
	{
		Boolean boatMayEnter = false;
		if(newBoat.checkPerson() == "This boat has one or more people")
		{
			if(checkRemainingSpace() >= newBoat.getSize())
			{
				boatMayEnter = true;				
				//System.out.println("This boat has been added successfully to the Marina");
				addBoatToMarina(newBoat);
				return "There are: " + checkRemainingSpace() + " spaces remaining";
			}
			else
			{
				return "Error: Marina is full! There are only " + checkRemainingSpace() + " spaces left in the Marina";
			}
		}
		else
		{
			return "This Boat has no associated People, it may not enter the Marina";
		}
	}
}
