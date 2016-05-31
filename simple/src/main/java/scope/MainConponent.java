package scope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by geniusmart on 2016/5/31.
 */
@Singleton
@Component(modules = {MainModule.class})
public interface MainConponent {

    GirlFriend inject();

    Boy injectd();
}
