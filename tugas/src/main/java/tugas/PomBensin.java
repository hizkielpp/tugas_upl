package tugas;

public class PomBensin {
	public double isiBensinPremium(double uang, Mobil mobil) {
		double liter = uang/6450;
		mobil.isiBensin(liter);
		return mobil.getBensin();
	}
	public double isiBensinPertalite(double uang, Mobil mobil) {
		double liter = uang/7650;
		mobil.isiBensin(liter);
		return mobil.getBensin();
	}
	public double isiBensinPertamax(double uang, Mobil mobil) {
		double liter = uang/9000;
		mobil.isiBensin(liter);
		return mobil.getBensin();
	}
	public double isiBensinPertamaxTurbo(double uang, Mobil mobil) {
		double liter = uang/14500;
		mobil.isiBensin(liter);
		return mobil.getBensin();
	}
	public double isiBensinDexLite(double uang, Mobil mobil) {
		double liter = uang/12950;
		mobil.isiBensin(liter);
		return mobil.getBensin();
	}
	public double isiBensinPertaminaDex(double uang, Mobil mobil) {
		double liter = uang/13700;
		mobil.isiBensin(liter);
		return mobil.getBensin();
	}
}
