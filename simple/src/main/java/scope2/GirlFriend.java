package scope2;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/31.
 */
public class GirlFriend {

    @Inject
    public GirlFriend() {

    }

    public void happy(String time) {
        System.out.println(toString() + " happy " + time);
    }
}
