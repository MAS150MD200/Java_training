//package JP_3;

/**
 * Created by atsvetkov on 18.03.2015.
 */

class Dog {
    String name, says;

    void setName(String n) {
        name = n;
    }

    void setSays(String s) {
        says = s;
    }

    void showName() {
        System.out.println(Dog.this.name);
    }

    void showSays() {
        System.out.println(Dog.this.says);
    }

}


public class JP_3_6{

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

//        spot.name = "Spot";
//        scruffy.name = "Scruffy";
//
//        spot.says = "wooooof-wooooof";
//        scruffy.says = "hrrrrr-hrrrrr";
//
//        System.out.println("Dog " + spot.name + " says " + spot.says);
//        System.out.println("Dog " + scruffy.name + " says " + scruffy.says);

        spot.setName("Spot");
        scruffy.setName("Scruffy");

        spot.setSays("wooooof-wooooof");
        scruffy.setSays("hrrrrr-hrrrrr");

        spot.showName();
        spot.showSays();

        scruffy.showName();
        scruffy.showSays();


        //JP_3_6
        Dog spot2 = new Dog();
        spot2.setName("Spot2");
        spot2.setSays("Gaf");
        System.out.println(spot == spot2);
        System.out.println(spot.equals(spot2));

        spot = spot2;

        System.out.println(spot == spot2);  //т.к. ссылки одинаковые.
        System.out.println(spot.equals(spot2)); //т.к. объекты тоже идентичны.
    }
}