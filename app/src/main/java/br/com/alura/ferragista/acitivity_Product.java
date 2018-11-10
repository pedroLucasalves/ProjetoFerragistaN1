package br.com.alura.ferragista;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class acitivity_Product extends AppCompatActivity {

    private String NomeCliente;
    private int parafuso;
    private int porcas;
    private int ruela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }

    public void vender(View view) {


    }

    public void addProduto(View view) {
        Intent telaItem = new Intent(getApplicationContext(),ItemProduto.class);
        startActivity(telaItem);
    }
}
