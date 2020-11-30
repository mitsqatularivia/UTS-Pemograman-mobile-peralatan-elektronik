package com.Mitsqa.katalogperalatanelektronik;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.Mitsqa.katalogperalatanelektronik.barang.Kulkas;
import com.Mitsqa.katalogperalatanelektronik.barang.Peralatan;
import com.Mitsqa.katalogperalatanelektronik.barang.Setrika;
import com.Mitsqa.katalogperalatanelektronik.barang.Mesincuci;


public class DataProvider {
    private static List<Peralatan> peralatans = new ArrayList<>();

    private static List<Kulkas> initDataKulkas(Context ctx) {
        List<Kulkas> kulkas = new ArrayList<>();
        kulkas.add(new Kulkas("Sanken Kulkas Satu Pintu SK-V163F-BK JADETABEK ONLY", "Rp1.530.000",
                "Warna Body : Black\n" +
                        "Warna Pintu : Black\n" +
                        "Pintu PCM / VCM : -\n" +
                        "Pintu Kaca (Tempered Glass) : Ya\n" +
                        "Pegangan Pintu : Ya\n" +
                        "Dinding HD (High Density) : Ya\n" +
                        "Jenis Rak : -\n" +
                        "Cooliing System : Direct Cooling", R.drawable.kulkas1));
        kulkas.add(new Kulkas("Polytron Belleza Kulkas 2 Pintu PRM 21 Garansi Resmi", "Rp2.716.000",
                "FITUR :\n" +
                        "- Door : Double Doors\n" +
                        "- Ice Twist Tray : Yes\n" +
                        "- Egg Pocket : Yes\n" +
                        "- 360 Multiflow : LED Lighting\n" +
                        "- Tempered glass rack : Yes\n" +
                        "- Tempered glass door : Yes", R.drawable.kulkas2));
        kulkas.add(new Kulkas("Kulkas Sharp 1 Pintu Kirei 166 ND Defrost", "Rp1.500.000",
                "Big Freezer: Ukuran Freezer Yang Besar\n" +
                        "Direct Colling System: Sistem pendinginan langsung yang memungkinkan pendinginan yang cepat\n" +
                        "2 Sliding shelf: Dilengkapi dengan dua rak geser\n" +
                        "Control Box: Kotak Pengontrol", R.drawable.kulkas3));
        kulkas.add(new Kulkas("Realme C11 Garansi Resmi - 2GB-32GB, Abu-abu", "Rp1.599.000",
                "Deskripsi Realme C11 Garansi Resmi - 2GB-32GB, Abu-abu" +
                        "Chipset : MediaTek Helio G35 (12 nm)" +
                        "Intern : 32GB RAM 2GB" +
                        "Baterai : Li-Po 5000 mAh yang tidak dapat dilepas", R.drawable.kulkas4));
        return kulkas;
    }

    private static List<Mesincuci> initDataMesincuci(Context ctx) {
        List<Mesincuci> mesincucis = new ArrayList<>();
        mesincucis.add(new Mesincuci("Sanken TW-1122GX Mesin Cuci 2 tabung 9KG", "Rp1.779.000",
                "Spesifikasi :\n" +
                        "Warna Panel Atas : White\n" +
                        "Warna Penutup Atas : Blue\n" +
                        "Warna Panel Kontrol : White\n" +
                        "Warna Bodi Kabinet : White\n" +
                        "Tipe Penutup Atas : Solid", R.drawable.mesincuci1));
        mesincucis.add(new Mesincuci("SHARP SEMI AUTO WASHER EST77FP 7kg Mesincuci 2 Tabung garansi resmi", "Rp2.179.000 ",
                "Barang Baru & Original 100%\n" +
                        "*Garansi Termasuk Spare Part & Service 5tahun\n" +
                        "*Kami Juga Memliki Toko Off Line Di Daerah Cipondoh kota tangerang\n" +
                        "*Pilihan pengiriman memakai GO-SEND\n" +
                        "*Estimasi Pengiriman Max 1-3 Hari Setelah Transaksi", R.drawable.mesincuci2));
        mesincucis.add(new Mesincuci("SAMSUNG MESINCUCI TOP LOADING 7,5Kg WA75H4200SG/SE GARANSI RESMI", "Rp1.209.000",
                "Type : WA75H4200SG\n" +
                        "Washing Capacity (kg) : 7.5\n" +
                        "Body color : Abu-2\n" +
                        "Spin Speed : 700 Rpm\n" +
                        "Drum type : Diamond Drum", R.drawable.mesincuci3));
        mesincucis.add(new Mesincuci("Sanken TW-883EPK Mesin Cuci 2 Tabung 7KG", "Rp2.658.000",
                "Spesifikasi :\n" +
                        "Warna Panel Atas : Black\n" +
                        "Warna Penutup Atas : Pink\n" +
                        "Warna Panel Kontrol : Transparant\n" +
                        "Warna Bodi Kabinet : White\n" +
                        "Tipe Penutup Atas : Solid", R.drawable.mesincuci4));
        return mesincucis;
    }
    private static List<Setrika> initDataSetrika(Context ctx) {
        List<Setrika> setrikas = new ArrayList<>();
        setrikas.add(new Setrika("Philips Dry Iron - HD1173/80", "Rp649.000",
                "Detail:\n" +
                        "- Tapak setrika keramik\n" +
                        "- Daya 350W\n" +
                        "- Panjang kabel 1,7 m", R.drawable.setrika1));
        setrikas.add(new Setrika("Gosokan - Setrika Uap WEIJIE Geser WJ-600H Grade AAA", "Rp665.000",
                "Cocok Digunakan untuk Tabung Uap :\n" +
                        "- Naomoto\n" +
                        "- Nagamoto\n" +
                        "- Toyomoto\n" +
                        "- Maomoto", R.drawable.setrika2));
        setrikas.add(new Setrika("Philips HD-1172 Setrika Dry Iron / Gosokan HD1772 / Garansi Resmi ORI", "Rp299.900",
                "Philips HD1172 adalah setrika listrik yang fungsional sehingga Anda dapat dengan mudah menyetrika pakaian.", R.drawable.setrika3));
        setrikas.add(new Setrika("PHILIPS Dry Iron GC160/27 - Setrika GC 160 GC160 Garansi Resmi", "Rp600.000",
                "Detail\n" +
                        "- Daya 350 Watt\n" +
                        "- Tegangan: 220-240\n" +
                        "- Panjang Kabel: 1.8 meter", R.drawable.setrika4));
        return setrikas;
    }

    private static void initAllPeralatans(Context ctx) {
        peralatans.addAll(initDataSetrika(ctx));
        peralatans.addAll(initDataKulkas(ctx));
        peralatans.addAll(initDataMesincuci(ctx));
    }

    public static List<Peralatan> getAllPeralatan(Context ctx) {
        if (peralatans.size() == 0) {
            initAllPeralatans(ctx);
        }
        return  peralatans;
    }

    public static List<Peralatan> getPeralatanByTipe(Context ctx, String merek) {
        List<Peralatan> peralatansByType = new ArrayList<>();
        if (peralatans.size() == 0) {
            initAllPeralatans(ctx);
        }
        for (Peralatan h : peralatans) {
            if (h.getMerek().equals(merek)) {
                peralatansByType.add(h);
            }
        }
        return peralatansByType;
    }

}
