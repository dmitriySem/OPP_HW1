package macro;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HotDrink drink1 = new HotDrink("milk", 1000, 15);
        HotDrink drink2 = new HotDrink("tea", 300, 18);
        HotDrink drink3 = new HotDrink("juice", 2000, 10);

        System.out.println(drink1);
        System.out.println(drink2);

        List<HotDrink> drinksList = List.of(drink1, drink2,drink3);

        VendingMachine vendingMachine1 = new HotVendingMachine(drinksList);
        System.out.println(vendingMachine1.getProduct("milk", 1000, 15));
        System.out.println(vendingMachine1.getProduct("juice", 1000, 15));
    }
}
