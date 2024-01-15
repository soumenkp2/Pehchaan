package com.example.pehchaan.utils;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;


public class LocationManagerHelper {
    private Context context;

    public LocationManagerHelper(Context context) {
        this.context = context;
    }

    public Location getLastKnownLocation() {
        LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

        try {
            return locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String generateGoogleMapsLink(double latitude, double longitude) {
        return "https://www.google.com/maps?q=" + latitude + "," + longitude;
    }

}

