package macro;

import java.util.List;

public interface VendingMachine {

//я хотел создать здесь поле с коллекцией продуктов, который инициализируется через конструктор.
//но не понял можно ли так сделать(у меня не получилось). Можно ли реализовать таккой функционал 
    HotDrink getProduct(String name, int volume, int temperature);

}
