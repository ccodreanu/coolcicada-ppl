package it.nettiva.coolcicada;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ViewHolder> {
	private List<String> stuffies;

	public ExerciseListAdapter(List stuff) {
		stuffies = stuff;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_list_row, parent, false);
		return new ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		String prez = stuffies.get(position);
		holder.tvExerciseRow.setText(prez);
	}

	@Override
	public int getItemCount() {
		return stuffies.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		private TextView tvExerciseRow;

		public ViewHolder(View itemView) {
			super(itemView);

			tvExerciseRow = (TextView) itemView.findViewById(R.id.tvExerciseRow);
		}
	}
}
