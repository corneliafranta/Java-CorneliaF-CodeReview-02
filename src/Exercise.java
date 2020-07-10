public class Exercise {
    String name;
    String description;
    int duration;
    String position;

    public Exercise(String name, String description, String duration, String position) {

        this.name = name;
        this.description = description;
        this.duration = Integer.parseInt(duration);
        this.position = position;
    }

    public void printExercise() {
        System.out.printf("%s \t \t DURATION: %d seconds. \n", this.name, this.duration);
        System.out.println("-".repeat(60));
        System.out.printf("DESCRIPTION: %s \n \n \n", this.description);


    }


}



