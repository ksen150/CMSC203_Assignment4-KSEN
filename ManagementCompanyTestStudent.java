import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {

	Property sampleProperty;
	ManagementCompany mangementCo;
	Plot plot1, plot2;
	
	
	@Before
	public void setUp() throws Exception {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		
		mangementCo.addProperty("Starbucks", "Rockville", 1000.0, "Tommy", 1,1,1,1);
		mangementCo.addProperty("Subway", "Rockville", 2000.0, "Chris", 2,2,2,2);
		mangementCo.addProperty("Chipotle", "Rockville", 3000.0, "Jack", 3,3,3,3);
		mangementCo.addProperty("Mcdonalds", "Rockville", 4000.0, "Anthony", 4,4,4,4);
		mangementCo.addProperty("School", "Rockville", 5000.0, "Robert", 5,5,5,5);
		
		plot1 = new Plot(2, 2, 6, 6);
		plot2 = new Plot(3, 4, 4, 3);
	}

	@After
	public void tearDown() throws Exception {
		mangementCo=null;
	}
	@Test
	void testManagementCompany() {
		mangementCo= new ManagementCompany("", "",0.0);
		
		assertEquals("", mangementCo.getName());
		assertEquals("", mangementCo.getTaxID());
		assertEquals(0.0, mangementCo.getMgmFee());
	
	}

	@Test
	void testManagementCompanyStringStringDouble() {
	
		mangementCo= new ManagementCompany("ManagementCompany", "12345",5.0);
		assertEquals("ManagementCompany", mangementCo.getName());
		assertEquals("12345", mangementCo.getTaxID());
		assertEquals(5.0, mangementCo.getMgmFee());
	
	}

	@Test
	void testManagementCompanyStringStringDoubleIntIntIntInt() {
		
		mangementCo= new ManagementCompany("ManagementCompany", "12345",5.0, 1,1,1,1);
		
		assertEquals("ManagementCompany", mangementCo.getName());
		assertEquals("12345", mangementCo.getTaxID());
		assertEquals(5.0, mangementCo.getMgmFee());
	}

	@Test
	void testIsPropertiesFull() {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		
		mangementCo.addProperty("Starbucks", "Rockville", 1000.0, "Tommy", 1,1,1,1);
		mangementCo.addProperty("Subway", "Rockville", 2000.0, "Chris", 2,2,2,2);
		mangementCo.addProperty("Chipotle", "Rockville", 3000.0, "Jack", 3,3,3,3);
		mangementCo.addProperty("Mcdonalds", "Rockville", 4000.0, "Anthony", 4,4,4,4);
		mangementCo.addProperty("School", "Rockville", 5000.0, "Robert", 5,5,5,5);
		assertEquals(false, mangementCo.isPropertiesFull());
	}

	@Test
	void testGetTotalRent() {
		
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		
		mangementCo.addProperty("Starbucks", "Rockville", 1000.0, "Tommy", 1,1,1,1);
		mangementCo.addProperty("Subway", "Rockville", 2000.0, "Chris", 2,2,2,2);
		assertEquals(3000.0, mangementCo.getTotalRent());
	}

	@Test
	void testGetHighestRentPropperty() {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		
		mangementCo.addProperty("Starbucks", "Rockville", 1000.0, "Tommy", 1,1,1,1);
		mangementCo.addProperty("Subway", "Rockville", 2000.0, "Chris", 2,2,2,2);
		assertEquals(3000.0, mangementCo.getHighestRentPropperty());
	}

	@Test
	void testIsManagementFeeValid() {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		assertEquals(true, mangementCo.isManagementFeeValid());
	}
	
	@Test
	void testGetName() {
		mangementCo= new ManagementCompany("Tommy", "555555555",6);
		assertEquals("Tommy", mangementCo.getName());
	}

	@Test
	void testGetTaxID() {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		assertEquals("555555555", mangementCo.getTaxID());
	}

	@Test
	void testGetMgmFee() {
		mangementCo= new ManagementCompany("Tommy", "555555555",6);
		assertEquals(6, mangementCo.getMgmFee());
	}

	@Test
	void testGetNumberOfProperties() {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		
		mangementCo.addProperty("Starbucks", "Rockville", 1000.0, "Tommy", 1,1,1,1);
		mangementCo.addProperty("Subway", "Rockville", 2000.0, "Chris", 2,2,2,2);
		assertEquals(2, mangementCo.getPropertiesCount());
	}
	
	@Test
	void testTaxID() {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		
		assertEquals("555555555", mangementCo.getTaxID());
	}
}
