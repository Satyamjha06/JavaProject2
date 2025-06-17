package JavaGroupProject;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        if (isAnagram(str1,str2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not an Anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2){
        if (s1.length()!= s2.length()){
            return false;
        }
        HashMap<Character,Integer> freqMap= new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Subtract frequency using str2
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!freqMap.containsKey(c)) {
                return false;
            }
            freqMap.put(c, freqMap.get(c) - 1);
            if (freqMap.get(c) == 0) {
                freqMap.remove(c);
            }
        }

        return freqMap.isEmpty(); // If empty, all letters matched perfectly
    }
}

