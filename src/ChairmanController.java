import java.util.Scanner;

public class ChairmanController {
    //A method which print a submenu to register whoch type of member----------------------
    public void registerMember(){
        System.out.println("Please choose a type of member:\n1. Motionist\n2. Competitive swimmer");
        switch (readInt()){
            case 1:
                createMotionist();
                break;
            case 2:
                createCompetitiveSwimmer();
                break;
            }
        }
    //Method which creates a competitive-swimmer member------------------------------------
    public void createCompetitiveSwimmer(){
        TrainerController trainerController = new TrainerController(" ");
        CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(" ", 1999);
        System.out.println("Please enter name:");
        competitiveSwimmer.setName(readString());
        System.out.println("Please enter year of birth: ");
        competitiveSwimmer.setYearOfBirth(readInt());
        competitiveSwimmer.whichMembership();
        competitiveSwimmer.membership();
        competitiveSwimmer.chooseDiscipline();
        trainerController.chooseTrainer();
        System.out.println("----------RECEIPT----------");
        System.out.printf("Chosen disciplines:\nBreast swimming: " +
                            "%s\nCrawl: %s\nButterfly: %s\nTrainer: %s"
            , trainerController.whichTrainerIsChosen(),
                System.out.printf("Name: %s\nYear of birth: %d\nMembership: %s\nPrice per year: %d\n\n" +
                            "----------------------------\n",
                    competitiveSwimmer.getName(), competitiveSwimmer.getYearOfBirth(),
                    competitiveSwimmer.membershipType(), competitiveSwimmer.getBalance()));
        System.out.println("\n\n---Does this look correct?---");
            competitiveSwimmer.yesOrNo();
        }
    //Method which creates a motionist member-------------------------------------------
    public void createMotionist(){
        Motionist motionist = new Motionist();
        System.out.println("Please enter name:");
        motionist.setName(readString());
        System.out.println("Please enter year of birth: ");
        motionist.setYearOfBirth(readInt());
        motionist.whichMembership();
        motionist.membership();
        System.out.printf("Does this look correct?\nName: %s\nYear of birth: %d\nMembership: %s\nPrice per year: %d",
                    motionist.getName(), motionist.getYearOfBirth(),motionist.membershipType(), motionist.getBalance());
            motionist.yesOrNo();
        }
    //Method with a login system for Chairman only----------------------------------------------
    public void loginChairman() { //Ejerskab: Ikhra & Hannan
        String s = "";
        String p = "";
        Scanner in = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Please enter your username:");
            s = in.nextLine();
            System.out.println("Please enter your password: ");
            p = in.nextLine();
            if (s.equalsIgnoreCase("Chairman") && p.equalsIgnoreCase("Chairman")) {
                System.out.println("Succeed");
                System.out.println("You are logged in as Chairman");
                break;
            } else {
                System.out.println("Try again");
                counter++;
                if (counter == 3) {
                    System.out.println("You have reached limited amount of tries");
                    break;
                }
            }

        }

    }
    //A method which read the intput and only accepts an integer otherwise et keeps running
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
    //A method which read the intput and only accepts a String otherwise et keeps running
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

}
