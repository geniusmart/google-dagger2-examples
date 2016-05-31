package scope;


/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        MainConponent build = DaggerMainConponent.builder().mainModule(new MainModule()).build();
        GirlFriend girlFriend1 = build.inject();
        GirlFriend girlFriend2 = build.inject();

        Boy boy = build.injectd();
        boy.test();
    }
}
