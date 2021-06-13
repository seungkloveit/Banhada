package com.banhada.mypage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.banhada.R;

import java.util.ArrayList;

public class reviewAdapter extends RecyclerView.Adapter<reviewAdapter.ViewHolder> {

    static ArrayList<review_record> data = new ArrayList<review_record>();
    static Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView content;
        Button del;
        Button mod;
        ImageView imageView;
        RatingBar ratingBar;


        ViewHolder(View itemview) {
            super(itemview);
            content = itemview.findViewById(R.id.rvcontent);
            del = itemview.findViewById(R.id.reviewdel);
            mod = itemview.findViewById(R.id.reviewmod);
            imageView = itemview.findViewById(R.id.reviewimg);
            ratingBar = itemview.findViewById(R.id.ratingBar);
        }

        public void setItem(review_record mi){
            content.setText(mi.content);
            imageView.setImageResource(mi.imageView);
            ratingBar.setRating(mi.rating);
        }
    }

    reviewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public reviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.review_rcv, parent, false);
        reviewAdapter.ViewHolder vh = new reviewAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(reviewAdapter.ViewHolder holder, int position) {
        review_record nr = data.get(position);
        holder.setItem(nr);
    }

    @Override
    public int  getItemCount(){
        return data.size();
    }

    public void addItem(review_record m) {
        data.add(m);
    }

    public void setData(ArrayList<review_record> data) {
        this.data = data;
    }

    public void setItem(int position, review_record m) {
        data.set(position,m);
    }

    public review_record getItem(int position) {
        return data.get(position);
    }
}
