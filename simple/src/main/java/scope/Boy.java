package scope;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/31.
 */
public class Boy {

    @Inject
    public Boy(){

    }

    @Inject
    GirlFriend mGirlFriend;

    public void test(){
        System.out.println(mGirlFriend.toString());
    }
}
