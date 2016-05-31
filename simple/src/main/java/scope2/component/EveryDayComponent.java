package scope2.component;

import dagger.Component;
import scope2.AnotherDay;
import scope2.OneDay;
import scope2.module.EveryDayModule;
import scope2.module.ForeverModule;
import scope2.scope.EveryDay;

/**
 * Created by geniusmart on 2016/5/31.
 */
@EveryDay
@Component(modules = {EveryDayModule.class, ForeverModule.class})
public interface EveryDayComponent {
    OneDay inject1();
    AnotherDay inject2();
}
