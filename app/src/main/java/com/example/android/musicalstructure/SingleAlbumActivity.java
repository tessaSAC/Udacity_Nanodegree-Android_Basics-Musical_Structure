package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingleAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_album);

        // BACK Click Listener
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        // SONG Click Listener
        // If I had more activities allowed I might link SONG to a SINGLE SONG VIEW instead
        TextView songTitle = (TextView) findViewById(R.id.songTitle);
        songTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleAlbumActivity.this, AllSongsActivity.class);
                startActivity(i);
            }
        });

        // ARTIST Click Listener
        TextView artistName = (TextView) findViewById(R.id.artistName);
        artistName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SingleAlbumActivity.this, SingleArtistActivity.class);
                startActivity(i);
            }
        });
    }
}
