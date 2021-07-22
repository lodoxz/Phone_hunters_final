package com.example.phone_hunters_final;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.phone_hunters_final.ui.home.HomeFragment;
import com.example.phone_hunters_final.ui.notifications.PreferitiFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.slider.RangeSlider;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.List;

public class Home_page extends AppCompatActivity {













    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_login)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        RangeSlider r1 = findViewById(R.id.r1);
        RangeSlider r2 = findViewById(R.id.r2);
        RangeSlider r3 = findViewById(R.id.r3);
        RangeSlider r4 = findViewById(R.id.r4);
        TextView t1 = findViewById(R.id.t1);
        TextView t2 = findViewById(R.id.t2);
        TextView t3 = findViewById(R.id.t3);
        TextView t4 = findViewById(R.id.t4);
        TextView t5 = findViewById(R.id.t5);
        TextView t6 = findViewById(R.id.t6);
        TextView t7 = findViewById(R.id.t7);
        TextView t8 = findViewById(R.id.t8);

r1.addOnChangeListener(new RangeSlider.OnChangeListener() {
    @Override
    public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
        List<Float> f;
        f = r1.getValues();
        t1.setText(String.valueOf(f.get(0)));
        t2.setText(String.valueOf(f.get(1)));

    }
});

        r2.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                List<Float> f;
                f = r2.getValues();
                t3.setText(String.valueOf(f.get(0)));
                t4.setText(String.valueOf(f.get(1)));

            }
        });

        r3.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                List<Float> f;
                f = r3.getValues();
                t5.setText(String.valueOf(f.get(0)));
                t6.setText(String.valueOf(f.get(1)));

            }
        });

        r4.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                List<Float> f;
                f = r4.getValues();
                t7.setText(String.valueOf(f.get(0)));
                t8.setText(String.valueOf(f.get(1)));

            }
        });



    }


    public void onClick1(View view) {

        Intent intent = new Intent(this, ActivityRegistrati.class);
        startActivity(intent);

    }

    public void onClick2(View view) {
        ChipGroup gruppo1;
        gruppo1=findViewById(R.id.gruppo1);
        gruppo1.clearCheck();
        ChipGroup gruppo2;
        gruppo2=findViewById(R.id.gruppo2);
        gruppo2.clearCheck();



    }

    public void onClick3(View view) {
        ChipGroup gruppo1;
        gruppo1=findViewById(R.id.gruppo3);
        gruppo1.clearCheck();
        ChipGroup gruppo2;
        gruppo2=findViewById(R.id.gruppo4);
        gruppo2.clearCheck();

    }

    public void onClick4(View view) {
        ChipGroup gruppo1;
        gruppo1=findViewById(R.id.gruppo5);
        gruppo1.clearCheck();
        ChipGroup gruppo2;
        gruppo2=findViewById(R.id.gruppo6);
        gruppo2.clearCheck();



    }

    public void onClick5(View view){
        Chip c1 = findViewById(R.id.chip4);
        Chip c2 = findViewById(R.id.chip5);
        Chip c3 = findViewById(R.id.chip6);
        Chip c4 = findViewById(R.id.chip7);
        Chip c5 = findViewById(R.id.chip26);
        Chip c6 = findViewById(R.id.chip27);
        Chip c7 = findViewById(R.id.chip28);
        Chip c8 = findViewById(R.id.chip29);
        Chip c9 = findViewById(R.id.chip30);
        Chip c10 = findViewById(R.id.chip31);
        Chip c11 = findViewById(R.id.chip32);
        Chip c12 = findViewById(R.id.chip8);
        Chip c13 = findViewById(R.id.chip9);
        Chip c14 = findViewById(R.id.chip10);
        Chip c15 = findViewById(R.id.chip11);
        Chip c16 = findViewById(R.id.chip12);
        Chip c17 = findViewById(R.id.chip13);
        Chip c18 = findViewById(R.id.chip14);
        Chip c19 = findViewById(R.id.chip15);
        Chip c20 = findViewById(R.id.chip16);
        Chip c21 = findViewById(R.id.chip17);
        Chip c22 = findViewById(R.id.chip18);
        Chip c23 = findViewById(R.id.chip19);
        Chip c24 = findViewById(R.id.chip20);
        Chip c25 = findViewById(R.id.chip21);
        Chip c26 = findViewById(R.id.chip22);
        Chip c27 = findViewById(R.id.chip23);
        Chip c28 = findViewById(R.id.chip24);
        Chip c29 = findViewById(R.id.chip25);
        Chip c30 = findViewById(R.id.chipimm1);
        Chip c31 = findViewById(R.id.chipimm2);
        Chip c32 = findViewById(R.id.chipimm3);
        Chip c33 = findViewById(R.id.chipimm4);
        Chip c34 = findViewById(R.id.chipimm5);
        Chip c35 = findViewById(R.id.chipimm6);
        Chip c36 = findViewById(R.id.chipimm7);
        Chip c37 = findViewById(R.id.chipimm8);
        Chip c38 = findViewById(R.id.chipimm9);
        Chip c39 = findViewById(R.id.chipimm10);
        RangeSlider r1 = findViewById(R.id.r1);
        RangeSlider r2 = findViewById(R.id.r2);
        RangeSlider r3 = findViewById(R.id.r3);
        RangeSlider r4 = findViewById(R.id.r4);
        String s1=null;
        String s2=null;
        String s3=null;
        String s4=null;
        String s5=null;
        String s6=null;
        String s7=null;
        String s8=null;
        String s9=null;
        String s10=null;
        String s11=null;
        String s12=null;
        String s13=null;
        String s14=null;
        String s15=null;
        String s16=null;
        String s17=null;
        String s18=null;
        String s19=null;
        String s20=null;
        String s21=null;
        String s22=null;
        String s23=null;
        String s24=null;
        String s25=null;
        String s26=null;
        String s27=null;
        String s28=null;
        String s29=null;

        String s30=null;
        String s31=null;
        String s32=null;
        String s33=null;
        String s34=null;
        String s35=null;
        String s36=null;
        String s37=null;
        String s38=null;
        String s39=null;


        List<Float> f1;
        List<Float> f2;
        List<Float> f3;
        List<Float> f4;
        Double r1start;
        Double r2start;
        Double r3start;
        Double r4start;
        Double r1finish;
        Double r2finish;
        Double r3finish;
        Double r4finish;

        f1 = r1.getValues();
        f2 = r2.getValues();
        f3 = r3.getValues();
        f4 = r4.getValues();

        r1start = Double.valueOf(f1.get(0));
        r1finish = Double.valueOf(f1.get(1));
        r2start = Double.valueOf(f2.get(0));
        r2finish = Double.valueOf(f2.get(1));
        r3start = Double.valueOf(f3.get(0));
        r3finish = Double.valueOf(f3.get(1));
        r4start = Double.valueOf(f4.get(0));
        r4finish = Double.valueOf(f4.get(1));



        if(c1.isChecked()) {
            s1 = (String) c1.getText();
        }
        if(c2.isChecked()) {
            s2 = (String) c2.getText();
        }
        if(c3.isChecked()) {
            s3 = (String) c3.getText();
        }
        if(c4.isChecked()) {
            s4 = (String) c4.getText();
        }
        if(c5.isChecked()) {
            s5 = (String) c5.getText();
        }
        if(c6.isChecked()) {
            s6 = (String) c6.getText();
        }
        if(c7.isChecked()) {
            s7 = (String) c7.getText();
        }
        if(c8.isChecked()) {
            s8 = (String) c8.getText();
        }
        if(c9.isChecked()) {
            s9 = (String) c9.getText();
        }
        if(c10.isChecked()) {
            s10 = (String) c10.getText();
        }
        if(c11.isChecked()) {
            s11 = (String) c11.getText();
        }
        if(c12.isChecked()) {
            s12 = (String) c12.getText();
        }
        if(c13.isChecked()) {
            s13 = (String) c13.getText();
        }
        if(c14.isChecked()) {
            s14 = (String) c14.getText();
        }
        if(c15.isChecked()) {
            s15 = (String) c15.getText();
        }
        if(c16.isChecked()) {
            s16 = (String) c16.getText();
        }
        if(c17.isChecked()) {
            s17 = (String) c17.getText();
        }
        if(c18.isChecked()) {
            s18 = (String) c18.getText();
        }
        if(c19.isChecked()) {
            s19 = (String) c19.getText();
        }
        if(c20.isChecked()) {
            s20 = (String) c20.getText();
        }
        if(c21.isChecked()) {
            s21 = (String) c21.getText();
        }
        if(c22.isChecked()) {
            s22 = (String) c22.getText();
        }
        if(c23.isChecked()) {
            s23 = (String) c23.getText();
        }
        if(c24.isChecked()) {
            s24 = (String) c24.getText();
        }
        if(c25.isChecked()) {
            s25 = (String) c25.getText();
        }
        if(c26.isChecked()) {
            s26 = (String) c26.getText();
        }
        if(c27.isChecked()) {
            s27 = (String) c27.getText();
        }
        if(c28.isChecked()) {
            s28 = (String) c28.getText();
        }
        if(c29.isChecked()) {
            s29 = (String) c29.getText();
        }
        if(c30.isChecked()) {
            s30 = (String) c30.getText();
        }
        if(c31.isChecked()) {
            s31 = (String) c31.getText();
        }
        if(c32.isChecked()) {
            s32 = (String) c32.getText();
        }
        if(c33.isChecked()) {
            s33 = (String) c33.getText();
        }
        if(c34.isChecked()) {
            s34 = (String) c34.getText();
        }
        if(c35.isChecked()) {
            s35 = (String) c35.getText();
        }
        if(c36.isChecked()) {
            s36 = (String) c36.getText();
        }
        if(c37.isChecked()) {
            s37 = (String) c37.getText();
        }
        if(c38.isChecked()) {
            s38 = (String) c38.getText();
        }
        if(c39.isChecked()) {
            s39 = (String) c39.getText();
        }



        Intent intent = new Intent(this, Risultati_ricerca.class);
        intent.putExtra("tipo_display1", s1);
        intent.putExtra("tipo_display2", s2);
        intent.putExtra("tipo_display3", s3);
        intent.putExtra("tipo_display4", s4);
        intent.putExtra("risoluzione_schermo1", s5);
        intent.putExtra("risoluzione_schermo2", s6);
        intent.putExtra("risoluzione_schermo3", s7);
        intent.putExtra("risoluzione_schermo4", s8);
        intent.putExtra("risoluzione_schermo5", s9);
        intent.putExtra("risoluzione_schermo6", s10);
        intent.putExtra("risoluzione_schermo7", s11);
        intent.putExtra("memoria_massa1", s12);
        intent.putExtra("memoria_massa2", s13);
        intent.putExtra("memoria_massa3", s14);
        intent.putExtra("memoria_massa4", s15);
        intent.putExtra("memoria_massa5", s16);
        intent.putExtra("memoria_massa6", s17);
        intent.putExtra("memoria_massa7", s18);
        intent.putExtra("memoria_massa8", s19);
        intent.putExtra("memoria_massa9", s20);
        intent.putExtra("memoria_ram1", s21);
        intent.putExtra("memoria_ram2", s22);
        intent.putExtra("memoria_ram3", s23);
        intent.putExtra("memoria_ram4", s24);
        intent.putExtra("memoria_ram5", s25);
        intent.putExtra("memoria_ram6", s26);
        intent.putExtra("memoria_ram7", s27);
        intent.putExtra("memoria_ram8", s28);
        intent.putExtra("memoria_ram9", s29);

        intent.putExtra("marca1", s30);
        intent.putExtra("marca2", s31);
        intent.putExtra("marca3", s32);
        intent.putExtra("marca4", s33);
        intent.putExtra("marca5", s34);
        intent.putExtra("marca6", s35);
        intent.putExtra("marca7", s36);
        intent.putExtra("marca8", s37);
        intent.putExtra("marca9", s38);
        intent.putExtra("marca10", s39);



        intent.putExtra("valore_iniziale1", r1start);
        intent.putExtra("valore_iniziale2", r2start);
        intent.putExtra("valore_iniziale3", r3start);
        intent.putExtra("valore_iniziale4", r4start);
        intent.putExtra("valore_finale1", r1finish);
        intent.putExtra("valore_finale2", r2finish);
        intent.putExtra("valore_finale3", r3finish);
        intent.putExtra("valore_finale4", r4finish);


        startActivity(intent);
    }







}

