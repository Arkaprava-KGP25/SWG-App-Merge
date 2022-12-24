package com.example.apphomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


     public CardView noticeboard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       noticeboard = (CardView)  findViewById(R.id.noticeboard);

       noticeboard.setOnClickListener(this);
    }








    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.noticeboard :
                i = new Intent(this,mentorMentee.class);
                startActivity(i);
                break;
        }
    }
}