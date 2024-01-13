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

import java.util.ArrayList;
import java.util.List;

public class EmergencyFragment extends Fragment {

    // these are constant value for checking of editView of particular Contact/Mess is enabled or disabled
    public int emergencyContact1 = 0;
    public int emergencyContact2 = 0;
    public int emergencyContact3 = 0;
    public int emergencyContact4 = 0;
    public int emergencyMessage = 0;

    public List<String> EmergencyContactNumber = new ArrayList<>();
    public String CustomEmergencyMess;

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
        View view = inflater.inflate(R.layout.fragment_emergency, container, false);

        Button send = (Button) view.findViewById(R.id.sendbtn);


        EditText customEmergencyMess = (EditText) view.findViewById(R.id.editmsg);
        SharedPreferences nummsg = this.getActivity().getSharedPreferences("phonenummsg", Context.MODE_PRIVATE);
        SharedPreferences.Editor editormsg = nummsg.edit();

        SharedPreferences nummsgg = this.getActivity().getSharedPreferences("phonenummsg", Context.MODE_PRIVATE);
        String StoredEmergecyCustomMessage = nummsgg.getString("nummsg", "Enter your message");
        customEmergencyMess.setText(StoredEmergecyCustomMessage);

        ImageView customEmergencyMess_Image = (ImageView) view.findViewById(R.id.txtmsg);
        customEmergencyMess_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        customEmergencyMess.setEnabled(false);


