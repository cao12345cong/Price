package com.ssy.price.commons.view;

import android.app.Activity;
import android.widget.Toast;

public class BaseActivity extends Activity {

	protected void showTipMsg(String msg) {
		Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
	}
}
