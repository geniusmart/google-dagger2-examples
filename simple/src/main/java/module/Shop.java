package module;


import javax.inject.Inject;

public class Shop {

    private Boy mBoy;
    private GirlFriend mGirlFriend;
    private FittingRoom mFittingRoom;

    @Inject
    public Shop(Boy boy, GirlFriend girlFriend, FittingRoom fittingRoom) {
        mBoy = boy;
        mGirlFriend = girlFriend;
        mFittingRoom = fittingRoom;
    }

    public void sale(){
        mBoy.daydayup();
        mGirlFriend.laugh();
        mFittingRoom.fit();
    }

}
