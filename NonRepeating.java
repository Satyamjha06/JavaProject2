package JavaGroupProject;

public class NonRepeating {
    public static void main(String[] args) {
        String str = "abracadabra";

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }

            }
            if (isUnique) {
                System.out.println("First non-repeating character: " + current);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}
