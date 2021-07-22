package com.example.phone_hunters_final.adapters;

import android.app.Activity;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;

import com.example.phone_hunters_final.R;
import com.example.phone_hunters_final.Risultati_ricerca;
import com.example.phone_hunters_final.database.Smartphone;

import java.util.List;

public class SmartphoneAdapter extends BaseAdapter {

    private List<Smartphone> smartphoneList;
    Context context;
    //private Activity activity;

    public SmartphoneAdapter(List<Smartphone> smartphoneList, Context context) {
        this.smartphoneList = smartphoneList;
        this.context = context;

        //this.activity = activity;
    }

    @Override
    public int getCount() {
        return smartphoneList.size();
    }

    @Override
    public Smartphone getItem(int i) {
        return smartphoneList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            //convertView = activity.getLayoutInflater().inflate(R.layout.slot_ricerca, parent, false);
            convertView=inflater.inflate(R.layout.slot_ricerca, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.textView14)).setText(this.getItem(i).getModello());
        ((TextView) convertView.findViewById(R.id.textView16)).setText(this.getItem(i).getLink());
        ((TextView) convertView.findViewById(R.id.textView15)).setText(this.getItem(i).getPrezzo().toString()+"$");
        ((TextView) convertView.findViewById(R.id.textView16)).setMovementMethod(LinkMovementMethod.getInstance());
        ((ImageView) convertView.findViewById(R.id.imageList)).setImageResource(this.getItem(i).getImg());

        ((CardView) convertView.findViewById(R.id.cardSlot)).setVisibility(View.VISIBLE);
        return convertView;
    }
}
