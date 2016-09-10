package com.example.jhon.punto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.jhon.punto1.Util.DataProduct;
import com.example.jhon.punto1.adapters.ListProductAdapter;
import com.example.jhon.punto1.models.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Toolbar toolbar;
    ListView list;
    ListProductAdapter adapter;
    List<Product> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList<>();
        //reggion setear valores
        Product product = new Product();
        product.setPrecio("2000");
        product.setMarca("Mazdaa");
        product.setImg("http://www.elheraldo.co/sites/default/files/styles/detalle_articulo/public/2016/02/15/articulo/new-sail-sedan.jpg?itok=SG68F0SP");
        product.setNombre("carro");
        data.add(product);

        Product product2 = new Product();
        product2.setPrecio("2500");
        product2.setMarca("doña chepa");
        product2.setImg("https://s6.postimg.io/67h3wzlep/dulces.jpg");
        product2.setNombre("dulces");
        data.add(product2);

        DataProduct.getData().addAll(data);


        //endregion
        adapter = new ListProductAdapter(data,this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        list = (ListView) findViewById(R.id.list);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Productos");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        startActivity(new Intent(this,DetailActivity.class).putExtra("index",i));
    }
}
