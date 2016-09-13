package com.ssy.price.view.member;

import com.ssy.price.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LoginMobileFragment extends Fragment{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_mobile, container, false);
        return view;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
