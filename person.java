
public class person {
//////////attributes/////////
	String name;
	String dob;
	String occupation;
	int salary;
	animal pets;
	
	public person(String name,String dob,String occupation,String money)
	{
		this.name = name;
		this.dob = dob;
		this.occupation = occupation;
		StringBuilder sb = new StringBuilder(money);
		sb.deleteCharAt(0);
		this.salary = Integer.parseInt(sb.toString());
	}
	public person(String[] allDetails)
	{
		if (allDetails.length >=5)									//if the string of attributes as more 5 (or more) attributes...//
		{
			this.name = allDetails[1];								//attribute allDetails[1] = name (the first attribute to use//
			this.dob = allDetails[2];									//this excludes the first empty line if applicable..//
			this.occupation = allDetails[3];
			StringBuilder sb = new StringBuilder(allDetails[4]);	//build a new StringBuilder with allDetails............................
			sb.deleteCharAt(0);										//delete the first empty line//
			this.salary = Integer.parseInt(sb.toString());			//change sb.toString to an integer?!..........................
		}
		else
		{
			this.name = allDetails[0];								//for the first line, if no blank line, name = allDetails[0];
			this.dob = allDetails[1];
			this.occupation = allDetails[2];
			StringBuilder sb = new StringBuilder(allDetails[3]);
			sb.deleteCharAt(0);									/////////////////????????????????????????????
			this.salary = Integer.parseInt(sb.toString());		/////////////////?????????????????????????????
		}	
	}
	
	
//////////methods/////////
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getDob(){
		return this.dob;
	}
	public void setDob(String dob){
		this.dob = dob;
	}
	public String getOccupation(){
		return this.occupation;
	}
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	public int getSalar(){
		return this.salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public animal getPets(){
		return this.pets;
	}
	public void setPets(animal pets){
		this.pets = pets;
	}
	
	//display all attributes of person neatly as a string//
	public String toString()		
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Person name: "+this.name+"\nDate of Birth: "+this.dob+"\nOccupation: "+this.occupation+"\nSalary: "+this.salary + "\n");
		return sb.toString();
	}

}
