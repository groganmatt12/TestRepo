
public class Marina {
String name;
String address;
int capacity;

	public Marina(String name, String address, int capacity)
	{
		this.name = name;
		this.address = address;
		this.capacity = capacity;
	}
	
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

}
