package JavaGroupProject;

import java.util.ArrayList;
import java.util.List;

public class ListStartsWith {
    public static void main(String[] args) {


        List<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("Banana");
        str.add("Asset");
        str.add("Mango");

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).startsWith("A")) {
                System.out.println(str.get(i) + " starts with 'A'");
            }
        }

    }
}



