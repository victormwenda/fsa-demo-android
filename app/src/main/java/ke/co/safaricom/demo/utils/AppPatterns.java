package ke.co.safaricom.demo.utils;

public class AppPatterns {
    /**
     * Password pattern
     * Min of eight characters, at least one letter, one number and one special character
     */
    public static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$^+=!*()@%&]).{8,10}$";
    /**
     * Username pattern
     * Android default email pattern regex
     */
    public static final String USERNAME_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    ;

}
