package com.example.root.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getActionBar().setDisplayHomeAsUpEnabled(true);


        TextView numberTextView = (TextView)findViewById(R.id.numbers);
        numberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Miwok Numbers",Toast.LENGTH_SHORT);
                Intent intent = new Intent(view.getContext(),NumbersActivity.class);
                startActivity(intent);
            }
        });
        TextView colorTextView = (TextView)findViewById(R.id.colors);
        colorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Miwok Colors",Toast.LENGTH_SHORT);
                Intent intent = new Intent(view.getContext(),ColorsActivity.class);
                startActivity(intent);
            }
        });
        TextView PhraseTextView = (TextView)findViewById(R.id.phrases);
        PhraseTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Miwok Phrases",Toast.LENGTH_SHORT);
                Intent intent = new Intent(view.getContext(),PhrasesActivity.class);
                startActivity(intent);
            }
        });
        TextView FamilyTextView = (TextView)findViewById(R.id.family);
        FamilyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Miwok Family",Toast.LENGTH_SHORT);
                Intent intent = new Intent(view.getContext(),FamilyActivity.class);
                startActivity(intent);
            }
        });

    }
/*
    public void openNumbersList(View view)
    {
    }
*/
}
