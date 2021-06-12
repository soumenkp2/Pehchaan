package com.example.pehchaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.CallLog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class history extends AppCompatActivity {

    public RecyclerView rcvl;
    public logadapter adl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        //TextView t = (TextView)findViewById(R.id.descript);
        //t.setText(getIntent().getStringExtra("number"));


        rcvl = (RecyclerView) findViewById(R.id.recyclelogs);
        rcvl.setLayoutManager(new LinearLayoutManager(this));

        adl = new logadapter(dataque(), this);

        rcvl.setAdapter(adl);







    }





    public ArrayList<log_model> dataque()
    {
        ArrayList<log_model> holder = new ArrayList<>();

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CALL_LOG},1);
        }

        Cursor cursor = this.getContentResolver().query(CallLog.Calls.CONTENT_URI, null, null, null , CallLog.Calls.DATE + " DESC");

        int num = cursor.getColumnIndex(CallLog.Calls.NUMBER);
        int date = cursor.getColumnIndex(CallLog.Calls.DATE);
        int duration = cursor.getColumnIndex(CallLog.Calls.DURATION);
        int name = cursor.getColumnIndex(CallLog.Calls.CACHED_NAME);
        int type = cursor.getColumnIndex(CallLog.Calls.TYPE);
        cursor.moveToFirst();

        String one = "1";
        String two = "2";
        String three = "3";


        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";
        String g = "G";
        String h = "H";
        String ii = "I";
        String j = "J";
        String k = "K";
        String l = "L";
        String m = "M";
        String n = "N";
        String o = "O";
        String p = "P";
        String q = "Q";
        String r = "R";
        String s = "S";
        String t = "T";
        String u = "U";
        String v = "V";
        String w = "W";
        String x = "X";
        String y = "Y";
        String z = "Z";


        boolean check = false;
        while(cursor.moveToNext()) {
            Date date1 = new Date(Long.valueOf(cursor.getString(date)));


            // String as = soumen.substring(0,1);
            //String e = "";

            //String as = soumen.substring(0,1);
            String nums = getIntent().getStringExtra("number");





            if (cursor.getString(num).equals(nums)) {



               // TextView tx = (TextView)findViewById(R.id.descript);
               // tx.setText(nums + "if");

                if (cursor.getString(type).equals(one)) {

                    String soumen = cursor.getString(name);
                    if (soumen == null) {


                        holder.add(new log_model(cursor.getString(num), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.user));

                    }
                    else {
                        String i = soumen;
                        check=true;

                        if (i.substring(0, 1).equals(a)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.a));

                        } else if (i.substring(0, 1).equals(b)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.b));

                        } else if (i.substring(0, 1).equals(c)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.c));

                        } else if (i.substring(0, 1).equals(d)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.d));

                        } else if (i.substring(0, 1).equals(e)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.e));

                        } else if (i.substring(0, 1).equals(f)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.f));

                        } else if (i.substring(0, 1).equals(g)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.g));

                        } else if (i.substring(0, 1).equals(h)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.h));

                        } else if (i.substring(0, 1).equals(ii)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.i));

                        } else if (i.substring(0, 1).equals(j)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.j));

                        } else if (i.substring(0, 1).equals(k)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.k));

                        } else if (i.substring(0, 1).equals(l)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.l));

                        } else if (i.substring(0, 1).equals(m)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.m));

                        } else if (i.substring(0, 1).equals(n)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.n));

                        } else if (i.substring(0, 1).equals(o)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.o));

                        } else if (i.substring(0, 1).equals(p)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.p));

                        } else if (i.substring(0, 1).equals(q)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.q));

                        } else if (i.substring(0, 1).equals(r)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.r));

                        } else if (i.substring(0, 1).equals(s)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.s));

                        } else if (i.substring(0, 1).equals(t)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.t));

                        } else if (i.substring(0, 1).equals(u)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.u));

                        } else if (i.substring(0, 1).equals(v)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.v));

                        } else if (i.substring(0, 1).equals(w)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.w));

                        } else if (i.substring(0, 1).equals(x)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.x));

                        } else if (i.substring(0, 1).equals(y)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.y));

                        } else if (i.substring(0, 1).equals(z)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.z));

                        } else {
                           // holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.incoming, R.drawable.circle));

                        }


                        // holder.add(new log_model(cursor.getString(name),cursor.getString(num),date1.toString(),cursor.getString(duration) + "s",R.drawable.telephone, R.drawable.incoming, R.drawable.b));

                    }

                }
                else if (cursor.getString(type).equals(two)) {

                    String soumen = cursor.getString(name);


                    if (soumen == null) {
                        holder.add(new log_model(cursor.getString(num), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.user));

                    }
                    else {

                        check=true;
                        //String aa = "A";


                        if (soumen.length() >= 1 && soumen.substring(0, 1).equals(a)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.a));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(b)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.b));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(c)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.c));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(d)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.d));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(e)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.e));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(f)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.f));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(g)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.g));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(h)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.h));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(ii)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.i));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(j)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.j));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(k)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.k));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(l)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.l));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(m)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.m));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(n)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.n));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(o)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.o));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(p)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.p));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(q)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.q));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(r)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.r));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(s)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.s));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(t)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.t));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(u)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.u));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(v)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.v));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(w)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.w));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(x)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.x));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(y)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.y));

                        } else if (soumen.length() >= 1 && soumen.substring(0, 1).equals(z)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.z));

                        } else {
                            //holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.outgoing, R.drawable.circle));

                        }


                        //holder.add(new log_model(cursor.getString(name),cursor.getString(num),date1.toString(),cursor.getString(duration) + "s",R.drawable.telephone, R.drawable.outgoing,R.drawable.b));

                    }

                }
                else if (cursor.getString(type).equals(three)) {

                    String soumen = cursor.getString(name);
                    if (soumen == null) {
                        holder.add(new log_model(cursor.getString(num), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.user));

                    } else {


                        String i = soumen;

                        check=true;
                        if (soumen.length() >= 1 && i.substring(0, 1).equals(a)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.a));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(b)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.b));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(c)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.c));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(d)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.d));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(e)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.e));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(f)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.f));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(g)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.g));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(h)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.h));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(ii)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.i));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(j)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.j));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(k)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.k));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(l)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.l));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(m)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.m));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(n)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.n));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(o)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.o));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(p)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.p));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(q)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.q));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(r)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.r));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(s)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.s));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(t)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.t));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(u)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.u));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(v)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.v));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(w)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.w));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(x)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.x));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(y)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.y));

                        } else if (soumen.length() >= 1 && i.substring(0, 1).equals(z)) {
                            holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.z));

                        } else {
                           // holder.add(new log_model(cursor.getString(name), cursor.getString(num), date1.toString(), cursor.getString(duration) + "s", R.drawable.telephone, R.drawable.missed, R.drawable.circle));

                        }
                        // holder.add(new log_model(cursor.getString(name),cursor.getString(num),date1.toString(),cursor.getString(duration) + "s",R.drawable.telephone, R.drawable.missed, R.drawable.b));

                    }

                }


            }
            else
            {
                //check = false;

            }


            /*if(check==false)
            {
                holder.add(new log_model("none", "none","none", "none", R.drawable.telephone, R.drawable.circle, R.drawable.user));

            }*/
        }

        if(check==false)
        {
            holder.add(new log_model("None", "none", "none", " " + " ", R.drawable.telephone, R.drawable.circle, R.drawable.circle));

        }
        return holder;

    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.logmenu, menu);
        MenuItem item = menu.findItem(R.menu.logmenu);

        SearchView searchView = (SearchView)menu.findItem(R.id.action_search).getActionView();

        searchView.setSearchableInfo(searchView.getSearchableInfo(getComponentName()));


        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adl.getFilter().filter(newText);
                return false;
            }
        });



        return super.onCreateOptionsMenu(menu);
    }*/













}