package com.example.mhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class editmhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editmhs);

        Button saveBtn = (Button) findViewById(R.id.btnSimpan);
        saveBtn.setOnClickListener(btnsave);

    }




    private  View.OnClickListener btnsave = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(editmhsActivity.this,tambahmhsActivity.class);
            startActivity(intent);
        }
    };

}







