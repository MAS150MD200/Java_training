package JP_2;

/**
 * Created by Antonio on 09.03.2015.
 */
public class JP_2_11 {
    public static void main(String[] args) {
        AllTheColorOfTheRainbow myColor = new AllTheColorOfTheRainbow();

        System.out.println(myColor.anIntegerRepresentingColors);
        System.out.println(myColor.hue);

        System.out.println(myColor.changeTheColor(3));
        System.out.println(myColor.anIntegerRepresentingColors);

        myColor.changeTheHueOfTheColor(100);
        System.out.println(myColor.hue);
    }
}

class AllTheColorOfTheRainbow {
    int anIntegerRepresentingColors = 0;
    int hue = 0;

    int changeTheColor(int newColor) {
        return anIntegerRepresentingColors = newColor;
    }

    void changeTheHueOfTheColor(int newHue) {
        hue = newHue;


    }
}