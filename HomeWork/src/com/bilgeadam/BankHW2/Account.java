package com.bilgeadam.BankHW2;

import java.util.Random;

public class Account {

	public String hesapNo;
	public double bakiye;
	public boolean krediBasvurusu;
	public double istenenKredi=0;
	
	public Account()
	{
		Random random=new Random(); //random sınıfı
		hesapNo=String.valueOf(random.nextInt(0,99999999));
	}
	public Account(String hesapNo)
	{
		this.hesapNo = hesapNo;
	}
	@Override
	public String toString() {
		return " Hesap No : " + hesapNo + " Bakiye : " + bakiye + " Kalan Kredi Borcu : " + istenenKredi;
	}
	
	
	
}
