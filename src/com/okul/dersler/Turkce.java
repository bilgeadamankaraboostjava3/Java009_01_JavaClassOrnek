package com.okul.dersler;

import static com.okul.utility.Constants.*;

public class Turkce {
	
	public  int vizenotu;
	public  int finalnotu;
	public  int ortalama;

	
	public  void ortalamaHesapla() {
		ortalama = (int) ((vizenotu*VIZE_AGIRLIGI + 
				finalnotu*FINAL_AGIRLIGI));
	}
}
