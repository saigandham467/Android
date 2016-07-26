package customnewlistview.com.saiandroid.mynewlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private CustomListViewAdapter customListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] bookTitles=new String[]{
                "The Alchemist",
                "The Giver",
                "How To kill a mocking bird",
                "Lost in Paradise",
                "The complete android and java developer",
                "Titanic",
                "The Knight runner",
                "Lord of the rings",
                "The Hobbit",
                "Java in a nut shell",
                "the social network",
                "Game programming all in one"
        };

        final String[] bookPages=new String[]{
                "300 pages",
                "350 pages",
                "400 pages",
                "500 pages",
                "250 pages",
                "275 pages",
                "450 pages",
                "520 pages",
                "570 pages",
                "600 pages",
                "670 pages",
                "700 pages"
        };

        final String[] authors=new String[]{
                "Paulo Coelho",
                "Lois Lowry",
                "Harper Lee",
                "Somell Auther",
                "Paulo and fahd",
                "Simon Adams",
                "Kahled hossein",
                "J.R.R Tolkein",
                "J.R.R Tolkein",
                "Flannagan",
                "Ben Mezrich",
                "Horbour"

        };
        ArrayList<HashMap<String,String>> authorlist=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            HashMap<String,String> data=new HashMap<>();
            data.put("title",bookTitles[i]);
            data.put("pages",bookPages[i]);
            data.put("author",authors[i]);
            authorlist.add(data);
        }
        customListViewAdapter = new CustomListViewAdapter(getApplicationContext(),authorlist);
        listview=(ListView)findViewById(R.id.list);
        listview.setAdapter(customListViewAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int myposition=position;
                String itemClickedId=listview.getItemAtPosition(myposition).toString();
                Toast.makeText(getApplicationContext(),"Id clicked: "+itemClickedId,Toast.LENGTH_LONG).show();

            }
        });


    }
}
