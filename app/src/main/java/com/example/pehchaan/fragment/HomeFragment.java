package com.example.pehchaan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pehchaan.activity.AddContactsActivity;
import com.example.pehchaan.activity.LogsActivity;
import com.example.pehchaan.activity.MainActivity;
import com.example.pehchaan.R;
import com.example.pehchaan.activity.AboutUsActivity;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ImageView nd = (ImageView) v.findViewById(R.id.about);
        Toast.makeText(requireContext(),"Welcome to Pehchaan", Toast.LENGTH_SHORT).show();

        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AboutUsActivity.class);
                startActivity(i);
            }
        });

        ImageView add1 = (ImageView) v.findViewById(R.id.addcontacts);
        ImageView emergencyicon = (ImageView) v.findViewById(R.id.emg);
        ImageView bookicon = (ImageView) v.findViewById(R.id.bookicon);
        CardView card12 = (CardView) v.findViewById(R.id.emgcard);
        ImageView add2 = (ImageView) v.findViewById(R.id.addcontacts2);
        ImageView logs = (ImageView) v.findViewById(R.id.logs);
        ImageView toggle = (ImageView) v.findViewById(R.id.toggle);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(ContactsContract.Intents.Insert.ACTION);
//                i.setType(ContactsContract.RawContacts.CONTENT_TYPE);
//
//                i.putExtra(ContactsContract.Intents.Insert.PHONE, " ");
//                i.putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);
//
//                startActivity(i);
                Intent intent = new Intent(getActivity(), AddContactsActivity.class);
                startActivity(intent);
            }
        });

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DrawerLayout dr = ((MainActivity) getActivity()).findViewById(R.id.drawer_layout);
                dr.openDrawer(GravityCompat.START);
            }
        });


        logs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), LogsActivity.class);
                startActivity(intent);
            }
        });


        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactsContract.Intents.Insert.ACTION);
                i.setType(ContactsContract.RawContacts.CONTENT_TYPE);

                i.putExtra(ContactsContract.Intents.Insert.PHONE, " ");
                i.putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);

                startActivity(i);
            }
        });


        emergencyicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                t.replace(R.id.container, new emergency());
                t.commit();*/

                Intent i = new Intent(getActivity(), MainActivity.class);
                i.putExtra("emergencytomain", "checkemergency");
                startActivity(i);


            }
        });

        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), MainActivity.class);
                i.putExtra("emergencytomain", "checkemergency");
                startActivity(i);


            }
        });

        bookicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                t.replace(R.id.container, new book());
                t.commit();*/

                Intent i = new Intent(getActivity(), MainActivity.class);
                i.putExtra("booktomain", "book");
                startActivity(i);


            }
        });


        return v;

    }
}