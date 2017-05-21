import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		String fileInfo =  Main.readFile("stage_5_input.txt"); 
		assertEquals("[Monaco Yacht Club_Quai Louis II, 98000 Monaco_150, Venice Marinas_237 Sports Marina Rd, Venice, LA 70091, USA_300][Santa Maria_Portugal_0.8, Marys Dream_USA_2.3, Boaty McBoatface_Great Britain_3.8, Aquaholic_Panama_1.0][David_Green_14/07/1952_British_, Mary_Jones_8/12/1968_Brtish_, Mike_Wozniak_02/04/1976_Polish_1759346/A, Bill_Knightley_17/05/1943_Australian_9986342/B, Brian_Johnson_05/10/1947_British_, Linus_Torvalds_28/12/1969_Finnish_88754438/A, Peter_Jackson_31/10/1961_New Zealander_76446789/A, Adele__05/05/1988_British_, Emma_Watson_15/04/1990_British_, Avril_Lavigne_27/09/1984_Canadian_35688643/C]", Main.printCreatedObjects(Main.formatFile(fileInfo)));
	}
 
}
