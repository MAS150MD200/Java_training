package Moe;

/**
 * Created by atsvetkov on 31.03.2015.
 */

import static net.mindview.util.Print.*;

public class ClassTestCallMethods {
    public static void main(String[] args) {
        MyClass myInst = new MyClass();

        myInst.myMethod("Hello");           //!!!

        new MyClass().myMethod("World");    //!!!

//        MyClass.myMethod("World");  //???!!!

    }

}


class MyClass {
    void myMethod(String s) {
        print(s);
    }
}
