package com.example.apphomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

      //code of start for slider defining various things for slider
    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass> CDC_Placements;
    ArrayList<ChildModelClass> CDC_Internships;
    ArrayList<ChildModelClass> KnowYourDepartment;

     public CardView noticeboard; //code of the noticeboard that renders to another activity




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); //hiding action bar for slider



        //here pasted the code of shubham in which he has taken up two recycler views one in another
        recyclerView=findViewById(R.id.rv_parent);
        childModelClassArrayList=new ArrayList<>();
        CDC_Placements=new ArrayList<>();
        CDC_Internships= new ArrayList<>();
        KnowYourDepartment= new ArrayList<>();
        parentModelClassArrayList= new ArrayList<>();
        ParentAdapter parentAdapter;

        CDC_Placements.add(new ChildModelClass(R.drawable.img));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_1));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_2));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_3));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_4));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_5));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_6));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_7));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("CDC Placements",CDC_Placements));

        CDC_Internships.add(new ChildModelClass(R.drawable.img));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_1));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_2));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_3));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_4));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_5));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_6));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_7));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("CDC Internships",CDC_Internships));

        KnowYourDepartment.add(new ChildModelClass(R.drawable.img));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_1));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_2));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_3));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_4));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_5));
//        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_6));
//        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_7));
//        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("Know Your Department",KnowYourDepartment));


        childModelClassArrayList.clear();
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_1));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_2));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_3));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_4));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_5));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_6));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_7));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("Institute ID Benefits",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Study Material",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("General Fundae",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("List Of Socities",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Academic Information",childModelClassArrayList));

        parentAdapter=new ParentAdapter(parentModelClassArrayList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();


       //again the noticeboard activity code i have founf noticeboard page from here
       noticeboard = (CardView)  findViewById(R.id.noticeboard);

       noticeboard.setOnClickListener(this);
    }






//onclick card action for the noticeboard view

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