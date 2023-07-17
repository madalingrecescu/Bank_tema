package emailapp;

public class Email {
    private String defaultPassword;
    private String passWord;
    private int defaultPasswordLength = 10;
    private String email;


    public Email(String firstName, String lastName, String bankDomain) {
        this.defaultPassword = randomPassword(this.defaultPasswordLength);
        System.out.println("Your password is " + this.defaultPassword);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + bankDomain;
    }

    //generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //Change password
    public void setPassword(String password) {
        this.passWord = password;
    }


    public String getDefaultPasswordPassword() {
        return defaultPassword;
    }

    @Override
    public String toString() {
        return "Email:{" +
                "email='" + email + '\'' +
                "default password='" + defaultPassword + '\'' +
                '}';
    }
}
