package coffee;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class CoffeeApp {
    @Singleton
    @Component(modules = { DripCoffeeModule.class })
    public interface Coffee {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
        coffee.maker().brew();
    }
}
