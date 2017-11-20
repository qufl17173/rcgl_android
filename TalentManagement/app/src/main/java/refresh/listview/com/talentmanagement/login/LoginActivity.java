package refresh.listview.com.talentmanagement.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import refresh.listview.com.talentmanagement.stay.MainActivity;
import refresh.listview.com.talentmanagement.R;
import refresh.listview.com.talentmanagement.utils.LogUtil;

/**
 * @author qufl
 *         登录界面
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LoginActivity";

    private ImageView loginImage;
    private EditText userNameEd;
    private EditText passWordEd;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUI();
    }

    private void initUI() {
        loginImage = (ImageView) findViewById(R.id.login_image);
        userNameEd = (EditText) findViewById(R.id.user_name_edit);
        passWordEd = (EditText) findViewById(R.id.pass_name_edit);
        submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.submit_button: {
                LoginActivity.actionStart(this);
                finish();
                Log.d(TAG, "");
            }
            break;
        }
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        LogUtil.finishToast(this);
    }
}
