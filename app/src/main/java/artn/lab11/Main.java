package artn.lab11;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main extends AppCompatActivity {
    protected SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        preferences = getSharedPreferences(getString(R.string.userPreference), MODE_PRIVATE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String intElKey = getString(R.string.colorIntVal);
        Integer colorEl = preferences.getInt(intElKey, -1);
        getWindow().getDecorView().setBackgroundColor(colorEl);
    }

    public void toSec(View view)
    {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }
}
