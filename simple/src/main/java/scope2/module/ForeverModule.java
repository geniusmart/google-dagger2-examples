package scope2.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import scope2.GirlFriend;

/**
 * Created by geniusmart on 2016/5/31.
 */
@Module
public class ForeverModule {

    @Singleton
    @Provides
    public GirlFriend mineGF(){
        return new GirlFriend();
    }
}
