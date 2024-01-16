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
        mLayoutInflater = LayoutInflater.from(mContext);
    }//end

    @Override
    public int getCount() {
        return sample.size();
    }

    @Override
    public SampleData getItem(int i) {
        return sample.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        View view = mLayoutInflater.inflate(R.layout.listview_custom, null);
        return view;
    }
}//class END










