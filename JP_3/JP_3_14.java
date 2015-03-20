package JP_3;

/**
 * Created by atsvetkov on 20.03.2015.
 */
public class JP_3_14 {

    static void myPrint(Object obj) {
        System.out.println(obj);
    }

    static void stringCompare(String s1, String s2) {
        myPrint("---");
        myPrint("s1 == s2," + (s1 == s2));
        myPrint("s1 != s2," + (s1 != s2));
        myPrint("s1.equals(s2)," + (s1.equals(s2)));
        myPrint("s2.equals(s1)," + (s2.equals(s1)));
        myPrint("---");
    }

    public static void main(String[] args) {
        stringCompare("Hello", "World");
        stringCompare("Hello", "hello");
        stringCompare("Hello", "Hello");
    }

}
