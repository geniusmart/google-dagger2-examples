package module;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class GirlFriend {

    @Inject
    public GirlFriend() {

    }

    public void laugh() {
        System.out.println(this.toString() + ":laughing");
    }
}
