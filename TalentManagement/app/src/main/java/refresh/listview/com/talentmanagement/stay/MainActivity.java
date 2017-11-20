package refresh.listview.com.talentmanagement.stay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import refresh.listview.com.talentmanagement.R;
import refresh.listview.com.talentmanagement.utils.LogUtil;

/**
 * @author qufl
 *         主界面，待办类
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        LogUtil.finishToast(this);
    }
}
