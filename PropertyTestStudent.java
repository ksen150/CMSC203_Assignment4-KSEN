import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {

	Property propertyOne;
	
	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = null;
	}

	@Test
	void testProperty() {
		Property p = new Property();
		assertEquals("", p.getPropertyName());
		assertEquals("", p.getCity());
		assertEquals("", p.getOwner());
		assertEquals(0, p.getRentAmount());
	}

	@Test
	void testPropertyStringStringDoubleString() {
		Property p = new Property("Starbucks", "Rockville", 1000.0, "Tommy");
		assertEquals("Starbucks", p.getPropertyName());
		assertEquals("Rockville", p.getCity());
		assertEquals(1000.0, p.getRentAmount());
		assertEquals("Tommy", p.getOwner());
	}

	@Test
	void testPropertyStringStringDoubleStringIntIntIntInt() {
		Property p = new Property("Subway", "Germantown", 2000.0, "Chris", 1, 2, 3, 4);
		
		assertEquals("Subway", p.getPropertyName());
		assertEquals("Germantown", p.getCity());
		assertEquals(2000.0, p.getRentAmount());
		assertEquals("Chris", p.getOwner());
	}

	@Test
	void testGetCity() {
		assertEquals("Rockville", propertyOne.getCity());
	}

	@Test
	void testGetOwner() {
		assertEquals("Wells Fargo Bank", propertyOne.getOwner());
	}

	@Test
	void testRentAmount() {
		assertEquals(2450.00, propertyOne.getRentAmount());
	}
}
