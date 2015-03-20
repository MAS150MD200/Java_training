//package JP_4;

/**
 * Created by atsvetkov on 20.03.2015.
 */

import java.util.*;

public class JP_4_17 {
    public static void main(String[] args) {

        Random rand = new Random();
        int i = 1;
//        for(int i = 1; i <= 25; i++) {
        while(true) {

            int currRndVal = rand.nextInt();
            int anotherRndVal = rand.nextInt();

            if(currRndVal > anotherRndVal) {
                System.out.println(i + ") " + currRndVal + " > " + anotherRndVal);
            } else if(currRndVal < anotherRndVal) {
                System.out.println(i + ") " + currRndVal + " < " + anotherRndVal);
            } else {
                System.out.println(i + ") " + currRndVal + " = " + anotherRndVal);
            }

            i++;

            if(i == 20) {break;}
        }
    }
}
