package com.example.alertdialog_toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Toast toast = new Toast(this);
    }

    public void Toast(View view){
        Toast.makeText(getApplicationContext(), "Hello world", Toast.LENGTH_SHORT).show();
        //Toast  toast =Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG);
        //toast .setGravity(Gravity.CENTER, 0, 0);

        //toast.show();
    }
    public void AlertDialog(View view){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("對話框測試");
        alertDialog.setMessage("這是一個對話視窗");
        alertDialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }


}