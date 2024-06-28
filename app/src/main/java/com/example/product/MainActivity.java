package com.example.product;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout addProduct, editProduct, viewProduct, deleteProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addProduct = findViewById(R.id.addproduct);
        editProduct = findViewById(R.id.editproduct);
        viewProduct = findViewById(R.id.viewproduct);
        deleteProduct = findViewById(R.id.deleteproduct);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I have been clicked!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), AddProduct.class));
            }
        });
        editProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I have been clicked!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), EditProduct.class));
            }
        });
        viewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I have been clicked!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), ViewProduct.class));
            }
        });
        deleteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I have been clicked!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), DeleteProduct.class));

            }
        });
    }

    }



