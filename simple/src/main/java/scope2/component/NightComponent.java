package scope2.component;

import dagger.Component;
import scope2.module.EveryDayModule;
import scope2.scope.EveryDay;

/**
 * Created by geniusmart on 2016/5/31.
 */
@EveryDay
@Component(dependencies = ForeverComponent.class, modules = EveryDayModule.class)
public interface NightComponent {

}
