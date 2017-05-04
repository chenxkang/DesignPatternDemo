package com.designpatterndemo.chenxkang.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * author: chenxkang
 * time  : 17/3/30
 * desc  : Intent相关
 */

public class IntentUtils {

    public static void sendDataIntent(Context context, Class<?> cls, Bundle bundle){
        Intent intent = new Intent(context, cls);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
