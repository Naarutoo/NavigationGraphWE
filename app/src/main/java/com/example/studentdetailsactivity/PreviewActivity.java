package com.example.studentdetailsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {
private TextView mTvName;
private TextView mTvAge;
private TextView mTvGrade;
private TextView mTvPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initviews();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        Model model = (Model)getIntent().getSerializableExtra("model");
        mTvName.setText(model.getName());
        mTvAge.setText(model.getAge());
        mTvGrade.setText(model.getGrade());
        mTvPercentage.setText(model.getPercentage());
    }

    private void initviews() {
        mTvName = findViewById(R.id.tvStudentName);
        mTvAge = findViewById(R.id.tvStudentAge);
        mTvGrade = findViewById(R.id.tvStudentGrade);
        mTvPercentage = findViewById(R.id.tvStudentPercentage);
    }
}