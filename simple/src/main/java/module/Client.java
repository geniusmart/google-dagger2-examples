package module;


/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){
        ShopComponent build = DaggerShopComponent.builder().build();
        Shop shop = build.inject();
        shop.sale();
    }
}
