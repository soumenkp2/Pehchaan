package com.example.pehchaan;

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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link dialpad#newInstance} factory method to
 * create an instance of this fragment.
 */
public class dialpad extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public dialpad() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment dialpad.
     */
    // TODO: Rename and change types and number of parameters
    public static dialpad newInstance(String param1, String param2) {
        dialpad fragment = new dialpad();
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

    ArrayList<String> String = new ArrayList<String>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v =  inflater.inflate(R.layout.fragment_dialpad, container, false);



        TextView one = (TextView) v.findViewById(R.id.one);
        TextView three = (TextView)v.findViewById(R.id.three);
        TextView four = (TextView) v.findViewById(R.id.four);
        TextView five = (TextView) v.findViewById(R.id.five);
        TextView six = (TextView) v.findViewById(R.id.six);
        TextView two = (TextView) v.findViewById(R.id.two);
        TextView sevens = (TextView) v.findViewById(R.id.sevens);
        TextView eight = (TextView) v.findViewById(R.id.eight);
        TextView nine = (TextView) v.findViewById(R.id.nine);
        TextView star = (TextView) v.findViewById(R.id.star);
        TextView zero = (TextView)v.findViewById(R.id.zero);
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


                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("2");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("3");


                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("4");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("5");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("6");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

       sevens.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String.add("7");

               String soumen="";
               for(int i=0;i<String.size();i++)
               {
                   soumen = soumen + String.get(i);
               }
               shownum.setText(soumen);
           }
       });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("8");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("9");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("0");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("*");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);
            }
        });

        hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String.add("#");

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=String.size()-1;i>=0;i--)
                {
                    String.remove(i);
                }

                String soumen="";

                    soumen = soumen ;

                shownum.setText(soumen);

            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(String.size()>0)
                {
                    String.remove(String.size()-1);
                }
                else
                {

                }


                String soumen="";
                for(int i=0;i<String.size();i++)
                {
                    soumen = soumen + String.get(i);
                }
                shownum.setText(soumen);



            }
        });


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(String.size()-1>=1)
                {
                    String soumen="";
                    for(int i=0;i<String.size();i++)
                    {
                        soumen = soumen + String.get(i);
                    }

                    String s = "tel:" + soumen;
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse(s));
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(getContext(),"Enter Valid Number",Toast.LENGTH_SHORT).show();
                }


            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String soumen="";
                for(int i=0;i<String.size();i++)
                {
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