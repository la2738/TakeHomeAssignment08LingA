package com.example.android.takehomeassignment08_linga;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectViewHolder>{

    private List<Project> projects;
    private Context context;

    public ProjectAdapter(List<Project> project,Context context){
        this.projects = project;
        this.context = context;
    }

    public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_project,parent,false);
        return new ProjectViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        Project project = projects.get(position);
        holder.projectName.setText(project.name);
        holder.projectLevel.setText(project.level);
        holder.projectTime.setText(project.time);
        holder.projectTool.setText(project.tool);
        holder.projectImage.setImageResource(project.photoId);
        holder.isTrue= project.isTrue;
        project.setTrue(holder.isTrue);

    }

    @Override
    public int getItemCount() {
        return projects.size();
    }

}
