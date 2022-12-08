package com.bilgeadam.BankHW2;

public class UserManager {

	public String emailUzanti = "@xbanka.com";
	
	public void otomatikEmailOlustur(User user)
	{
		user.email =(user.name + "." + user.surname + emailUzanti).toLowerCase();
	}
	public void bilgileriGoster(User user)
	{
		System.out.println(user);
	}
	public void krediBasvurusundaBulun(Account account, int para)
	{
		account.istenenKredi=para;
		System.out.println(account.istenenKredi+" TL tutarında kredi başvurusu yaptınız \n Lütfen onay bekleyiniz!");
		
	}
	public void krediKartiBorcuOdeme(Account account, double taksit)
	{
		if(account.istenenKredi==0)
		{
			System.out.println("Kredi borcunuz yoktur");
		}
		else
		{
			account.istenenKredi-=taksit;
			System.out.println("Ödenen taksit : "+taksit+"Kalan borç : "+account.istenenKredi);
		}
	}
}
