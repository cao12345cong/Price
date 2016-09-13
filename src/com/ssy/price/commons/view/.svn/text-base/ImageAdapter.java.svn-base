package com.ssy.price.commons.view;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView.ScaleType;

public class ImageAdapter extends BaseAdapter {
	private Context _context;
	private ArrayList<Drawable> _imgList;

	public ImageAdapter(Context context, ArrayList<Drawable> imgList) {
		_context = context;
		_imgList = imgList;
	}

	public int getCount() {
		return Integer.MAX_VALUE;
	}

	public Object getItem(int position) {

		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = null;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			ImageView imageView = new ImageView(_context);
			imageView.setAdjustViewBounds(true);
			imageView.setScaleType(ScaleType.FIT_XY);
			imageView.setLayoutParams(new Gallery.LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			convertView = imageView;
			viewHolder.imageView = (ImageView) convertView;
			convertView.setTag(viewHolder);

		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.imageView.setImageDrawable(_imgList.get(position
				% _imgList.size()));

		return convertView;
	}

	private static class ViewHolder {
		ImageView imageView;
	}
}
