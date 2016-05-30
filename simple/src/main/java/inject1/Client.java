package inject1;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        GFComponent build = DaggerGFComponent.builder().build();
        build.inject().show();
    }
}
