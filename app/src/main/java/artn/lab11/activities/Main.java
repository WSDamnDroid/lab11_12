package artn.lab11.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import artn.lab11.R;

public class Main extends MyBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
    }


    public void toSec(View view) {
        Intent intent1 = new Intent(this, Second.class);
        startActivity(intent1);
    }

    public void toThird(View view) {
        Intent intent2 = new Intent(this, Third.class);
        startActivity(intent2);
    }
}
