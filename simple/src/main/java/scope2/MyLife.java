package scope2;

import scope2.component.DaggerEveryDayComponent;
import scope2.component.EveryDayComponent;
import scope2.module.ForeverModule;

/**
 * Created by geniusmart on 2016/5/31.
 */
public class MyLife {

    public static void main(String[] args) {
        EveryDayComponent build = DaggerEveryDayComponent.builder().foreverModule(new ForeverModule()).build();
        OneDay oneDay = build.inject1();
        AnotherDay anotherDay = build.inject2();
        oneDay.start();
        anotherDay.start();
    }
}
