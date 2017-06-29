package com.example.lilittevosyan.materialtestapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by LilitTevosyan on 6/13/17.
 */

public class ItemAdapter<GridItem> extends ArrayAdapter {
	private LayoutInflater inflater = null;


	public ItemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
		super(context, resource, objects);
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item, parent, false);
		} else {
			ImageView item = (ImageView) convertView.findViewById(R.id.grid_item);
			item.setImageResource(R.mipmap.ic_launcher);
		}
		return convertView;
	}
}
