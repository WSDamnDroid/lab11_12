package artn.lab11.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import artn.lab11.R;

public class MyBaseActivity extends AppCompatActivity {
    protected SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(getString(R.string.userPreference), MODE_PRIVATE);
        String intElKey = getString(R.string.colorIntVal);
        Integer colorEl = preferences.getInt(intElKey, -1);
        getWindow().getDecorView().setBackgroundColor(colorEl);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String intElKey = getString(R.string.colorIntVal);
        Integer colorEl = preferences.getInt(intElKey, -1);
        getWindow().getDecorView().setBackgroundColor(colorEl);
    }

    public void Bck(View view) {
        onBackPressed();
    }
}
