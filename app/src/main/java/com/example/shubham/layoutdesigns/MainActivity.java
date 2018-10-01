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

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutManager;
    private ArrayList<Model> news=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_example);

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

        model1.setDesciption("description1");
        model1.setTitle("Title1");
        news.add(model1);

        model2.setDesciption("description2");
        model2.setTitle("Title2");
        news.add(model2);

        model3.setDesciption("description3");
        model3.setTitle("Title3");
        news.add(model3);

        model4.setDesciption("description4");
        model4.setTitle("Title4");
        news.add(model4);

        model5.setDesciption("description5");
        model5.setTitle("Title5");
        news.add(model5);

        model6.setDesciption("description6");
        model6.setTitle("Title6");
        news.add(model6);

        model7.setDesciption("description7");
        model7.setTitle("Title7");
        news.add(model7);

        model8.setDesciption("description8");
        model8.setTitle("Title8");
        news.add(model8);

        model9.setDesciption("description9");
        model9.setTitle("Title9");
        news.add(model9);

        return news;
    }

}
