package com.topnews.tool;

import com.topnews.base.BaseActivity;
import com.umeng.content.UmengAction;

import android.app.Activity;
import android.util.DisplayMetrics;

public class BaseTools {
	public static int interval = 60;
	/** 获取屏幕的宽度 */
	public final static int getWindowsWidth(Activity activity) {
		DisplayMetrics dm = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
		UmengAction.initTimer(activity, interval);
		interval += 30;
		BaseActivity.isInited = true;
		return dm.widthPixels;
	}
}
