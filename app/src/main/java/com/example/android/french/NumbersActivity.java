package com.example.android.french;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","Un/Une",R.drawable.number_one));
        words.add(new Word("Two","Deux",R.drawable.number_two));
        words.add(new Word("Three","Trois",R.drawable.number_three));
        words.add(new Word("Four","Quatre",R.drawable.number_four));
        words.add(new Word("Five","Cinq",R.drawable.number_five));
        words.add(new Word("Six","Six",R.drawable.number_six));
        words.add(new Word("Seven","Sept",R.drawable.number_seven));
        words.add(new Word("Eight","Huit",R.drawable.number_eight));
        words.add(new Word("Nine","Neuf",R.drawable.number_nine));
        words.add(new Word("Ten","Dix",R.drawable.number_ten));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        LinearLayout rootView =(LinearLayout) findViewById(R.id.rootView);
//        for (int index = 0;index<words.size();index++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }
    }
}
