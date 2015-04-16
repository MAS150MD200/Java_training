package Moe;

/**
 * Created by atsvetkov on 07.04.2015.
 */
public class PkgTest1 {
//    public static void main(String[] args) {
//        System.out.println("Hello from PkgTest1 main");
//    }

    public void publicPrint(String arg) {
        System.out.println(arg);
    }

    void defaultPrint(String arg) {
        System.out.println(arg);
    }
}

class PkgTest1DefaultAccess {
    public static void myPrint(String[] args) {
        System.out.println("Hello from PkgTest1DefaultAccess");
    }
}


