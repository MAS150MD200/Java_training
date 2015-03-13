package JP_2;

/**
 * Created by Antonio on 08.03.2015.
 */

class MyClassVal {
    static int my_val = 1;
}

class MyIncr {
    static void incr() {
        MyClassVal.my_val++;
    }
}

public class JP_2_8 {
    public static void main(String[] args) {
        MyClassVal my_inst_1 = new MyClassVal();
        MyClassVal my_inst_2 = new MyClassVal();

        System.out.println(my_inst_1.my_val);
        System.out.println(my_inst_2.my_val);

        MyIncr.incr();

        System.out.println(my_inst_1.my_val);
        System.out.println(my_inst_1.my_val);

        my_inst_1.my_val++;

        System.out.println(my_inst_1.my_val);
        System.out.println(my_inst_2.my_val);

        MyClassVal my_inst_3 = new MyClassVal();
        System.out.println(my_inst_3.my_val);


    }




}
