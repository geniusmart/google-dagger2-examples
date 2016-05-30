package module;

import dagger.Component;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Component(modules = {FittingModule.class})
public interface ShopComponent {

    Shop inject();

}
