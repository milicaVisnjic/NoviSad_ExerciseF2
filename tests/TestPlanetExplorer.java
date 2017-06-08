import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test(expected=PlanetExplorerException.class)
	public void testExceptionWithObstacleAt0_1() throws PlanetExplorerException {
		PlanetExplorer p = new PlanetExplorer(3, 3, "(0,1)");
		String kretanje = "ffrf";
		String actualPosition=p.executeCommand(kretanje);
		
		//assertEquals("(1,1)", actualPosition);
	}
	
	@Test
	public void testCheckIfCarGoesForward() throws PlanetExplorerException {
		PlanetExplorer p = new PlanetExplorer(3, 3, "(1,2)");
		p.setX_vozila(0);
		p.setY_vozila(0);
		String kretanje = "f";
		String actualPosition = p.executeCommand(kretanje);
		
		assertEquals("(0,1,N)", actualPosition);
	}
	
	@Test
	public void testCheckIfCarGoesRight() throws PlanetExplorerException {
		PlanetExplorer p = new PlanetExplorer(3, 3, "(1,2)");
		p.setX_vozila(1);
		p.setY_vozila(0);
		String kretanje = "r";
		String actualPosition = p.executeCommand(kretanje);
		
		assertEquals("(0,0,E)", actualPosition);
		
	}
	
}
