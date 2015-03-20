package JP_4;

/**
 * Created by atsvetkov on 20.03.2015.
 */
public class JP_4_18 {

    public static void main(String[] args) {
        boolean flag;

        for(int i = 2; i <= 25; i++) {
            flag = true;
            System.out.println("try " + i);

            for(int y = 2; y < i; y++) {
//                System.out.println(i + "%" + y + " = " + i%y);
                if(i%y == 0) {flag = false;}
            }

//            System.out.println("---");
            if(flag) {System.out.println("Bingo " + i);};

        }
    }
}
