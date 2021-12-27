package com.example.mainactivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.PermissionRequest;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.single.PermissionListener;

public class form extends AppCompatActivity {

    String[] course = {"MBA Tech","B.Tech","BTI","M.Tech"};
    String[] branch ={"Computer Engineering","Information Technology","Artificial Intelligence","Data Science","Computer Science and Business Systems (CSBS)","Mechanical Engineering","Civil Engineering","Electronics and Telecommunications","Mechatronics"};

    Button submitButton1;
    Button submitButton2;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Spinner spin1 = (Spinner) findViewById(R.id.spinner_course);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, course);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa);

        Spinner spin2 = (Spinner) findViewById(R.id.spinner_branch);
        ArrayAdapter<String> bb = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, branch);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(bb);
    }

    @Override
    protected void onResume() {
        super.onResume();

        submitButton1 = findViewById(R.id.button2);
        submitButton2 = findViewById(R.id.button1);
        imageView = findViewById(R.id.imageView2);

        submitButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit1();
            }
        });

        submitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit2();
            }
        });

    }

    private void submit1() {
        Intent intent =new Intent(this, Home_Screen.class);
        startActivity(intent);

    }

    private void submit2() {
        Dexter.withActivity(form.this)
                .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {

                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {

                        Intent intent=new Intent(Intent.ACTION_PICK);
                        intent.setType("image/*");
                        startActivityForResult(Intent.createChooser(intent,"select image"),1);
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(com.karumi.dexter.listener.PermissionRequest permissionRequest, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }

                }).check();

    }
}