package tugas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AkiTest {
	Aki aki = new Aki();
	@Test
	@DisplayName("test setter voltase")
	void testSetterVoltase() {
		aki.setVoltase(5);
		assertEquals(5,aki.getVoltase());
	}
	@Test
	@DisplayName("test setter suhu")
	void testSetterSuhu() {
		aki.setSuhu(10);
		assertEquals(10,aki.getSuhu());
	}

}
