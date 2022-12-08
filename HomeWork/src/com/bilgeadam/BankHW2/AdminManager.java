package com.bilgeadam.BankHW2;

public class AdminManager {

	public void krediBasvurusunuOnayla(Account account)
	{
		if(account.istenenKredi>0)
		{
			account.krediBasvurusu = true; 
			System.out.println("Başvurunuz onaylanmıştır");
			account.bakiye += account.istenenKredi;
		}
		else
		{
			System.out.println("Kredi başvurunuz yoktur!!!");
		}
	}
	public void krediBasvurusunuReddet(Account account)
	{
		if(account.istenenKredi>0)
		{
			System.out.println("Başvurunuz reddedilmiştir");
			account.istenenKredi=0;
		}
		else
		{
			System.out.println("Kredi başvurunuz yoktur!!!");
		}
	}
}
