package com.example.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomSpin extends BaseAdapter {
    private Context context;
    private int flags[];
    private String names[];
    private String capitals[];
    private LayoutInflater inflater;
    public CustomSpin(Context context, int[] images, String[] stringsList,String[] capitals) {
        this.context = context;
        this.flags = images;
        this.names = stringsList;
        this.capitals=capitals;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
