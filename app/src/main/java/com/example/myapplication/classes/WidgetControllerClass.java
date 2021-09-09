package com.example.myapplication.classes;

import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import java.text.MessageFormat;

public class WidgetControllerClass {
    private TextView text_name, text_age, text_personality, text_live, text_hobby;
    private CardView card_info, card_reset;
    private EditText edittext_name;
    private RelativeLayout relative_input;

    public WidgetControllerClass(TextView text_name, TextView text_age, TextView text_personality, TextView text_live, TextView text_hobby, CardView card_info, CardView card_reset, EditText edittext_name, RelativeLayout relative_input) {
        this.text_name = text_name;
        this.text_age = text_age;
        this.text_personality = text_personality;
        this.text_live = text_live;
        this.text_hobby = text_hobby;
        this.card_info = card_info;
        this.card_reset = card_reset;
        this.edittext_name = edittext_name;
        this.relative_input = relative_input;
    }

    public void setVisibilityToGone() {
        text_name.setVisibility(View.GONE);
        text_age.setVisibility(View.GONE);
        text_personality.setVisibility(View.GONE);
        text_live.setVisibility(View.GONE);
        text_hobby.setVisibility(View.GONE);

        card_info.setVisibility(View.GONE);
    }

    public void setTextsToVisible() {
        if (edittext_name.getText().toString().isEmpty()) {
            Toast.makeText(text_name.getContext(), "field cannot be empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        card_info.setVisibility(View.VISIBLE);
        if (text_name.getVisibility() == View.GONE) {
            edittext_name.setHint("enter your age...");
            text_name.setText(MessageFormat.format("My name is {0}", edittext_name.getText().toString()));
            edittext_name.setText("");
            text_name.setVisibility(View.VISIBLE);
            edittext_name.setInputType(InputType.TYPE_CLASS_NUMBER);
            return;
        }

        if (text_age.getVisibility() == View.GONE) {
            edittext_name.setHint("enter your personality...");
            text_age.setText(MessageFormat.format("I am {0} years old", edittext_name.getText().toString()));
            edittext_name.setText("");
            text_age.setVisibility(View.VISIBLE);
            edittext_name.setInputType(InputType.TYPE_CLASS_TEXT);
            return;
        }

        if (text_personality.getVisibility() == View.GONE) {
            edittext_name.setHint("enter where you live...");
            text_personality.setText(MessageFormat.format("I am very {0}", edittext_name.getText().toString()));
            edittext_name.setText("");
            text_personality.setVisibility(View.VISIBLE);
            return;
        }

        if (text_live.getVisibility() == View.GONE) {
            edittext_name.setHint("enter your hobby...");
            text_live.setText(MessageFormat.format("I live in {0}", edittext_name.getText().toString()));
            edittext_name.setText("");
            text_live.setVisibility(View.VISIBLE);
            return;
        }

        if (text_hobby.getVisibility() == View.GONE) {
            text_hobby.setText(MessageFormat.format("I love {0}", edittext_name.getText().toString()));
            edittext_name.setText("");
            text_hobby.setVisibility(View.VISIBLE);
            relative_input.setVisibility(View.GONE);
            card_reset.setVisibility(View.VISIBLE);
        }
    }

}
