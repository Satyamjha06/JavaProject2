package JavaGroupProject;

public class Vowels {
    public static void main(String[] args) {
        String str= "documentation";
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
          char ch= Character.toLowerCase(str.charAt(i));
            if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }

        }
        System.out.println("Vowels count: "+count);
    }
}
