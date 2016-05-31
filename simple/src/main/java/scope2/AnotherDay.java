package scope2;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/31.
 */
public class AnotherDay {
    @Inject
    GirlFriend mGirlFriend;

    @Inject
    public AnotherDay() {

    }

    public void start() {
        mGirlFriend.happy("another day");
    }
}
