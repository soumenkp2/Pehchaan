package com.example.pehchaan;

import android.content.Intent;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link homefragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class homefragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public homefragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment homefragment.
     */
    // TODO: Rename and change types and number of parameters
    public static homefragment newInstance(String param1, String param2) {
        homefragment fragment = new homefragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_homefragment, container, false);

        ImageView nd = (ImageView) v.findViewById(R.id.about);

        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), aboutus.class);
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



        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DrawerLayout dr = ((MainActivity)getActivity()).findViewById(R.id.drawer_layout);
                dr.openDrawer(GravityCompat.START);
            }
        });



        logs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), logs.class);
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


        add1.setOnClickListener(new View.OnClickListener() {
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
                i.putExtra("emergencytomain","checkemergency");
                startActivity(i);


            }
        });

        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), MainActivity.class);
                i.putExtra("emergencytomain","checkemergency");
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
                i.putExtra("booktomain","book");
                startActivity(i);


            }
        });






        return v;

    }
}