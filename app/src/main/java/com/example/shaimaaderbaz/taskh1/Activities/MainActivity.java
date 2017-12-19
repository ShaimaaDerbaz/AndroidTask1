package com.example.shaimaaderbaz.taskh1.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import com.example.shaimaaderbaz.taskh1.Adapters.ListAdapter;
import com.example.shaimaaderbaz.taskh1.ImageItem;
import com.example.shaimaaderbaz.taskh1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnNavigationItemSelectedListener
        {
            private DrawerLayout mDrawerLayout;
            private ActionBarDrawerToggle mDrawerToggle;
            private CharSequence mDrawerTitle;
            private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ImageItem> images=new ArrayList<ImageItem>();
        //String[] images=new String[10];
        images.add(new ImageItem(R.drawable.facebook,1));
        images.add(new ImageItem(R.drawable.googleplus,2));
        images.add(new ImageItem(R.drawable.linkedin,3));
        images.add(new ImageItem(R.drawable.twitter,4));
        images.add(new ImageItem(R.drawable.wordpress,5));
        images.add(new ImageItem(R.drawable.youtube,6));

        ListAdapter adapter = new ListAdapter(this,images);
        ListView listView = (ListView) findViewById(R.id.content_main);
        listView.setAdapter(adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // old automatic
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navView = (NavigationView) findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);
       ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        ////////////

       /* mTitle = mDrawerTitle = getTitle();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close) {

            // Called when a drawer has settled in a completely closed state.
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            // Called when a drawer has settled in a completely open state.
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);*/


    }

           /* @Override
            public boolean onPrepareOptionsMenu(Menu menu) {
                // If the nav drawer is open, hide action items related to the content view
                boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
                menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
                return super.onPrepareOptionsMenu(menu);
            }*/

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
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
                    Intent i =new Intent(MainActivity.this,ContactUsActivity.class);
                    startActivity(i);


                } else if (id == R.id.about_us) {

                    Intent i =new Intent(MainActivity.this,AboutUsActivity.class);
                    startActivity(i);

                } else if (id == R.id.website) {

                    Uri uriUrl = Uri.parse("http://hadeya.net/");
                    Intent openBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(openBrowser);
                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }







        }
