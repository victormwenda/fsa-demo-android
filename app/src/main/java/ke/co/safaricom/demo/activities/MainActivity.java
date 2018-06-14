package ke.co.safaricom.demo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.widget.Toast;


import ke.co.safaricom.demo.R;
import ke.co.safaricom.demo.utils.LoginUtils;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText mUsername;
    private AppCompatEditText mPassword;
    private AppCompatButton mLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    /**
     * initialise app views
     */
    private void initViews() {
        mUsername = findViewById(R.id.input_username);
        mPassword = findViewById(R.id.input_password);
        mLogin = findViewById(R.id.button_login);

        mLogin.setOnClickListener((view) -> {
            if (view == mLogin) {
                boolean loggedIn = loginUser(mUsername.getText().toString(), mPassword.getText().toString());
                String loginMessage = loggedIn ? "Login successful" : "Login failed";
                Toast.makeText(MainActivity.this, loginMessage, Toast.LENGTH_SHORT).show();

            }
        });
    }

    /**
     * Authenticates a user
     *
     * @param username
     * @param password
     * @return
     */
    public static boolean loginUser(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return LoginUtils.authenticate(username, password);
    }
}
