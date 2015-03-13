package JP_2;

/**
 * Created by Antonio on 08.03.2015.
 */


class DataOnly {
    int i;
    double d;
    boolean b;
}

public class JP_2_4 {
    public static void main(String[] args) {
        DataOnly data_inst = new DataOnly();
        System.out.println(data_inst.i);
        System.out.println(data_inst.b);
        System.out.println(data_inst.d);
    }
}
