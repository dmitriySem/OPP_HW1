package macro;

public class HotDrink  extends Drink{

    private int temperature;


    public HotDrink(String name, float volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public HotDrink() {
        this.temperature = 0;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{name=" +
                super.getName() +
                ", volume=" +
                super.getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}
