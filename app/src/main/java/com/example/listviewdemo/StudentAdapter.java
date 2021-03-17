package com.example.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Student> mDataSource;

    public StudentAdapter(Context obj, ArrayList list){
        mContext = obj;
        mDataSource = list;
        mInflator = (LayoutInflater) mContext.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
    }


    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflator.inflate(R.layout.list_view_row, parent, false);

        TextView StudentFNameView = rowView.findViewById(R.id.first_name);
        TextView StudentLNameView = rowView.findViewById(R.id.last_name);
        TextView majorNameView = rowView.findViewById(R.id.major);

        Student student = (Student) getItem(position);
        StudentFNameView.setText(student.getFname());
        StudentLNameView.setText(student.getLname());
        majorNameView.setText(student.getmajor());

        return rowView;
    }
}
