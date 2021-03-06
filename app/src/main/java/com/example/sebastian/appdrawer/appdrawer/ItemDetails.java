package com.example.sebastian.appdrawer.appdrawer;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sebastian.appdrawer.R;

public class ItemDetails extends AppCompatActivity {
    ImageView d_imageView;
    TextView txTitle,txPrice,txCreator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_action_close);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        d_imageView = (ImageView)findViewById(R.id.d_imageView);
        txTitle = (TextView) findViewById(R.id.txTitle);
        txCreator = (TextView) findViewById(R.id.txCreator);
        txPrice = (TextView) findViewById(R.id.txPrice);

        //Retrieve parsed information
        d_imageView.setImageResource(getIntent().getIntExtra("item_img",00));
        txTitle.setText(getIntent().getStringExtra("item_title"));
        txCreator.setText(getIntent().getStringExtra("item_creator"));
        txPrice.setText(getIntent().getStringExtra("item_price"));
    }
}
