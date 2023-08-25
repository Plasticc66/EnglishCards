package eng.plasticc66;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> lesson1 = new HashMap<>();
        lesson1.put("hello", "привет");
        lesson1.put("style", "стиль");
        lesson1.put("parrot", "попугай");
        lesson1.put("circle", "круг");

        /*Map<String, String> lesson2 = new HashMap<>();
        lesson1.put("", "");
        lesson1.put("", "");
        lesson1.put("", "");
        lesson1.put("", "");
*/
        Dictionary dictionary = new Dictionary(lesson1);
        dictionary.startSession();

    }
}