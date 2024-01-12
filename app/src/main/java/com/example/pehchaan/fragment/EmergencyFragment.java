package com.example.pehchaan.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.pehchaan.R;

public class EmergencyFragment extends Fragment {
    public int ec1 = 0;
    public int ec2 = 0;
    public int ec3 = 0;
    public int ec4 = 0;
    public int ecmsg = 0;

    public EmergencyFragment() {
        // Required empty public constructor
    }

    public static EmergencyFragment newInstance(String param1, String param2) {
        EmergencyFragment fragment = new EmergencyFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_emergency, container, false);

        Button send = (Button) v.findViewById(R.id.sendbtn);


        EditText emsg = (EditText) v.findViewById(R.id.editmsg);
        SharedPreferences nummsg = this.getActivity().getSharedPreferences("phonenummsg", Context.MODE_PRIVATE);
        SharedPreferences.Editor editormsg = nummsg.edit();

        SharedPreferences nummsgg = this.getActivity().getSharedPreferences("phonenummsg", Context.MODE_PRIVATE);
        String valuemsg = nummsgg.getString("nummsg", "Enter your message");
        emsg.setText(valuemsg);

        ImageView tmsg = (ImageView) v.findViewById(R.id.txtmsg);
        tmsg.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        emsg.setEnabled(false);


        EditText e1 = (EditText) v.findViewById(R.id.edit1);
        SharedPreferences num1 = this.getActivity().getSharedPreferences("phonenum1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = num1.edit();

        SharedPreferences num1g = this.getActivity().getSharedPreferences("phonenum1", Context.MODE_PRIVATE);
        String value1 = num1g.getString("num1", "Enter num1");
        e1.setText(value1);

        ImageView t1 = (ImageView) v.findViewById(R.id.txt1);
        t1.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        e1.setEnabled(false);


        EditText e2 = (EditText) v.findViewById(R.id.edit2);
        SharedPreferences num2 = this.getActivity().getSharedPreferences("phonenum2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = num2.edit();

        SharedPreferences num2g = this.getActivity().getSharedPreferences("phonenum2", Context.MODE_PRIVATE);
        String value2 = num2g.getString("num2", "Enter Num2");
        e2.setText(value2);

        ImageView t2 = (ImageView) v.findViewById(R.id.txt2);
        t2.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        e2.setEnabled(false);


        EditText e3 = (EditText) v.findViewById(R.id.edit3);
        SharedPreferences num3 = this.getActivity().getSharedPreferences("phonenum3", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor3 = num3.edit();

        SharedPreferences num3g = this.getActivity().getSharedPreferences("phonenum3", Context.MODE_PRIVATE);
        String value3 = num3g.getString("num3", "Enter Num3");
        e3.setText(value3);

        ImageView t3 = (ImageView) v.findViewById(R.id.txt3);
        t3.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        e3.setEnabled(false);


        EditText e4 = (EditText) v.findViewById(R.id.edit4);
        SharedPreferences num4 = this.getActivity().getSharedPreferences("phonenum4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor4 = num4.edit();

        SharedPreferences num4g = this.getActivity().getSharedPreferences("phonenum4", Context.MODE_PRIVATE);
        String value4 = num4g.getString("num4", "Enter Num4");
        e4.setText(value4);

        ImageView t4 = (ImageView) v.findViewById(R.id.txt4);
        t4.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        e4.setEnabled(false);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ec1++;
                if (ec1 == 1) {
                    t1.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    e1.setEnabled(true);
                } else if (ec1 >= 2) {
                    String phonenum1 = e1.getText().toString();
                    editor1.putString("num1", phonenum1);
                    editor1.apply();

                    String value1 = num1.getString("num1", "Enter Num1");
                    e1.setText(value1);

                    t1.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    e1.setEnabled(false);
                    ec1 = 0;
                }


            }
        });


        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ec2++;
                if (ec2 == 1) {
                    t2.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    e2.setEnabled(true);
                } else if (ec2 >= 2) {
                    String phonenum2 = e2.getText().toString();
                    editor2.putString("num2", phonenum2);
                    editor2.apply();

                    String value2 = num2.getString("num2", "Enter Num2");
                    e2.setText(value2);


                    t2.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    e2.setEnabled(false);
                    ec2 = 0;
                }


            }
        });


        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ec3++;
                if (ec3 == 1) {
                    t3.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    e3.setEnabled(true);
                } else if (ec3 >= 2) {
                    String phonenum3 = e3.getText().toString();
                    editor3.putString("num3", phonenum3);
                    editor3.apply();

                    String value3 = num3.getString("num3", "Enter Num3");
                    e3.setText(value3);

                    t3.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    e3.setEnabled(false);
                    ec3 = 0;
                }


            }
        });


        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ec4++;
                if (ec4 == 1) {
                    t4.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    e4.setEnabled(true);
                } else if (ec4 >= 2) {
                    String phonenum4 = e4.getText().toString();
                    editor4.putString("num4", phonenum4);
                    editor4.apply();

                    String value4 = num4.getString("num4", "Enter Num4");
                    e4.setText(value4);

                    t4.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    e4.setEnabled(false);
                    ec4 = 0;
                }


            }
        });


        tmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ecmsg++;
                if (ecmsg == 1) {
                    tmsg.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    emsg.setEnabled(true);
                } else if (ecmsg >= 2) {
                    String msg = emsg.getText().toString();
                    editormsg.putString("nummsg", msg);
                    editormsg.apply();

                    String valuemsg = nummsg.getString("nummsg", "Enter your message");
                    emsg.setText(valuemsg);

                    tmsg.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    emsg.setEnabled(false);
                    ecmsg = 0;
                }


            }
        });


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // A single toast efficiently conveys the message to the user.
                Toast.makeText(getActivity(), "Message Sent",
                        Toast.LENGTH_LONG).show();

                String number1 = num1.getString("num1", "Enter Num1");
                String number2 = num2.getString("num2", "Enter Num2");
                String number3 = num3.getString("num3", "Enter Num3");
                String number4 = num4.getString("num4", "Enter Num4");

                String message = nummsg.getString("nummsg", "Enter your message");

                /*Intent sms1 = new Intent(Intent.ACTION_VIEW);
                sms1.setData(Uri.parse("smsto:"));
                sms1.setType("vnd.android-dir/mms-sms");
                sms1.putExtra("address", number1);
                sms1.putExtra("sms_body", "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n" + message);

                try
                {

                    startActivity(sms1);
                    Toast.makeText(getActivity(),"sent sucessfully!",Toast.LENGTH_SHORT).show();
                }
                catch (android.content.ActivityNotFoundException ex)
                {

                    Toast.makeText(getActivity(),"oops! failed",Toast.LENGTH_SHORT).show();
                }*/

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number1, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }


                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number2, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number3, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }


                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number4, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }


            }
        });


        return v;
    }
}