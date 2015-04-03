package JP_5;

/**
 * Created by atsvetkov on 31.03.2015.
 */


import static net.mindview.util.Print.*;

public class JP_5_5 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.Bark(true);
        dog.Bark(10);
        dog.Bark(10.1f);
        dog.Bark('s');

        print("---");

        int val = 10;
        dog.Bark((int)val);
        dog.Bark((short)val);
        dog.Bark((double)val);
        dog.Bark((long)val);
        dog.Bark((char)val);
    }

}

class Dog {
    void Bark(int i) {print("wof INT");}
    void Bark(short i) {print("wof SHORT");}
    void Bark(boolean i) {print("wof BOOLEAN");}
    void Bark(float i) {print("wof FLOAT");}
    void Bark(char i) {print("wof CHAR");}
    void Bark(long i) {print("wof LONG");}
    void Bark(double i) {print("wof DOUBLE");}
    void Bark() {print("wof EMPTY");}
}
