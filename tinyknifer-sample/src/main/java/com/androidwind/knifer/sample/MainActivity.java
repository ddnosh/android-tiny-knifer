package com.androidwind.knifer.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.androidwind.annotation.knifer.BindView;
import com.androidwind.knifer.api.TinyViewBinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_main)
    TextView mTextView;
    @BindView(R.id.btn_main)
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TinyViewBinder.bind(this);
        mTextView.setText("New Hello World!");
    }
}
