package it.nettiva.coolcicada.pull;

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


public class PullTypeFragment extends Fragment {
	private View mView;
	private RecyclerView listPullExercises;

	public PullTypeFragment() {
		// Required empty public constructor
	}

	public static PullTypeFragment newInstance() {
		PullTypeFragment fragment = new PullTypeFragment();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mView = inflater.inflate(R.layout.fragment_pull_type, container, false);

		listPullExercises = (RecyclerView) mView.findViewById(R.id.listPullExercises);
		listPullExercises.setLayoutManager(new LinearLayoutManager(getActivity()));

		return mView;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		ArrayList<Exercise> exercises = new ArrayList<>(ExercisesProvider.pullExercises());
		ExerciseListAdapter exerciseListAdapter = new ExerciseListAdapter(exercises);

		listPullExercises.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
		listPullExercises.setAdapter(exerciseListAdapter);
		super.onViewCreated(view, savedInstanceState);
	}
}
