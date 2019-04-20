package com.example.batupermata;

import java.util.ArrayList;

public class PermataData{
    public static String[][] data = new String[][]{
            {"Batu Kecubung", "Batu Mineral Kuasa", "http://3.bp.blogspot.com/-8DA524bu5m8/VL1voWSmEPI/AAAAAAAADBc/ilzl4djv_GQ/s1600/Harga%2Bbatu%2Bkecubung%2Bkasihan.jpg"},
            {"Batu Delima", "Batu Mineral Silikat", "http://selingkaran.com/wp-content/uploads/2014/08/batu-delima-merah-2-500x300.jpg"},
            {"Intan", "Mineral Kimia berbentuk Kristal", "https://orori-telin.akamaized.net/images.orori.com/news/2016/04/14/4b556e2dee5f91af20576a09324ef354ef344df0.jpg"},
            {"Chalcedony", "Kriptokristalin dari Silika", "https://rawa-bening.com/3045-13392-large_default/grey-green-chalcedony-1180-carat.jpg"},
            {"Giok", "Batu Permata Berwarna Hijau", "https://storage.googleapis.com/manfaat/2017/11/756d0837-manfaat-batu-giok-aceh.jpg"},
            {"Kuarsa", "Mineral Kimia berbentuk Silika Trigonal", "http://cdn2.tstatic.net/manado/foto/bank/images/batu-kuarsa222_20150519_220054.jpg"},
            {"Mutiara", "Jaringan Lunak Moluska Hidup", "https://cdn3.volusion.com/rwhao.mcoqv/v/vspfiles/photos/SNOWPEARL-2.jpg"}
    };

    public static ArrayList<Permata> getListData(){
        Permata permata = null;
        ArrayList<Permata> list = new ArrayList<>();
        for (String[] aData : data) {
            permata = new Permata();
            permata.setName(aData[0]);
            permata.setRemarks(aData[1]);
            permata.setPhoto(aData[2]);

            list.add(permata);
        }

        return list;
    }
}
