package com.okul.dersler;

import static com.okul.utility.Constants.*;

public class Matematik {
	// Access Medifier -> Eri�im Belirte�leri
	public  int vizenotu;
	public  int finalnotu;
	public  int butunlemenotu;
	public  int ortalama;

	
	public  void ortalamaHesapla() {
		// Constants cs = new Constants();
		// constants.finalAgirligi = 0.8;
		ortalama = (int) ((vizenotu*VIZE_AGIRLIGI + 
				finalnotu*FINAL_AGIRLIGI));
	}
	
}
