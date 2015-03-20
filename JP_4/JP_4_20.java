package JP_4;

/**
 * Created by atsvetkov on 20.03.2015.
 */
public class JP_4_20 {

    static boolean test(int testVal, int beginRng, int endRng) {

        boolean flag = false;
        for(int i = beginRng; i <= endRng; i++) {
            if(testVal == i) {flag = true;}
        }
        return flag;
    }


    static boolean test2(int testVal, int beginRng, int endRng) {
        boolean flag = false;

        if(testVal >= beginRng && testVal <= endRng) {
            flag = true;
        }

        return flag;
    }


    public static void main(String[] args) {
        int myVal = 3;
        int myBeginRng = 2;
        int myEndRng = 20;

        System.out.println(test(myVal, myBeginRng, myEndRng));
        System.out.println(test2(myVal, myBeginRng, myEndRng));

    }
}


