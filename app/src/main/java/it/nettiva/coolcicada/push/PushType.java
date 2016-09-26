package it.nettiva.coolcicada.push;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import it.nettiva.coolcicada.DividerItemDecoration;
import it.nettiva.coolcicada.ExerciseListAdapter;
import it.nettiva.coolcicada.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PushType.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PushType#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PushType extends Fragment {
	private View mView;
	private RecyclerView listPushExercises;

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
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mView = inflater.inflate(R.layout.fragment_push_type, container, false);

		listPushExercises = (RecyclerView) mView.findViewById(R.id.listPushExercises);
		listPushExercises.setLayoutManager(new LinearLayoutManager(getActivity()));

		return mView;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		ArrayList<String> prez = new ArrayList<>();
		prez.add("Lincoln");
		prez.add("Washington");
		prez.add("Quincy");
		prez.add("JFK");

		listPushExercises.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
		listPushExercises.setAdapter(new ExerciseListAdapter(prez));
		super.onViewCreated(view, savedInstanceState);
	}
}