        EditText EmergencyNumber1 = (EditText) view.findViewById(R.id.edit1);
        SharedPreferences num1 = this.getActivity().getSharedPreferences("phonenum1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = num1.edit();

        SharedPreferences num1g = this.getActivity().getSharedPreferences("phonenum1", Context.MODE_PRIVATE);
        String StoredEmergecyContactNumber1 = num1g.getString("num1", "Enter Num1");
        EmergencyNumber1.setText(StoredEmergecyContactNumber1);

        ImageView EmergencyNumber1_Image = (ImageView) view.findViewById(R.id.txt1);
        EmergencyNumber1_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        EmergencyNumber1.setEnabled(false);


        EditText EmergencyNumber2 = (EditText) view.findViewById(R.id.edit2);
        SharedPreferences num2 = this.getActivity().getSharedPreferences("phonenum2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = num2.edit();

        SharedPreferences num2g = this.getActivity().getSharedPreferences("phonenum2", Context.MODE_PRIVATE);
        String StoredEmergecyContactNumber2 = num2g.getString("num2", "Enter Num2");
        EmergencyNumber2.setText(StoredEmergecyContactNumber2);

        ImageView EmergencyNumber2_Image = (ImageView) view.findViewById(R.id.txt2);
        EmergencyNumber2_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        EmergencyNumber2.setEnabled(false);


        EditText EmergencyNumber3 = (EditText) view.findViewById(R.id.edit3);
        SharedPreferences num3 = this.getActivity().getSharedPreferences("phonenum3", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor3 = num3.edit();

        SharedPreferences num3g = this.getActivity().getSharedPreferences("phonenum3", Context.MODE_PRIVATE);
        String StoredEmergecyContactNumber3 = num3g.getString("num3", "Enter Num3");
        EmergencyNumber3.setText(StoredEmergecyContactNumber3);

        ImageView EmergencyNumber3_Image = (ImageView) view.findViewById(R.id.txt3);
        EmergencyNumber3_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        EmergencyNumber3.setEnabled(false);


        EditText EmergencyNumber4 = (EditText) view.findViewById(R.id.edit4);
        SharedPreferences num4 = this.getActivity().getSharedPreferences("phonenum4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor4 = num4.edit();

        SharedPreferences num4g = this.getActivity().getSharedPreferences("phonenum4", Context.MODE_PRIVATE);
        String StoredEmergencyContactNumber4 = num4g.getString("num4", "Enter Num4");
        EmergencyNumber4.setText(StoredEmergencyContactNumber4);

        ImageView EmergencyNumber4_Image = (ImageView) view.findViewById(R.id.txt4);
        EmergencyNumber4_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
        EmergencyNumber4.setEnabled(false);


        EmergencyNumber1_Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emergencyContact1++;
                if (emergencyContact1 == 1) {
                    EmergencyNumber1_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    EmergencyNumber1.setEnabled(true);
                } else if (emergencyContact1 >= 2) {
                    String phonenum1 = EmergencyNumber1.getText().toString();
                    editor1.putString("num1", phonenum1);
                    editor1.apply();

                    String StoredEmergencyContactNumber1 = num1.getString("num1", "Enter Num1");
                    EmergencyNumber1.setText(StoredEmergencyContactNumber1);

                    EmergencyNumber1_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    EmergencyNumber1.setEnabled(false);
                    emergencyContact1 = 0;
                }


            }
        });


        EmergencyNumber2_Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emergencyContact2++;
                if (emergencyContact2 == 1) {
                    EmergencyNumber2_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    EmergencyNumber2.setEnabled(true);
                } else if (emergencyContact2 >= 2) {
                    String phonenum2 = EmergencyNumber2.getText().toString();
                    editor2.putString("num2", phonenum2);
                    editor2.apply();

                    String StoredEmergencyContactNumber2 = num2.getString("num2", "Enter Num2");
                    EmergencyNumber2.setText(StoredEmergencyContactNumber2);


                    EmergencyNumber2_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    EmergencyNumber2.setEnabled(false);
                    emergencyContact2 = 0;
                }


            }
        });


        EmergencyNumber3_Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emergencyContact3++;
                if (emergencyContact3 == 1) {
                    EmergencyNumber3_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    EmergencyNumber3.setEnabled(true);
                } else if (emergencyContact3 >= 2) {
                    String phonenum3 = EmergencyNumber3.getText().toString();
                    editor3.putString("num3", phonenum3);
                    editor3.apply();

                    String StoredEmergencyContactNumber3 = num3.getString("num3", "Enter Num3");
                    EmergencyNumber3.setText(StoredEmergencyContactNumber3);

                    EmergencyNumber3_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    EmergencyNumber3.setEnabled(false);
                    emergencyContact3 = 0;
                }



            }
        });


        EmergencyNumber4_Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emergencyContact4++;
                if (emergencyContact4 == 1) {
                    EmergencyNumber4_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    EmergencyNumber4.setEnabled(true);
                } else if (emergencyContact4 >= 2) {
                    String phonenum4 = EmergencyNumber4.getText().toString();
                    editor4.putString("num4", phonenum4);
                    editor4.apply();

                    String StoredEmergencyContactNumber4 = num4.getString("num4", "Enter Num4");
                    EmergencyNumber4.setText(StoredEmergencyContactNumber4);

                    EmergencyNumber4_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    EmergencyNumber4.setEnabled(false);
                    emergencyContact4 = 0;
                }


            }
        });


        customEmergencyMess_Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emergencyMessage++;
                if (emergencyMessage == 1) {
                    customEmergencyMess_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.dark));
                    customEmergencyMess.setEnabled(true);
                } else if (emergencyMessage >= 2) {
                    String msg = customEmergencyMess.getText().toString();
                    editormsg.putString("nummsg", msg);
                    editormsg.apply();

                    String StoredEmergencyCustomMessage = nummsg.getString("nummsg", "Enter your message");
                    customEmergencyMess.setText(StoredEmergencyCustomMessage);

                    customEmergencyMess_Image.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.light));
                    customEmergencyMess.setEnabled(false);
                    emergencyMessage = 0;
                }


            }
        });


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // save all the contact number in the EmergencyContactNumber array
                EmergencyContactNumber.add(num1.getString("num1", "Enter Num1"));
                EmergencyContactNumber.add(num2.getString("num2", "Enter Num2"));
                EmergencyContactNumber.add(num3.getString("num3", "Enter Num3"));
                EmergencyContactNumber.add(num4.getString("num4", "Enter Num4"));

                CustomEmergencyMess = nummsg.getString("nummsg", "Enter your message");

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
                    smsManager.sendTextMessage(EmergencyContactNumber.get(0), null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + CustomEmergencyMess, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }


                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(EmergencyContactNumber.get(1), null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + CustomEmergencyMess, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(EmergencyContactNumber.get(2), null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + CustomEmergencyMess, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }


                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(EmergencyContactNumber.get(3), null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + CustomEmergencyMess, null, null);
                } catch (Exception ex) {
                    Toast.makeText(getActivity(), ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }finally {
                    // A single toast efficiently conveys the message to the user.
                    Toast.makeText(getActivity(), "Message Sent",
                            Toast.LENGTH_LONG).show();
                }


            }
        });


        return view;
    }
}