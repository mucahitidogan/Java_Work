package com.bilgeadam.BankHW2;

public class Test {

	public static void main(String[] args) {
		
		Account account1 = new Account();
		AccountManager accountManager = new AccountManager();
		User user1 =  new User("Arda","Ağdemir",account1);
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();
		
		accountManager.paraYatir(account1, 500);
		accountManager.paraYatir(account1, 2000);
		accountManager.paraCek(account1, 1000);
		accountManager.hesapBilgileriniGoster(account1);

		userManager.otomatikEmailOlustur(user1);
		userManager.bilgileriGoster(user1);
		userManager.krediBasvurusundaBulun(account1, 10000);
		adminManager.krediBasvurusunuReddet(account1);
		
		accountManager.hesapBilgileriniGoster(account1);
		
		userManager.krediKartiBorcuOdeme(account1, 1000);
		userManager.krediKartiBorcuOdeme(account1, 2000);
		userManager.krediKartiBorcuOdeme(account1, 3000);
		userManager.bilgileriGoster(user1);
	}

}
