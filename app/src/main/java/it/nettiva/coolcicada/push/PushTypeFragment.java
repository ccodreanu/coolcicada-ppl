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
import it.nettiva.coolcicada.R;
import it.nettiva.coolcicada.model.Exercise;
import it.nettiva.coolcicada.model.ExerciseListAdapter;
import it.nettiva.coolcicada.model.ExercisesProvider;


public class PushTypeFragment extends Fragment {
	private View mView;
	private RecyclerView listPushExercises;

	public PushTypeFragment() {
		// Required empty public constructor
	}

	public static PushTypeFragment newInstance() {
		PushTypeFragment fragment = new PushTypeFragment();

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
	public void onViewCreated(final View view, Bundle savedInstanceState) {
		ArrayList<Exercise> exercises = new ArrayList<>(ExercisesProvider.pushExercises());
		ExerciseListAdapter exerciseListAdapter = new ExerciseListAdapter(exercises);

		listPushExercises.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
		listPushExercises.setAdapter(exerciseListAdapter);
		super.onViewCreated(view, savedInstanceState);
	}
}
