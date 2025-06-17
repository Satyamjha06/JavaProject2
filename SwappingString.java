package JavaGroupProject;

public class SwappingString {
    public static void main(String[] args) {
        String str1 = "Hi";
        String str2 = "Hello";
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("Swapped first String is: " + str1);
        System.out.println("Swapped second String is: " + str2);
    }
}
