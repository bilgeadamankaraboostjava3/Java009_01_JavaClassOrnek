package com.okul.dersler;

import static com.okul.utility.Constants.*;

public class Fizik {

	public  int vizenotu; //100 -> 25
	public  int finalnotu;  //100 -> 50
	public  int ortalama;

	
	public  void ortalamaHesapla() {
		ortalama = (int) ((vizenotu*VIZE_AGIRLIGI + 
				finalnotu*FINAL_AGIRLIGI));
	}
}
