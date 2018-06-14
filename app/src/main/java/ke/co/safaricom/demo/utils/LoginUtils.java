package ke.co.safaricom.demo.utils;

public class LoginUtils {
    /**
     * Authenticates a user.
     * //TODO Add actual implementation
     *
     * @param username
     * @param password
     * @return
     */
    public static boolean authenticate(String username, String password) {
        if (LoginUtils.isValidUsername(username) && LoginUtils.isValidPassword(password)) {
            return !username.equals(password);
        } else {
            return false;
        }
    }

    public static boolean isValidPassword(String password) {
        return password.matches(AppPatterns.PASSWORD_PATTERN);
    }

    public static boolean isValidUsername(String username) {
        return username.matches(AppPatterns.USERNAME_PATTERN);
    }
}
