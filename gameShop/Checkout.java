package gameShop;
import java.util.Calendar;
import java.util.Scanner;


public class Checkout {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		games breathOftheWild = new games();
		games skyrim = new games();
		
		Calendar day = Calendar.getInstance();
		Calendar saleDay = Calendar.getInstance();
		
		saleDay.set(Calendar.DAY_OF_MONTH, 27);
		saleDay.set(Calendar.YEAR, 2020);
		saleDay.set(Calendar.MONTH, 7);
		
		
		skyrim.title = "Skyrim";
		skyrim.company = "Bethesda";
		skyrim.price = 19.99;
		skyrim.sale = false;
		skyrim.stock = 1;
		
		breathOftheWild.title = "The Legend of Zelda: Breath of the Wild";
		breathOftheWild.company = "Nintendo";
		breathOftheWild.price = 59.99;
		breathOftheWild.stock = 3;
		breathOftheWild.sale = false;
		
		
		
		if(day.get(Calendar.DAY_OF_MONTH) == saleDay.get(Calendar.DAY_OF_MONTH) & day.get(Calendar.MONTH) == saleDay.get(Calendar.MONTH)) {
			skyrim.sale = true;
		}
		if(skyrim.sale == true) {
			skyrim.price = skyrim.price * .5;
		}
		
		boolean done = false;
		
		while(done == false) {
			System.out.println("Welcome to the gameshop, please make a selection:");
			System.out.println("1: purchase games");
			System.out.println("2: check stock");
			System.out.println("3: leave");
			String menu1 = user.nextLine();
			if(menu1.equals("1")) {
				System.out.println(skyrim.title + ' ' + skyrim.price);
				System.out.println(breathOftheWild.title + ' ' + breathOftheWild.price);
			}
		}
	}
}
