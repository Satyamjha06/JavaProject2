package JavaGroupProject;

public class Alpha {
    public static void main(String[] args) {

        String str= "Alpha @123 Number!";
        int count= 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                count++;
            }

        }
        System.out.println("Number of alpha character: "+count);
    }

    public static class Vowels {
    }
}
