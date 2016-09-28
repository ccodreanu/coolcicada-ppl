package it.nettiva.coolcicada.model;

import java.util.ArrayList;
import java.util.List;

public class ExercisesProvider {
	public static List<Exercise> pushExercises() {
		List<Exercise> list = new ArrayList<>();

		list.add(new Exercise("Flat Bench Press", 0, 5, 3, 0));
		list.add(new Exercise("Seated Shoulder Press", 0, 5, 3, 0));
		list.add(new Exercise("Inclined Bench Press", 0, 5, 3, 0));
		list.add(new Exercise("Dumbbell Lateral Raise", 0, 10, 3, 0));
		list.add(new Exercise("Tricep Pushdown", 0, 10, 3, 0));
		list.add(new Exercise("Overhead Tricep Extensions", 0, 10, 3, 0));
		list.add(new Exercise("Shrugs", 0, 12, 3, 0));

		return list;
	}

	public static List<Exercise> pullExercises() {
		List<Exercise> list = new ArrayList<>();

		list.add(new Exercise("Barbell Rows", 0, 5, 3, 0));
		list.add(new Exercise("Reverse Lat Pulldown", 0, 8, 3, 0));
		list.add(new Exercise("Lat Pulldown", 0, 8, 3, 0));
		list.add(new Exercise("Seated Rows", 0, 8, 3, 0));
		list.add(new Exercise("Barbell Curls", 0, 10, 4, 0));
		list.add(new Exercise("Hammer Curls", 0, 10, 3, 0));

		return list;
	}
}
