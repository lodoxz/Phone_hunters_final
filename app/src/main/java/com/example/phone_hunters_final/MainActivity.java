package com.example.phone_hunters_final;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.phone_hunters_final.database.Smartphone;
import com.example.phone_hunters_final.database.SmartphoneDao;
import com.example.phone_hunters_final.database.SmartphoneData;
import com.example.phone_hunters_final.database.SmartphoneDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);










    }



    public void onClick(View view) {
        Intent intent = new Intent(this, Home_page.class);
       startActivity(intent);


    }



}