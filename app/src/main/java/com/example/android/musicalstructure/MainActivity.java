package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PURCHASE Click Listener
        Button cartButton = (Button) findViewById(R.id.cartButton);
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PurchaseActivity.class);
                startActivity(i);
            }
        });

        // SINGLE ARTIST Click Listener
        TextView singleArtistName = (TextView) findViewById(R.id.currentSongArtist);

        View.OnClickListener singleArtistHandler = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SingleArtistActivity.class);
                startActivity(i);
            }
        };
        singleArtistName.setOnClickListener(singleArtistHandler);

        // ALL SONGS Click Listener
        TextView singleSongTitle = (TextView) findViewById(R.id.currentSongTitle);
        Button libraryButton = (Button) findViewById(R.id.libraryButton);

        View.OnClickListener allSongsHandler = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AllSongsActivity.class);
                startActivity(i);
            }
        };
        singleSongTitle.setOnClickListener(allSongsHandler);
        libraryButton.setOnClickListener(allSongsHandler);

        // SINGLE ALBUM Click Listener
        TextView singleAlbumTitle = (TextView) findViewById(R.id.currentAlbumTitle);
        ImageView singleAlbumArt = (ImageView) findViewById(R.id.currentAlbumArt);

        View.OnClickListener singleAlbumHandler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SingleAlbumActivity.class);
                startActivity(i);
            }
        };
        singleAlbumArt.setOnClickListener(singleAlbumHandler);
        singleAlbumTitle.setOnClickListener(singleAlbumHandler);

    }
}
