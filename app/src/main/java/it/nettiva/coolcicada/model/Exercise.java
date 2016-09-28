package it.nettiva.coolcicada.model;

public class Exercise {
	private String name;
	private int sets;
	private int reps;
	private float weight;
	private int duration;

	public Exercise(String name, int duration, int reps, int sets, float weight) {
		this.name = name;
		this.duration = duration;
		this.reps = reps;
		this.sets = sets;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
