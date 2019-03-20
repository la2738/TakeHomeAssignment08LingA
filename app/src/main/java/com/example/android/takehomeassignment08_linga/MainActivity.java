package com.example.android.takehomeassignment08_linga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

private List<Project> project;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DIY IS SO EASY");

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProjectAdapter(project,this));
        }

private void initialData(){
        project = new ArrayList<>();
        project.add(new Project(R.string.build_cattree,R.string.level_beginner,R.string.time_very_short, R.string.tool_cattree, R.drawable.cattree, false));
        project.add(new Project(R.string.clean_burnt_pan,R.string.level_beginner, R.string.time_short,R.string.tool_burnt_pan, R.drawable.cleanburntpan, false));
        project.add(new Project(R.string.fix_clogged_sink,R.string.level_beginner,R.string.time_very_short, R.string.tool_clogged_sink,R.drawable.fixcloggedsink, false));
        project.add(new Project(R.string.fix_door_handler,R.string.level_intermediate, R.string.time_short, R.string.tool_door_handler,R.drawable.fixdoorhandler, true));
        project.add(new Project(R.string.build_deck,R.string.level_advanced, R.string.time_long,R.string.tool_build_deck, R.drawable.builddeck, true));
        }


        }
