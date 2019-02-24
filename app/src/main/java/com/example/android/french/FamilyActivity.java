package com.example.android.french;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","Père",R.drawable.family_father));
        words.add(new Word("Mother","Mère",R.drawable.family_mother));
        words.add(new Word("Son","Fils",R.drawable.family_son));
        words.add(new Word("Daughter","Fille",R.drawable.family_daughter));
        words.add(new Word("Brother","Frère",R.drawable.family_older_brother));
        words.add(new Word("Sister","Sœur",R.drawable.family_older_sister));
        words.add(new Word("Grandmother","Mémé",R.drawable.family_grandmother));
        words.add(new Word("Grandfather","Pépé",R.drawable.family_grandfather));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
