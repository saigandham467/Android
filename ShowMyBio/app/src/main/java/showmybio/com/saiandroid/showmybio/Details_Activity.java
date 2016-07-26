package showmybio.com.saiandroid.showmybio;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Details_Activity extends Activity {
    private ImageView profileImage;
    private TextView biotext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        profileImage=(ImageView)findViewById(R.id.finalimageid);
        biotext=(TextView)findViewById(R.id.textViewid);
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            String mydata=extras.getString("sai");
            if(mydata.startsWith("Sai weared a blue"))
            {
                profileImage.setImageDrawable(getResources().getDrawable(R.drawable.sai1));
                biotext.setText(mydata);
            }
            else if(mydata.startsWith("Sai weared a grey"))
            {
                profileImage.setImageDrawable(getResources().getDrawable(R.drawable.sai2));
                biotext.setText(mydata);
            }

        }

    }

}
