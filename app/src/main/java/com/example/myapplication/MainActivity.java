package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text_name, text_age, text_personality, text_live, text_hobby;
    private Button button_insert;
    private EditText edittext_name;
    private CardView card_info;
    private RelativeLayout relative_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning id to variables....
        text_name = findViewById(R.id.text_name);
        text_age = findViewById(R.id.text_age);
        text_personality = findViewById(R.id.text_personality);
        text_live = findViewById(R.id.text_live);
        text_hobby = findViewById(R.id.text_hobby);

        button_insert = findViewById(R.id.button_insert);

        edittext_name = findViewById(R.id.edittext_name);

        card_info = findViewById(R.id.card_info);

        relative_input = findViewById(R.id.relative_input);

        setVisibilityToGone();

        button_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext_name.getText().toString().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "field cannot be empty!", Toast.LENGTH_SHORT).show();
                    return;
                }

                card_info.setVisibility(View.VISIBLE);
                if (text_name.getVisibility() == View.GONE) {
                    text_name.setVisibility(View.VISIBLE);
                    return;
                }

                if (text_age.getVisibility() == View.GONE) {
                    text_age.setVisibility(View.VISIBLE);
                    return;
                }

                if (text_personality.getVisibility() == View.GONE) {
                    text_personality.setVisibility(View.VISIBLE);
                    return;
                }

                if (text_live.getVisibility() == View.GONE) {
                    text_live.setVisibility(View.VISIBLE);
                    return;
                }

                if (text_hobby.getVisibility() == View.GONE) {
                    text_hobby.setVisibility(View.VISIBLE);
                    relative_input.setVisibility(View.GONE);
                }
            }
        });

    }

    private void setVisibilityToGone() {
        text_name.setVisibility(View.GONE);
        text_age.setVisibility(View.GONE);
        text_personality.setVisibility(View.GONE);
        text_live.setVisibility(View.GONE);
        text_hobby.setVisibility(View.GONE);

        card_info.setVisibility(View.GONE);
    }
}
