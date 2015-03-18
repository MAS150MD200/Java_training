package JP_3;

/**
 * Created by atsvetkov on 18.03.2015.
 */
public class JP_3_8 {

    public static void main(String[] args) {

        int i = 2147483647; //max int = 2147483647.
//        int i = 2147483648; //gives an error.

        long y = 2147483648L;

        System.out.println(Long.toHexString(y));    //80000000
        System.out.println(Long.toOctalString(y));    //20000000000

        long yHex = 0x8000000F;
        long yOct = 2000000000;

    }

}
