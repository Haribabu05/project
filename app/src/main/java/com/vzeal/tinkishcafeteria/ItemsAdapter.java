package com.vzeal.tinkishcafeteria;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.VIEWHOLDER> {

    List<ItemsModel> itemsModelList;

    public ItemsAdapter(List<ItemsModel> itemsModelList) {
        this.itemsModelList = itemsModelList;
    }

    @NonNull
    @Override
    public ItemsAdapter.VIEWHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new VIEWHOLDER(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsAdapter.VIEWHOLDER holder, int position) {
        String name  = itemsModelList.get(position).getName();
        String price  = itemsModelList.get(position).getPrice();
        String img  = itemsModelList.get(position).getImg();
        holder.setDat(name,img,price);
    }

    @Override
    public int getItemCount() {
        return itemsModelList.size();
    }

    public class VIEWHOLDER extends RecyclerView.ViewHolder {

        TextView nameTV,PRICETV;
        ImageView IMG;

        public VIEWHOLDER(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.textView5);
            IMG = itemView.findViewById(R.id.imageView);
            PRICETV = itemView.findViewById(R.id.textVie5);

        }
        void setDat(String name,String img,String price){
            nameTV.setText(name);
            IMG.setImageDrawable(Drawable.createFromPath(img));
            PRICETV.setText("₹ "+price);
        }
    }
}
