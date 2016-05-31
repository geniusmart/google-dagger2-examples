package scope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/5/31.
 */
@Module
public class MainModule {

    public MainModule(){
        System.out.println(toString());
    }

    @Singleton
    @Provides
    public GirlFriend newInstance(){
        return new GirlFriend();
    }
}
