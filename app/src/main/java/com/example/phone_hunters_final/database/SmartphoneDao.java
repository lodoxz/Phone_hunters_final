package com.example.phone_hunters_final.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SmartphoneDao {

    @Query("SELECT * FROM smartphone WHERE ((`tipo di display`=:s1  or `tipo di display`=:s2 or  `tipo di display`=:s3 or  `tipo di display`=:s4)OR(:s1 IS NULL AND :s2 IS NULL AND :s3 IS NULL AND :s4 IS NULL) ) AND ((`risoluzione schermo`=:s5 or  `risoluzione schermo`=:s6 or `risoluzione schermo`=:s7 or  `risoluzione schermo`=:s8 or  `risoluzione schermo`=:s9 or `risoluzione schermo`=:s10 or `risoluzione schermo`=:s11)OR(:s5 IS NULL AND :s6 IS NULL AND :s7 IS NULL AND :s8 IS NULL AND :s9 IS NULL AND :s10 IS NULL AND :s11 IS NULL)) AND ((`memoria di massa`=:s12 or `memoria di massa`=:s13 or `memoria di massa`=:s14 or `memoria di massa`=:s15 or `memoria di massa`=:s16 or `memoria di massa`=:s17 or `memoria di massa`=:s18 or `memoria di massa`=:s19 or `memoria di massa`=:s20)OR(:s12 IS NULL AND :s13 IS NULL AND :s14 IS NULL AND :s15 IS NULL AND :s16 IS NULL AND :s17 IS NULL AND :s18 IS NULL AND :s19 IS NULL AND :s20 IS NULL))AND((`memoria ram`=:s21 or `memoria ram`=:s22 or `memoria ram`=:s23 or `memoria ram`=:s24 or `memoria ram`=:s25 or `memoria ram`=:s26 or `memoria ram`=:s27 or `memoria ram`=:s28 or `memoria ram`=:s29)OR(:s21 IS NULL AND :s22 IS NULL AND :s23 IS NULL AND :s24 IS NULL AND :s25 IS NULL AND :s26 IS NULL AND :s27 IS NULL AND :s28 IS NULL AND :s29 IS NULL)) AND (`dimensioni display`>= :r1start AND `dimensioni display`<= :r1finish) AND (`fotocamera esterna`>= :r2start AND `fotocamera esterna`<= :r2finish) AND (`fotocamera interna`>= :r3start AND `fotocamera interna`<= :r3finish) AND (batteria>= :r4start AND batteria <= :r4finisih)AND((marca=:s30 or marca=:s31 or marca=:s32 or marca=:s33 or marca=:s34 or marca=:s35 or marca=:s36 or marca=:s37 or marca=:s38 or marca=:s39)OR(:s30 IS NULL AND :s31 IS NULL AND :s32 IS NULL AND :s33 IS NULL AND :s34 IS NULL AND :s35 IS NULL AND :s36 IS NULL AND :s37 IS NULL AND :s38 IS NULL AND :s39 IS NULL)) ")
    List<Smartphone> getFilteredSmartphones(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15, String s16, String s17, String s18, String s19, String s20, String s21, String s22, String s23, String s24, String s25, String s26, String s27, String s28, String s29, Double r1start, Double r2start, Double r3start, Double r4start, Double r1finish, Double r2finish, Double r3finish, Double r4finisih, String s30, String s31, String s32, String s33, String s34, String s35, String s36, String s37, String s38, String s39);


    @Query("SELECT * FROM smartphone WHERE marca='APPLE'")
    List<Smartphone> getAllSmartphones();

    @Insert
    void insertAll(Smartphone[] smartphones);
}
