package JP_3;

/**
 * Created by atsvetkov on 18.03.2015.
 */
public class JP_3_10 {
    public static void main(String[] args) {

        int const1 = 1 + 4 + 16 + 64;
        int const2 = 2 + 8 + 32 + 128;

        int const1f = 0x55F;
        int const2f = 0xAAF;


        System.out.println(Integer.toBinaryString(const1));
        System.out.println(Integer.toBinaryString(const2));

        System.out.println(Integer.toBinaryString(const1f));
        System.out.println(Integer.toBinaryString(const2f));

        System.out.println("---");

        System.out.println(Integer.toBinaryString(const1 & const2));
        System.out.println(Integer.toBinaryString(const1 | const2));
        System.out.println(Integer.toBinaryString(const1 ^ const2));
        System.out.println(Integer.toBinaryString(~const1));
        System.out.println(Integer.toBinaryString(~const2));

        System.out.println("---");

        System.out.println(Integer.toBinaryString(const1f & const2f));
        System.out.println(Integer.toBinaryString(const1f | const2f));
        System.out.println(Integer.toBinaryString(const1f ^ const2f));
        System.out.println(Integer.toBinaryString(~const1f));
        System.out.println(Integer.toBinaryString(~const2f));


    }
}
