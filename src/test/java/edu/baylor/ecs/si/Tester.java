package edu.baylor.ecs.si;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

public class Tester {
	
	@DisplayName("Test Timer pass")
	@Test
	void passingTest() throws TimerException {
		Assertions.assertTrue(Timer.timeMe(1000) >= 1000);
	}

	@DisplayName("Test Timer fail")
	@Test
	void failOverTest() {
		Assertions.assertThrows(TimerException.class, () -> Timer.timeMe(-1));
	}
	
	@Test
	@DisplayName("Test Timer Edge Case")
	void failOverTestEdge() throws TimerException {
		Assertions.assertTrue(Timer.timeMe(0) >= 0);
	}
}
