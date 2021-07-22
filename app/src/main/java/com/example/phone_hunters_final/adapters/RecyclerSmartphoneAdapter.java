package com.example.phone_hunters_final.adapters;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phone_hunters_final.R;
import com.example.phone_hunters_final.database.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class RecyclerSmartphoneAdapter extends RecyclerView.Adapter<RecyclerSmartphoneAdapter.SmartphoneHolder> {
private List<Smartphone> smartphones = new ArrayList<>();

    @NonNull
    @Override
    public SmartphoneHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.slot_ricerca, parent, false);
        return new SmartphoneHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SmartphoneHolder holder, int position) {
        Smartphone currentSmartphone = smartphones.get(position);
        holder.textViewModello.setText(currentSmartphone.getModello());
        holder.textViewLink.setText(currentSmartphone.getLink());
        holder.textViewLink.setMovementMethod(LinkMovementMethod.getInstance());
        holder.textViewPrezzo.setText(currentSmartphone.getPrezzo().toString());
        holder.immagine.setImageResource(currentSmartphone.getImg());

    }

    @Override
    public int getItemCount() {
        return smartphones.size();
    }

    public void setSmartphones(List<Smartphone> smartphones){
        this.smartphones=smartphones;
        notifyDataSetChanged();
    }

    class SmartphoneHolder extends RecyclerView.ViewHolder{
        private TextView textViewModello;
        private TextView textViewLink;
        private TextView textViewPrezzo;
        private ImageView immagine;

        public SmartphoneHolder( View itemView) {
            super(itemView);
            textViewModello = itemView.findViewById(R.id.textView14);
            textViewLink = itemView.findViewById(R.id.textView16);
            textViewPrezzo = itemView.findViewById(R.id.textView15);
            immagine = itemView.findViewById(R.id.imageList);
        }
    }

}
