package com.example.jhon.punto1.models;

import com.orm.SugarRecord;

/**
 * Created by jhon on 10/09/16.
 */
public class Product{
    String img;
    String nombre;
    String marca;
    String precio;


    public Product() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


}
