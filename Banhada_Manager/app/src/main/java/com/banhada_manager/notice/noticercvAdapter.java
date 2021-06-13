package com.banhada_manager.notice;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.banhada_manager.R;

import java.util.ArrayList;

public class noticercvAdapter extends RecyclerView.Adapter<noticercvAdapter.ViewHolder> {

    static ArrayList<notice_record> data = new ArrayList<notice_record>();
    static Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView date;

        public void setItem(notice_record mi){
            title.setText(mi.title);
            date.setText(mi.date);

        }

        ViewHolder(View itemview) {
            super(itemview);
            title = itemview.findViewById(R.id.ntitle);
            date = itemview.findViewById(R.id.ndate);

        }
    }

    noticercvAdapter(Context context) {
        this.context = context;
    }

    @Override
    public noticercvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.notice_rcv, parent, false);
        noticercvAdapter.ViewHolder vh = new noticercvAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(noticercvAdapter.ViewHolder holder, int position) {
        notice_record nr = data.get(position);
        holder.setItem(nr);
    }

    @Override
    public int  getItemCount(){
        return data.size();
    }

    public void addItem(notice_record m) {
        data.add(m);
    }

    public void setData(ArrayList<notice_record> data) {
        this.data = data;
    }

    public void setItem(int position, notice_record m) {
        data.set(position,m);
    }

    public notice_record getItem(int position) {
        return data.get(position);
    }
}