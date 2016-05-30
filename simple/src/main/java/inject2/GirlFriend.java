package inject2;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class GirlFriend {

    @Inject
    public GirlFriend(){

    }

    public void laugh(){
        System.out.println("laughing girl");
    }
}
