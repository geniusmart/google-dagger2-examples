package coffee;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Module
public class PumpModule {

    @Provides
    Pump providePump(Thermosiphon pump){
        return pump;
    }
}
