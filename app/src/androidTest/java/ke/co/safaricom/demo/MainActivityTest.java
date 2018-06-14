package ke.co.safaricom.demo;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import ke.co.safaricom.demo.activities.MainActivity;

import static junit.framework.TestCase.assertTrue;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Test
    public void testBadUserLogin() {
        String username = "vrwanda";
        String password = "1(Pa$$";
        assertTrue(!MainActivity.loginUser(username, password));
    }

    @Test
    public void testGoodUserLogin() {
        String username = "vrwanda@safaricom.co.ke";
        String password = "1(Pa$$w0rD";
        assertTrue(MainActivity.loginUser(username, password));
    }
}
