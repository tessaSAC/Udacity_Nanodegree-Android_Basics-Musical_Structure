package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingleArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_artist);

        // BACK Click Listener
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // SONG Click Listener
        TextView songTitle = (TextView) findViewById(R.id.songTitle);
        songTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SingleArtistActivity.this, AllSongsActivity.class);
                startActivity(i);
            }
        });

        // ALBUM Click Listener
        TextView albumTitle = (TextView) findViewById(R.id.albumTitle);
        albumTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SingleArtistActivity.this, SingleAlbumActivity.class);
                startActivity(i);
            }
        });
    }
}