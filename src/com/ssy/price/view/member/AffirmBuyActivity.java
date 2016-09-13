package com.ssy.price.view.member;


import java.util.ArrayList;
import java.util.List;

import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssy.price.R;

public class AffirmBuyActivity extends FragmentActivity{
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
		setContentView(R.layout.login);
		init();
	}

	void init() {
		ivCursor=(ImageView) findViewById(R.id.ivCursor);
		DisplayMetrics dm=new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		int screenWidth=dm.widthPixels;
		imgWidth=screenWidth/4;
		Matrix matrix=new Matrix();
		matrix.postTranslate(offset, 0);
		matrix.setScale(imgWidth/5, 1);
		ivCursor.setImageMatrix(matrix);

		tvMobile = (TextView) findViewById(R.id.tvMobile);
		tvAccount = (TextView) findViewById(R.id.tvAccount);
		tvMobile.setOnClickListener(new TvOnClickListener(0));
		tvAccount.setOnClickListener(new TvOnClickListener(1));

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		adapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),getFragments());
//		views = new ArrayList<View>();
//		LayoutInflater mInflater = getLayoutInflater();
//		views.add(mInflater.inflate(R.layout.login_mobile, null));
//		views.add(mInflater.inflate(R.layout.login_account, null));
//		viewPager.setAdapter(new BasePagerAdapter(views));
		viewPager.setAdapter(adapter);
		viewPager.setCurrentItem(0);
		viewPager.setOnPageChangeListener(new VpOnPageChangeListener());
	}

	private ArrayList<Fragment> getFragments() {
		ArrayList<Fragment> fragments=new ArrayList<Fragment>();
		fragments.add(new LoginAccountFragment());
		fragments.add(new LoginMobileFragment());
		return fragments;
		 
	}

	// 标题点击监听
	public class TvOnClickListener implements View.OnClickListener {
		private int index = 0;

		public TvOnClickListener(int i) {
			index = i;
		}

		@Override
		public void onClick(View v) {
			viewPager.setCurrentItem(index);
		}
	};

	// 页卡切换监听
	public class VpOnPageChangeListener implements OnPageChangeListener {

		@Override
		public void onPageSelected(int index) {
			Animation animation = null;
			int fromX=currIndex*imgWidth;
			int toX=index*imgWidth;
			animation = new TranslateAnimation(fromX, toX, 0, 0);
			tvAccount.setTextColor(getResources().getColor(
					R.color.titlebar_bottom_line_1));
			tvMobile.setTextColor(getResources().getColor(
					R.color.titlebar_bottom_line_2));

//			switch (index) {
//			case 0:
//				animation = new TranslateAnimation(imgWidth, 0, 0, 0);
//				tvAccount.setTextColor(getResources().getColor(
//						R.color.titlebar_bottom_line_1));
//				tvMobile.setTextColor(getResources().getColor(
//						R.color.titlebar_bottom_line_2));
//				break;
//			case 1:
//				animation = new TranslateAnimation(offset, imgWidth, 0, 0);
//				tvAccount.setTextColor(getResources().getColor(
//						R.color.titlebar_bottom_line_2));
//				tvMobile.setTextColor(getResources().getColor(
//						R.color.titlebar_bottom_line_1));
//				break;
//			case 2:
//				break;
//			case 3:
//				break;
//			}
			currIndex = index;
			animation.setFillAfter(true);// True:图片停在动画结束位置
			animation.setDuration(300);
			ivCursor.startAnimation(animation);
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}
	}
	
	
}
