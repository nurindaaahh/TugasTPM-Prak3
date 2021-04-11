package com.example.listblog;

import java.util.ArrayList;

public class MoviesData {
    private static String[] movieNames = {
            "Mangkujiwo",
            "Dua Garis Biru",
            "The Raid",
            "Cek Toko Sebelah",
            "Aruna dan Lidahnya",
            "Laskar Pelangi",
            "Love for Sale",
            "Dignitate",
            "Aku Tau Kapan Kamu Mati",
            "Mariposa"
    };

    private static String[] movieDetails = {
          "Mangkujiwo merupakan film horor arahan Azhar Kinoi Lubis yang tayang pada Januari 2020 ini. Sebagai prekuel sekaligus penyambung seri Kuntilanak, film ini mengisahkan tentang asal-usul dari hadirnya kuntilanak yang meneror dari seri film yang dibintangi Julie Estelle dan sekuelnya yang diperankan oleh para anak kecil. Film tersebut juga sekaligus mengangkat cerita mengenai kehadiran sekte Mangkujiwo yang kerap disebut di seri legendaris ini",
            "Tayangan layar lebar satu ini menceritakan tentang kehidupan anak sekolah yang tokoh utamanya adalah Bima (Angga Aldi Yunanda) dan Dara (Adhisty Zara). Keduanya adalah siswa SMU yang menjalin hubungan percintaan.  Namun, masalah terjadi ketika keduanya melakukan hal yang di luar batas pacaran. Alhasil semuanya menjadi runyam. Keduanya pernah saling tidak bertegur sapa sampai berpikiran untuk menggugurkan kandungan.",
            "Sinema layar lebar ini mengulas tentang Rama dan Jaka yang berada di dalam kelompok polisi elit. Mereka berdua menyerang apartemen di Jakarta untuk menangkap seseorang yang jadi incaran selama ini, yaitu Tama Riyadi. Namun, penyerangan mereka tidak berjalan seperti yang diharapkan. Mereka harus menghadapi anak buah beserta panglima tempur dari bos penjahat tersebut.",
            "Menceritakan tentang seorang ayah yang mengelola toko miliknya. Ia mempunyai dua orang anak bernama Erwin dan Yohan. Erwin merupakan anak kesayangan sang ayah, karena mempunyai otak yang pintar dan bekerja di perusahaan besar. Sedangkan Yohan kurang disenangi oleh ayahnya karena pekerjaannya yang itu-itu saja. Namun, akhir cerita sangat tidak disangka, karena tidak sesuai dengan yang ditebak oleh para penonton.",
            "Film Indonesia ini menceritakan tentang persahabatan dua wanita dan dua pria yang kehidupannya suka jalan-jalan dan juga mencicipi beragam kuliner. Mereka berjalan-jalan ke banyak tempat, seperti Jakarta, Surabaya, Pamekasan, Pontianak, dan Singkawang. Selain itu, film ini juga berfokus dengan penyelidikan kasus flu burung yang dilakukan oleh dua orang di antara mereka.",
            "Sinema ini menceritakan mengenai perjuangan anak-anak Belitung yang akhirnya bisa menikmati bangku sekolah. Anak-anak tersebut mempunyai karakter masing-masing yang membuat film ini semakin hidup.",
            "Love For Sale yang mengangkat tema percintaan di era digital. Di mana Richard merupakan seorang jomblo akut karena terlalu pemilih dalam menentukan pasangan. Pada suatu hari, dirinya ditantang oleh kawannya yang hendak menikah, bahwa ia disuruh untuk membawa pasangan ke pesta pernikahan. Kalau tidak, harga dirinya dipertaruhkan. ",
            "Film drama garapan fajar Nugros ini berhasil ditonton sebanyak 236.210 penonton. Film Dignitate menjadi salah satu film Indonesia yang diadaptasi dari novel Wattpad. Film ini dibintangi oleh Al Ghazali, Caitlin Halderman, dan Giorgino Abraham.",
            "Satu lagi film horor yang diadaptasi dari novel wattpad. Kali ini berjudul Aku Tahu Kapan Kamu Mati,  yang dibintangi oleh Natasha Wilona, Al Ghazali, dan Ria Ricis. Film garapan Hadrah Daeng Ratu ini rilis di awal Maret dan disaksikan 564.686 penonton, menduduki posisi kedelapan film Indonesia terlaris kuartal pertama tahun 2020.",
            "Baru tayang sebentar, film garapan Fajar Bustomi berhasil disaksikan 741.496 penonton. Film Mariposa tayang di bioskop sejak 12 Maret 2020, terpaksa harus mundur karena bioskop sedang tutup sementara. Semoga film yang dibintangi Adhisty Zara dan Angga Yunanda akan tayang kembali di bioskop."
    };

    private static int[] movieImages = {
            R.drawable.mangkujiwo,
            R.drawable.dua_garis_biru,
            R.drawable.the_raid,
            R.drawable.cek_toko_sebelah,
            R.drawable.arjuna_dan_lidahnya,
            R.drawable.laskar_pelangi,
            R.drawable.love_for_sale,
            R.drawable.dignitate,
            R.drawable.aku_tau_kapan_kamu_mati,
            R.drawable.mariposa
    };

    static ArrayList<MovieModel> getListData(){
        ArrayList<MovieModel> list = new ArrayList<>();
        for (int position = 0; position < movieNames.length; position++){
           MovieModel moviemodel = new MovieModel();
           moviemodel.setName(movieNames[position]);
           moviemodel.setDetail(movieDetails[position]);
           moviemodel.setPhoto(movieImages[position]);
           list.add(moviemodel);
        }
        return list;
    }
}
