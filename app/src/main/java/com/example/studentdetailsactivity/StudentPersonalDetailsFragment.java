package com.example.studentdetailsactivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class StudentPersonalDetailsFragment extends Fragment {

private Button mBtnNext;
private EditText mEtName;
private EditText mEtAge;
private CommunicationListner listner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_personal_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
    }

    private void initviews(View view) {
        mEtName = view.findViewById(R.id.etStudentName);
        mEtAge = view.findViewById(R.id.etStudentAge);
        mBtnNext = view.findViewById(R.id.btnNext);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEtName.getText().toString();
                int age = Integer.parseInt(mEtAge.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putInt("age",age);
                if (listner!=null){
                    listner.launchPerformanceFragment(bundle);
                }
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listner = (CommunicationListner)context;
    }
}