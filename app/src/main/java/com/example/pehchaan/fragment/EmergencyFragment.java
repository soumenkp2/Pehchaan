package com.example.pehchaan.fragment;


import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.pehchaan.R;
import com.example.pehchaan.utils.LocationManagerHelper;

public class EmergencyFragment extends Fragment {
    public int ec1 = 0;
    public int ec2 = 0;
    public int ec3 = 0;
    public int ec4 = 0;
    public int ecmsg = 0;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private static final int LOCATION_SETTINGS_REQUEST_CODE = 2;
    private LocationManagerHelper locationManagerHelper;

    private String number1 = "Enter Num1";
    private String number2 = "Enter Num2";
    private String number3 = "Enter Num3";
    private String number4 = "Enter Num4";
    private String message = "Enter your message";


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

        locationManagerHelper = new LocationManagerHelper(requireContext());

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

                number1 = num1.getString("num1", "Enter Num1");
                number2 = num2.getString("num2", "Enter Num2");
                number3 = num3.getString("num3", "Enter Num3");
                number4 = num4.getString("num4", "Enter Num4");

                message = nummsg.getString("nummsg", "Enter your message");

                locationRequest();


            }
        });


        return v;
    }


    private void retrieveUserLocation() {
        Location location = locationManagerHelper.getLastKnownLocation();

        LocationManager locationManager = (LocationManager) requireActivity().getSystemService(Context.LOCATION_SERVICE);
        boolean isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        Log.d("THIS",isGPSEnabled +"");


        if (location != null) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();

            // Generate Google Maps link and send SMS.
            sendLocationViaSMS(latitude, longitude);
        } else {
            // Handle case where location is unavailable.

            Toast.makeText(requireContext(), "Unable to retrieve location. Please try again", Toast.LENGTH_LONG).show();
//            // Optionally, provide the user with further instructions or actions.
//
//            // For example, you can show a button to open location settings.
//            showOpenLocationSettingsButton();
//
//            // Or you can show a button to retry retrieving the location.
//            showRetryButton();
        }
    }



    private void locationRequest() {
        // Check if the app has location permission, if not, request it.
        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // Request the permission.

            if (ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(), Manifest.permission.ACCESS_FINE_LOCATION)) {
                // Show an explanation if the user denied the permission previously.
                showPermissionRationaleDialog();
            } else {
                // No explanation needed; request the permission.
                requestLocationPermission();
            }
        } else {
            // Permission already granted, proceed with location retrieval.
            retrieveUserLocation();

        }
    }

    private void showPermissionRationaleDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle("Location Permission Required")
                .setMessage("Please grant location permission to use this feature.")
                .setPositiveButton("Grant", (dialog, which) -> requestLocationPermission())
                .setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss())
                .show();
    }

    private void requestLocationPermission() {
        ActivityCompat.requestPermissions(requireActivity(),
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                LOCATION_PERMISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, proceed with location retrieval.
                retrieveUserLocation();
            } else {
                // Permission denied; show a message or take appropriate action.
                Toast.makeText(requireContext(), "Location permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private void sendLocationViaSMS(double latitude, double longitude) {
        String googleMapsLink = locationManagerHelper.generateGoogleMapsLink(latitude, longitude);

        Log.d("THIS", googleMapsLink);


        Log.d("THIS", "Before sending SMS to number1");
        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number1, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message + "\n" + "Emergency! I need help. My current location: " + googleMapsLink, null, null);
            Log.d("THIS", "SMS sent successfully to number1");
            Toast.makeText(getActivity(), "Message Sent", Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Log.e("THIS", "Error sending SMS to number1: " + ex.getMessage());
            Toast.makeText(getActivity(), ex.getMessage().toString(), Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }

//        Log.d("THIS", "Sending SMS to number1: " + number1);
//        Log.d("THIS", "Sending SMS to number1: " + number2);


        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number2, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message + "\n" + "Emergency! I need help. My current location: " + googleMapsLink, null, null);
            Toast.makeText(getActivity(), "Message Sent",
                    Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Toast.makeText(getActivity(), ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number3, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message + "\n" + "Emergency! I need help. My current location: " + googleMapsLink, null, null);
            Toast.makeText(getActivity(), "Message Sent",
                    Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Toast.makeText(getActivity(), ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }


        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number4, null, "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n Message sent by him/her:\n" + message + "\n" + "Emergency! I need help. My current location: " + googleMapsLink, null, null);
            Toast.makeText(getActivity(), "Message Sent",
                    Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Toast.makeText(getActivity(), ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }


    }



//    private void showOpenLocationSettingsButton() {
//        // Use an AlertDialog to show a button that opens location settings.
//        new AlertDialog.Builder(requireContext())
//                .setTitle("Location Settings")
//                .setMessage("Location is disabled. Do you want to open location settings?")
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        openLocationSettings();
//                    }
//                })
//                .setNegativeButton("No", null)
//                .show();
//    }
//
//    private void openLocationSettings() {
//        // Open the location settings.
//        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
//        startActivity(intent);
//    }
//
//    private void showRetryButton() {
//        // Use an AlertDialog to show a button that allows the user to retry retrieving the location.
//        new AlertDialog.Builder(requireContext())
//                .setTitle("Retry")
//                .setMessage("Retry retrieving location?")
//                .setPositiveButton("Retry", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        retrieveUserLocation();
//                    }
//                })
//                .setNegativeButton("Cancel", null)
//                .show();
//    }


}