package com.example.jhon.punto1.Util;

import com.example.jhon.punto1.models.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhon on 10/09/16.
 */
public class DataProduct {
    private static List<Product> data;
    public static List<Product> getData(){
        if (data == null){
            data = new ArrayList<>();
        }
        return data;
    }
}
