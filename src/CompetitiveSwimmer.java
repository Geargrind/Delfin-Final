import java.io.IOException;
import java.util.Scanner;

public class CompetitiveSwimmer extends Member {
    //Attributs------------------------------------------------------------------------------------
    private double time;
    private String location;
    private String competition;
    private String trainer;
    private String discipline;


    //Constructor overloading
    public CompetitiveSwimmer(String name, String dateOfBirth, int age){
        super(name, dateOfBirth, age);
    }

    public CompetitiveSwimmer(String name, int memberId, String dateOfBirth, boolean hasPaid, double time, String disipline,
                              String location, String competition, String trainer, boolean isActive) throws IOException {
        super(name, memberId, hasPaid, dateOfBirth, isActive);
        this.time = time;
        this.location = location;
        this.competition = competition;
        this.discipline = disipline;
        this.trainer = trainer;
    }

    public CompetitiveSwimmer() {
        super();
    }


    //Getters:---------------------------------------------------------------------------
    public String getTrainer() {
        return trainer;
    }

    public double getTime() {
        return time;
    }
    public String getLocation() {
        return location;
    }

    public String getDiscipline() {
        return discipline;
    }


    public String getCompetition() {
        return competition;
    }

    //Setters----------------------------------------------------------------------------
    public void setTime(double time) {
        this.time = time;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    //Method which prints w..
    public void swimmingsDisciplin(){
        chooseADisciplin();
    }
    //Method where the user can choose a swimming discipline----------------------------
    public void chooseADisciplin(){
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

        return "\n" + "Name: " + getName() +
                "\nID: " + getMemberId() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nHas paid membership fee: " + isHasPaid() +
                "\nTime: " + getTime() +
                "\nDiscipline: " + getDiscipline() +
                "\nLocation: " + getLocation() +
                "\nCompetition: " + getCompetition() +
                "\nStatus: " + membershipType() +
                "\nPrice per year:" + getMembershipPrice() +
                "\n";
    }


}
