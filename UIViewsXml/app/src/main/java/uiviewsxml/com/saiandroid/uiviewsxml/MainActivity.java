package uiviewsxml.com.saiandroid.uiviewsxml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mybutton;
    private TextView mytextview;
    int Request_Code=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton=(Button)findViewById(R.id.buttonid);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myint=new Intent(MainActivity.this,SecondActivity.class);
                myint.putExtra("key","entered from first activity");
                startActivityForResult(myint,Request_Code);

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==Request_Code)
        {
            if(resultCode==RESULT_OK)
            {
                String result=data.getStringExtra("secondkey");

                Toast.makeText(this,result,Toast.LENGTH_LONG).show();
            }
        }

    }
}
