package it.nettiva.coolcicada.model;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import it.nettiva.coolcicada.R;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ViewHolder> {
	private List<Exercise> exercises;
	private CountDownTimer countDownTimer;

	public ExerciseListAdapter(List exercises) {
		this.exercises = exercises;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_list_row, parent, false);
		return new ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(final ViewHolder holder, int position) {
		final String exerciseName = exercises.get(position).getName();
		String exerciseSetsAndReps = exercises.get(position).getSets() + " x " + exercises.get(position).getReps();
		holder.tvExerciseRowName.setText(exerciseName);
		holder.tvExerciseRowSetsReps.setText(exerciseSetsAndReps);

		countDownTimer = new CountDownTimer(60 * 1000, 60 * 1000) {

			@Override
			public void onTick(long millisUntilFinished) {

			}

			@Override
			public void onFinish() {
				try {
					Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
					Ringtone r = RingtoneManager.getRingtone(holder.itemView.getContext(), notification);
					r.play();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	}

	@Override
	public int getItemCount() {
		return exercises.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		private TextView tvExerciseRowName;
		private TextView tvExerciseRowSetsReps;

		public ViewHolder(final View itemView) {
			super(itemView);

			tvExerciseRowName = (TextView) itemView.findViewById(R.id.tvExerciseRowName);
			tvExerciseRowSetsReps = (TextView) itemView.findViewById(R.id.tvExerciseRowSetsReps);

			itemView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.d("CLICKY", "Something clicked " + getLayoutPosition());

					Toast toast = Toast.makeText(itemView.getContext(), "Countdown started. 60 seconds.", Toast.LENGTH_SHORT);
					toast.show();

					NotificationCompat.Builder mBuilder =
							new NotificationCompat.Builder(this)
									.setSmallIcon(R.drawable.)
									.setContentTitle("My notification")
									.setContentText("Hello World!");

					countDownTimer.start();
				}
			});
		}
	}
}
