package com.example.pehchaan.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;

import com.example.pehchaan.R;
import com.example.pehchaan.databinding.ActivityAddContactsBinding;

public class AddContactsActivity extends AppCompatActivity {

    ActivityAddContactsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddContactsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.firstNameET.getText().toString().isEmpty()) {
                    binding.firstNameET.setError("* Required");
                }else if (binding.phoneNumET.getText().toString().isEmpty()) {
                    binding.phoneNumET.setError("* Required");
                }else {
                    addContact(binding.firstNameET.getText().toString() + " " + binding.firstNameET.getText().toString(),
                            binding.phoneNumET.getText().toString());
                    finish();
                }
            }
        });
    }

    public void addContact(String displayName, String phoneNumber) {
        ContentResolver contentResolver = getContentResolver();

        // Create a new raw contact
        ContentValues values = new ContentValues();
        values.put(ContactsContract.RawContacts.ACCOUNT_TYPE, "");
        values.put(ContactsContract.RawContacts.ACCOUNT_NAME, "");
        android.net.Uri rawContactUri = contentResolver.insert(ContactsContract.RawContacts.CONTENT_URI, values);
        long rawContactId = Long.parseLong(rawContactUri.getLastPathSegment());

        // Add contact display name
        values.clear();
        values.put(ContactsContract.Data.RAW_CONTACT_ID, rawContactId);
        values.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE);
        values.put(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME, displayName);
        contentResolver.insert(ContactsContract.Data.CONTENT_URI, values);

        // Add contact phone number
        values.clear();
        values.put(ContactsContract.Data.RAW_CONTACT_ID, rawContactId);
        values.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE);
        values.put(ContactsContract.CommonDataKinds.Phone.NUMBER, phoneNumber);
        values.put(ContactsContract.CommonDataKinds.Phone.TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE);
        contentResolver.insert(ContactsContract.Data.CONTENT_URI, values);

        Toast.makeText(this, "Contact Saved Successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}