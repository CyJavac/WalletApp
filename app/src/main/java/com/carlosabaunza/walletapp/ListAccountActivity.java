package com.carlosabaunza.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();

    private RecyclerView myRecycleAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myRecycleAccount = findViewById(R.id.rv_list_accounts);
        AccountAdapter myAdapter = new AccountAdapter(listAccountRV);
        myRecycleAccount.setAdapter(myAdapter);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));


    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia","Cuenta de ahorros", 12345600.0);
        Account myAccount2 = new Account("Davivienda","Cuenta debito", 1684442.0);
        Account myAccount3 = new Account("Efectivo","Efectivo", 1646444.0);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }




}