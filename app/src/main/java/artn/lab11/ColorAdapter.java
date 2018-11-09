package artn.lab11;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.sql.Struct;

public class ColorAdapter extends BaseAdapter {

    private String[] names;
    private int[] colors;

    ColorAdapter(String[] Names, int[] Colors) {
        names = Names;
        colors = Colors;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
            return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return -1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lv_act, parent, false);
        }
        TextView textView = (TextView) convertView;
        textView.setText(names[position]);
        textView.setTextColor(Color.BLACK);
        if((int)getItem(position) == Color.BLACK || (int)getItem(position) == Color.BLUE)
            textView.setTextColor(Color.WHITE);
        textView.setBackgroundColor(colors[position]);
        return convertView;
    }
}
