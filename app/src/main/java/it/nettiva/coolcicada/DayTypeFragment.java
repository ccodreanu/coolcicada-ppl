package it.nettiva.coolcicada;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import it.nettiva.coolcicada.push.PushType;

public class DayTypeFragment extends Fragment implements View.OnClickListener {

    private View mView;
    private Button btnPush;
    private FragmentManager mFragmentManager;

    public DayTypeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment DayTypeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DayTypeFragment newInstance() {
        DayTypeFragment fragment = new DayTypeFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_day_type, container, false);
        mFragmentManager = getFragmentManager();

        btnPush = (Button) mView.findViewById(R.id.btnPush);

        btnPush.setOnClickListener(this);

        return mView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPush:
                Log.d("DayType", "Button was pressed");
                mFragmentManager.beginTransaction()
                        .replace(R.id.activity_main, PushType.newInstance())
                        .addToBackStack(null)
                        .commit();
        }
    }
}
