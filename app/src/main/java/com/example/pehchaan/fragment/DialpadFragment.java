package com.example.pehchaan.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pehchaan.R;

import java.util.ArrayList;

public class DialpadFragment extends Fragment {

    public DialpadFragment() {
        // Required empty public constructor
    }

    public static DialpadFragment newInstance(String param1, String param2) {
        DialpadFragment fragment = new DialpadFragment();
        return fragment;
    }

    ArrayList<String> String = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_dialpad, container, false);


        TextView one = (TextView) v.findViewById(R.id.one);
        TextView three = (TextView) v.findViewById(R.id.three);
        TextView four = (TextView) v.findViewById(R.id.four);
        TextView five = (TextView) v.findViewById(R.id.five);
        TextView six = (TextView) v.findViewById(R.id.six);
        TextView two = (TextView) v.findViewById(R.id.two);
        TextView sevens = (TextView) v.findViewById(R.id.sevens);
        TextView eight = (TextView) v.findViewById(R.id.eight);
        TextView nine = (TextView) v.findViewById(R.id.nine);
        TextView star = (TextView) v.findViewById(R.id.star);
        TextView zero = (TextView) v.findViewById(R.id.zero);
        TextView hash = (TextView) v.findViewById(R.id.hash);

        ImageView call = (ImageView) v.findViewById(R.id.call);
        ImageView delete = (ImageView) v.findViewById(R.id.delete);
        ImageView backspace = (ImageView) v.findViewById(R.id.backspace);
        ImageView add = (ImageView) v.findViewById(R.id.add);
        TextView shownum = (TextView) v.findViewById(R.id.shownum);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("1");


                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("2");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("3");


                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("4");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("5");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("6");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        sevens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String.add("7");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("8");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("9");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("0");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("*");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("#");

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = String.size() - 1; i >= 0; i--) {
                    String.remove(i);
                }

                String soumen = "";

                soumen = soumen;

                shownum.setText(soumen);

            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (String.size() > 0) {
                    String.remove(String.size() - 1);
                } else {

                }


                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);


            }
        });


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (String.size() - 1 >= 1) {
                    String soumen = "";
                    for (int i = 0; i < String.size(); i++) {
                        soumen = soumen + String.get(i);
                    }

                    String s = "tel:" + soumen;
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse(s));
                    startActivity(i);

                } else {
                    Toast.makeText(getContext(), "Enter Valid Number", Toast.LENGTH_SHORT).show();
                }


            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String soumen = "";
                for (int i = 0; i < String.size(); i++) {
                    soumen = soumen + String.get(i);
                }

                Intent i = new Intent(ContactsContract.Intents.Insert.ACTION);
                i.setType(ContactsContract.RawContacts.CONTENT_TYPE);

                i.putExtra(ContactsContract.Intents.Insert.PHONE, soumen);
                i.putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);

                startActivity(i);


            }
        });


        return v;


    }
}