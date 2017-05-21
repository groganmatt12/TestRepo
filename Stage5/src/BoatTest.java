import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class BoatTest {
	
	@Test
	public void testAddPersonToBoat() {							//add a person to a boat//
		Boat testBoat = new Boat("Name", "Origin", 1.00);
		Person newPerson = new Person("Name", "Surname", "D.O.B", "Nationality");
		assertEquals("Person added to Boat", testBoat.addPerson(newPerson));
	}
	
	@Test
	public void testOnlyOneCaptainOnBoat() {					//check for multiple captains per boat//
		Boat testBoat = new Boat("Name", "Origin", 1.00);
		Person newPerson = new Person("Name", "Surname", "D.O.B", "Nationality"); //Add an existing Captain//
		newPerson.setOccupation("Captain");							
		testBoat.addPerson(newPerson);							
		Person newPerson1 = new Person("Name1", "Surname1", "D.O.B1", "Nationality1"); //create a new person to add//
		newPerson1.setOccupation("Captain");											//make them another Captain//
		assertEquals("Error: Cannot have two Captains per Boat", testBoat.addPerson(newPerson1));
	}
	
	@Test
	public void testBoatHasPerson() {							//does Boat have a Person?//
		Boat testBoat = new Boat("Name", "Origin", 1.00);
		Person testPerson = new Person("Name", "Surname", "D.O.B", "Nationality");
		testPerson.setOccupation("Owner");
		testBoat.addPerson(testPerson);
		assertEquals("This boat has one or more people", testBoat.checkPerson());
	}
	
	
		// test that only captain, owner etc can be entered
}
