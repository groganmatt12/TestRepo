
public class animal {
//////////attributes/////////
String name;
String species;
//////////constructors/////////
	public animal(String name, String species)	{
		this.name = name;
		this.species = species;
	}
	
	public animal(String[] animalString)
	{
		this.name = animalString[0];
		this.species = animalString[1];
	}
//////////methods/////////
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getSpecies(){
		return this.species;
	}
	public void setSpecies(String species){
		this.species = species;
	}
	
	//display attributes of animal neatly//
	public String toString()
	{
	StringBuilder sb = new StringBuilder();
	sb.append("Name: " + this.name + " Species: " + this.species + "\n");
	return sb.toString();
	}
}
