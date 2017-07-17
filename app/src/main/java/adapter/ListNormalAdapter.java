package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brandellpetty.connectfour.R;

import java.util.ArrayList;

/**
 * Created by brandellpetty on 7/15/17.
 */

public class ListNormalAdapter extends BaseAdapter {

    public final Context context;
    private final LayoutInflater inflater;
    private final ArrayList<String> list;

    public ListNormalAdapter(Context context, ArrayList<String> list){
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.list_option_item, parent, false);
        TextView tv = (TextView) convertView.findViewById(R.id.item_option_tv);
        tv.setText(list.get(position));
        return tv;
    }
}
