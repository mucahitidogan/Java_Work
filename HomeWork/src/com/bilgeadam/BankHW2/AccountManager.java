package com.bilgeadam.BankHW2;

public class AccountManager extends Account{

	
	
	public void paraYatir(Account account, double miktar)
	{
		
		if(miktar<=10000)
		{
			account.bakiye += miktar;
			System.out.println("Yatırılan miktar :"+miktar+" TL      Toplam bakiye :"+account.bakiye+" TL");
		}
		else
		{
			System.out.println("Yatırmak istediğiniz tutar maksimum yatırılabilecek tutarın (10000 TL) üzerindedir!!!");
		}
	}
	public void paraCek(Account account, double miktar)
	{
		
		if(miktar>account.bakiye)
		{
			System.out.println("Bakiyeniz yetersiz!!!");
		}
		else
		{
			account.bakiye -= miktar;
			System.out.println("Çekilen miktar :"+miktar+" TL      Kalan bakiye :"+account.bakiye+" TL");
		}
	}
	public void hesapBilgileriniGoster(Account account)
	{
		System.out.println("Hesap No : "+account.hesapNo+"   Bakiye : "+account.bakiye+" TL");
	}
}
