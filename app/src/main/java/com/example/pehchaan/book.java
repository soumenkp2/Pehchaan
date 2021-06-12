package com.example.pehchaan;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link book#newInstance} factory method to
 * create an instance of this fragment.
 */
public class book extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public RecyclerView rcv;
    public myadapter ad;


    public book() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment book.
     */
    // TODO: Rename and change types and number of parameters
    public static book newInstance(String param1, String param2) {
        book fragment = new book();
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

        if(ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE},1);
        }
        else
        {

        }

        View v = inflater.inflate(R.layout.fragment_book, container, false);

        rcv = (RecyclerView) v.findViewById(R.id.recycle);
        rcv.setLayoutManager(new LinearLayoutManager(getContext()));

        ad = new myadapter(dataque(), getContext());

        rcv.setAdapter(ad);


        return v;



    }


    public ArrayList<model> dataque() {


        ArrayList<model> holder = new ArrayList<>();

        Cursor cursor = getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null , ContactsContract.Contacts.DISPLAY_NAME + " ASC ");
        cursor.moveToFirst();

        String aa = "a";
        String bb = "b";
        String cc = "c";
        String dd = "d";
        String ee = "e";
        String ff = "f";
        String gg = "g";
        String hh = "h";
        String iii = "i";
        String jj = "j";
        String kk = "k";
        String ll = "l";
        String mm = "m";
        String nn = "n";
        String oo = "o";
        String pp = "p";
        String qq = "q";
        String rr = "r";
        String ss = "s";
        String tt = "t";
        String uu = "u";
        String vv = "v";
        String ww = "w";
        String xx = "x";
        String yy = "y";
        String zz = "z";

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

        String previous = "djwdjdmo";

        while(cursor.moveToNext())
        {
            String i =  (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));


            if(i.substring(0,1).equals(a) || i.substring(0,1).equals(aa) )
            {

                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.a, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(b) || i.substring(0,1).equals(bb) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.b, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(c) || i.substring(0,1).equals(cc))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.c, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(d) || i.substring(0,1).equals(dd))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.d, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(e) || i.substring(0,1).equals(ee))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.e, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(f) || i.substring(0,1).equals(ff) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.f, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(g) || i.substring(0,1).equals(gg) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.g, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(h) || i.substring(0,1).equals(hh))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.h, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(ii) || i.substring(0,1).equals(iii))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.i, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(j) || i.substring(0,1).equals(jj) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.j, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(k) || i.substring(0,1).equals(kk))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.k, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(l) || i.substring(0,1).equals(ll))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.l, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(m) || i.substring(0,1).equals(mm) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.m, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(n) || i.substring(0,1).equals(nn))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.n, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(o) || i.substring(0,1).equals(oo))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.o, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(p) || i.substring(0,1).equals(pp) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.p, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(q) || i.substring(0,1).equals(qq))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.q, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(r) || i.substring(0,1).equals(rr))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.r, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(s) || i.substring(0,1).equals(ss) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.s, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(t) || i.substring(0,1).equals(tt))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.t, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(u) || i.substring(0,1).equals(uu) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.u, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(v) || i.substring(0,1).equals(vv))
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.v, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(w) || i.substring(0,1).equals(ww) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.w, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(x) || i.substring(0,1).equals(xx) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.x, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else if(i.substring(0,1).equals(y) || i.substring(0,1).equals(yy))
            {

                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.y, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));


            }
            else if(i.substring(0,1).equals(z) || i.substring(0,1).equals(zz) )
            {
                if(i.equals(previous))
                {
                    holder.add(new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.z, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            }
            else
            {
                if( !i.equals(previous))
                {
                    previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

                    holder.add( new model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.user,R.drawable.telephone,R.drawable.chat   ));

                }
                else {
                    previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

                }

            }


        }






















       /* ArrayList<model> holder = new ArrayList<>();


        Cursor cursor_Android_Contacts = null;
        ContentResolver contentResolver = getActivity().getContentResolver();


        try {
            cursor_Android_Contacts = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        } catch (Exception ex) {
            Log.e("Error on contact", ex.getMessage());
        }
//--</ get all Contacts >--

//----< Check: hasContacts >----
        if (cursor_Android_Contacts.getCount() > 0) {
//----< has Contacts >----
//----< @Loop: all Contacts >----
            while (cursor_Android_Contacts.moveToNext()) {
//< init >
                model android_contact = new model();
                String contact_id = cursor_Android_Contacts.getString(cursor_Android_Contacts.getColumnIndex(ContactsContract.Contacts._ID));
                String contact_display_name = cursor_Android_Contacts.getString(cursor_Android_Contacts.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                android_contact.setTxt(contact_display_name);
               // android_contact.setNumber("8077570708");
                android_contact.setImagename(R.drawable.circle);
                android_contact.setCall(R.drawable.telephone);
                android_contact.setMessage(R.drawable.chat);

                //holder.add(android_contact);


                int hasPhoneNumber = Integer.parseInt(cursor_Android_Contacts.getString(cursor_Android_Contacts.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER)));
                if (hasPhoneNumber > 0) {

                    Cursor phoneCursor = contentResolver.query(
                            ContactsContract.CommonDataKinds.Phone.CONTENT_URI
                            , null
                            , ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ?"
                            , new String[]{contact_id}
                            , null);

                    while (phoneCursor.moveToNext()) {
                        String phoneNumber = phoneCursor.getString(phoneCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
//< set >
                        android_contact.setNumber(phoneNumber);
//</ set >
                    }
                    phoneCursor.close();
                }

                holder.add(android_contact);
            }






        }*/


        return holder;




    }





}