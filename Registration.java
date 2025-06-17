package JavaGroupProject;

public class Registration {
    String email;
    String userName;
    String password;

    public void setEmail(String email) {
        if (email != null && email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Only Yahoo emails are accepted.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. It must be more than 6 characters.");
        }
    }
    // Set password with checks
    public void setPassword(String password) {
        if (password == null || password.length() <= 6) {
            System.out.println("Invalid password. It must be more than 6 characters.");
        } else if (this.userName != null && password.toLowerCase().contains(userName.toLowerCase())) {
            System.out.println("Invalid password. It cannot contain the username.");
        } else {
            this.password = password;
            System.out.println("Password set successfully.");
        }
    }
    public void displayInfo() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + (password != null ? "********" : "Not Set"));
    }
}

