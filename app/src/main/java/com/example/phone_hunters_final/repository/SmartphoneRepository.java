package com.example.phone_hunters_final.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.phone_hunters_final.database.Smartphone;
import com.example.phone_hunters_final.database.SmartphoneDao;
import com.example.phone_hunters_final.database.SmartphoneDatabase;

import java.util.List;

public class SmartphoneRepository {
    private SmartphoneDao smartphoneDao;
    private List<Smartphone> allSmartphone;

    String s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    String s7;
    String s8;
    String s9;
    String s10;
    String s11;
    String s12;
    String s13;
    String s14;
    String s15;
    String s16;
    String s17;
    String s18;
    String s19;
    String s20;
    String s21;
    String s22;
    String s23;
    String s24;
    String s25;
    String s26;
    String s27;
    String s28;
    String s29;
    String s30;
    String s31;
    String s32;
    String s33;
    String s34;
    String s35;
    String s36;
    String s37;
    String s38;
    String s39;
    Double r1start;
    Double r2start;
    Double r3start;
    Double r4start;
    Double r1finish;
    Double r2finish;
    Double r3finish;
    Double r4finisih;

    public SmartphoneRepository(Application application, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15, String s16, String s17, String s18, String s19, String s20, String s21, String s22, String s23, String s24, String s25, String s26, String s27, String s28, String s29, Double r1start, Double r2start, Double r3start, Double r4start, Double r1finish, Double r2finish, Double r3finish, Double r4finisih, String s30, String s31, String s32, String s33, String s34, String s35, String s36, String s37, String s38, String s39) {


        SmartphoneDatabase db = SmartphoneDatabase.getInstance(application);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.s10 = s10;
        this.s11 = s11;
        this.s12 = s12;
        this.s13 = s13;
        this.s14 = s14;
        this.s15 = s15;
        this.s16 = s16;
        this.s17 = s17;
        this.s18 = s18;
        this.s19 = s19;
        this.s20 = s20;
        this.s21 = s21;
        this.s22 = s22;
        this.s23 = s23;
        this.s24 = s24;
        this.s25 = s25;
        this.s26 = s26;
        this.s27 = s27;
        this.s28 = s28;
        this.s29 = s29;
        this.s30 = s30;
        this.s31 = s31;
        this.s32 = s32;
        this.s33 = s33;
        this.s34 = s34;
        this.s35 = s35;
        this.s36 = s36;
        this.s37 = s37;
        this.s38 = s38;
        this.s39 = s39;
        this.r1start = r1start;
        this.r2start = r2start;
        this.r3start = r3start;
        this.r4start = r4start;
        this.r1finish = r1finish;
        this.r2finish = r2finish;
        this.r3finish = r3finish;
        this.r4finisih = r4finisih;
        smartphoneDao = db.smartphoneDao();
       // allSmartphone = smartphoneDao.getAllSmartphones();
    }

    public void insert(Smartphone[] smartphones){

        smartphoneDao.insertAll(smartphones);


    }

    public List<Smartphone> getFilteredSMartphones(){

        allSmartphone = smartphoneDao.getFilteredSmartphones(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, r1start, r2start, r3start, r4start, r1finish, r2finish, r3finish, r4finisih, s30, s31, s32, s33, s34, s35, s36, s37, s38, s39);
        return allSmartphone;
    }

    public List<Smartphone> getAllSmartphone(){
        allSmartphone = smartphoneDao.getAllSmartphones();
        return allSmartphone;
    }
}
