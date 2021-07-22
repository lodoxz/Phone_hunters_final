package com.example.phone_hunters_final.database;

import com.example.phone_hunters_final.R;

public class SmartphoneData {
    public static Smartphone[] populateSmartphoneData() {
            return new Smartphone[]{
                    new Smartphone(1, "IPHONE 11", "APPLE", 6.0, "IPS", "HD", "32GB", "8GB", 16.0, 16.0, 1000.0,900.00, R.drawable.iphone_11_jpg, R.string.link_iphone_11),
                    new Smartphone(2, "IPHONE 12", "APPLE", 5.1, "OLED", "HD+", "64GB", "4GB", 12.0, 12.0, 2815.0, 799.00, R.drawable.iphone_12_jpg, R.string.link_iphone_12),
                    new Smartphone(3, "IPHONE XR", "APPLE", 6.1, "IPS", "HD", "64GB", "4GB", 12.0, 7.0, 2942.0, 619.00, R.drawable.iphone_xr, R.string.link_iphone_xr),
                    new Smartphone(4, "IPHONE XS", "APPLE", 5.8, "OLED", "HD+", "256GB", "4GB", 12.0, 7.0, 2658.0, 649.00, R.drawable.iphone_xs, R.string.link_iphone_xs),
                    new Smartphone(5, "IPHONE 12 MINI", "APPLE", 5.4, "IPS", "HD+", "32GB", "4GB", 12.0, 12.0, 2227, 699, R.drawable.iphone_12_mini, R.string.link_iphone_12),
                    new Smartphone(6, "GALAXY S21", "SAMSUNG", 6.2, "AMOLED", "FULL HD+", "128GB", "8GB", 12.0, 10.0, 4000, 879, R.drawable.s21, R.string.link_s21),
                    new Smartphone(7, "GALAXY S21 ULTRA", "SAMSUNG", 6.8, "AMOLED", "QHD+","128GB", "12GB", 50, 40 , 5000, 1279.00, R.drawable.s21ultra, R.string.link_s21ultra),
                    new Smartphone(8, "GALAXY NOTE20", "SAMSUNG", 6.7, "SUPERAMOLED", "FULL HD+", "256GB", "8GB", 12.0, 10.0, 4300, 699.00, R.drawable.note20, R.string.link_note20),
                    new Smartphone(9, "GALAXY Z FOLD2", "SAMSUNG", 7.6, "AMOLED", "FULL HD+", "256GB", "12GB", 12.0, 10.0, 4500, 1849, R.drawable.zfold2, R.string.link_zfold2),
                    new Smartphone(10,"GALAXY Z FLIP", "SAMSUNG", 6.7, "AMOLED", "FULL HD+", "256GB", "8GB", 12.0, 10.0, 3300, 1399, R.drawable.zflip, R.string.link_zflip ),
                    new Smartphone(11, "VELVET", "LG", 6.8, "OLED", "FULL HD+", "128GB", "6GB", 48.0, 16.0, 4300, 399, R.drawable.lgvelvet, R.string.link_velvet),
                    new Smartphone(12,"WING", "LG", 6.8, "OLED", "FULL HD+", "128GB", "8GB", 64.0, 32.0, 4000, 1299, R.drawable.lgwing, R.string.link_wing ),
                    new Smartphone(13, "PIXEL 4A", "GOOGLE", 5.8, "OLED", "FULL HD+", "128GB", "6GB", 12.0, 8.0, 3140.0, 389.0, R.drawable.pixel_4a, R.string.link_pixel),
                    new Smartphone(14, "G100", "MOTOROLA", 6.7, "IPS", "FULL HD+", "128GB", "8GB", 64.0, 16.0, 5000.0, 499.0, R.drawable.moto_g100, R.string.link_g100),
                    new Smartphone(15, "RAZER", "MOTOROLA", 6.2, "OLED", "HD+", "256GB", "8GB", 48.0, 29.0, 2510.0, 1599.0, R.drawable.moto_razr, R.string.link_razr),
                    new Smartphone(16, "P40 PRO", "HUAWEI", 6.6, "OLED", "QHD", "256GB", "8GB", 50.0, 32.0, 4200.0, 1049.0, R.drawable.p40pro, R.string.link_p40pro),
                    new Smartphone(17, "MATE 40 PRO", "HUAWEI", 6.8, "OLED", "FULL HD+", "256GB", "8GB", 50.0, 13.0, 4400.0, 1249.0, R.drawable.mate_40_pro, R.string.link_mate40pro),
                    new Smartphone(18, "MI 11", "XIAOMI", 6.8, "AMOLED", "QHD+", "128GB", "8GB", 50.0, 20.0, 4600.0, 799.0, R.drawable.mi11, R.string.link_mi11),
                    new Smartphone(19, "REDMI NOTE 10", "XIAOMI", 6.4, "AMOLED", "FULL HD+", "128GB", "4GB", 48.0, 12.0, 5000.0, 229.0, R.drawable.redmi_note_10, R.string.link_note10),
                    new Smartphone(20, "ZENPHONE 8", "ASUS",5.9, "AMOLED", "FULL HD+", "128GB", "8GB", 49.0, 12.0, 4000.0, 699.0, R.drawable.zenfone8, R.string.link_zenphone8 ),
                    new Smartphone(21, "ROG PHONE", "ASUS", 6.8, "AMOLED", "FULL HD+", "128GB", "8GB", 54.0, 24.0, 6000.0, 799.0, R.drawable.rog_phone, R.string.link_rog ),
                    new Smartphone(22, "RENO 5", "OPPO", 6.4, "AMOLED", "FULL HD+", "128GB", "8GB", 50.0, 32.0, 4350.0,299.0,  R.drawable.reno5, R.string.link_reno5)



            };
    }
}

