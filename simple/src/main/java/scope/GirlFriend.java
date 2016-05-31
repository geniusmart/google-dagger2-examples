package scope;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class GirlFriend {

    @Inject
    public GirlFriend(){
        System.out.println(toString());
    }

    public void laugh(){
        System.out.println("laughing girl");
    }
}
