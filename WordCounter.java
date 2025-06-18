package JavaGroupProject;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Hello, world!";
        String[] words = sentence.trim().split("\\W+");
        System.out.println("Word count in '" + sentence + "': " + words.length);
    }
}
