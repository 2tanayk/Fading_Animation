package com.example.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    boolean womanIsShowing=true;
    public void fade(View view)
    {
        Log.i("Info","Imageview tapped");
        ImageView womanImageView=(ImageView) findViewById(R.id.womanImageView);
        ImageView catImageView=(ImageView) findViewById(R.id.catImageView);

        if(womanIsShowing)
        {
            womanIsShowing=false;
            womanImageView.animate().alpha(0).setDuration(2000);
            catImageView.animate().alpha(1).setDuration(2000);
        }
        else
        {
            womanIsShowing=true;
            womanImageView.animate().alpha(1).setDuration(2000);
            catImageView.animate().alpha(0).setDuration(2000);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
