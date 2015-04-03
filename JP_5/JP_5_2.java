package JP_5;

/**
 * Created by atsvetkov on 30.03.2015.
 */


import static net.mindview.util.Print.*;

public class JP_5_2 {

    String s;
    String s2 = "Hello";

    JP_5_2(String s_constr) {
        s = s_constr;
    }

    public static void main(String[] args) {

        JP_5_2 my_inst = new JP_5_2("World");

        print(my_inst.s);
        print(my_inst.s2);

    }

}
