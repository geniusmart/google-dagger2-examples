package qualifier;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class FittingRoom {

    private int no = -1;
    private String sex;
    private String context;

    @Inject
    public FittingRoom() {
        context = "有点猫腻的试衣间";
    }

    public FittingRoom(String sex) {
        this.sex = sex;
        context = sex + "试衣间";
    }

    public FittingRoom(String sex, int no) {
        this.sex = sex;
        this.no = no;
        context = no + "号" + sex + "试衣间";
    }

    public void fit() {
        System.out.println("welcome to shop!");
    }

    public void build() {
        System.out.println(context);
    }
}
