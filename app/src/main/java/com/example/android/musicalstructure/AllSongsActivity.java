package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        // BACK Click Listener
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // ALBUM & SONG Click Listener
        // If I had more activities allowed I might link SONG to a SINGLE SONG VIEW instead
        TextView albumTitle = (TextView) findViewById(R.id.albumTitle);
        TextView songTitle = (TextView) findViewById(R.id.songTitle);

        View.OnClickListener singleAlbumHandler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AllSongsActivity.this, SingleAlbumActivity.class);
                startActivity(i);
            }
        };
        albumTitle.setOnClickListener(singleAlbumHandler);
        songTitle.setOnClickListener(singleAlbumHandler);

        // ARTIST Click Listener
        TextView artistName = (TextView) findViewById(R.id.artistName);
        artistName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AllSongsActivity.this, SingleArtistActivity.class);
                startActivity(i);
            }
        });
    }
}
