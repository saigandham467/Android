package checkbox.com.saiandroid.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox ckbox1;
    private CheckBox ckbox2;
    private CheckBox ckbox3;
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckbox1=(CheckBox)findViewById(R.id.checkBox1id);
        ckbox2=(CheckBox)findViewById(R.id.checkBox2id);
        ckbox3=(CheckBox)findViewById(R.id.checkBox3id);
        button=(Button)findViewById(R.id.viewcheckboxbuttonid);
        textView=(TextView)findViewById(R.id.displaytextViewid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb=new StringBuilder();
                sb.append("checkbox 1 : "+ckbox1.getText()+" "+ ckbox1.isChecked()+"\n");
                sb.append("checkbox 2 : "+ckbox2.getText()+" "+ ckbox2.isChecked()+"\n");
                sb.append("checkbox 3 : "+ckbox3.getText()+" "+ ckbox3.isChecked()+"\n");
                textView.setText(sb.toString());
            }
        });


    }
}
