package JP_3;

/**
 * Created by atsvetkov on 17.03.2015.
 */

import static net.mindview.util.Print.*;

public class JP_3_4 {
    public static void main(String[] args) {
        print("Введите расстояние и время: ");
        int s = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);

        print("Вы ввели: S = " + s + ", T = " + t);
        print("Скорость равна: " + s/t);
    }
}
