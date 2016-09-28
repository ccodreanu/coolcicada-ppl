package it.nettiva.coolcicada;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DayTypeFragment dayTypeFragment = DayTypeFragment.newInstance();
        mFragmentManager = getFragmentManager();
        mFragmentManager.beginTransaction()
                .add(R.id.activity_main, dayTypeFragment)
                .commit();
    }


}
