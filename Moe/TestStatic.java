package Moe;

/**
 * Created by Antonio on 08.03.2015.
 */



class MyTestClass {
    int i = 10;
}

public class TestStatic {
    public static void main(String[] args) {
        System.out.println((new MyTestClass()).i);
        (new MyTestClass()).i++;
        System.out.println((new MyTestClass()).i);

        MyTestClass my_inst = new MyTestClass();
        System.out.println(my_inst.i);

        my_inst.i++;
        System.out.println(my_inst.i);
    }
}
