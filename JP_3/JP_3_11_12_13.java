package JP_3;

/**
 * Created by atvetkov on 18.03.2015.
 */

import static net.mindview.util.Print.*;
import java.util.*;

public class JP_3_11_12_13 {

    public static void main(String[] args) {

//        int i = -1;
        int i = 139; //10001011
        System.out.println(Integer.toBinaryString(i));  //10001011

        i = i >> 5;
        System.out.println(Integer.toBinaryString(i));  //100

        i = 139; //10001011
        i = i << 5;
        System.out.println(Integer.toBinaryString(i));  //1000101100000

        i = 139; //10001011
        i = i >>> 5;
        System.out.println(Integer.toBinaryString(i));  //100

        Random rand = new Random(47);
        i = rand.nextInt();
        System.out.println(i);

        System.out.println(Integer.toBinaryString(i));

        System.out.println(Integer.toBinaryString(i << 5));
        System.out.println(Integer.toBinaryString(i >> 5));
        System.out.println(Integer.toBinaryString(i >>> 5));


        System.out.println("---");
        i = 139; //10001011
        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));  //10001011

        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));  //10001011

        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));  //10001011

        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));  //10001011

        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));  //10001011

        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));  //10001011

        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));  //10001011

        System.out.println("---");


        i = 255;
        System.out.println(Integer.toBinaryString(i));

        i <<= 3;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 1;
        System.out.println(Integer.toBinaryString(i));

        System.out.println("---");

        char c = 'A';
        System.out.println(Integer.toBinaryString(c));

        c = 'a';
        System.out.println(Integer.toBinaryString(c));

        c += 1;
        System.out.println(Integer.toBinaryString(c));



    }

}
