import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
		GradeBook g1;
		GradeBook g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2= new GradeBook(5);
		g1.addScore(25);
		g1.addScore(30);
		g2.addScore(40);
		g2.addScore(60);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1= null;
		g2 = null;
	}
		
	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("25.0 30.0 "));
		
	}

	@Test
	void testSum() {
		assertEquals(55, g1.sum());
		assertEquals(100, g2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(25,g1.minimum());
		assertEquals(40,g2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(30,g1.finalScore());
		assertEquals(60,g2.finalScore());
	}



}
