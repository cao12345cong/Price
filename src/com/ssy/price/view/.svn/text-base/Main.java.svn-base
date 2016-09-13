package com.ssy.price.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ssy.price.R;
import com.ssy.price.commons.view.BaseActivity;
import com.ssy.price.commons.view.ImageGallery;
import com.ssy.price.commons.view.ImageAdapter;
import com.ssy.price.view.member.LoginActivity;
import com.ssy.price.view.member.Member;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Main extends BaseActivity {

	TextView tvTitle;
	ImageView ivMember;

	private LinearLayout ll_focus_indicator_container = null;
	private ImageGallery gallery = null;
	private ArrayList<Drawable> imgList = new ArrayList<Drawable>();
	private int preSelImgIndex = 0;// 存储上一个选择项的Index

	GridView gvSudoku;
	int[] imgs = new int[] { R.drawable.zhuyetubiao_1,
			R.drawable.zhuyetubiao_2, R.drawable.zhuyetubiao_3,
			R.drawable.zhuyetubiao_4, R.drawable.zhuyetubiao_5,
			R.drawable.zhuyetubiao_6, R.drawable.zhuyetubiao_7,
			R.drawable.zhuyetubiao_8, R.drawable.zhuyetubiao_9,
			R.drawable.zhuyetubiao_10, R.drawable.zhuyetubiao_11,
			R.drawable.zhuyetubiao_12 };
	String[] texts = new String[] { "价格行情", "分析预测", "优质供应商", "应季农产品", "食品安全",
			"食材食谱", "我的评论", "历史浏览", "我的评论", "我的留言", "二维码扫描", "用户反馈" };
	List<HashMap<String, Object>> lstSudoku = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// 设置标题
		tvTitle = (TextView) findViewById(R.id.tvTitle);
		tvTitle.setText("深圳-福田农批市场");

		// 进入会员中心，未登录则进入登录页
		ivMember = (ImageView) findViewById(R.id.ivMember);
		ivMember.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				member();
			}
		});

		// startService(new Intent(this, MessagePushService.class));

		InitImgList();
		ll_focus_indicator_container = (LinearLayout) findViewById(R.id.ll_focus_indicator_container);
		InitFocusIndicatorContainer();
		gallery = (ImageGallery) findViewById(R.id.banner_gallery);
		gallery.setAdapter(new ImageAdapter(this, imgList));
		gallery.setFocusable(true);
		gallery.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int selIndex, long arg3) {
				// 修改上一次选中项的背景
				selIndex = selIndex % imgList.size();
				ImageView preSelImg = (ImageView) ll_focus_indicator_container
						.findViewById(preSelImgIndex);
				preSelImg.setImageDrawable(Main.this.getResources()
						.getDrawable(R.drawable.ic_focus));
				// 修改当前选中项的背景
				ImageView curSelImg = (ImageView) ll_focus_indicator_container
						.findViewById(selIndex);
				curSelImg.setImageDrawable(Main.this.getResources()
						.getDrawable(R.drawable.ic_focus_select));
				preSelImgIndex = selIndex;
			}

			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
		HashMap<String, Object> map = null;
		lstSudoku = new ArrayList<HashMap<String, Object>>();
		for (int i = 0; i < imgs.length; i++) {
			map = new HashMap<String, Object>();
			map.put("itemText", texts[i]);
			map.put("itemImage", imgs[i]);
			lstSudoku.add(map);
		}

		gvSudoku = (GridView) findViewById(R.id.gvSudoku);
		SimpleAdapter sa = new SimpleAdapter(this, lstSudoku,
				R.layout.main_items, new String[] { "itemText", "itemImage" },
				new int[] { R.id.tvText, R.id.ivImg });
		gvSudoku.setAdapter(sa);
	}

	private void member() {
		boolean isLogin = false;
		Intent intent = null;
		if (isLogin) {
			intent = new Intent(Main.this, Member.class);
		} else {
			intent = new Intent(Main.this, LoginActivity.class);
		}
		startActivity(intent);
	}

	public static float dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (dpValue * scale + 0.5f);
	}

	public static float px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (pxValue / scale + 0.5f);
	}

	private void InitFocusIndicatorContainer() {
		for (int i = 0; i < imgList.size(); i++) {
			ImageView localImageView = new ImageView(this);
			localImageView.setId(i);
			ImageView.ScaleType localScaleType = ImageView.ScaleType.FIT_XY;
			localImageView.setScaleType(localScaleType);
			LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(
					24, 24);
			localImageView.setLayoutParams(localLayoutParams);
			localImageView.setPadding(5, 5, 5, 5);
			localImageView.setImageResource(R.drawable.ic_focus);
			this.ll_focus_indicator_container.addView(localImageView);
		}
	}

	private void InitImgList() {
		imgList.add(this.getResources().getDrawable(R.drawable.img1));
		imgList.add(this.getResources().getDrawable(R.drawable.img2));
		imgList.add(this.getResources().getDrawable(R.drawable.img3));
		imgList.add(this.getResources().getDrawable(R.drawable.img4));
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		gallery.destroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.itemExit:
			System.exit(0);
			return true;
		}
		return false;
	}
}
