package com.bilgeadam.BankHW.BankGetterSetter;

import com.bilgeadam.BankHW.BankGetterSetter.Manager.AccountManager;
import com.bilgeadam.BankHW.BankGetterSetter.Manager.AdminManager;
import com.bilgeadam.BankHW.BankGetterSetter.Manager.UserManager;
import com.bilgeadam.BankHW.BankGetterSetter.User;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManager accountManager = new AccountManager();
		Account account1 = new Account();
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();
		User user1 = new User("Ali","Bilen",account1);
		accountManager.paraYatir(account1, 1000);
		accountManager.paraYatir(account1, 1500);
		accountManager.paraCek(account1, 2000);
		accountManager.hesapBilgileriniGoster(account1);
		
		userManager.otomatikEmailOlustur(user1);
		userManager.bilgileriGoster(user1);
		userManager.krediBasvurusundaBulun(account1, 10000);
		adminManager.krediBasvurusunuOnayla(account1);
		
		accountManager.hesapBilgileriniGoster(account1);
		userManager.krediKartiBorcuOdeme(account1, 1500);
		userManager.krediKartiBorcuOdeme(account1, 2500);
		userManager.krediKartiBorcuOdeme(account1, 8000);
		userManager.bilgileriGoster(user1);
		
		
		
		
	}

}
