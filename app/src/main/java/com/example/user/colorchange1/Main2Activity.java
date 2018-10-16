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

public class Main2Activity extends AppCompatActivity {
    LinearLayout layout01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        layout01 = (LinearLayout) findViewById(R.id.layout01);
    }
    public void back (View view) {
        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,250,"Green");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("Red"))
            layout01.setBackgroundColor(Color.RED);
        if (st.equals("Blue"))
            layout01.setBackgroundColor(Color.BLUE);
        if (st.equals("Yellow"))
            layout01.setBackgroundColor(Color.YELLOW);
        if (st.equals("Green"))
            layout01.setBackgroundColor(Color.GREEN);
        return super.onOptionsItemSelected(item);

    }
}
