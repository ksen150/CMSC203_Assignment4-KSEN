import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	
	private Plot plot1, plot2, plot3, plot4;
	
	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(6, 2, 3, 4);
		plot2 = new Plot(9, 2, 1, 4);
	}

	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testPlot() {
		Plot p = new Plot();
		assertEquals(1, p.getWidth());
		assertEquals(1, p.getWidth());
	}

	@Test
	public void testPlotIntIntIntInt() {
		Plot p = new Plot(1, 2, 3, 4);
		assertEquals(1, p.getX());
		assertEquals(2, p.getY());
		assertEquals(3, p.getWidth());
		assertEquals(4, p.getDepth());
		
	}

	@Test
	public void testEncompasses() {
		plot3 = new Plot(12, 12, 6, 6);
		plot4 = new Plot(11, 11, 3, 2);
		
		assertTrue(plot3.encompasses(plot4));
	}
	
	@Test
	public void getX() {
		Plot p = new Plot(5, 2, 3, 4);
		assertEquals(5, p.getX());
	}
	
	@Test
	public void getY() {
		Plot p = new Plot(5, 2, 3, 4);
		assertEquals(2, p.getY());
	}
	
	@Test
	public void getWidth() {
		Plot p = new Plot(5, 2, 3, 4);
		assertEquals(3, p.getWidth());
	}
	
	@Test
	public void getDepth() {
		Plot p = new Plot(5, 2, 3, 4);
		assertEquals(4, p.getDepth());
	}
}
