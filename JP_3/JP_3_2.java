package JP_3;

/**
 * Created by atsvetkov on 17.03.2015.
 */


//: JP_3/JP_3_2.java
import static net.mindview.util.Print.*;

class Tank {
    float level;
}

public class JP_3_2 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9.14f;
        t2.level = 1.12f;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);

        t1 = t2;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);

        t1.level = 2.19f;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
