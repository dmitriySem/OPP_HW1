package macro;

import java.util.List;
import java.util.Optional;


public class HotVendingMachine implements VendingMachine{

    List<HotDrink> products;

    public HotVendingMachine(List<HotDrink> drinksList) {
        this.products = drinksList;
    }



    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        Optional<HotDrink> product = products.stream().filter(hotDrink ->
                hotDrink.getName().equals(name)).
                filter(hotDrink -> hotDrink.getVolume() == volume).
                filter(hotDrink -> hotDrink.getTemperature() == temperature).findFirst();


        return product.isPresent()?product.get():new HotDrink();
    }
}
