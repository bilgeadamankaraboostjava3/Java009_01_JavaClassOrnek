package com.okul;

import com.okul.dersler.Fizik;
import com.okul.dersler.Matematik;


public class Runner {

	public static void main(String[] args) {
		
		Ogrenci ogrenci;
		ogrenci = new Ogrenci();
		ogrenci.ad = "Bahar KUÞ";
		
		int sayi = 34;
		int sayi2;//0
		sayi2 = 34;//34
		
		//Matematik matematik = new Matematik();   //19
		//matematik.vizenotu = 65;
		//matematik.finalnotu = 33;
		//matematik.ortalamaHesapla();
		//2.
		ogrenci.matematik = new Matematik(); //15, 19
		ogrenci.matematik.vizenotu = 76;
		ogrenci.matematik.finalnotu = 32;
		ogrenci.matematik.ortalamaHesapla();
		//3.
		ogrenci.fizik = new Fizik();
		//ogrenci.fizik.vizenotu1 = 43;
		ogrenci.fizik.vizenotu = 21;
		ogrenci.fizik.finalnotu = 78;
		ogrenci.fizik.ortalamaHesapla();
		
		System.out.println("*** Öðrenci *** ");
		System.out.println("ad.............: "+ogrenci.ad);
		System.out.println("adres..........: "+ogrenci.adres);
		System.out.println("veli...........: "+ogrenci.veli);
		System.out.println("Dogum..........: "+ogrenci.dogumYili);
		System.out.println("ogretmen.......: "+ogrenci.ogretmen);
		System.out.println("- matematik");
		System.out.println("Vize...........: "+ogrenci.matematik.vizenotu);
		System.out.println("Final..........: "+ogrenci.matematik.finalnotu);
		System.out.println("Ortalam........: "+ogrenci.matematik.ortalama);		
		System.out.println("- fizik");
		System.out.println("Vize...........: "+ogrenci.fizik.vizenotu);
		System.out.println("Final..........: "+ogrenci.fizik.finalnotu);
		System.out.println("Ortalam........: "+ogrenci.fizik.ortalama);
		
	}

}
