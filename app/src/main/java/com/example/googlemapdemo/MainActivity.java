package com.example.googlemapdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng RawonNguling = new LatLng(-7.717986, 113.081713);
        map.addMarker(new MarkerOptions().position(RawonNguling).title("Rawon Nguling"));
        map.moveCamera(CameraUpdateFactory.newLatLng(RawonNguling));

        LatLng RMSriTanjung = new LatLng(-7.719597, 113.084758);
        map.addMarker(new MarkerOptions().position(RMSriTanjung).title("RM SriTanjung"));
        map.moveCamera(CameraUpdateFactory.newLatLng(RMSriTanjung));

        LatLng RMWarket = new LatLng(-7.720274, 113.086002);
        map.addMarker(new MarkerOptions().position(RMWarket).title("RM Warket"));
        map.moveCamera(CameraUpdateFactory.newLatLng(RMWarket));

        LatLng RMTongasAsri = new LatLng(-7.722362, 113.090517);
        map.addMarker(new MarkerOptions().position(RMTongasAsri).title("RM Tongas Asri"));
        map.moveCamera(CameraUpdateFactory.newLatLng(RMTongasAsri));

        LatLng RMMorena = new LatLng(-7.717770, 113.071331);
        map.addMarker(new MarkerOptions().position(RMMorena).title("RM Morena"));
        map.moveCamera(CameraUpdateFactory.newLatLng(RMMorena));

        LatLng RMNdeso = new LatLng(-7.717637, 113.069740);
        map.addMarker(new MarkerOptions().position(RMNdeso).title("RM Ndeso"));
        map.moveCamera(CameraUpdateFactory.newLatLng(RMNdeso));

        LatLng RMBiru = new LatLng(-7.717678, 113.069048);
        map.addMarker(new MarkerOptions().position(RMBiru).title("RM Biru"));
        map.moveCamera(CameraUpdateFactory.newLatLng(RMBiru));

    }
}
