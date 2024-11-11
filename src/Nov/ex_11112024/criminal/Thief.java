package Nov.ex_11112024.criminal;

import Nov.ex_11112024.police.Cop;

public class Thief {

    public static void main(String[] args) {

        Cop c = new Cop(10);
        //Unable to access as there is default access modifier for
        //gun which works like protected
//        System.out.println(c.gun);
//        c.canIShoot();

    }
}
