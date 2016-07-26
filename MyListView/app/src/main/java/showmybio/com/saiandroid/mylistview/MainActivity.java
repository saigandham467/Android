package showmybio.com.saiandroid.mylistview;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView lview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lview=(ListView)findViewById(R.id.listViewid);
        final String[] values=new String[]{"Computer science",
            "operating systems",
            "analysis of algorithms",
            "computer architecture",
            "compiler design",
            "machine learning",
            "large scale data management",
            "parallel processing",
            "software testing and quality assurance",
            "computer networks",
            "Security Incident and response",
            "principles of information security",
            "software engineering"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,
                android.R.id.text1,values);
        //assign adapter to list view
        lview.setAdapter(adapter);
        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int number=position;
                String val=lview.getItemAtPosition(number).toString();
                Toast.makeText(getApplicationContext(),val,Toast.LENGTH_SHORT).show();
            }
        });



    }
}
