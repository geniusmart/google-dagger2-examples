package scope2;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/31.
 */
public class OneDay {

    @Inject
    GirlFriend mGirlFriend;

    @Inject
    public OneDay(){

    }

    public void start() {
        mGirlFriend.happy("one day");
    }
}
