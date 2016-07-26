package customnewlistview.com.saiandroid.mynewlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sai on 7/17/2016.
 */
public class CustomListViewAdapter extends BaseAdapter {
    private Context mcontext;
    private ArrayList<HashMap<String,String>> books;
    private static LayoutInflater inflater=null;

    public CustomListViewAdapter(Context context, ArrayList<HashMap<String,String>> Data)
    {
        mcontext=context;
        books=Data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View cview=view;
        if(view==null)
        {
            cview=inflater.inflate(R.layout.list_row,null);
            TextView title=(TextView) cview.findViewById(R.id.title);
            TextView author=(TextView)cview.findViewById(R.id.author);
            TextView pages=(TextView)cview.findViewById(R.id.pages);
            ImageView image=(ImageView)cview.findViewById(R.id.image);
            HashMap<String,String> mbook=new HashMap<String,String>();
            mbook=books.get(position);
            title.setText(mbook.get("title"));
            author.setText(mbook.get("author"));
            pages.setText(mbook.get("pages"));
            image.setImageDrawable(mcontext.getResources().getDrawable(R.mipmap.ic_launcher));
        }
        return cview;
    }
}
