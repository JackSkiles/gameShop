package gameShop;
import java.util.Calendar;


public class Checkout {
	public static void main(String[] args) {
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
		System.out.println(skyrim.price);
		
	}
}
