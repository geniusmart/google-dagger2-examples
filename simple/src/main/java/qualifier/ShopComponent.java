package qualifier;

import dagger.Component;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Component(modules = {FittingRoomModule.class})
public interface ShopComponent {

    Shop inject();
}
