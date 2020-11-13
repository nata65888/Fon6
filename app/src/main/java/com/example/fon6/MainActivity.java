package com.example.fon6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button btnFon;
    ConstraintLayout сonstraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFon = (Button)findViewById(R.id.idbtn);
        сonstraintLayout = (ConstraintLayout)findViewById(R.id.idconstrl);
        context = MainActivity.this;
        
        
        btnFon.setOnClickListener(this);
        


    }

    @Override
    public void onClick(View v) {

        final CharSequence[] item = {getText(R.string.red),getText(R.string.yellow),getText(R.string.green)};


       // btnFon.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0:
                        ConstraintLayout.setBackgroundResourse(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        ConstraintLayout.setBackgroundResourse(R.color.yellowColor);
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        ConstraintLayout.setBackgroundResourse (R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }
}