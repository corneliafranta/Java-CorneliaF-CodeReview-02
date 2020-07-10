import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        String[][] exercises = {

                {"Push-ups",
                        "Place your hands on the floor. Raise up onto your toes so that all of your body weight is" +
                                " on your hands and your feet. Bend your elbows and lower your chest down toward the floor." +
                                " Then, push off the floor and extend them so that you return to starting position.",
                        "30",
                        "floor"
                },
                {"Planks",
                        " Start on the floor on your hands and knees. Lower your forearms to the floor with elbows" +
                                " positioned under your shoulders and your hands shoulder-width apart. Maintain a straight " +
                                "line from heels through the top of your head, looking down at the floor. Now, tighten your" +
                                " abs and hold. ",
                        "90",
                        "floor"
                },
                {"Squats",
                        " Stand with feet a little wider than shoulder-width apart, hips stacked over knees," +
                                " and knees over ankles. Extend arms out straight so they are parallel with the ground," +
                                " palms facing down.  Goto a squat and exhale, then explode back up to standing, driving" +
                                " through heels.",
                        "45",
                        "stand-up"
                },
                {"Backward Kick",
                        " Get in an all-fours position with your knees and hands on the floor. Your back is straight." +
                                " Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg" +
                                " with your heel pushing up and constantly forming a 90 degree angle in between the legs." +
                                " Return to the starting position and repeat.",
                        "60",
                        "floor"
                },
                {"Leg Curl",
                        " Stand up on, shift your weight to  one feet and pull another heel toward your buttocks." +
                                " Stay for 15 seconds, then repeat with your other leg.",
                        "90",
                        "stand-up"
                },
                {"Sidewards Back Stretch",
                        " Go into standing position, put your hands on your hips and then stretch with one hand" +
                                " over your head to the opposite side. Repeat with other hand.",
                        "60",
                        "stand-up"
                },


        };

        ArrayList<Exercise> exerciseObjects = new ArrayList<Exercise>();

        for (String[] exercise : exercises) {

            exerciseObjects.add(new Exercise(exercise[0], exercise[1], exercise[2], exercise[3]));
            System.out.println(String.format("added %s", exercise[0]));
        }
        System.out.println("Done!");

        for (Exercise exercise : exerciseObjects) {

            exercise.printExercise();
        }

        //Calling filterExercises method to only display floor exercises
        filterExercises("floor", exerciseObjects, 0);

        //Calling filterExercises method to only display floor exercises that take more than 1 min
        filterExercises("floor", exerciseObjects, 60);

        //BONUS EXERCISE
        ArrayList<IntervalWorkout> workoutList = new ArrayList<IntervalWorkout>();

        String[] exerciseList = {
                exerciseObjects.get(0).name,
                exerciseObjects.get(2).name,
                exerciseObjects.get(1).name
        };

        workoutList.add(new IntervalWorkout("myWorkout", exerciseList, 4, 30));

        workoutList.get(0).showWorkout();


    }

    //Function to Filter Exercises

    public static void filterExercises(String filterby, ArrayList<Exercise> exerciseObjects, int duration) {

        System.out.printf("%s EXCERSICES ", filterby.toUpperCase());
        if (duration > 0) {
            System.out.printf("MIN-DURATION: %d seconds \n \n", duration);
        } else {
            System.out.print("\n \n");
        }
        for (Exercise exercise : exerciseObjects) {

            if (filterby == exercise.position) {
                if (duration > 0 && exercise.duration <= duration) {
                    continue;
                }
                exercise.printExercise();

            }
        }
    }

}


