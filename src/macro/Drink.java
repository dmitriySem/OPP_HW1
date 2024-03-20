package macro;

public class Drink {

    private String name;
    private float volume;

    public Drink(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }

    public Drink() {
        this.name = "";
        this.volume = 0.0F;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
