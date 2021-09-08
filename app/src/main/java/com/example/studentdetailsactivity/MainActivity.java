package com.example.studentdetailsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CommunicationListner{
private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        launchPersonalDetailsFragment();
    }

    private void launchPersonalDetailsFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment fragment = new StudentPersonalDetailsFragment();
        fragmentTransaction.add(R.id.container,fragment,"personal").commit();
    }


    @Override
    public void launchPerformanceFragment(Bundle bundle) {
FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
StudentPerformanceDetailsFragment personalDetailsFragment = new StudentPerformanceDetailsFragment();
personalDetailsFragment.setArguments(bundle);
fragmentTransaction.replace(R.id.container,personalDetailsFragment,"personalDetailsFragment").addToBackStack("").commit();
    }
}