package com.example.diveshkumar.menu_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textView = (TextView) findViewById(R.id.textView);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int x = item.getItemId();
        switch(x){
            case R.id.item1:
                textView.setText( item.getTitle());
                break;
            case R.id.item2:
                textView.setText( item.getTitle());
                break;
            case R.id.item3:
                textView.setText( item.getTitle());
                break;
            case R.id.item4:
                textView.setText( item.getTitle());
                break;
        }


        return super.onOptionsItemSelected(item);
    }


}
