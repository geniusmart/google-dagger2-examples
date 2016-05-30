package module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Module
public class FittingModule {

    @Provides
    public FittingRoom provideFittingRoom(){
        return new FittingRoom();
    }
}
