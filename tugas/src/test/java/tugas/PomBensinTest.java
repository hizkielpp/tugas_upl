package tugas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PomBensinTest {
	Mobil mobil = new Mobil();
	PomBensin pom = new PomBensin();
	@Test
	@DisplayName("isi bensin premium")
	void testIsiPremium() {
		double duit = 20000;
		pom.isiBensinPremium(duit, mobil);
		assertEquals((double)20000/6450, mobil.getBensin());
	}
	@Test
	@DisplayName("isi bensin pertalite")
	void testIsiPertalite(){
		double duit = 20000;
//		double expectedBensin = mobil.getBensin() + (double)20000/7650;
		pom.isiBensinPertalite(duit, mobil);
//		assertEquals(expectedBensin,mobil.getBensin());
		assertEquals((double)20000/7650,mobil.getBensin());
	}
	@Test
	@DisplayName("isi bensin pertamax")
	void teIsiPertamax(){
		double duit = 20000;
		double expectedBensin = mobil.getBensin() + (double)20000/9000;
		pom.isiBensinPertamax(duit, mobil);
		assertEquals(expectedBensin,mobil.getBensin());
	}	
	@Test
	@DisplayName("isi bensin pertamax turbo")
	void teIsiPertamaxTurbo(){
		double duit = 20000;
		double expectedBensin = mobil.getBensin() + (double)20000/14500;
		pom.isiBensinPertamaxTurbo(duit, mobil);
		assertEquals(expectedBensin,mobil.getBensin());
	}
	@Test
	@DisplayName("isi bensin DexLite")
	void teIsiDexLite(){
		double duit = 20000;
		double expectedBensin = mobil.getBensin() + (double)20000/12950;
		pom.isiBensinDexLite(duit, mobil);
		assertEquals(expectedBensin,mobil.getBensin());
	}	
	@Test
	@DisplayName("isi bensin PertaminaDex")
	void teIsiPertaminaDex(){
		double duit = 20000;
		double expectedBensin = mobil.getBensin() + (double)20000/13700;
		pom.isiBensinPertaminaDex(duit, mobil);
		assertEquals(expectedBensin,mobil.getBensin());
	}		
}
