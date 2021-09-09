package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.classes.WidgetControllerClass;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text_name, text_age, text_personality, text_live, text_hobby;
    private Button button_insert;
    private EditText edittext_name;
    private CardView card_info, card_reset;
    private RelativeLayout relative_input;
    private WidgetControllerClass widgetControllerClass;

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
        card_reset = findViewById(R.id.card_reset);

        relative_input = findViewById(R.id.relative_input);

        widgetControllerClass = new WidgetControllerClass(text_name, text_age, text_personality, text_live, text_hobby, card_info,card_reset, edittext_name,relative_input);

        widgetControllerClass.setVisibilityToGone();

        button_insert.setOnClickListener(this);
        card_reset.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v == button_insert) {

            widgetControllerClass.setTextsToVisible();

        }
        if (v == card_reset) {

            widgetControllerClass.setVisibilityToGone();
            edittext_name.setHint("enter your name...");
            edittext_name.setInputType(InputType.TYPE_CLASS_TEXT);
            card_reset.setVisibility(View.GONE);
            relative_input.setVisibility(View.VISIBLE);

        }
    }
}
