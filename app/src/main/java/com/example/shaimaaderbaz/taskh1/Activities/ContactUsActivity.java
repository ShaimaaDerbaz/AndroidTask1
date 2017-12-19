package com.example.shaimaaderbaz.taskh1.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.shaimaaderbaz.taskh1.R;

public class ContactUsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        Button numbers =(Button)findViewById(R.id.open_map_button);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://goo.gl/maps/WFLkk9WGJ5G2");
                Intent openBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(openBrowser);

            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout3);
        NavigationView navView = (NavigationView) findViewById(R.id.nav_view3);
        navView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout3);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.contact_us) {
            Intent i =new Intent(ContactUsActivity.this,ContactUsActivity.class);
            startActivity(i);


        } else if (id == R.id.about_us) {

            Intent i =new Intent(ContactUsActivity.this,AboutUsActivity.class);
            startActivity(i);

        } else if (id == R.id.website) {

            Uri uriUrl = Uri.parse("http://hadeya.net/");
            Intent openBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(openBrowser);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout3);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
