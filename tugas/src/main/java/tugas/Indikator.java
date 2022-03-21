package tugas;

public class Indikator {
	public String kondisiRoda(Mobil mobil) {
		double ukuranRoda = mobil.getRoda();
		if(ukuranRoda>=0&&ukuranRoda<1){
			return "roda sudah terlalu aus";
		}else if(ukuranRoda>=1&&ukuranRoda<2){
			return "roda sebaiknya diganti";
		}else if(ukuranRoda>=2&&ukuranRoda<3) {
			return "roda masih cukup baik";
		}else if(ukuranRoda>=3&&ukuranRoda<=4) {
			return "roda baru nih";
		}else {
			return "ukuran roda tidak valid";
		}
	}
	public String kondisiBensin(Mobil mobil) {
		double garisIndikatorBensin = mobil.getBensin()/4.5; //1 indikator bensin 4.5 liter sehingga jumlah bensin yang ada 
															//dibagi 4.5 liter terlebih dahulu baru tahu ada berapa garis indikator 
															//bensin dalam mobil
		if(garisIndikatorBensin>=0&&garisIndikatorBensin<1) {
			return "bensin hampir habis";
		}else if(garisIndikatorBensin>=1&&garisIndikatorBensin<2) {
			return "bensin cukup";
		}else if(garisIndikatorBensin>=2&&garisIndikatorBensin<3) {
			return "bensin dalam keadaan baik";
		}else if(garisIndikatorBensin>=3&&garisIndikatorBensin<4) {
			return "bensin penuh";
		}
		else {
			return "indikator bensin rusak";
		}
	}
	public String kondisiRem(Mobil mobil) {
		double kampasRem = mobil.getKampasRem();
		if(kampasRem>=0&&kampasRem<6) {
			return "kampas rem sudah tipis";
		}else if(kampasRem>=6&&kampasRem<8) {
			return "kampas rem kurang optimal";
		}else if(kampasRem>=8&&kampasRem<10) {
			return "kampas rem masih layak digunakan";
		}else if(kampasRem>=10&&kampasRem<12) {
			return "kampas rem baru";
		}else {
			return "ukuran kampas rem tidak valid";
		}
	}
	public String kondisiKecepatan(Mobil mobil) {
		double kondisiKecepatan = mobil.getKecepatan();
		if(kondisiKecepatan>0&&kondisiKecepatan<=40) {
			return "kecepatan lambat";
		}else if(kondisiKecepatan>40&&kondisiKecepatan<=60) {
			return "kecepatan biasa";
		}else if(kondisiKecepatan>60&&kondisiKecepatan<=80) {
			return "kecepatan terhitung cepat";
		}else if(kondisiKecepatan>80&&kondisiKecepatan<=120) {
			return "kecepatan maksimal";
		}else {
			return "kecepatan tidak valid"; //nilai negatif atau lebih dari 120 
		}
	}
	public String kondisiAki(Mobil mobil) {
		double voltase = mobil.getAki().getVoltase();
		String kondisi = mobil.getKondisi();
		String hasil;
		if(kondisi.equals("mati")){
			if(voltase<12){
				hasil ="normal";
			}else{
				hasil ="aki tidak normal";
			}
		}else if(kondisi.equals("starter")) {
			if(voltase>=11.5&&voltase<=14) {
				hasil = "normal";
			}else {
				hasil = "aki tidak normal";
			}
		}else if(kondisi.equals("stabil")) {
			if(voltase>=13.5&&voltase<=14.5) {
				hasil = "normal";
			}else {
				hasil ="aki tidak normal";
			}
		}else{
			hasil = "aki tidak valid";
		}
		return hasil;
	}
}
