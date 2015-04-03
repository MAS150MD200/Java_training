package JP_4;

/**
 * Created by atsvetkov on 30.03.2015.
 */


public class JP_4_23 {

    static void print(Object obj) {
        System.out.println(obj);
    }


    static int factor(int n) {

        if (n <= 1) {
            return 1;
        }

        return n*factor(n-1);
    }

    static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }


    public static void main(String[] args) {

        for(int i=1; i<=10; i++) {
            print("fib = " + fib(i));
            print("factor = " + factor(i));
        }
    }
}
