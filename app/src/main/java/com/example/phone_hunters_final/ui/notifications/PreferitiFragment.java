package com.example.phone_hunters_final.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phone_hunters_final.Home_page;
import com.example.phone_hunters_final.R;
import com.example.phone_hunters_final.adapters.SmartphoneAdapter;

import com.example.phone_hunters_final.database.Smartphone;
import com.example.phone_hunters_final.database.SmartphoneData;
import com.example.phone_hunters_final.database.SmartphoneDatabase;

import java.util.ArrayList;
import java.util.List;

public class PreferitiFragment extends Fragment {
    

    private PreferitiViewModel preferitiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        preferitiViewModel =
                new ViewModelProvider(this).get(PreferitiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_preferiti, container, false);


        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //SmartphoneDatabase db = SmartphoneDatabase.getInstance(this.getContext());
        //db.smartphoneDao().insertAll(SmartphoneData.populateSmartphoneData());
        //ListView listView = view.findViewById(R.id.list);
       // List<Smartphone>  SmartphoneList = db.smartphoneDao().getAllSmartphones();
       // SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(SmartphoneList, getActivity());
       // listView.setAdapter(smartphoneAdapter);






    }


}