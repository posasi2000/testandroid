package com.example.mytwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class SKUAdapter extends BaseAdapter {
    Context mContext = null ;
    LayoutInflater mLayoutInflater = null ;
    ArrayList<SampleData> sample ;
    Integer[ ]  posterID ={ };
    String[ ] posterName = { };

    public SKUAdapter(Context mContext, ArrayList<SampleData> sample) {
        this.mContext = mContext;
        this.sample = sample;
    }//end

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        View view = mLayoutInflater.inflate(R.layout.listview_custom, null);
        return null;
    }
}//class END










