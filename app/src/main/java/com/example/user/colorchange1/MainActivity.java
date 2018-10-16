package com.example.user.colorchange1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1 = (LinearLayout) findViewById(R.id.layout1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("Red"))
            layout1.setBackgroundColor(Color.RED);
        if (st.equals("Blue"))
            layout1.setBackgroundColor(Color.BLUE);
        if (st.equals("Yellow"))
            layout1.setBackgroundColor(Color.YELLOW);
        return super.onOptionsItemSelected(item);
    }

    public void next(View view) {
        Intent t = new Intent(this, Main2Activity.class);
        startActivity(t);
    }



}

