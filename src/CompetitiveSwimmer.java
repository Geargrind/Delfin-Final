import java.util.ArrayList;
import java.util.Scanner;

public class CompetitiveSwimmer extends Member {
    //Attributs------------------------------------------------------------------------------------
    private double time;
    private String name;
    private String location;
    private String competition;
    private TrainerController affiliatedTrainer;
    private ArrayList<CompetitiveSwimmer> butterflySvimmers;


    //Constructor overloading
    public CompetitiveSwimmer(String name, int memberID, String dateOfBirth, boolean hasDebt) {
        setName(name);
        setTime(time);
    }

    public CompetitiveSwimmer(String name, String location, String competition, double time){
        super();
        setName(name);
        setCompetition(competition);
        setLocation(location);
        setTime(time);
    }

    public String printTrainerAsAString(){
        TrainerController affiliatedTrainer = new TrainerController(" ");
        return affiliatedTrainer.whichTrainerIsChosen();
    }


    public static ArrayList<Member> butterfly() {
        ArrayList<CompetitiveSwimmer> CompSwim1 = new ArrayList<>();
        return null;
    }



    //Getters:---------------------------------------------------------------------------
    public TrainerController getAffiliatedTrainer() {
        return affiliatedTrainer;
    }
    public double getTime() {
        return time;
    }
    public String getLocation() {
        return location;
    }
    public String getName(){
        return name;
    }
    public String getCompetition() {
        return competition;
    }

    //Setters----------------------------------------------------------------------------
    public void setName(String name){
        this.name = name;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCompetition(String competition) {
        this.competition = competition;
    }
    public void setAffiliatedTrainer(TrainerController affiliatedTrainer) {
        this.affiliatedTrainer = affiliatedTrainer;
    }

    //Method which makes sure the menu keep going after the user input is entered--------
    public boolean keepGoingMenu() {
        boolean keepGoing = true;
        System.out.println("Do you want to add another discipline?");
        System.out.println("1. Yes\n2. No");
        switch (readInt()) {
            case 1:
                keepGoing = true;
                break;
            case 2:
                keepGoing = false;
                break;
        }
        return keepGoing;
    }

    //Method which lets the user choose a discipline of the three given------------------
    public void chooseDiscipline() {
        do {
            System.out.println("Please select the swimming styles you wish to practice: ");
            System.out.println("1. Breast\n2. Crawl\n3. Butterfly");
            switch (readInt()) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        } while (keepGoingMenu());
    }
    //Method which print a submenu from '2. Competitive swimmers'-------------------------
    public void competitiveSvimmer(){
        System.out.println("Please choose either:\n1. Swimming disciplines\n2. Top five swimmers");
        switch (readInt()){
            case 1:
                swimmingsDisciplin();
                break;
            case 2:
                topFiveSwimmer();
                break;
        }
    }
    //Method which prints w..
    public void swimmingsDisciplin(){
        chooseADisciplin();
    }
    public void topFiveSwimmer(){
        chooseADisciplin();


    }

    //Method where the user can choose a swimming discipline----------------------------
    public void chooseADisciplin(){
    }

    //Method that should print the elements i the butterfly - arraylist
    public void butterflysum(){

    }


    //Same method as the one above but here we use printf for a better format
    public void printe(){
        for (CompetitiveSwimmer b : butterflySvimmers) {
            System.out.printf("Name: %s\nLocation: %s\nCompetition: %f\ntime: \n\n" +
                            "----------------------------\n",
                    b.getLocation(), b.getCompetition(), b.getTime());
        }
    }

    //Method
    public int readInt() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        int choice = -1;
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                validChoice = true;
            } else {
                System.err.println("Please input a number");
                scanner.nextLine();
            }
        }
        return choice;
    }

    public String readString() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        String choice2 = " ";
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextLine()) {
                choice2 = scanner.nextLine();
                validChoice = true;
            } else {
                System.err.println("Please input a string");
                scanner.nextLine();
            }
        }
        return choice2;
    }

    public char readChar() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        char choice2 = ' ';
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextLine()) {
                choice2 = scanner.next().toUpperCase().charAt(0);
                validChoice = true;
            } else {
                System.err.println("Please input a character");
                scanner.nextLine();
            }
        }
        return choice2;
    }


    @Override
    public String toString() {
        return " ";
    }


}
