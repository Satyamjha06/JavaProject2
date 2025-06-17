package JavaGroupProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfWords {
    public static void main(String[] args) {
        String str =("Hello, world!");
        int count = 0;

        if (str.equals("")){
            System.out.println("Empty");

        }
        else{
            Pattern pattern= Pattern.compile("\\b\\w+\\b");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()){
                count++;
            }
        }
        System.out.println(count);

    }
}
