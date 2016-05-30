package coffee;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class ElectricHeater implements Heater {

    boolean heating;

    @Override
    public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
