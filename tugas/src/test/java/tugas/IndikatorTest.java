package tugas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IndikatorTest {
	Indikator indikator = new Indikator();
	@ParameterizedTest(name ="{index} => ukuranRoda={0}, hasil={1}")
	@CsvSource({"0.5,roda sudah terlalu aus","1.5,roda sebaiknya diganti","2.5,roda masih cukup baik","3.5,roda baru nih","4.5,ukuran roda tidak valid"})
	void testIndikatorRoda(double ukuranRoda, String hasil) {
		Mobil mobil = mock(Mobil.class);
		when(mobil.getRoda()).thenReturn(ukuranRoda);
		assertEquals(hasil, indikator.kondisiRoda((mobil)));	
	}
	@ParameterizedTest(name ="{index} => bensin={0}, hasil={1}")
	@CsvSource({"0.5,bensin hampir habis","1.5,bensin cukup","2.5,bensin dalam keadaan baik","3.5,bensin penuh","4.5,indikator bensin rusak"})
	void testIndikatorBensin(double bensin, String hasil) {
		bensin = bensin*4.5;//bensin dalam liter dijadikan satuan indikator yang mana 1 indikator 4.5 liter
		Mobil mobil = mock(Mobil.class);
		when(mobil.getBensin()).thenReturn(bensin);
		assertEquals(hasil, indikator.kondisiBensin((mobil)));	
	}	
	@ParameterizedTest(name ="{index} => ukuranKampasRem={0}, hasil={1}")
	@CsvSource({"5,kampas rem sudah tipis","7,kampas rem kurang optimal","9,kampas rem masih layak digunakan","11,kampas rem baru","13,ukuran kampas rem tidak valid"})
	void testIndikatorRem(double ukuranKampasRem, String hasil) {
		Mobil mobil = mock(Mobil.class);
		when(mobil.getKampasRem()).thenReturn(ukuranKampasRem);
		assertEquals(hasil, indikator.kondisiRem((mobil)));	
	}
	@ParameterizedTest(name ="{index} => kecepatan={0}, hasil={1}")
	@CsvSource({"30,kecepatan lambat","50,kecepatan biasa","70,kecepatan terhitung cepat","90,kecepatan maksimal","130,kecepatan tidak valid"})
	//asumsikan kecepatan maksimal motor ini 120 sehingga apabila menyentuh lebih dari 120 dianggap tidak valid
	void testIndikatorKecepatan(double kecepatan, String hasil) {
		Mobil mobil = mock(Mobil.class);
		when(mobil.getKecepatan()).thenReturn(kecepatan);
		assertEquals(hasil, indikator.kondisiKecepatan((mobil)));	
	}
	@ParameterizedTest(name ="{index} => voltase={0}, keadaan={1}, hasil={2}")	
	@CsvSource({"11,mati,normal","13,mati,aki tidak normal","13,starter,normal","15,starter,aki tidak normal","14,stabil,normal","15,stabil,aki tidak normal","20,meledak,aki tidak valid"})
	void testIndikatorAki(double voltase, String keadaan, String hasil) {
		Mobil mobil = new Mobil();//tidak menggunakan mock karena 
								//properti aki merupakan instansce 
								//sehingga akan bernilai null apabila 
								//menggunakan mock
		mobil.getAki().setVoltase(voltase);
		mobil.setKondisi(keadaan);
		assertEquals(hasil, indikator.kondisiAki(mobil));
	}

}
