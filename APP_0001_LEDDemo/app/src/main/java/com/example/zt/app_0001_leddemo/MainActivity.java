package com.example.zt.app_0001_leddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import com.example.zt.hardlibrary.*;

public class MainActivity extends AppCompatActivity {
    private Button button = null;
    private  boolean ledon=false;

    private CheckBox checkBoxLed1=null;
    private CheckBox checkBoxLed2=null;
    private CheckBox checkBoxLed3=null;
    private CheckBox checkBoxLed4=null;

    class MyButtonListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {

            HardControl hardControl = new HardControl();

            ledon=!ledon;
            if(ledon) {
                button.setText("ALL ON");
                checkBoxLed1.setChecked(true);
                checkBoxLed2.setChecked(true);
                checkBoxLed3.setChecked(true);
                checkBoxLed4.setChecked(true);
            }
            else {
                button.setText("ALL OFF");
                checkBoxLed1.setChecked(false);
                checkBoxLed2.setChecked(false);
                checkBoxLed3.setChecked(false);
                checkBoxLed4.setChecked(false);
            }
        }
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked)
                {
                    Toast.makeText(getApplicationContext(),"LED1 ON",Toast.LENGTH_SHORT ).show();
                }
                // Put some meat on the sandwich
            else
                {
                    Toast.makeText(getApplicationContext(),"LED1 OFF",Toast.LENGTH_SHORT ).show();
                }
                // Remove the meat
                break;
            case R.id.LED2:
                if (checked)
                {
                    Toast.makeText(getApplicationContext(),"LED2 ON",Toast.LENGTH_SHORT ).show();
                }
                // Put some meat on the sandwich
                else
                {
                    Toast.makeText(getApplicationContext(),"LED2 OFF",Toast.LENGTH_SHORT ).show();
                }
                // Remove the meat
                break;
            case R.id.LED3:
                if (checked)
                {
                    Toast.makeText(getApplicationContext(),"LED3 ON",Toast.LENGTH_SHORT ).show();
                }
                // Put some meat on the sandwich
                else
                {
                    Toast.makeText(getApplicationContext(),"LED3 OFF",Toast.LENGTH_SHORT ).show();
                }
                // Remove the meat
                break;
            case R.id.LED4:
                if (checked)
                {
                    Toast.makeText(getApplicationContext(),"LED4 ON",Toast.LENGTH_SHORT ).show();
                }
                // Put some meat on the sandwich
                else
                {
                    Toast.makeText(getApplicationContext(),"LED4 OFF",Toast.LENGTH_SHORT ).show();
                }
                // Remove the meat
                break;
            // TODO: Veggie sandwich
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.BUTTON);
        checkBoxLed1=(CheckBox)findViewById(R.id.LED1);
        checkBoxLed2=(CheckBox)findViewById(R.id.LED2);
        checkBoxLed3=(CheckBox)findViewById(R.id.LED3);
        checkBoxLed4=(CheckBox)findViewById(R.id.LED4);

        button.setOnClickListener(new MyButtonListener());
        /*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ledon=!ledon;
                if(ledon)
                    button.setText("ALL OFF");
                else
                    button.setText("ALL ON");
            }
        });
        */

    }
}
