package com.ssy.price.view.member;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssy.price.R;
import com.ssy.price.view.member.LoginActivity.MyFragmentPagerAdapter;

public class LLActivity extends Activity{
	ImageView ivBack;// 返回按钮
	ViewPager viewPager;// 页卡内容
	List<View> views;// 视图集
	ImageView ivCursor;// 底图
	TextView tvMobile, tvAccount;// 页卡标题
	// offset:偏移量;currIndex:当前选中;imgWidth:底图宽度
	int offset = 0, currIndex = 0, imgWidth;
	MyFragmentPagerAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login1);

		
	}

	
}
