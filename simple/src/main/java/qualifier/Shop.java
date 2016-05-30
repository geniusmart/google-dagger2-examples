package qualifier;

import javax.inject.Inject;

import qualifier.type.One;
import qualifier.type.Three;
import qualifier.type.Two;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Shop {

    @Inject
    FittingRoom room;

    @Inject @One
    FittingRoom room1;
    @Inject @Two
    FittingRoom room2;
    @Inject @Three
    FittingRoom room3;

    @Inject
    public Shop(){

    }

    public void build(){
        room.build();
        room1.build();
        room2.build();
        room3.build();
    }

}
