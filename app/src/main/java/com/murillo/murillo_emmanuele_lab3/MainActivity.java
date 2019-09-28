package com.murillo.murillo_emmanuele_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText c1, c2, c3, c4, c5, c6, c7, c8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.E1);
        c2 = findViewById(R.id.E2);
        c3 = findViewById(R.id.E3);
        c4 = findViewById(R.id.E4);
        c5 = findViewById(R.id.E5);
        c6 = findViewById(R.id.E6);
        c7 = findViewById(R.id.E7);
        c8 = findViewById(R.id.E8);
        setTitle("IT SUBJECTS");


    }

    public void saveD(View v) {
        String inp1 = c1.getText().toString() + ",";
        String inp2 = c2.getText().toString() + ",";
        String inp3 = c3.getText().toString() + ",";
        String inp4 = c4.getText().toString() + ",";
        String inp5 = c5.getText().toString() + ",";
        String inp6 = c6.getText().toString() + ",";
        String inp7 = c7.getText().toString() + ",";
        String inp8 = c8.getText().toString() + ",";
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data.txt", MODE_PRIVATE);
            writer.write(inp1.getBytes());
            writer.write(inp2.getBytes());
            writer.write(inp3.getBytes());
            writer.write(inp4.getBytes());
            writer.write(inp5.getBytes());
            writer.write(inp6.getBytes());
            writer.write(inp7.getBytes());
            writer.write(inp8.getBytes());


        } catch (FileNotFoundException e) {
            Log.d("error", "file not found");
        } catch (IOException e) {
            Log.d("error", "io error");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Toast.makeText(this, "data saved", Toast.LENGTH_LONG).show();
    }
    public void nextD(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);

    }

}
