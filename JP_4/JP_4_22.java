package JP_4;

/**
 * Created by atsvetkov on 30.03.2015.
 */

public class JP_4_22 {

    static void print(Object obj) {
        System.out.println(obj);
    }


    public static void main(String[] args) {

        int i = 0;

        for(char c: "ADECB".toCharArray()) {

            print(i++);
//            print(++i);

            switch (c) {
                case 'A':
                    print("This is A");
//                    break;
                case 'B':
                    print("This is B");
//                    break;
                case 'C':
                    print("This is C");
//                    break;
                case 'D':
                    print("This is D");
//                    break;
                case 'E':
                    print("This is E");
//                    break;
            }
        }
    }
}
