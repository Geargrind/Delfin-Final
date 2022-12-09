import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TrainerController {
        //Attributes--------------------------------------------------------------------------------
        private String trainer1 = "Niels Jørgensen";
        private String trainer2 = "Thomas Nielsen";
        private String trainer3 = "John Madsen";
        private String discipline;
        private String trainer;
        private String location;
        private String competition;


    //Constructor------------------------------------------------------------------------------

    CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(" ", 2, "20-10-2002", true, 12.2, " ", " ", " ", " ", true);

    public TrainerController() throws IOException {
         }

    //Method with a login system for trainer only----------------------------------------------
    public void loginTrainer() { //Ejerskab: Ikhra & Hannan

                String s = "";
                String p = "";
                Scanner in = new Scanner(System.in);
                int counter = 0;

                while (true) {

                        System.out.println("Please enter your username:");
                        s = in.nextLine();

                        System.out.println("Please enter your password: ");
                        p = in.nextLine();

                        if (s.equalsIgnoreCase("Trainer") && p.equalsIgnoreCase("Trainer123")) {
                                System.out.println("Succeed");
                                System.out.println("You are logged in as Trainer");
                                break;
                        }

                        else {
                                System.out.println("Try again");
                                counter++;
                                if (counter == 3) {
                                        System.out.println("You have reached limited amount of tries");
                                        break;
                                }
                        }

                }

        }

    public void sortCompetitiveSwimmers() throws IOException { //Ejerskab Lasse, Ikhra, Susmita
        Filehandler filehandler = new Filehandler();
        List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
        for (int i = 0; i < competitiveSwimmers.size(); i++) {
            competitiveSwimmers.sort(Comparator.comparing(CompetitiveSwimmer::getDiscipline).thenComparing(CompetitiveSwimmer::getTime));
        }
        for ( CompetitiveSwimmer e : competitiveSwimmers ) {
            System.out.printf("\nName: %-10s\nDiscipline: %s\nTrainer: %s\nTime: %.2f\n", e.getName(), e.getDiscipline(), e.getTrainer(), e.getTime());
        }
    }

    public String chooseTrainer(){ //Ejerskab Lasse
        System.out.println("Please choose a swimming trainer: ");
        System.out.println("1. Niels Jørgensen\n2. Thomas Nielsen\n3. John Madsen");
        switch (readInt()){
            case 1:
                trainer = ("Niels Jørgensen");
                break;
            case 2:
                trainer = ("Thomas Nielsen");
                break;
            case 3:
                trainer = ("John Madsen");
                break;
        }
        return trainer;
    }

    public String chooseDiscipline() { //Ejerskab Lasse, Ikhra
        System.out.println("Please select the swimming styles you wish to practice: ");
        System.out.println("1. Breast\n2. Crawl\n3. Butterfly");
        switch (readInt()) {
            case 1:
                discipline = ("BREAST");
                break;
            case 2:
                discipline = ("CRAWL");
                break;
            case 3:
                discipline = ("BUTTERFLY");
                break;
        }
        return discipline;
    }

    public String chooseLocation(){ //Ejerskab Lasse, Ikhra
        System.out.println("Please choose which location the competition was held at: ");
        System.out.println("1. Hillerød\n2. København\n3. Helsingør");
        switch (readInt()){
            case 1:
                location = ("Hillerød");
                break;
            case 2:
                location = ("København");
                break;
            case 3:
                location = ("Helsingør");
                break;
        }
        return location;
    }

    public String chooseCompetition(){ //Ejerskab Lasse, Ikhra
        System.out.println("Please choose the competition the member has participated in:");
        System.out.println("1. World-Cup\n2. Scandinavian-Cup\n3. Denmark-Cup");
        switch (readInt()){
            case 1:
                competition = ("World-Cup");
                break;
            case 2:
                competition = ("Scandinavian-Cup");
                break;
            case 3:
                competition = ("Denmark-Cup");
                break;
        }
        return competition;
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
