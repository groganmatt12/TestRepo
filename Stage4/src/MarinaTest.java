import static org.junit.Assert.*;

import org.junit.Test;

public class MarinaTest {

	@Test
	public void testAddBoatToMarina() {
		Marina testMarina = new Marina("Test Marina", "Test Location", 50);
		Boat testBoat = new Boat("TestBoat", "Italy", 1.5);
		assertEquals("Boat added to Marina successfully!", testMarina.addBoatToMarina(testBoat));
	}
	
	@Test
	public void testNumberBoatsInMarina() {
		Marina testMarina = new Marina("Test Marina", "Test Location", 50);
		Boat testBoat = new Boat("TestBoat", "Italy", 1.5);
		Boat testBoat2 = new Boat("TestBoat", "Italy", 1.5);
		Boat testBoat3 = new Boat("TestBoat", "Italy", 1.5);
		testMarina.addBoatToMarina(testBoat);
		testMarina.addBoatToMarina(testBoat2);
		testMarina.addBoatToMarina(testBoat3);
		assertEquals("Number of boats: 3", testMarina.numberBoatsInMarina());
	}
	
	@Test
	public void checkRemainingSpace() {
		Marina testMarina = new Marina("Test Marina", "Test Location", 50);
		Boat testBoat = new Boat("TestBoat", "Italy", 1.5);	
		Boat testBoat2 = new Boat("TestBoat", "Italy", 1.5);
		Boat testBoat3 = new Boat("TestBoat", "Italy", 1.5);
		testMarina.addBoatToMarina(testBoat);	//boat size 1.5, therefore 2 spaces required//
		testMarina.addBoatToMarina(testBoat2);  //boat size 1.5, therefore 2 spaces required//
		testMarina.addBoatToMarina(testBoat3);  //boat size 1.5, therefore 2 spaces required//
		assertEquals(44, testMarina.checkRemainingSpace(), 0); 
	}
	
	@Test
	public void testCheckCanEnterMarina() {  ////////////how to add precision 0.1 into this??//////////////
		Marina testMarina = new Marina("Test Marina", "Test Location", 50);			//Marina size = 50//
		Boat testBoat = new Boat("TestBoat", "Italy", 0.5);							//testBoat requires 1 spaces in the Marina//
		testBoat.addPerson(new Person("Name", "Surname", "D.O.B", "Nationality"));
		Boat testBoat1 = new Boat("TestBoat1", "Italy", 40.4);						//add pre-existing boat taking up 41 spaces in Marina//
		testBoat1.addPerson(new Person("Name", "Surname", "D.O.B", "Nationality"));
		testMarina.boatList.add(testBoat1);
		Boat testBoat2 = new Boat("TestBoat1", "Italy", 7.1);						//add pre-existing boat taking up 8 spaces in Marina//
		testBoat2.addPerson(new Person("Name", "Surname", "D.O.B", "Nationality"));
		testMarina.boatList.add(testBoat2);
		assertEquals("There are: 0.0 spaces remaining", testMarina.checkCanEnterMarina(testBoat)); //50 - 46.5 - 1.5 = 2.0 spaces remaining//
	}
}
