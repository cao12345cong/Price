package com.ssy.price.view.member;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
	private ArrayList<Fragment> fragmentsList;
	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	public MyFragmentPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> fragments) {
        super(fragmentManager);
        this.fragmentsList = fragments;
    }
	
	@Override
	public Fragment getItem(int arg0) {
		return fragmentsList.get(arg0);
	}

	@Override
	public int getCount() {
		return fragmentsList.size();
	}
	public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }
}
