package module;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Boy {

    private GirlFriend mGirlFriend;

    @Inject
    public Boy(GirlFriend girlFriend){
        mGirlFriend = girlFriend;
    }

    public void daydayup(){
        mGirlFriend.laugh();
    }

}
