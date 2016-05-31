package scope2.module;

import dagger.Module;
import dagger.Provides;
import scope2.AnotherDay;
import scope2.OneDay;

/**
 * Created by geniusmart on 2016/5/31.
 */
@Module
public class EveryDayModule {

    @Provides
    public OneDay newOne() {
        return new OneDay();
    }

    @Provides
    public AnotherDay newAnother(){
        return new AnotherDay();
    }
}
