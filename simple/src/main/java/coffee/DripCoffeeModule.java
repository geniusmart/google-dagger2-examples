package coffee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Module(includes = PumpModule.class)
public class DripCoffeeModule {

    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
