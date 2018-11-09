package artn.lab11;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class Second extends AppCompatActivity implements AdapterView.OnItemClickListener {
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

    public void Bck(View view) {
        onBackPressed();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        SharedPreferences.Editor editor = getSharedPreferences(getString(R.string.userPreference), MODE_PRIVATE).edit();
        getWindow().getDecorView().setBackgroundColor((int)adapter.getItem(position));
        editor.putInt(getString(R.string.colorIntVal), (int)adapter.getItem(position));
        editor.commit();
    }
}
