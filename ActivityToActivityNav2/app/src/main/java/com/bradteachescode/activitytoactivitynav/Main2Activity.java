package com.bradteachescode.activitytoactivitynav;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String text = getIntent().getStringExtra("EXTRA_MAIN1");

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);

                intent.putExtra("EXTRA_MAIN2", "From Main 2");

                startActivity(intent);
            }
        });


    }
}
