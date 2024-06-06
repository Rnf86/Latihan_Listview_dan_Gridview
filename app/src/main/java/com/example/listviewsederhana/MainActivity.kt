package com.example.listviewsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.ListView)
        var list = mutableListOf<Universitas>()


        list.add(Universitas("Universitas Indonesia","Universitas peringkat 1 di Indonesia",
            R.drawable.upi1))
        list.add(Universitas("Universitas Gadjah Mada","Universitas peringkat 2 di Indonesia",
            R.drawable.ungad2))
        list.add(Universitas("Universitas Brawijaya","Universitas peringkat 3 di Indonesia",
            R.drawable.unbra3))
        list.add(Universitas("Universitas Airlangga","Universitas peringkat 4 di Indonesia",
            R.drawable.unair4))
        list.add(Universitas("Universitas Sebelas Maret","Universitas peringkat 5 di Indonesia",
            R.drawable.usm5))
        list.add(Universitas("Universitas Syiah Kuala","Universitas peringkat 6 di Indonesia",
            R.drawable.usk6))

        listView.adapter = UnivAdapter(this, R.layout.listuniversitas, list)

    }
}