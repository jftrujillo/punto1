package com.example.jhon.punto1.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jhon.punto1.R;
import com.example.jhon.punto1.models.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jhon on 10/09/16.
 */
public class ListProductAdapter extends BaseAdapter{
    List<Product> data;
    Context context;

    public ListProductAdapter(List<Product> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null){
            v =View.inflate(context, R.layout.template_list_product,null);
        }
        ImageView img = (ImageView) v.findViewById(R.id.imagen);
        TextView  nombre = (TextView) v.findViewById(R.id.nombre);
        TextView precio = (TextView) v.findViewById(R.id.precio);
        TextView marca = (TextView) v.findViewById(R.id.marca);

        nombre.setText(data.get(i).getNombre());
        precio.setText(data.get(i).getPrecio());
        marca.setText(data.get(i).getMarca());
        Picasso.with(context).load(data.get(i).getImg()).into(img);
        return v;
    }
}
