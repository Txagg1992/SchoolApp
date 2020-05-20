package com.curiousapps.schoolapp.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.curiousapps.schoolapp.R;
import com.curiousapps.schoolapp.models.SchoolList;

public class SchoolListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView schoolName;
    TextView schoolAddress;
    TextView schoolCity;
    TextView schoolState;
    TextView schoolZip;
    TextView schoolPhone;
    ImageView schoolWebLink;

    private SchoolList schoolList;

    OnSchoolListener onSchoolListListener;

    public SchoolListViewHolder(@NonNull View itemView, OnSchoolListener onSchoolListListener) {
        super(itemView);
        this.onSchoolListListener = onSchoolListListener;

        Context context = itemView.getContext();
        schoolName = itemView.findViewById(R.id.text_view_school_name);
        schoolAddress = itemView.findViewById(R.id.text_view_school_address);
        schoolCity = itemView.findViewById(R.id.text_view_school_city);
        schoolState = itemView.findViewById(R.id.text_view_school_state);
        schoolZip = itemView.findViewById(R.id.text_view_school_zip);
        schoolPhone = itemView.findViewById(R.id.text_view_school_phone);
        schoolWebLink = itemView.findViewById(R.id.icon_web_link);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onSchoolListListener.onSchoolClick(getAdapterPosition());
    }

}
