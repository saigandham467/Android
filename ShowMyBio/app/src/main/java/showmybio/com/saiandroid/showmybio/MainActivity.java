package showmybio.com.saiandroid.showmybio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {
    private ImageView saiblueimage;
    private ImageView saigreyimge;
    private String saibluebio="Sai weared a blue T-Shirt. That shirt was presented at hackathon compitition"+
            "at UTSA, The color of T-shirt is blue. There are some advertisements on T-shirts";
    private String saigreybio="Sai weared a grey shirt. This is a plain grey shirt. It was bought in India"+
            "this T-shirt looks very good. Though it was bought one year before its quality is good";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saiblueimage=(ImageView)findViewById(R.id.imageViewsai1);
        saigreyimge=(ImageView)findViewById(R.id.imageViewsai2);
        saiblueimage.setOnClickListener(this);
        saigreyimge.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageViewsai1:
                Intent saiblueintent=new Intent(MainActivity.this,Details_Activity.class);
                saiblueintent.putExtra("sai",saibluebio);
                startActivity(saiblueintent);

                break;
            case R.id.imageViewsai2:
                Intent saigreyintent=new Intent(MainActivity.this,Details_Activity.class);
                saigreyintent.putExtra("sai",saigreybio);
                startActivity(saigreyintent);

                break;
        }

    }
}
