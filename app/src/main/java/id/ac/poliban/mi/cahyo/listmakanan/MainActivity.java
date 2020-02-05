package id.ac.poliban.mi.cahyo.listmakanan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Makanan> makanans = new ArrayList<>();
    private ListView lvMakanan;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //koneksikan object dengan view
        lvMakanan = findViewById(R.id.listview);
//ambil data dari CountryData dan berikan ke object countries
        makanans.addAll(MakananData.getAllMakanan());
//buat object adapter dan kirim data countries sebagai
//parameter di konstruktor CountryAdapter()
        adapter = new MakananAdapter(makanans);
//pasang object adapter sebagai adapter lvCountry
        lvMakanan.setAdapter(adapter);
//menambahkan kejadian ketika user mengklik salah satu item
        lvMakanan.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Negara yang Anda Pilih")
                    .setMessage(makanans.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}
