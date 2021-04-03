package com.example.layoutsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddConstraint(View view) {
        Intent intent = new Intent(this, AddConstraintActivity.class);
        startActivity(intent);
    }

    public void onClickParentPosition(View view) {
        Intent intent = new Intent(this, ParentPositionActivity.class);
        startActivity(intent);
    }

    public void onClickOrderPosition(View view) {
        Intent intent = new Intent(this, OrderPositionActivity.class);
        startActivity(intent);
    }

    public void onClickAlignment(View view) {
        Intent intent = new Intent(this, AlignmentActivity.class);
        startActivity(intent);
    }

    public void onClickBaselineAlignment(View view) {
        Intent intent = new Intent(this, BaselineAlignmentActivity.class);
        startActivity(intent);
    }

    public void onClickOverview(View view) {
        Intent intent = new Intent(this,OverviewActivity.class);
        startActivity(intent);
    }
}