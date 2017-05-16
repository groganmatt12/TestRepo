
public class Boat implements Vehicle {
String name;
String origin;
Double size;

	public Boat(String name, String origin, Double size)
	{
		this.name = name;
		this.origin = origin;
		this.size = size;
	}

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
	
}
