package edu.temple.assignment3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    String[] colors;
    Context c;

    public ColorAdapter(Context c, String[] colors){//constructor
        this.colors = colors;
        this.c = c;
    }

    @Override
    public int getCount(){ //returns count of how many colors
        return colors.length;
    }
    @Override
    public Object getItem(int i){
        return colors[i]; //position of specified color
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    public View getView(int pos, View v, ViewGroup vg){
        TextView textview = new TextView(c);
        if (v == null){
            textview = new TextView(c);
        }
        else{
            textview = (TextView) v;
        }
        textview.setText(colors[pos]);
        textview.setBackgroundColor(Color.parseColor(colors[pos])); //sets background to selected color

        return textview;
    }



}
