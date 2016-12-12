package kr.co.dothome.fourstep.bowlingscore;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by yooyeol on 2016-12-08.
 */
public class SignUpButtonActivity extends Activity {

    int year, month, day, hour, minute;

    Button datePickBtn;
    

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        datePickBtn = (Button)findViewById(R.id.birthPickerBtn);
        datePickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.birthPickerBtn:

                }
            }
        });
    }
}
