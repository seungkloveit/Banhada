package com.banhada_manager.Member;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SlidingDrawer;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.banhada_manager.R;

import java.util.ArrayList;

public class mmrcvAdapter extends RecyclerView.Adapter<mmrcvAdapter.ViewHolder> {

    static ArrayList<memberinfo> data = new ArrayList<memberinfo>();
    static Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView id;
        TextView tel;
        TextView mail;
/*        TextView addr;
        SlidingDrawer sd;
        RelativeLayout rl;*/

        ViewHolder(View itemview) {
            super(itemview);
            name = itemview.findViewById(R.id.mmname);
            id = itemview.findViewById(R.id.mmid);
            tel = itemview.findViewById(R.id.mmtel);
            mail = itemview.findViewById(R.id.mmmail);
/*            addr = itemview.findViewById(R.id.addr);
            sd = itemview.findViewById(R.id.sliding_drawer);
            rl = itemview.findViewById(R.id.rl);*/

        }
        public void setItem(memberinfo mi){
            name.setText(mi.mname);
            id.setText(mi.mid);
            tel.setText(mi.mphone);
            mail.setText(mi.mmail);
            /*            addr.setText(mi.maddr);*/

        }
    }

    mmrcvAdapter(Context context) {
        this.context = context;
    }

    @Override
    public mmrcvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.member_management_rcv, parent, false);
        mmrcvAdapter.ViewHolder vh = new mmrcvAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(mmrcvAdapter.ViewHolder holder, int position) {
        memberinfo mi = data.get(position);
        holder.setItem(mi);
    }

    @Override
    public int  getItemCount(){
        return data.size();
    }

    public void addItem(memberinfo m) {
        data.add(m);
    }

    public void setData(ArrayList<memberinfo> data) {
        this.data = data;
    }

    public void setItem(int position, memberinfo m) {
        data.set(position,m);
    }

    public memberinfo getItem(int position) {
        return data.get(position);
    }
}

