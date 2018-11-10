package br.com.alura.ferragista;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ferragista extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ferragista);
    }

    public void TelaProduct(View view) {
        Intent telaProduct = new Intent(getApplicationContext(), acitivity_Product.class);
        startActivity(telaProduct);
    }
}
