package com.gooodfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MenuAdapter(listMakanan,this));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Kue",
                "Rp. 65.000",
                "Kue adalah kudapan atau makanan ringan yang bukan makanan utama. Kue biasanya bercita rasa manis atau ada pula yang gurih dan asin. Kue sering kali diartikan sebagai makanan ringan yang dibuat dari adonan tepung, baik tepung beras, tepung sagu, tapioka, ataupun terigu. Kue tradisional Nusantara lazim ditemukan di Indonesia, Malaysia, Singapura, serta Belanda melalui hubungan sejarahnya dengan Indonesia.",
                R.drawable.cake));

        listMakanan.add(new Makanan("Permen",
                " Rp. 20.000",
                "Permen (bahasa Inggris: candy) adalah makanan berkalori tinggi yang pada umumnya berbahan dasar gula, air, dan sirup fruktosa.[1] Tingginya kadar gula dalam permen membuatnya diklaim sebagai salah satu penyebab gigi berlubang.Kue adalah kudapan atau makanan ringan yang bukan makanan utama.",
                R.drawable.candy));

        listMakanan.add(new Makanan("Cokelat",
                "Rp. 35.000",
                "Cokelat umumnya diberikan sebagai hadiah atau bingkisan pada hari ulang tahun dan hari raya. Dengan bentuk, corak, dan rasa yang unik, cokelat sering digunakan sebagai ungkapan terima kasih, simpati, atau perhatian bahkan sebagai pernyataan cinta. Cokelat juga telah menjadi salah satu rasa yang paling populer di dunia. Selain dikonsumsi paling umum dalam bentuk cokelat batangan, cokelat juga menjadi bahan minuman hangat dan dingin.",
                R.drawable.choco));

        listMakanan.add(new Makanan("Es Krim",
                "Rp. 12.000",
                "Es krim adalah sebuah makanan beku yang dibuat dari produk susu seperti krim, lalu dicampur dengan perasa dan pemanis buatan ataupun alami. Campuran ini didinginkan dengan diaduk sambil mengurangi suhunya untuk mencegah pembentukan es batu. Suhu dikurangi dengan menaruh campuran es krim ke sebuah wadah yang dimasukkan ke dalam campuran es pecah dan garam. Garam membuat air cair dapat berada di bawah titik beku air murni, membuat wadah tersebut mendapat sentuhan merata dengan air dan es tersebut.",
                R.drawable.icecream)) ;
    }
}