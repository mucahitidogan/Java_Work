package com.bilgeadam.BankHW.BankGetterSetter.Manager;

import com.bilgeadam.BankHW.BankGetterSetter.Account;

public class AccountManager {
	
	public void paraYatir(Account account, double miktar)
	{
		if(miktar <= 10000)
		{
			account.setBakiye(account.getBakiye() + miktar);
			System.out.println("Yatırılan miktar : " + miktar + " Güncel bakiye : "+account.getBakiye());
		}
		else
		{
			System.out.println("10000 TLden fazla yatıramazsınız!!!");
		}
	}
	public void paraCek(Account account, double miktar)
	{
		if(miktar > account.getBakiye())
		{
			System.out.println("Yetersiz bakiye!!!");
		}
		else
		{
			account.setBakiye(account.getBakiye()-miktar);
			System.out.println("Çekilen miktar : " + miktar + "Mevcut bakiye : "+account.getBakiye());
		}
			
	}
	public void hesapBilgileriniGoster(Account account)
	{
		System.out.println("Hesap No : "+account.getHesapNo()+"  Güncel Bakiye : "+account.getBakiye()+" TL");
	}
}
