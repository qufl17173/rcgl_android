package refresh.listview.com.talentmanagement.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @author qufl
 *         工具类
 */

public class LogUtil {
    private static final String TAG = "LogUtil";
    private static long _firstTime;

    /*
    * 两次返回退出
    * */
    public static void finishToast(Context context) {
        Toast toast = Toast.makeText(context, "再按一次退出程序...", Toast.LENGTH_LONG);
        long secondTime = System.currentTimeMillis();
        if (secondTime - _firstTime > 2000) {// 如果两次按键时间间隔大于2000毫秒，则不退出
            toast.show();
            _firstTime = secondTime;// 更新firstTime
        } else {
            System.gc();
            System.exit(0);
        }
    }
}
