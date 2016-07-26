package temperatureconverter.com.saiandroid.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


        EditText showedittext=null;
        Button cbutton,fbutton;
        TextView printtextview;
    DecimalFormat round=new DecimalFormat("0.0");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showedittext=(EditText)findViewById(R.id.editTextid);
        cbutton=(Button)findViewById(R.id.buttonid1);
        fbutton=(Button)findViewById(R.id.buttonid2);
        printtextview=(TextView)findViewById(R.id.textViewid);
        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String ctemperature=null;
                Double ctemp=null;
                ctemperature=showedittext.getText().toString();
                ctemp=Double.parseDouble(ctemperature);
                ctemp=(ctemp-32)*0.5556;
                String result=String.valueOf(round.format(ctemp));
                printtextview.setText(result);

            }
        });
        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ftemperature=null;
                Double ftemp=null;
                ftemperature=showedittext.getText().toString();
                ftemp=Double.parseDouble(ftemperature);
                ftemp=ftemp*1.8+32;
                String result=String.valueOf(round.format(ftemp));
                printtextview.setText(result);

            }
        });
    }
}
