import java.util.Scanner;

public class CompetitiveSwimmer extends Member {
    //Attributs------------------------------------------------------------------------------------
    private double time;
    private String location;
    private String competition;
    private String trainer;
    private String discipline;


    //Constructor overloading
    public CompetitiveSwimmer(String name, String dateOfBirth){
        super(name, dateOfBirth);
    }

    public CompetitiveSwimmer(String name, int memberId, String dateOfBirth, boolean hasPaid, double time, String disipline,
                              String location, String competition, String trainer) {
        super(name, memberId, hasPaid, dateOfBirth);
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
    public void chooseTrainer(){
        System.out.println("Please choose a swimming trainer: ");
        System.out.println("1. Niels Jørgensen\n2. Thomas Nielsen\n3. John Madsen");
        switch (readInt()){
            case 1:
                setTrainer("Niels Jørgensen");
                break;
            case 2:
              setTrainer("Thomas Nielsen");
                break;
            case 3:
                setTrainer("John Madsen");
                break;
        }

    }
    //Method which lets the user choose a discipline of the three given------------------
    public void chooseDiscipline() {
            System.out.println("Please select the swimming styles you wish to practice: ");
            System.out.println("1. Breast\n2. Crawl\n3. Butterfly");
            switch (readInt()) {
                case 1:
                    setDiscipline("BREAST");
                    break;
                case 2:
                    setDiscipline("CRAWL");
                    break;
                case 3:
                    setDiscipline("BUTTERFLY");
                    break;
            }
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
    public void chooseLocation(){
        System.out.println("Please choose which location the competition was held at: ");
        System.out.println("1. Hillerød\n2. København\n3. Helsingør");
        switch (readInt()){
            case 1:
                setLocation("Hillerød");
                break;
            case 2:
                setLocation("København");
                break;
            case 3:
                setLocation("Helsingør");
                break;
        }
    }
    public void chooseCompetition(){
        System.out.println("Please choose the competition the member has participated in:");
        System.out.println("1. World-Cup\n2. Scandinavian-Cup\n3. Denmark-Cup");
        switch (readInt()){
            case 1:
                setCompetition("World-Cup");
                break;
            case 2:
                setCompetition("Scandinavian-Cup");
                break;
            case 3:
                setCompetition("Denmark-Cup");
                break;
        }
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
    /*
    public void printe(){
        for (CompetitiveSwimmer b : butterflySvimmers) {
            System.out.printf("Name: %s\nLocation: %s\nCompetition: %f\ntime: \n\n" +
                            "----------------------------\n",
                    b.getLocation(), b.getCompetition(), b.getTime());
        }
    }
*/
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
                "\n";
    }


}
