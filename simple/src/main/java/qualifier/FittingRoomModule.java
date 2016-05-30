package qualifier;

import dagger.Module;
import dagger.Provides;
import qualifier.type.One;
import qualifier.type.Three;
import qualifier.type.Two;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Module
public class FittingRoomModule {
    @Provides
    @One
    public FittingRoom instanceRoom1() {
        return new FittingRoom();
    }

    @Provides
    @Two
    public FittingRoom instanceRoom2() {
        return new FittingRoom("男");
    }

    @Provides
    @Three
    public FittingRoom instanceRoom3() {
        return new FittingRoom("女",1001);
    }
}
