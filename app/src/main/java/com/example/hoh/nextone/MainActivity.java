//------------------------------------------------------------------------------------------
//-- H. Homann Feb-11-2017
//-- Sorry guys. This is my first project in Java, I don't know anything about Java programming
//-- language eventhough I was born and grew up there ;)
//------------------------------------------------------------------------------------------
//  Try to come up with a concept to structure of this project using Objects DTO and DAO
//    using the sample from my playlist DAO-DTO
//  1. https://www.youtube.com/watch?v=Ncl4G0FSfXs --> General Concept
//  2. https://www.youtube.com/watch?v=19U_E-b41_U  --> Creating a new package dto (Data Transfer Object)
//     for all DTOs. such as MarketDTO
//  3. https://www.youtube.com/watch?v=62xq-D5cw08  --> Creating the DAO and Interface, so that we
//     can use the dummy data as prototype until the real data comes available. Anything ends with
//     Stub means this is a dummy data. Anything start with I = Interface. The actual DAO  is without
//     any Is or Stub. Such as MarketDAO.

package com.example.hoh.nextone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


       // Intent nextIntent = new Intent(this, UserLoginActivity.class);
        //startActivity(nextIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnBeginDayClicked(View view){
        Intent nextIntent = new Intent(this, UserLoginActivity.class);
        startActivity(nextIntent);
    }
}
