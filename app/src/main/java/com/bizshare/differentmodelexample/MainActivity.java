package com.bizshare.differentmodelexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    ArrayList<String> arrayList = new ArrayList<>();
    Button button, button2;
    User user;
    Emp emp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RecyclerView rv_card = findViewById(R.id.rv_card);
        rv_card.setLayoutManager(new LinearLayoutManager(this));

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(MainActivity.this, arrayList);
        rv_card.setAdapter(recyclerAdapter);
        //button = findViewById(R.id.button);
        //button2 = findViewById(R.id.button2);

        //button.setOnClickListener(this);
        //button2.setOnClickListener(this);

        user = new User("User", "user@mail.com");
        emp = new Emp("e123", "edesig");
    }

    private void getdata(Object object){
        if(object instanceof User) {
            Log.e(TAG, ((User) object).getName());
        }else{
            Log.e(TAG, ((Emp) object).getEmpcode());
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            getdata(user);
        }
        if(v.getId()==R.id.button2){
            getdata(emp);
        }
    }
}
