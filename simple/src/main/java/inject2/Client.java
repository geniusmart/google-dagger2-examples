package inject2;


/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        BoyComponent build = DaggerBoyComponent.builder().build();
        Boy boy = build.inject();
        boy.daydayup();
    }
}
