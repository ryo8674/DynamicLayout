package com.example.peter.dynamicpadding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);
        textView.setText("test");
        textView.setWidth(getResources().getDimensionPixelSize(R.dimen.width320));
        textView.setPadding(getResources().getDimensionPixelSize(R.dimen.padding8),
                getResources().getDimensionPixelSize(R.dimen.padding8),
                getResources().getDimensionPixelSize(R.dimen.padding8),
                getResources().getDimensionPixelSize(R.dimen.padding8));
        setContentView(textView);

        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        lp.setMargins(getResources().getDimensionPixelSize(R.dimen.margin16),
                getResources().getDimensionPixelSize(R.dimen.margin16),
                getResources().getDimensionPixelSize(R.dimen.margin16),
                getResources().getDimensionPixelSize(R.dimen.margin16));
        textView.setLayoutParams(lp);




    }
}
