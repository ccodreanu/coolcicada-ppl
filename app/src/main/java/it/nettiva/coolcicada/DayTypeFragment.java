package it.nettiva.coolcicada;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import it.nettiva.coolcicada.pull.PullTypeFragment;
import it.nettiva.coolcicada.push.PushTypeFragment;

public class DayTypeFragment extends Fragment implements View.OnClickListener {
    private View mView;
    private Button btnPush;
	private Button btnPull;
    private FragmentManager mFragmentManager;

    public DayTypeFragment() {
        // Required empty public constructor
    }

    public static DayTypeFragment newInstance() {
        DayTypeFragment fragment = new DayTypeFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_day_type, container, false);
        mFragmentManager = getFragmentManager();

        btnPush = (Button) mView.findViewById(R.id.btnPush);
		btnPull = (Button) mView.findViewById(R.id.btnPull);

        btnPush.setOnClickListener(this);
		btnPull.setOnClickListener(this);

        return mView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPush:
                Log.d("DayType", "Push exercises were selected");
                mFragmentManager.beginTransaction()
                        .replace(R.id.activity_main, PushTypeFragment.newInstance())
                        .addToBackStack(null)
                        .commit();
				break;

			case R.id.btnPull:
				Log.d("DayType", "Pull exercises were selected");
				mFragmentManager.beginTransaction()
						.replace(R.id.activity_main, PullTypeFragment.newInstance())
						.addToBackStack(null)
						.commit();
				break;
        }
    }
}
