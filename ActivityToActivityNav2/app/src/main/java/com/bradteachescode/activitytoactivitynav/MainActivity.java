package com.bradteachescode.activitytoactivitynav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private String text = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = getIntent().getStringExtra("EXTRA_MAIN2");

        if (text != null){
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }



        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                intent.putExtra("EXTRA_MAIN1", "From Main 1");

                startActivity(intent);
            }
        });

    }
}
