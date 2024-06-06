package com.example.listviewsederhana

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class UnivAdapter(var mContext: Context, var resources: Int, var items:List<Universitas> ): ArrayAdapter<Universitas>(mContext,resources, items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.iv_photo)
        val NamaUniversitas: TextView = view.findViewById(R.id.tv_namauniv)
        val Deskripsi: TextView = view.findViewById(R.id.tv_deskripsi)

        var mItem:Universitas = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        NamaUniversitas.text = mItem.nama
        Deskripsi.text = mItem.deskripsi

        return view
    }
}