package com.apnatutorials.androidtogglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    ToggleButton tbSimple1, tbSimple2, tbCustom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbSimple1 = (ToggleButton) findViewById(R.id.tbSimple1);
        tbSimple2 = (ToggleButton) findViewById(R.id.tbSimple2);
        tbCustom = (ToggleButton) findViewById(R.id.tbCustom);

        tbSimple1.setOnCheckedChangeListener(this);
        tbSimple2.setOnCheckedChangeListener(this);
        tbCustom.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        switch (compoundButton.getId()){
            case R.id.tbSimple1:
                Toast.makeText(MainActivity.this, "tbSimple1 : isChecked : " + isChecked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbSimple2:
                Toast.makeText(MainActivity.this, "tbSimple2 : isChecked : " + isChecked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbCustom:
                Toast.makeText(MainActivity.this, "tbCustom : isChecked : " + isChecked, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
