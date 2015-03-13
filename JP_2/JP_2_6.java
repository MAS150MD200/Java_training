package JP_2;

/**
 * Created by Antonio on 08.03.2015.
 */

class MyTools {
    int storage(String s) {
        return s.length() * 2;
    }
}

class MyToolsStatic {
    static int storage(String s) {
        return s.length() * 2;
    }
}

public class JP_2_6 {
    public static void main(String[] args) {
        MyTools mytools_inst = new MyTools();
        System.out.println(mytools_inst.storage("Hello World") + " Bytes" + " (with instance)");

        System.out.println(MyToolsStatic.storage("Hello World") + " Bytes" + " (static method)");
    }
}
