package com.example.android.takehomeassignment08_linga;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProjectViewHolder extends RecyclerView.ViewHolder{

    public CardView cardView;
    public TextView projectName;
    public TextView projectLevel;
    public TextView projectTime;
    public TextView projectTool;
    public ImageView projectImage;
    public boolean isTrue;


    public ProjectViewHolder(View itemView, final Context context) {
        super(itemView);


        cardView = (CardView) itemView.findViewById(R.id.card_view);
        projectName = (TextView) itemView.findViewById(R.id.project_name);
        projectLevel = (TextView) itemView.findViewById(R.id.project_level);
        projectTime = (TextView) itemView.findViewById(R.id.project_time);
        projectTool = (TextView) itemView.findViewById(R.id.project_tool);
        projectImage = (ImageView) itemView.findViewById(R.id.project_image);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isTrue) {
                    Toast.makeText(context, R.string.true_button, Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(context, R.string.false_button, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
