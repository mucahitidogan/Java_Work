package com.bilgeadam.BankHW.BankGetterSetter.Manager;

import com.bilgeadam.BankHW.BankGetterSetter.Account;


public class AdminManager {

	public void krediBasvurusunuOnayla(Account account)
	{
		if(account.getKrediBasvurusu())
		{
			System.out.println("Başvurunuz onaylanmıştır.");
			account.setBakiye(account.getBakiye() + account.getIstenenKredi());
		}
		else
		{
			System.out.println("Kredi başvurunuz yok!");
		}
	}
	public void krediBasvurusunuReddet(Account account)
	{
		if(account.getKrediBasvurusu())
		{
			System.out.println("Kredi başvurunuz reddedilmiştir.");
			account.setIstenenKredi(0.0);
		}
		else
		{
			System.out.println("Kredi başvurusu yok!");
		}
	}
}
