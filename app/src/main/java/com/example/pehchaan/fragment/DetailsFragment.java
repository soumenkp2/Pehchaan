package com.example.pehchaan.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pehchaan.activity.HistoryActivity;
import com.example.pehchaan.activity.MainActivity;
import com.example.pehchaan.R;

public class DetailsFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        setContentView(R.layout.activity_details);

        ImageView image = (ImageView) findViewById(R.id.image);
        TextView text = (TextView) findViewById(R.id.name);
        TextView number = (TextView) findViewById(R.id.number);

        image.setImageResource(getIntent().getIntExtra("imagename", 0));
        text.setText(getIntent().getStringExtra("name"));
        number.setText(getIntent().getStringExtra("number"));

        //Transfering number to history activity from details activity
        String num = getIntent().getStringExtra("number");
        String nm = getIntent().getStringExtra("name");


        Button history = (Button) findViewById(R.id.callhistory);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent (DetailsFragment.this , HistoryActivity.class);
                i.putExtra("number", num);
                i.putExtra("name", nm);
                startActivity(i);


            }
        });

        ImageView back = (ImageView) findViewById(R.id.back_details);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soumen = "book";
                Intent i = new Intent(DetailsFragment.this, MainActivity.class);
                i.putExtra("book", soumen);

                startActivity(i);
            }
        });


        ImageView call = (ImageView) findViewById(R.id.details_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = "tel:" + getIntent().getStringExtra("number");
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(s));
                startActivity(i);


            }
        });


        ImageView mssg = (ImageView) findViewById(R.id.details_mssg);
        mssg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("smsto:"));
                i.setType("vnd.android-dir/mms-sms");
                i.putExtra("address", num);
                //sms1.putExtra("sms_body", "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n" + message);

                try
                {
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                    //startActivity(i);
                   // Toast.makeText(context,"sent sucessfully!",Toast.LENGTH_SHORT).show();
                }
                catch (android.content.ActivityNotFoundException ex)
                {

                    Toast.makeText(DetailsFragment.this,"oops! failed",Toast.LENGTH_SHORT).show();
                }



            }
        });


        ImageView edit = (ImageView) findViewById(R.id.details_edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {

                long idContact = 0;
                Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                Cursor cursor = getApplicationContext().getContentResolver().query(uri, null, null, null, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC");
                if (cursor.moveToFirst()) {
                    idContact = cursor.getLong(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_ID));
                }


                Intent i = new Intent(Intent.ACTION_EDIT);
                Uri contactUri = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, idContact);
                i.setData(contactUri);
                //i.putExtra("Name", true);



                i.putExtra(ContactsContract.Intents.Insert.NAME, nm);
                i.putExtra(ContactsContract.Intents.Insert.PHONE, getIntent().getStringExtra("number"));
                i.putExtra("finishActivityOnSaveCompleted", true);
                startActivity(i);











            }
        });






    }
}