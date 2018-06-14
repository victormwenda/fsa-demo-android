package ke.co.safaricom.demo;

import org.junit.Test;

import ke.co.safaricom.demo.utils.LoginUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginUtilsTest {

    /**
     * Validates wrong username
     */
    @Test
    public void assertUsernameValidatorDetectsWrongUsername() {
        String username = "vrwanda";
        assertThat(LoginUtils.isValidUsername(username), is(false));
    }

    /**
     * Validates right username
     */
    @Test
    public void assertUsernameValidatorDetectsRightUsername() {
        String username = "vrwanda@safaricom.co.ke";
        assertThat(LoginUtils.isValidUsername(username), is(true));
    }

    /**
     * Validates wrong password length
     */
    @Test
    public void assertPasswordValidatorDetectsWrongPasswordLength() {
        String password = "1(Pa$$";
        assertThat(LoginUtils.isValidPassword(password), is(false));
    }

    /**
     * Validates right password length
     */
    @Test
    public void assertPasswordValidatorDetectsRightPasswordLength() {
        String password = "1qwertP^";
        assertThat(LoginUtils.isValidPassword(password), is(true));
    }
}
