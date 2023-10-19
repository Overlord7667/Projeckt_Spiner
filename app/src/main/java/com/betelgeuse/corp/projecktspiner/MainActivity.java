package com.betelgeuse.corp.projecktspiner;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.betelgeuse.corp.projecktspiner.Adapters.AutoBrandsSpinnerAdapter;
import com.betelgeuse.corp.projecktspiner.AdditionalClases.AutoBrandClass;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity{

    //int i = 0;
    //Handler handler = new Handler();

//    private String[] autoBrands = {"Bugatti", "Lamborghini", "Ferrari", "Koenigsegg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AutoBrandClass> autoBrandsList = new ArrayList<>();

//        ArrayAdapter<String> autoBrandsAdapter = new ArrayAdapter<String>
//                (this, android.R.layout.simple_spinner_item, autoBrands);

//        autoBrandsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        autoBrandsList.add(new AutoBrandClass("Bugatti", R.drawable.bugatti));
        autoBrandsList.add(new AutoBrandClass("Ferrari", R.drawable.ferrari));
        autoBrandsList.add(new AutoBrandClass("Lamborghini", R.drawable.lamborghini));
        autoBrandsList.add(new AutoBrandClass("Koenigsegg", R.drawable.koenigsegg));

        Spinner spinAutoBrands = (Spinner) findViewById(R.id.multi);

        AutoBrandsSpinnerAdapter spinnerAdapter = new AutoBrandsSpinnerAdapter(this, autoBrandsList);

        spinAutoBrands.setAdapter(spinnerAdapter);

//        spinAutoBrands.setAdapter(autoBrandsAdapter);

        spinAutoBrands.setPrompt("Сars for sale");

        spinAutoBrands.setOnItemSelectedListener(onItemSelectedListener());

//        Button button = new Button(this);
//
//        Button button = findViewById(R.id.clickBtn);
//        //button.setText("Click");
//        //View activity = findViewById(R.layout.activity_main);
//        button.setWidth(500);
//        button.setHeight(200);
//        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) button.getLayoutParams();
//        params.setMargins(200, 500, 0,0);
//        button.setLayoutParams(params);
//        SeekBar seekBar = findViewById(R.id.seekBar);
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                Toast.makeText(MainActivity.this, "ProgressOn", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//                Toast.makeText(MainActivity.this, "StartOn", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//                Toast.makeText(MainActivity.this, "StopOn", Toast.LENGTH_SHORT).show();
//            }
//        });

//        ProgressBar secondProgressBar = findViewById(R.id.secondProgressBar);
//        Button btnStart = findViewById(R.id.start);
//        ProgressBar progressBar = findViewById(R.id.thirdProgressBar);
//        Random random = new Random();
//
//        btnStart.setOnClickListener(View -> {
//            handler.post(new Runnable() {
//                @Override
//                public void run() {
//                    if (progressBar.getProgress() < progressBar.getMax()){
//                    //i = i + 10 ;
//                    //progressBar.setProgress(i);
//                        //progressBar.incrementProgressBy(10);
//                        progressBar.incrementProgressBy(random.nextInt(50));
//                    }else {
//                        Toast.makeText(MainActivity.this , "Zamolneno", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    handler.postDelayed(this, 500);
//                }
//            });
////            if (i < progressBar.getMax()){
////                i = i + 10 ;
////                progressBar.setProgress(i);
////
////            }else {
////                Toast.makeText(this, "Zamolneno", Toast.LENGTH_SHORT).show();
////            }
//        });

//        DatePicker datePicker = findViewById(R.id.datePicker);
//        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
//                Toast.makeText(MainActivity.this, "Date " + i + " : " + i1 + " : " + i2, Toast.LENGTH_SHORT).show();
//            }
//        });

//        TimePicker timePicker = findViewById(R.id.timePicker);
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
//                Toast.makeText(MainActivity.this, "Tame " + i + " : " + i1, Toast.LENGTH_SHORT).show();
//            }
//        });

        //Button btn = findViewById(R.id.clickBtn);

    }
    AdapterView.OnItemSelectedListener onItemSelectedListener(){
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(getBaseContext(),"You bought " + adapterView.getSelectedItem().toString() , Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
    }
}