package coffee;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Thermosiphon implements Pump {

    private final Heater mHeater;

    @Inject
    public Thermosiphon(Heater heater) {
        mHeater = heater;
    }

    @Override
    public void pump() {
        if (mHeater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
