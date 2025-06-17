package JavaGroupProject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        List<String>list= new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("orange");
        list.add("apple");
        list.add("orange");
        list.add("orange");

        Set<String> set= new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("List after removing duplicates: " + list);
    }
}
