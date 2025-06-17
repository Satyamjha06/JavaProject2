package JavaGroupProject;

import java.util.Set;

public class VowelsSet {
    public static void main(String[] args) {
        String str= "documentation";
        int count=0;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i <str.length() ; i++) {
            char ch= Character.toLowerCase(str.charAt(i));
            if (vowels.contains(ch)){
                count++;
            }

        }
        System.out.println("Vowels count: "+count);
    }
}
