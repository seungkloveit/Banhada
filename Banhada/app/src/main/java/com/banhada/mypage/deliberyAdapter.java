package com.banhada.mypage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.banhada.R;

import java.util.ArrayList;

public class deliberyAdapter extends RecyclerView.Adapter<deliberyAdapter.ViewHolder> {

    static ArrayList<delivery_record> data = new ArrayList<delivery_record>();
    static Context context;
    TextView name, ordernum,state;
    ImageView imageView;
    Button detail,sch, review;

    public class ViewHolder extends RecyclerView.ViewHolder {


        ViewHolder(View itemview) {
            super(itemview);
            name = itemview.findViewById(R.id.productname);
            imageView = itemview.findViewById(R.id.productimg);
            ordernum = itemview.findViewById(R.id.ordernum);
            state = itemview.findViewById(R.id.state);
            detail = itemview.findViewById(R.id.detail);
            sch = itemview.findViewById(R.id.sch);
            review = itemview.findViewById(R.id.reviewbtn);

        }

        public void setItem(delivery_record mi){

            name.setText(mi.name);
            ordernum.setText(mi.ordernum);
            state.setText(mi.state);
            imageView.setImageResource(mi.imageView);
        }
    }

    deliberyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public deliberyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.delivery_rcv, parent, false);
        deliberyAdapter.ViewHolder vh = new deliberyAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(deliberyAdapter.ViewHolder holder, int position) {

        delivery_record nr = data.get(position);
        holder.setItem(nr);
        if(nr.state.equals("배송완료"))
            review.setVisibility(View.VISIBLE);
    }

    @Override
    public int  getItemCount(){
        return data.size();
    }

    public void addItem(delivery_record m) {
        data.add(m);
    }

    public void setData(ArrayList<delivery_record> data) {
        this.data = data;
    }

    public void setItem(int position, delivery_record m) {
        data.set(position,m);
    }

    public delivery_record getItem(int position) {
        return data.get(position);
    }
}
