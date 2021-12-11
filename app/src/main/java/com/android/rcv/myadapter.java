package com.android.rcv;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.holder>
{
    List<data> list1List;
    Context ct;
    public myadapter(Context ct,List<data> list1List)
    {
        this.list1List = list1List;
        this.ct=ct;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.title.setText(list1List.get(position).getTitle());
        holder.des.setText(list1List.get(position).getDes());
        Glide.with(ct).load(list1List.get(position).getImg_url())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return list1List.size();
    }




    class holder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView img;
        TextView title,des;
        public holder(@NonNull View itemView) {
            super(itemView);

            title=(TextView)itemView.findViewById(R.id.title);
            des=(TextView)itemView.findViewById(R.id.des);
            img=(ImageView) itemView.findViewById(R.id.pic);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
           /* int position=getAdapterPosition();
            Toast.makeText(ct,"position"+position,Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(ct,MainActivity2.class);
            ct.startActivity(intent);
*/
        }
    }
}
