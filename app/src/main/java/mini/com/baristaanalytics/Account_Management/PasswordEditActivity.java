package mini.com.baristaanalytics.Account_Management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import mini.com.baristaanalytics.R;

public class PasswordEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_password_edit);

    }
    public void backToUserProfile(View view){
        finish();
    }

}
