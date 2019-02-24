package com.example.android.french;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?","Où allez-vous?"));
        words.add(new Word("What is your name?","Quel est votre nom?"));
        words.add(new Word("My name is...","Mon nom est..."));
        words.add(new Word("How are you feeling?","Comment allez-vous?"));
        words.add(new Word("I’m feeling good.","Je me sens bien"));
        words.add(new Word("Are you coming?","Viens-tu?"));
        words.add(new Word("Yes, I’m coming.","Oui, je viens."));
        words.add(new Word("Let’s go.","Allons-y."));
        words.add(new Word("Come here.","Venez ici."));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
