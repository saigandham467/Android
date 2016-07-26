package highestmountains.com.saiandroid.highestmountainnames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button showmebutton,shownamebutton;
    private TextView showtextview,shownametextview;
    private EditText myedittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showmebutton=(Button)findViewById(R.id.buttonid);
        showtextview=(TextView)findViewById(R.id.mountaintextViewid);
        final String[] mountain={"everast","kilimanjaro","easternghats","westernghats","makulu","kiz"};
        showmebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                int randomnumber=rand.nextInt(mountain.length);
                showtextview.setText(mountain[randomnumber]);

            }
        });
        myedittext=(EditText) findViewById(R.id.editTextid);
        shownamebutton=(Button)findViewById(R.id.buttonid1);
        shownametextview=(TextView)findViewById(R.id.textViewid1);
        shownamebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              String gettext=null;
                gettext=myedittext.getText().toString();
                shownametextview.setText(gettext);
            }
        });


    }
}
