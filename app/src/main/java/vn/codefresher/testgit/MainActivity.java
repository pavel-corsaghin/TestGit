package vn.codefresher.testgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_user, edt_pass;
    Button btn_login;
    CheckBox cb_remember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        edt_user = findViewById(R.id.username);
        edt_pass = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);
        cb_remember = findViewById(R.id.cb_remember);
    }
}