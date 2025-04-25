package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HomeworkTwo {

    public static void main(String[] args) {
        System.out.println(("Hello World").length());
        System.out.println(("Hello").concat(" World"));
        System.out.println(thirdWord("Hello World oe"));
        System.out.println(Arrays.toString(splitFruit("apple,banana,orange")));
        traverseStringReverse("Hello World");


        Map<String, Integer> map = new HashMap<>();

        map.put("Giorgi", 16);
        map.put("Vaja", 20);
        map.put("Merabi", 30);
        map.put("Nuca", -21);

        System.out.println(map.get("Vaja"));

        for (String i : map.keySet()) {
            map.put(i, map.get(i) + 1);
        }
        for (String i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
    }

    public static String areEquals(String str1, String str2) {

        if (str1.equals(str2)){
            return "equals";

        }
        return "not equals";

    }

    public static String firstWord(String str) {
        String[] result = str.split(" ");
        return result[0];
    }

    public static String thirdWord(String str) {
        String[] result = str.split(" ");
        try {
            return result[2];
        }
        catch (IndexOutOfBoundsException e) {
            return "Not Enough Words";
        }

    }

    public static String[] splitFruit(String str) {
        return str.split(",");
    }

    static void traverseStringReverse(String str)
    {
        // Traverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }


}
