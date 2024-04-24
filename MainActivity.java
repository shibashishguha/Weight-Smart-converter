package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView heading=findViewById(R.id.heading);
        Button btn=findViewById(R.id.button);
        EditText entry_text=findViewById(R.id.entrytext);
        TextView display_text=findViewById(R.id.displaytext);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=entry_text.getText().toString();
                double kilo=Double.parseDouble(a);
                display_text.setText("Value in pounds is "+kilos(kilo));
            }
        });
    }

    public double kilos(double kilo)
    {
        return kilo*2.20462;
    }
}