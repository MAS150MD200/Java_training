package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_5_9 {
    public static void main(String[] args) {
        new MyClass(10);
        new MyClass(10, 'a');
    }
}


class MyClass {
    MyClass(int i) {
        print(i);
    }

    MyClass(int i, char c) {
        this(i);                        //!!!
        print(c);
    }
}



