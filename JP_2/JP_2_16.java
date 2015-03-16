package JP_2;

/**
 * Created by atsvetkov on 16.03.2015.
 */

//: JP_2/JP_2_16.java

/** Описание класса Tree
 * содержит два метода Tree() - конструктор и info() и два соответствующих им перегруженных метода.
 */
class Tree {
    /** объявляем переменную height */
    int height;

    /** Метод Tree() */
    Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    /** Перегруженный метод Tree() */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание нового дерева высотой " + height + " м.");
    }

    /** Метод info() */
    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }

    /** Перегруженный метод info() */
    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}


/**
 * Класс с методом main().
 */
public class JP_2_16 {

    /** Точка входа в программу */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
        //Перегруженный конструктор:
        new Tree();
    }
}
