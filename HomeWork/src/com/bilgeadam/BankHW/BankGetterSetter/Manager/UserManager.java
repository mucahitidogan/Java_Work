package com.bilgeadam.BankHW.BankGetterSetter.Manager;

import com.bilgeadam.BankHW.BankGetterSetter.Account;
import com.bilgeadam.BankHW.BankGetterSetter.User;


public class UserManager {

	String emailFormat = "@xbanka.com";
	
	
	public void otomatikEmailOlustur(User user)
	{
		String otomatikOlusanMail = (user.getName() + "." + user.getSurname() + emailFormat).toLowerCase();
		user.setEmail(otomatikOlusanMail);
		System.out.println(user.getEmail());
	}
	public void bilgileriGoster(User user)
	{
		System.out.println("İsim : " + user.getName() + "Surname : " + user.getSurname() + "HesapNo : " + user.getAccount().getHesapNo() + "Email : " +user.getEmail() + 
				            "Hesap Bakiyeniz : " + user.getAccount().getBakiye() + "Kalan Kredi borcunuz : " + user.getAccount().getIstenenKredi());
	}
	public void krediBasvurusundaBulun(Account account, int para)
	{
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		System.out.println("Kredi başvurusu miktarı : " + account.getIstenenKredi());
		System.out.println("Lütfen onay bekleyiniz.");
	}
	public void krediKartiBorcuOdeme(Account account, double taksit)
	{
		if(account.getIstenenKredi() == 0)
		{
			System.out.println("Kredi borcunuz yoktur");
		}
		else if(account.getIstenenKredi() < taksit)
		{
			double aktarilanMiktar = taksit - account.getIstenenKredi();
			account.setBakiye(account.getBakiye()+aktarilanMiktar);
			account.setIstenenKredi(0);
			System.out.println("Fazla yaptığınız ödeme bakiyenize eklenmiştir  Kalan borç : "+account.getIstenenKredi() + " Bakiyenize eklenen tutar : "+aktarilanMiktar+ " Mevcut bakiyeniz :" + account.getBakiye());
		}
		else
		{
			account.setIstenenKredi(account.getIstenenKredi() - taksit);
			System.out.println("Ödenen miktar : " + taksit + " Kalan Borç : " + account.getIstenenKredi());
		}
	}
	
}
