package com.example.jhon.punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jhon.punto1.Util.DataProduct;
import com.example.jhon.punto1.models.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DetailActivity extends AppCompatActivity {
    List<Product> data;
    TextView nombre,precio,marca;
    Toolbar toolbar;
    ImageView img;
    Bundle bundle;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Detalle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bundle = getIntent().getExtras();
        nombre = (TextView) findViewById(R.id.nombre);
        precio = (TextView) findViewById(R.id.precio);
        marca = (TextView) findViewById(R.id.marca);
        img = (ImageView) findViewById(R.id.imagen);
        i = bundle.getInt("index");
        nombre.setText(DataProduct.getData().get(i).getNombre());
        precio.setText(DataProduct.getData().get(i).getPrecio());
        marca.setText(DataProduct.getData().get(i).getMarca());
        Picasso.with(this).load(DataProduct.getData().get(i).getImg()).into(img);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }
}
