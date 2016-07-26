package imageview.com.saiandroid.imageview;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="MainActivity";
    private ImageView sai;
    private TextView showtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sai=(ImageView) findViewById(R.id.imageViewid);
        showtext=(TextView)findViewById(R.id.textViewid);
        sai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtext.setText("sai is good boy");
                Log.d(TAG,"this is from here");
                Log.v(TAG,"anathor here");
            }
        });
    }
}
