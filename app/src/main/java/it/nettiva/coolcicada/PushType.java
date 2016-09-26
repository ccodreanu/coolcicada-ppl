package it.nettiva.coolcicada;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PushType.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PushType#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PushType extends Fragment {
    public PushType() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment PushType.
     */
    // TODO: Rename and change types and number of parameters
    public static PushType newInstance() {
        PushType fragment = new PushType();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_push_type, container, false);
    }
}
