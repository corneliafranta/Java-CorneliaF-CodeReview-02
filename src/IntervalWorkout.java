public class IntervalWorkout {
    String name;
    String[] exercises;
    int repetition;
    int breakTime;

    public IntervalWorkout(String name, String[] exercises, int repetition, int breakTime) {

        this.name = name;
        this.exercises = exercises;
        this.repetition = repetition;
        this.breakTime = breakTime;
    }

    public void showWorkout() {
        String breakText = String.format("DO THE BREAK (%d SECONDS)", this.breakTime);


        System.out.println("*".repeat(this.name.length() + 8));
        System.out.printf("%s STARTS \n", this.name);
        System.out.println("*".repeat(this.name.length() + 8));
        System.out.println("=".repeat(this.name.length() + 8));
        for (int index = 0; index <= exercises.length; index++) {
            if (index < exercises.length) {
                System.out.printf("ROUND %d: \n", index + 1);
                for (String exercise : this.exercises) {
                    System.out.println(exercise);
                }
                System.out.println("=".repeat(breakText.length()));
                System.out.println(breakText);
                System.out.println("=".repeat(breakText.length()));
            } else {
                System.out.printf("ROUND %d: \n", index + 1);
                for (String exercise : this.exercises) {
                    System.out.println(exercise);
                }

            }

        }
        System.out.println("*".repeat(27));
        System.out.println("CONGRATS - YOU ARE DONE !!!");
        System.out.println("*".repeat(27));


    }
}
