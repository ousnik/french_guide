package com.example.android.french;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red","Rouge",R.drawable.color_red));
        words.add(new Word("Brown","Marron",R.drawable.color_brown));
        words.add(new Word("Green","Vert/Verte",R.drawable.color_green));
        words.add(new Word("Gray","Gris/Grise",R.drawable.color_gray));
        words.add(new Word("Black","Noir/Noire",R.drawable.color_black));
        words.add(new Word("White","Blanc/Blanche",R.drawable.color_white));
        words.add(new Word("Yellow","Jaune",R.drawable.color_mustard_yellow
        ));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
