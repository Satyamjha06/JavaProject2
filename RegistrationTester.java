package JavaGroupProject;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration user1 = new Registration();

        user1.setEmail("john@yahoo.com");
        user1.setUserName("johnDoe123");
        user1.setPassword("securePass123");

        // Invalid cases:
        /*user1.setEmail("john@gmail.com");
        user1.setUserName("john");
        user1.setPassword("johnDoe123pass");*/

        System.out.println("\nUser Info:");
        user1.displayInfo();
    }

}
