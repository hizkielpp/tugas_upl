package tugas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MobilTest {

	Mobil mobil = new Mobil();
	@Test
	@DisplayName("Test isi bensin dalam liter")
	void testIsiBensinDalamLiter() {
		mobil.isiBensin(50);
		assertEquals(50,mobil.getBensin());
	}
	@Test
	@DisplayName("Test starter mobil")
	void testNyalakanMobil(){
		mobil.starterMobil();
		assertEquals("starter",mobil.getKondisi());
	}
	@Test
	@DisplayName("Test mobil berjalan")
	void testMenjalankanMobil(){
		mobil.berjalanStabil();
		assertEquals("stabil",mobil.getKondisi());
	}	
	@Test
	@DisplayName("Test matikan mobil")
	void testMatikanMobil(){
		mobil.matikanMobil();
		assertEquals("mati",mobil.getKondisi());
	}
	@Test
	@DisplayName("Test tambah kecepatan")
	void testTambahKecepatan() {
		mobil.tambahKecepatan(20.0);
		assertEquals(20.0, mobil.getKecepatan());
	}
	@Test
	@DisplayName("Test kurangi kecepatan")
	void testKurangKecepatan() {
		mobil.tambahKecepatan(20.00);
		mobil.kurangiKecepatan(5.00);
		assertEquals(15.00, mobil.getKecepatan());
	}
	
}
