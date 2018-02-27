package com.tatar.smellslikebakin;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mobile on 27.02.2018.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Recipes.names.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView itemImg;
        public TextView itemTxt;

        public ViewHolder(View itemView) {
            super(itemView);

            itemImg = itemView.findViewById(R.id.itemImg);
            itemTxt = itemView.findViewById(R.id.itemTxt);

            itemView.setOnClickListener(this);
        }

        public void bindView(int position) {
            itemImg.setImageResource(Recipes.resourceIds[position]);
            itemTxt.setText(Recipes.names[position]);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
