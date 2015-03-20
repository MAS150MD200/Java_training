package Moe;

/**
 * Created by atsvetkov on 18.03.2015.
 */
public class CastingOperators {
    public static void main(String[] args) {
        int i = 200;
        System.out.println(i);

        long lng = (long)i;
        System.out.println(lng);

        String s = "123";
        System.out.println(Integer.valueOf(s));

        char a = 'a';
        char b = 'b';

        System.out.println((int)(a));
    }

}
