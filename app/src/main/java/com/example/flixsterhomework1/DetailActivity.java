package com.example.flixsterhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flixsterhomework1.models.Movie;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    public static final String YOUTUBE_API_KEY ="AIzaSyAHpKACyrPHDXX1CXmAhjnJLapTc_Z888";

  TextView tvTitle;
  TextView tvOverview;
  RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle=findViewById(R.id.tvTitle);
        tvTitle=findViewById(R.id.tvOverview);
        ratingBar=findViewById(R.id.ratingBar);

        String title = getIntent().getStringExtra("title");
        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        tvTitle.setText(title);
        tvOverview.setText(movie.getOverview());
        ratingBar.setRating((float)movie.getRating());
    }
}