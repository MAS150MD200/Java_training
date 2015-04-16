package new_package;

/**
 * Created by atsvetkov on 07.04.2015.
 */

import Moe.PkgTest1;
import Moe.PkgTest1.*;

public class ClassFromNewPackage {

    public static void main(String[] args) {

        PkgTest1 myInst = new PkgTest1();
        myInst.publicPrint("Hello");

    }

}
