import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChairmanController {
    Filehandler filehandler = new Filehandler();
    //A method which print a submenu to register which type of member---------------------------------------------------
    public void registerMember() throws IOException {
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

    //Method which creates a competitive-swimmer member & adds them to a list of competitive swimmers-------------------
    public void createCompetitiveSwimmer() throws IOException { //Ejerskab Lasse
        Filehandler filehandler = new Filehandler();
        TrainerController trainerController = new TrainerController();
        List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
        System.out.println("Please enter name:");
        String name = readString();
        System.out.println("Please enter Member ID: ");
        int memberId = readInt();
        System.out.println("Please enter date of birth: DD-MM-YYYY");
        String dateOfBirth = readString();
        System.out.println("Has the member paid the membership fee? (answer -> true or false)");
        boolean hasPaid = readBoolean();
        System.out.println("What is the swimmers best time?");
        double time = readDouble();
        String discipline = trainerController.chooseDiscipline();
        String trainer = trainerController.chooseTrainer();
        String location = trainerController.chooseLocation();
        String competition = trainerController.chooseCompetition();
        System.out.println("Is the member active or passive? (Answer -> true or false");
        boolean isActive = readBoolean();
        CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(name, memberId, dateOfBirth, hasPaid, time, discipline, location, competition, trainer, isActive);
        competitiveSwimmer.setActive(isActive);
        System.out.println();
        System.out.println("----------RECEIPT----------");
        System.out.printf("Name: %s\nMember ID: %d\nDate of birth: %s\nMembership: %s\nHas the member paid the membership fee: %b\n" +
                                "Time: %f\nDiscipline: %s\nLocation: %s\nCompetition: %s\nTrainer: %s\nPrice: %f\n" +
                            "----------------------------\n",competitiveSwimmer.getName(),competitiveSwimmer.getMemberId(),
                competitiveSwimmer.getDateOfBirth(),competitiveSwimmer.membershipType(), competitiveSwimmer.isHasPaid(),
                competitiveSwimmer.getTime(), competitiveSwimmer.getDiscipline(),
                competitiveSwimmer.getLocation(), competitiveSwimmer.getCompetition(), competitiveSwimmer.getTrainer(), competitiveSwimmer.getMembershipPrice());

        System.out.println("\n\n---Does this look correct?---\n");
            switch(competitiveSwimmer.yesOrNo()){
                case 'Y':
                    competitiveSwimmers.add(competitiveSwimmer);
                    ArrayList<CompetitiveSwimmer> competitorList = new ArrayList<>();
                    try {
                        try (FileWriter f = new FileWriter("competitiveSwimmersList.csv", true)) {
                            f.write( competitiveSwimmer.getName() + ":");
                            f.write(competitiveSwimmer.getMemberId() + ":");
                            f.write(competitiveSwimmer.getDateOfBirth() + ":");
                            f.write(competitiveSwimmer.isHasPaid() + ":");
                            f.write(Double.toString(competitiveSwimmer.getTime()));
                            f.write(":");
                            f.write(competitiveSwimmer.getDiscipline() + ":");
                            f.write(competitiveSwimmer.getLocation() + ":");
                            f.write(competitiveSwimmer.getCompetition()  + ":");
                            f.write(competitiveSwimmer.getTrainer() + ":");
                            f.write(Double.toString(competitiveSwimmer.getMembershipPrice()) +"\n");
                        }
                    } catch (IOException e) {
                        System.out.println("I/O Exception: " + e.getMessage());
                    }
                    break;
                case 'N':
                    break;
            };
        }
    //Method which creates a motionist member & adds them to a list of motionist members--------------------------------
    public void createMotionist() throws IOException { //Ejerskab Lasse
        Filehandler filehandler = new Filehandler();
        List<Motionist> motionists = filehandler.getMotionistSwimmers();
        AccountantController accountant = new AccountantController();
        System.out.println("Please enter name:");
        String name = readString();
        System.out.println("Please enter member ID:");
        int memberId = readInt();
        System.out.println("Please enter the date of birth: DD-MM-YYYY");
        String dateOfBirth = readString();
        System.out.println("Has the member paid membership fee? (Answer -> true or false)");
        boolean hasPaid = readBoolean();
        System.out.println("Is the membership active? (Answer -> true or false)");
        boolean isActive = readBoolean();
        Motionist motionist = new Motionist(name, memberId, dateOfBirth, hasPaid,isActive);
        motionist.setActive(isActive);
        System.out.printf("Does this look correct?\nName: %s\nDate of birth: %s\nMembership: %s\nMember ID: %d\nHas paid for membership: %b" +
                        "Membership Price: %f\n",
                    motionist.getName(), motionist.getDateOfBirth(),motionist.isActive(), motionist.getMemberId(),
                motionist.isHasPaid(), motionist.getMembershipPrice());
           switch (motionist.yesOrNo()){
               case 'Y':
                   motionists.add(motionist);
                   try {
                       try (FileWriter f = new FileWriter("motionistList.csv", true)) {
                           f.write( motionist.getName() + ":");
                           f.write(motionist.getMemberId() + ":");
                           f.write(motionist.getDateOfBirth() + ":");
                           f.write(motionist.isHasPaid() + ":");
                                   f.write(Double.toString(motionist.getMembershipPrice()));
                                   f.write("\n");
                       }
                   } catch (IOException e) {
                       System.out.println("I/O Exception: " + e.getMessage());
                   }
                   break;
               case 'N':
                   break;
           }
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
    public Double readDouble() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        double choice2 = 0.0;
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextDouble()) {
                choice2 = scanner.nextDouble();
                validChoice = true;
            } else {
                System.err.println("Please input a double");
                scanner.nextDouble();
            }
        }
        return choice2;
    }

    public boolean readBoolean() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        Boolean choice2 = true;
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextLine()) {
                choice2 = scanner.nextBoolean();
                validChoice = true;
            } else {
                System.err.println("Please input a boolean");
                scanner.nextLine();
            }
        }
        return choice2;
    }








}
