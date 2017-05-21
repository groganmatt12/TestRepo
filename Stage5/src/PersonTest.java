import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class PersonTest {
	@Test
	public void testOccupationAdd() {
		Person testPerson = new Person("Name", "Surname", "D.O.B", "Nationality");
		assertEquals("Occupation added successfully!", testPerson.setOccupation("Captain"));
	}
	
	@Test
	public void testOccupationAlreadyAdded() {
		Person testPerson = new Person("Name", "Surname", "D.O.B", "Nationality");
		testPerson.setOccupation("Captain");
		assertEquals("Error: This person already has that occupation", testPerson.setOccupation("Captain"));
	}
	
	@Test
	public void testCaptainAndCrew1() { //already Captain, adding Captain//
		Person testPerson = new Person("Name", "Surname", "D.O.B", "Nationality");
		testPerson.setOccupation("Captain");
		assertEquals("Error: this person is already a Captain. Cannot be Captain and Crew!", testPerson.setOccupation("Crew"));
	}
	
	@Test
	public void testCaptainAndCrew2() { //already Crew, adding Captain//
		Person testPerson = new Person("Name", "Surname", "D.O.B", "Nationality");
		testPerson.setOccupation("Crew");
		assertEquals("Error: this person is already a Crew. Cannot be Captain and Crew!", testPerson.setOccupation("Captain"));
	}
}
