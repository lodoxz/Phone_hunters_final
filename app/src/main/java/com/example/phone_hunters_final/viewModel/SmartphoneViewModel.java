package com.example.phone_hunters_final.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.phone_hunters_final.database.Smartphone;
import com.example.phone_hunters_final.repository.SmartphoneRepository;

import java.util.List;

public class SmartphoneViewModel extends AndroidViewModel {
    private SmartphoneRepository repository;
    private List<Smartphone> allFilteredSmartphones;

    public SmartphoneViewModel(@NonNull Application application, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15, String s16, String s17, String s18, String s19, String s20, String s21, String s22, String s23, String s24, String s25, String s26, String s27, String s28, String s29, Double r1start, Double r2start, Double r3start, Double r4start, Double r1finish, Double r2finish, Double r3finish, Double r4finisih, String s30, String s31, String s32, String s33, String s34, String s35, String s36, String s37, String s38, String s39 ) {
        super(application);
        repository = new SmartphoneRepository(application, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, r1start, r2start, r3start, r4start, r1finish, r2finish, r3finish, r4finisih, s30, s31, s32, s33, s34, s35, s36, s37, s38, s39 );

    }

    public void insert(Smartphone[] smartphones){
        repository.insert(smartphones);
    }

    public List<Smartphone> getFilteredSmartphones(){
       allFilteredSmartphones = repository.getFilteredSMartphones();
       return allFilteredSmartphones;
    }

    public List<Smartphone> getAllSmartphones(){
        allFilteredSmartphones = repository.getAllSmartphone();
        return allFilteredSmartphones;
    }
}
