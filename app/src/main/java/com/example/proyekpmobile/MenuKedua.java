package com.example.proyekpmobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MenuKedua extends AppCompatActivity {
    private static final String TAG = "MenuKedua";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kedua);

        Log.d(TAG, "Ini ada di Menu Pick Up");


        Button button = findViewById(R.id.buttonSubmit);
       //final EditText editpesan = findViewById(R.id.editpesan);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+6289654524950";
               // String message = editpesan.getText().toString();

                Uri uri = Uri.parse("smsto:" + phoneNumber);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.setPackage("com.whatsapp");
                //intent.putExtra("sms_body", message);

                try {
                    startActivity(intent);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MenuKedua.this, "WhatsApp not installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    private boolean appinstalledOrNot(String url){
        PackageManager packageManager = getPackageManager();
        boolean app_installed;
        try{
            packageManager.getPackageInfo(url, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        }catch (PackageManager.NameNotFoundException e){
            app_installed = false;
        }
        return app_installed;
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Ini ada di onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Ini ada di onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Ini ada di onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Ini ada di onDestroy");
    }
}
