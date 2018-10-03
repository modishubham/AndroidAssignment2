package com.example.shubham.layoutdesigns;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button1,button2;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;
    private ArrayList<Model> news=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_example);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeLayoutExample.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ConstraintLayoutExample.class);
                startActivity(intent);
            }
        });


        recyclerView = findViewById(R.id.recyclerView);
        mlayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mlayoutManager);
        mAdapter=new MyAdapterClass(news);

        recyclerView.setAdapter(mAdapter);

        setDataInModel();


    }

    public ArrayList<Model> setDataInModel() {

        Model model1 = new Model();
        Model model2 = new Model();
        Model model3 = new Model();
        Model model4 = new Model();
        Model model5 = new Model();
        Model model6 = new Model();
        Model model7 = new Model();
        Model model8 = new Model();
        Model model9 = new Model();

        model1.setDesciption("");
        model1.setTitle("China Says Navy Drove US Warship From South China Sea Reef");
        news.add(model1);

        model2.setDesciption("Ag industry offers praise for new North American free trade pact, which tackles Canada’s dairy program and removes discriminatory grain grading standards");
        model2.setTitle("Goodbye NAFTA, hello USMCA");
        news.add(model2);

        model3.setDesciption("In a news conference, Trump said he is open to a “comprehensive investigation” but insisted that it must move quickly.");
        model3.setTitle("White House agrees to expand Kavanaugh probe slightly as McConnell signals vote is imminent");
        news.add(model3);

        model4.setDesciption("As a 19-year-old freshman at Columbia, O’Rourke used the phrase “phenomenally large breasts and tight buttocks“ in reviewing a Broadway musical for the college paper.");
        model4.setTitle("‘I am ashamed’: Beto apologizes for ‘demeaning comments about women’");
        news.add(model4);

        model5.setDesciption("The blaze wound up causing $8 million in damage.");
        model5.setTitle("A Border Patrol Agent Started a 47,000-Acre Wildfire with a Gender Reveal Party - VICE");
        news.add(model5);

        model6.setDesciption("A father and son were killed Saturday night when a car exploded in Allentown, the Lehigh Coroner's Office announced Monday afternoon.");
        model6.setTitle("Father and Toddler Among 3 People Killed in Allentown Car Blast");
        news.add(model6);

        model7.setDesciption("Flash-flood watches stretch a whopping 750 miles, extending from the Mexican border northward through Utah.");
        model7.setTitle("Tropical Storm Rosa to dump torrential rains on Desert Southwest, leading to flooding Tuesday");
        news.add(model7);

        model8.setDesciption("The president's media critiques got especially personal during a Rose Garden press conference.");
        model8.setTitle("Trump to reporter: 'I know you’re not thinking, you never do'");
        news.add(model8);

        model9.setDesciption("Survivors described the panic and devastation of the earthquake and tsunami that hit Sulawesi, Indonesia, as rescue workers raced to find survivors and pull them from the rubble.");
        model9.setTitle("‘We Just Ran’: Scale of Tsunami Horror Emerges in Indonesia");
        news.add(model9);

        return news;
    }

}
