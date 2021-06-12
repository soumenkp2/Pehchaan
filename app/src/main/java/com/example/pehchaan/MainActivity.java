package com.example.pehchaan;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MainActivity extends AppCompatActivity {








    int dc=0;
    int hc=0;
    int ec=0;
    int bc=0;

    @Override
    protected void onStart() {
        super.onStart();
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS},1);
        }
        else
        {

        }
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS},1);
        }
        else
        {

        }


        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);
        }
        else
        {

        }



        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CALL_LOG},1);
        }
        else
        {

        }





        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_CONTACTS) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_CONTACTS},1);
        }
        
        
        
        
        
        
        

        String checkbook = "book";
        String checkemergency = "checkemergency";






        TextView mainup = (TextView) findViewById(R.id.main_feedup);
        TextView dialup = (TextView) findViewById(R.id.dialup);
        TextView bookup = (TextView) findViewById(R.id.bookup);
        TextView emergencyup = (TextView) findViewById(R.id.emergencyup);

        ImageView main = (ImageView) findViewById(R.id.main_feed);
        main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));

        ImageView dial = (ImageView) findViewById(R.id.dialpad);
        ImageView book = (ImageView) findViewById(R.id.book);
        ImageView emergency = (ImageView) findViewById(R.id.emergency);

        mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
        dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
        bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
        emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
        dialup.setText(" ");
        bookup.setText(" ");
        emergencyup.setText(" ");
        mainup.setText("Home");
        mainup.setTextSize(17);
        mainup.setPadding(0,0,0,0);
        mainup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
        mainup.setTextColor(getResources().getColor(R.color.white));

        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        t.replace(R.id.container, new homefragment());
        t.commit();





        NavigationView nv = findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if(menuItem.getItemId() == R.id.nav_home)
                {
                    //Toast.makeText(MainActivity.this, "Soumen", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, aboutus.class);
                    startActivity(i);

                }
                else if(menuItem.getItemId() == R.id.nav_gallery)
                {
                    //emergency

                    ec++;
                    hc=0;
                    bc=0;
                    dc=0;
                    emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                    main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));



                    if(ec==1)
                    {
                        mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                        // emergencyup.setText("Home");

                        dialup.setText(" ");
                        bookup.setText(" ");
                        mainup.setText(" ");
                        emergencyup.setText("Emergency");
                        emergencyup.setTextSize(15);
                        emergencyup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                        emergencyup.setTextColor(getResources().getColor(R.color.white));

                        FragmentManager m = getSupportFragmentManager();
                        FragmentTransaction t = m.beginTransaction();
                        t.replace(R.id.container, new emergency());
                        t.commit();
                    }
                    else if(ec==2)
                    {

                        mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        // emergencyup.setText("Home");

                        dialup.setText(" ");
                        bookup.setText(" ");
                        mainup.setText(" ");
                        emergencyup.setText(" ");
                        emergencyup.setTextSize(15);
                        emergencyup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                        emergencyup.setTextColor(getResources().getColor(R.color.white));

                        ec=0;

                    }



                }

                else if(menuItem.getItemId() == R.id.nav_emergency)
                {
                    //Add contacts
                    //Toast.makeText(MainActivity.this, "Soumen", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(ContactsContract.Intents.Insert.ACTION);
                    i.setType(ContactsContract.RawContacts.CONTENT_TYPE);

                    i.putExtra(ContactsContract.Intents.Insert.PHONE, " ");
                    i.putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);

                    startActivity(i);

                }
                else if(menuItem.getItemId() == R.id.nav_book)
                {
                    //Phone book

                    bc++;
                    dc=0;
                    ec=0;
                    hc=0;

                    book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                    main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));

                    if(bc==1)
                    {
                        mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                        emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        //bookup.setText("Home");

                        dialup.setText(" ");
                        bookup.setText("Phone Book");
                        emergencyup.setText(" ");
                        mainup.setText(" ");
                        bookup.setTextSize(15);
                        bookup.setPadding(0,0,0,0);
                        bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                        bookup.setTextColor(getResources().getColor(R.color.white));

                        FragmentManager m = getSupportFragmentManager();
                        FragmentTransaction t = m.beginTransaction();
                        t.replace(R.id.container, new book());
                        t.commit();



                    }
                    else if(bc==2)
                    {

                        mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                        //bookup.setText("Home");

                        dialup.setText(" ");
                        bookup.setText(" ");
                        emergencyup.setText(" ");
                        mainup.setText(" ");
                        bookup.setTextSize(15);
                        bookup.setPadding(0,0,0,0);
                        bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                        bookup.setTextColor(getResources().getColor(R.color.white));


                        bc=0;



                    }




                }



                DrawerLayout dr = findViewById(R.id.drawer_layout);
                dr.closeDrawer(GravityCompat.START);

                return true;
            }
        });






        if(checkemergency.equals(getIntent().getStringExtra("emergencytomain")))
        {

            ec++;
            hc=0;
            bc=0;
            dc=0;
            emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
            main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
            dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
            book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));



            if(ec==1)
            {
                mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                // emergencyup.setText("Home");

                dialup.setText(" ");
                bookup.setText(" ");
                mainup.setText(" ");
                emergencyup.setText("Emergency");
                emergencyup.setTextSize(15);
                emergencyup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                emergencyup.setTextColor(getResources().getColor(R.color.white));

                FragmentManager mm = getSupportFragmentManager();
                FragmentTransaction tt = m.beginTransaction();
                tt.replace(R.id.container, new emergency());
                tt.commit();
            }
            else if(ec==2)
            {

                mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                // emergencyup.setText("Home");

                dialup.setText(" ");
                bookup.setText(" ");
                mainup.setText(" ");
                emergencyup.setText(" ");
                emergencyup.setTextSize(15);
                emergencyup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                emergencyup.setTextColor(getResources().getColor(R.color.white));

                ec=0;

            }












        }










        if(checkbook.equals(getIntent().getStringExtra("book"))) {

            bc++;
            dc = 0;
            ec = 0;
            hc = 0;

            book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
            main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
            dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
            emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));

            if (bc == 1) {
                mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                //bookup.setText("Home");

                dialup.setText(" ");
                bookup.setText("Phone Book");
                emergencyup.setText(" ");
                mainup.setText(" ");
                bookup.setTextSize(15);
                bookup.setPadding(0, 0, 0, 0);
                bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                bookup.setTextColor(getResources().getColor(R.color.white));

                FragmentManager mm = getSupportFragmentManager();
                FragmentTransaction tt = mm.beginTransaction();
                tt.replace(R.id.container, new book());
                tt.commit();


            }
            else if (bc == 2) {

                mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                //bookup.setText("Home");

                dialup.setText(" ");
                bookup.setText(" ");
                emergencyup.setText(" ");
                mainup.setText(" ");
                bookup.setTextSize(15);
                bookup.setPadding(0, 0, 0, 0);
                bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                bookup.setTextColor(getResources().getColor(R.color.white));


                bc = 0;


            }

        }




        if(checkbook.equals(getIntent().getStringExtra("booktomain"))) {

            bc++;
            dc = 0;
            ec = 0;
            hc = 0;

            book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
            main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
            dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
            emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));

            if (bc == 1) {
                mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                //bookup.setText("Home");

                dialup.setText(" ");
                bookup.setText("Phone Book");
                emergencyup.setText(" ");
                mainup.setText(" ");
                bookup.setTextSize(15);
                bookup.setPadding(0, 0, 0, 0);
                bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                bookup.setTextColor(getResources().getColor(R.color.white));

                FragmentManager mm = getSupportFragmentManager();
                FragmentTransaction tt = mm.beginTransaction();
                tt.replace(R.id.container, new book());
                tt.commit();


            }
            else if (bc == 2) {

                mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                //bookup.setText("Home");

                dialup.setText(" ");
                bookup.setText(" ");
                emergencyup.setText(" ");
                mainup.setText(" ");
                bookup.setTextSize(15);
                bookup.setPadding(0, 0, 0, 0);
                bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                bookup.setTextColor(getResources().getColor(R.color.white));


                bc = 0;


            }

        }


        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ec=0;
                bc=0;
                hc=0;
                dc++;
                dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));

                if(dc==1)
                {

                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    //dialup.setText("Home");

                    dialup.setText("Dialpad");
                    bookup.setText(" ");
                    emergencyup.setText(" ");
                    mainup.setText(" ");
                    dialup.setTextSize(17);
                    dialup.setPadding(0,0,0,0);
                    dialup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    dialup.setTextColor(getResources().getColor(R.color.white));

                    FragmentManager m = getSupportFragmentManager();
                    FragmentTransaction t = m.beginTransaction();
                    t.replace(R.id.container, new dialpad());
                    t.commit();

                }


                else if(dc==2)
                {

                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    //dialup.setText("Home");

                    dialup.setText(" ");
                    bookup.setText(" ");
                    emergencyup.setText(" ");
                    mainup.setText(" ");
                    dialup.setTextSize(17);
                    dialup.setPadding(0,0,0,0);
                    dialup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    dialup.setTextColor(getResources().getColor(R.color.white));



                    dc=0;
                }
                /*mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                //dialup.setText("Home");

                dialup.setText("Dialpad");
                bookup.setText(" ");
                emergencyup.setText(" ");
                mainup.setText(" ");
                dialup.setTextSize(17);
                dialup.setPadding(0,0,0,0);
                dialup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                dialup.setTextColor(getResources().getColor(R.color.white));*/



            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc++;
                dc=0;
                ec=0;
                hc=0;

                book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));

                if(bc==1)
                {
                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    //bookup.setText("Home");

                    dialup.setText(" ");
                    bookup.setText("Phone Book");
                    emergencyup.setText(" ");
                    mainup.setText(" ");
                    bookup.setTextSize(15);
                    bookup.setPadding(0,0,0,0);
                    bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    bookup.setTextColor(getResources().getColor(R.color.white));

                    FragmentManager m = getSupportFragmentManager();
                    FragmentTransaction t = m.beginTransaction();
                    t.replace(R.id.container, new book());
                    t.commit();



                }
                else if(bc==2)
                {

                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    //bookup.setText("Home");

                    dialup.setText(" ");
                    bookup.setText(" ");
                    emergencyup.setText(" ");
                    mainup.setText(" ");
                    bookup.setTextSize(15);
                    bookup.setPadding(0,0,0,0);
                    bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    bookup.setTextColor(getResources().getColor(R.color.white));


                    bc=0;



                }

                /*mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                //bookup.setText("Home");

                dialup.setText(" ");
                bookup.setText("Phone Book");
                emergencyup.setText(" ");
                mainup.setText(" ");
                bookup.setTextSize(15);
                bookup.setPadding(0,0,0,0);
                bookup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                bookup.setTextColor(getResources().getColor(R.color.white));*/


            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ec++;
                hc=0;
                bc=0;
                dc=0;
                emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));



                if(ec==1)
                {
                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                    // emergencyup.setText("Home");

                    dialup.setText(" ");
                    bookup.setText(" ");
                    mainup.setText(" ");
                    emergencyup.setText("Emergency");
                    emergencyup.setTextSize(15);
                    emergencyup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    emergencyup.setTextColor(getResources().getColor(R.color.white));

                    FragmentManager m = getSupportFragmentManager();
                    FragmentTransaction t = m.beginTransaction();
                    t.replace(R.id.container, new emergency());
                    t.commit();
                }
                else if(ec==2)
                {

                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    // emergencyup.setText("Home");

                    dialup.setText(" ");
                    bookup.setText(" ");
                    mainup.setText(" ");
                    emergencyup.setText(" ");
                    emergencyup.setTextSize(15);
                    emergencyup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    emergencyup.setTextColor(getResources().getColor(R.color.white));

                    ec=0;

                }

               /* mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
               // emergencyup.setText("Home");

                dialup.setText(" ");
                bookup.setText(" ");
                mainup.setText(" ");
                emergencyup.setText("Emergency");
                emergencyup.setTextSize(15);
                emergencyup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                emergencyup.setTextColor(getResources().getColor(R.color.white));*/



            }
        });

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hc++;
                ec=0;
                dc=0;
                bc=0;

                main.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                dial.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                book.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergency.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));

                if(hc==1)
                {

                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setText(" ");
                    bookup.setText(" ");
                    emergencyup.setText(" ");
                    mainup.setText("Home");
                    mainup.setTextSize(17);
                    mainup.setPadding(0,0,0,0);
                    mainup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    mainup.setTextColor(getResources().getColor(R.color.white));

                    FragmentManager m = getSupportFragmentManager();
                    FragmentTransaction t = m.beginTransaction();
                    t.replace(R.id.container, new homefragment());
                    t.commit();


                }

                else if(hc==2)
                {


                    mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                    dialup.setText(" ");
                    bookup.setText(" ");
                    emergencyup.setText(" ");
                    mainup.setText(" ");
                    mainup.setTextSize(17);
                    mainup.setPadding(0,0,0,0);
                    mainup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                    mainup.setTextColor(getResources().getColor(R.color.white));





                }

               /* mainup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.change));
                dialup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                bookup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                emergencyup.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.reverse));
                dialup.setText(" ");
                bookup.setText(" ");
                emergencyup.setText(" ");
                mainup.setText("Home");
                mainup.setTextSize(17);
                mainup.setPadding(0,0,0,0);
                mainup.setTextAppearance(MainActivity.this, R.style.fontForNotificationLandingPage);
                mainup.setTextColor(getResources().getColor(R.color.white));*/



            }
        });











    }


}


