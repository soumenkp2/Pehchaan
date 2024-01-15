package com.example.pehchaan.fragment;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pehchaan.R;
import com.example.pehchaan.adapter.MyAdapter;
import com.example.pehchaan.model.Model;

import java.util.ArrayList;

public class BookFragment extends Fragment {

    public RecyclerView rcv;
    public MyAdapter ad;

    private ArrayList<Model> originalData;
    private EditText searchEditText;

    public BookFragment() {
        // Required empty public constructor
    }

    public static BookFragment newInstance() {
        BookFragment fragment = new BookFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else {

        }

        View v = inflater.inflate(R.layout.fragment_book, container, false);
        Toast.makeText(requireContext(), "Explore Your Contacts!", Toast.LENGTH_SHORT).show();

        rcv = (RecyclerView) v.findViewById(R.id.recycle);
        rcv.setLayoutManager(new LinearLayoutManager(getContext()));

        ad = new MyAdapter(dataque(), getContext());

        rcv.setAdapter(ad);


        rcv.setLayoutManager(new LinearLayoutManager(getContext()));

        originalData = dataque(); // Store original data for filtering
        ad = new MyAdapter(originalData, getContext());
        rcv.setAdapter(ad);

        searchEditText = v.findViewById(R.id.searchEditText);
        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Not used
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Filter the data based on user input
                filterData(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Not used
            }
        });


        return v;
    }

    @SuppressLint("Range")
    public ArrayList<Model> dataque() {


        ArrayList<Model> holder = new ArrayList<>();

        Cursor cursor = getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, ContactsContract.Contacts.DISPLAY_NAME + " ASC ");
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

        while (cursor.moveToNext()) {
            String i = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));


            if (i.substring(0, 1).equals(a) || i.substring(0, 1).equals(aa)) {

                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.a, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(b) || i.substring(0, 1).equals(bb)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.b, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(c) || i.substring(0, 1).equals(cc)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.c, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(d) || i.substring(0, 1).equals(dd)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.d, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(e) || i.substring(0, 1).equals(ee)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.e, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(f) || i.substring(0, 1).equals(ff)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.f, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(g) || i.substring(0, 1).equals(gg)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.g, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(h) || i.substring(0, 1).equals(hh)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.h, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(ii) || i.substring(0, 1).equals(iii)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.i, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(j) || i.substring(0, 1).equals(jj)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.j, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(k) || i.substring(0, 1).equals(kk)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.k, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(l) || i.substring(0, 1).equals(ll)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.l, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(m) || i.substring(0, 1).equals(mm)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.m, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(n) || i.substring(0, 1).equals(nn)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.n, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(o) || i.substring(0, 1).equals(oo)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.o, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(p) || i.substring(0, 1).equals(pp)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.p, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(q) || i.substring(0, 1).equals(qq)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.q, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(r) || i.substring(0, 1).equals(rr)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.r, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(s) || i.substring(0, 1).equals(ss)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.s, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(t) || i.substring(0, 1).equals(tt)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.t, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(u) || i.substring(0, 1).equals(uu)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.u, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(v) || i.substring(0, 1).equals(vv)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.v, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(w) || i.substring(0, 1).equals(ww)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.w, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(x) || i.substring(0, 1).equals(xx)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.x, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else if (i.substring(0, 1).equals(y) || i.substring(0, 1).equals(yy)) {

                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.y, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));


            } else if (i.substring(0, 1).equals(z) || i.substring(0, 1).equals(zz)) {
                if (i.equals(previous)) {
                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.z, R.drawable.telephone, R.drawable.chat));
                }
                previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            } else {
                if (!i.equals(previous)) {
                    previous = (String) cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

                    holder.add(new Model(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY)), cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)), R.drawable.user, R.drawable.telephone, R.drawable.chat));

                } else {
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


    private void filterData(String query) {
        ArrayList<Model> filteredData = new ArrayList<>();
        for (Model model : originalData) {
            // Add models that match the search query
            if (model.getTxt().toLowerCase().contains(query.toLowerCase())) {
                filteredData.add(model);
            }
        }
        ad.setData(filteredData); // Update adapter with filtered data
        ad.notifyDataSetChanged();
    }


}