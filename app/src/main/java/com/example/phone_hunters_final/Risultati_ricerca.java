package com.example.phone_hunters_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.phone_hunters_final.adapters.RecyclerSmartphoneAdapter;
import com.example.phone_hunters_final.adapters.SmartphoneAdapter;
import com.example.phone_hunters_final.database.Smartphone;
import com.example.phone_hunters_final.database.SmartphoneData;
import com.example.phone_hunters_final.database.SmartphoneDatabase;
import com.example.phone_hunters_final.repository.SmartphoneRepository;
import com.example.phone_hunters_final.viewModel.SmartphoneViewModel;

import java.util.List;

public class Risultati_ricerca extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risultati_ricerca);



        Bundle datipassati = getIntent().getExtras();
        String dato1 = datipassati.getString("tipo_display1");
        String dato2 = datipassati.getString("tipo_display2");
        String dato3 = datipassati.getString("tipo_display3");
        String dato4 = datipassati.getString("tipo_display4");
        String dato5 = datipassati.getString("risoluzione_schermo1");
        String dato6 = datipassati.getString("risoluzione_schermo2");
        String dato7 = datipassati.getString("risoluzione_schermo3");
        String dato8 = datipassati.getString("risoluzione_schermo4");
        String dato9 = datipassati.getString("risoluzione_schermo5");
        String dato10 = datipassati.getString("risoluzione_schermo6");
        String dato11 = datipassati.getString("risoluzione_schermo7");
        String dato12 = datipassati.getString("memoria_massa1");
        String dato13 = datipassati.getString("memoria_massa2");
        String dato14 = datipassati.getString("memoria_massa3");
        String dato15 = datipassati.getString("memoria_massa4");
        String dato16 = datipassati.getString("memoria_massa5");
        String dato17 = datipassati.getString("memoria_massa6");
        String dato18 = datipassati.getString("memoria_massa7");
        String dato19 = datipassati.getString("memoria_massa8");
        String dato20 = datipassati.getString("memoria_massa9");
        String dato21 = datipassati.getString("memoria_ram1");
        String dato22 = datipassati.getString("memoria_ram2");
        String dato23 = datipassati.getString("memoria_ram3");
        String dato24 = datipassati.getString("memoria_ram4");
        String dato25 = datipassati.getString("memoria_ram5");
        String dato26 = datipassati.getString("memoria_ram6");
        String dato27 = datipassati.getString("memoria_ram7");
        String dato28 = datipassati.getString("memoria_ram8");
        String dato29 = datipassati.getString("memoria_ram9");

        String dato30 = datipassati.getString("marca1");
        String dato31 = datipassati.getString("marca2");
        String dato32 = datipassati.getString("marca3");
        String dato33 = datipassati.getString("marca4");
        String dato34 = datipassati.getString("marca5");
        String dato35 = datipassati.getString("marca6");
        String dato36 = datipassati.getString("marca7");
        String dato37 = datipassati.getString("marca8");
        String dato38 = datipassati.getString("marca9");
        String dato39 = datipassati.getString("marca10");


        Double dator1start = datipassati.getDouble("valore_iniziale1");
        Double dator2start = datipassati.getDouble("valore_iniziale2");
        Double dator3start = datipassati.getDouble("valore_iniziale3");
        Double dator4start = datipassati.getDouble("valore_iniziale4");
        Double dator1finish = datipassati.getDouble("valore_finale1");
        Double dator2finish = datipassati.getDouble("valore_finale2");
        Double dator3finish = datipassati.getDouble("valore_finale3");
        Double dator4finish = datipassati.getDouble("valore_finale4");







            ListView listView = findViewById(R.id.list1);
            SmartphoneRepository r1 = new SmartphoneRepository(this.getApplication(), dato1, dato2, dato3, dato4, dato5, dato6, dato7, dato8, dato9, dato10, dato11, dato12, dato13, dato14, dato15, dato16, dato17, dato18, dato19, dato20, dato21, dato22, dato23, dato24, dato25, dato26, dato27, dato28, dato29, dator1start, dator2start, dator3start, dator4start, dator1finish, dator2finish, dator3finish, dator4finish, dato30, dato31, dato32, dato33, dato34, dato35, dato36, dato37, dato38, dato39);
       // r1.insert(SmartphoneData.populateSmartphoneData());
        List<Smartphone> SmartphoneList = r1.getFilteredSMartphones();
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(SmartphoneList, this);
        listView.setAdapter(smartphoneAdapter);


    }
}