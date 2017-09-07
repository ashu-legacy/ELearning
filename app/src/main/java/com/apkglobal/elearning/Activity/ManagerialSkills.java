package com.apkglobal.elearning.Activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.apkglobal.elearning.R;
import com.apkglobal.elearning.TopicUtil.ManagerialAdapter;
import com.apkglobal.elearning.TopicUtil.TechnicalAdapter;

public class ManagerialSkills extends AppCompatActivity {
    private RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managerial_skills);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Playing the ManagerialSkills Video",Toast.LENGTH_SHORT).show();
            }
        });

//        quizButton=(Button)findViewById(R.id.button_quiz_section);

        View.OnClickListener butListner=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        };

        recyclerView2=(RecyclerView)findViewById(R.id.recyclerView_topics_managerial);
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        ManagerialAdapter managerialAdapter =new ManagerialAdapter(butListner);
        recyclerView2.setAdapter(managerialAdapter);



    }
}