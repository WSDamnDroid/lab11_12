package artn.lab11.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import artn.lab11.adapters.ColorAdapter;
import artn.lab11.R;

public class Second extends MyBaseActivity implements AdapterView.OnItemClickListener {
    private ColorAdapter adapter;
    private ListView lv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_act);
        adapter = new ColorAdapter(getResources().getStringArray(R.array.colorsStr), getResources().getIntArray(R.array.colorsRes));
        lv = (ListView) findViewById(R.id.listV);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        SharedPreferences.Editor editor = preferences.edit();
        getWindow().getDecorView().setBackgroundColor((int) adapter.getItem(position));
        editor.putInt(getString(R.string.colorIntVal), (int) adapter.getItem(position));
        editor.commit();
    }
}
