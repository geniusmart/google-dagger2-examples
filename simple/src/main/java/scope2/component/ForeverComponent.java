package scope2.component;

import javax.inject.Singleton;

import dagger.Component;
import scope2.GirlFriend;
import scope2.module.ForeverModule;

/**
 * Created by geniusmart on 2016/5/31.
 */
@Singleton
@Component(modules = ForeverModule.class)
public interface ForeverComponent {
    GirlFriend inject();
}
