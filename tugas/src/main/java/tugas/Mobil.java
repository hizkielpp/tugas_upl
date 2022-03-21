package tugas;

public class Mobil {
	//properties
	private double roda;
	public double bensin;
	private double kampasRem;
	private double kecepatan;
	private Aki aki;
	private String kondisiMesin;
	//constructor
	public Mobil() {
		this.roda = 0;
		this.bensin = 0;
		this.kampasRem = 0;
		this.kecepatan = 0;
		Aki aki = new Aki();
		this.aki = aki;
		this.kondisiMesin = "mati"; //default mobil dalam kondisi mati
	}
	
	//setter
	public void gantiRoda(double ukuran) {
		this.roda = ukuran;
	}
	public void setKondisi(String kondisi) {
		this.kondisiMesin = kondisi;
	}
	public void isiBensin(double liter){
		this.bensin += liter;
	}
	public void gantiKampasRem(double kampasRemBaru){
		this.kampasRem = kampasRemBaru;
	}
	public void setrumAki(double voltase) {
		this.aki.setVoltase(voltase);
	}
	public void tambahKecepatan(double akselerasi){
		this.kecepatan += akselerasi; 
	}
	public void kurangiKecepatan(double deselerasi){
		this.kecepatan -= deselerasi;
	}
	public void starterMobil() {
		this.kondisiMesin = "starter";
	}
	public void matikanMobil() {
		this.kondisiMesin = "mati";
	}
	public void berjalanStabil() {
		this.kondisiMesin = "stabil";
	}

	
	//getter
	public double getRoda() {
		return this.roda;
	}
	public double getBensin() {
		return this.bensin; 
	}
	public double getKampasRem() {
		return this.kampasRem;//dalam cm ketebalan kampas rem
	}
	public double getKecepatan() {
		return this.kecepatan;
	}
	public Aki getAki() {
		return this.aki;
	}
	public String getKondisi() {
		return this.kondisiMesin;
	}
	
}
