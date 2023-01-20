package com.example.post;

import static com.example.post.R.id.timeline_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerview;
     adapter adapter;

     ArrayList<postdata> postdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerview=findViewById(timeline_recyclerview);
        initializedata();
        adapter = new adapter(postdata);
        recyclerview.setAdapter(adapter);

    }
    public void initializedata() {
        postdata = new ArrayList<>(100);
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0)
                postdata.add(new postdata(
                        "yasmin ahmed",
                        "hello <3","2hr",
                        "like","comment","share",
                        R.drawable.ic_baseline_circle_24,R.drawable.ic_baseline_screen_share_24,R.drawable.ic_more));
            else if (i % 3 == 1) {
                postdata.add(new postdata("abeer ahmed",
                        "good morning","30min",
                        "like","comment","share",
                        R.drawable.ic_baseline_circle_24,R.drawable.ic_baseline_screen_share_24,R.drawable.ic_more));

            } else if (i % 3 == 2) {
                postdata.add(new postdata("turkish",
                        "Gunaydin","1min",
                        "like","comment","share",
                        R.drawable.ic_baseline_circle_24,R.drawable.ic_baseline_screen_share_24,R.drawable.ic_more));

            }
        }

    }
    }
