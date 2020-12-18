package com.example.mygooglemap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng Urdaneta = new LatLng(15.9758, 120.5707);
        mMap.addMarker(new MarkerOptions().position(Urdaneta).title("Urdaneta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Urdaneta));

        //MARKERS
        //meljean
        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(16.0506, 120.4934))
                .anchor(0.5f, 0.5f)
                .title("Location")
                .snippet("Meljean's Location"));

       //marissa
        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(16.0788, 120.4473))
                .anchor(0.5f, 0.5f)
                .title("Location")
                .snippet("Marissa's Location"));

        //joshua
        Marker m3 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(16.0044, 120.6545))
                .anchor(0.5f, 0.5f)
                .title("Location")
                .snippet("Joshua's Location"));

//location's circle

        //meljean
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.0506, 120.4934))
                .radius(4000)
                .strokeWidth(8)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(130, 0, 250, 0)));

        //marissa
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.0788, 120.4473))
                .radius(4000)
                .strokeWidth(8)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(130, 0, 250, 0)));

        //josh
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.0044, 120.6545))
                .radius(4000)
                .strokeWidth(8)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(130, 0, 250, 0)));

        //urda
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9758, 120.5707))
                .radius(4000)
                .strokeWidth(8)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(130, 0, 250, 0)));


        //route to school

        //meljean
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.0506, 120.4934),
                        new LatLng(16.0445, 120.4888),
                        new LatLng(16.0174, 120.5147),
                        new LatLng(15.9950, 120.5404),
                        new LatLng(15.9891, 120.5462),
                        new LatLng(15.9758, 120.5707))
                .width(10)
                .color(Color.RED));

        //joshua
        mMap.addPolyline(new PolylineOptions()
        .add(new LatLng(16.0044, 120.6545),
                new LatLng(15.9946, 120.6488),
                new LatLng(15.9874, 120.6368),
                new LatLng(15.9803, 120.6244),
                new LatLng(15.9775, 120.6083),
                new LatLng(15.9758, 120.5707))
                .width(10)
                .color(Color.RED));

        //marissa
        mMap.addPolyline(new PolylineOptions()
        .add(new LatLng(16.0788, 120.4473),
                new LatLng(16.0445, 120.4888),
                new LatLng(16.0174, 120.5147),
                new LatLng(15.9950, 120.5404),
                new LatLng(15.9891, 120.5462),
                new LatLng(15.9758, 120.5707))
                .width(10)
                .color(Color.RED));

        enableMyLocation();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);

    }

    public void enableMyLocation(){
    }
}