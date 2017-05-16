
public class Person {
String name;
String surname;
String dob;
String nationality;
int visaInfo;

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
}
