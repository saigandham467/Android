package mytextview.com.saiandroid.mytextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mybutton;
    private TextView mytextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mytext=(TextView)findViewById(R.id.textView2);
        mytext.setText("awesome!");
        mybutton=(Button) findViewById(R.id.buttonid);
        mytextview=(TextView)findViewById(R.id.textViewid);
        mybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                mytextview.setText("oops! button clicked");
                //Toast.makeText(getApplicationContext(),"oops!I was clicked",Toast.LENGTH_LONG).show();
            }
        });

    }
}
