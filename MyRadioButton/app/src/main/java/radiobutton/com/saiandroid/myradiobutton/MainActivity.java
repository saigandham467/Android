package radiobutton.com.saiandroid.myradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgrp;
    private Button btn;
    private RadioButton rbtn;
    private TextView tview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgrp=(RadioGroup)findViewById(R.id.radioGroup);
        tview=(TextView)findViewById(R.id.showtextView);
        btn=(Button)findViewById(R.id.showbutton);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int selectionOption=rgrp.getCheckedRadioButtonId();
                rbtn=(RadioButton)findViewById(selectionOption);
                tview.setText(rbtn.getText());
            }
        });


    }
}
