package com.murillo.murillo_emmanuele_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {
    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Subjects Taken");
        try {
            FileInputStream reader = openFileInput("data.txt");
            int token;

            while ((token = reader.read()) != -1) {
                data = data + (char) token;
            }


            try {

                String[] list = data.split(" ");
                ((CheckBox) (findViewById(R.id.cb1))).setText(list[0]);
                ((CheckBox) (findViewById(R.id.cb2))).setText(list[1]);
                ((CheckBox) (findViewById(R.id.cb3))).setText(list[2]);
                ((CheckBox) (findViewById(R.id.cb4))).setText(list[3]);
                ((CheckBox) (findViewById(R.id.cb5))).setText(list[4]);
                ((CheckBox) (findViewById(R.id.cb6))).setText(list[5]);
                ((CheckBox) (findViewById(R.id.cb7))).setText(list[6]);
                ((CheckBox) (findViewById(R.id.cb8))).setText(list[7]);

            } finally {

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


