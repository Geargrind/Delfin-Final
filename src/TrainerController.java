import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TrainerController {
        //Attributes--------------------------------------------------------------------------------
        private String trainer1 = "Niels Jørgensen";
        private String trainer2 = "Thomas Nielsen";
        private String trainer3 = "John Madsen";


    public TrainerController() {

    }


        //Getter and Setter------------------------------------------------------------------------


    public String getTrainer1() {
        return trainer1;
    }

    public String getTrainer2() {
        return trainer2;
    }

    public String getTrainer3() {
        return trainer3;
    }

    public void setTrainer1(String trainer1) {
        this.trainer1 = trainer1;
    }

    public void setTrainer2(String trainer2) {
        this.trainer2 = trainer2;
    }

    public void setTrainer3(String trainer3) {
        this.trainer3 = trainer3;
    }

    //Constructor------------------------------------------------------------------------------

        CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer();

        public void chooseTrainer(){
                System.out.println("Please choose a swimming trainer: ");
                System.out.println("1. Niels Jørgensen\n2. Thomas Nielsen\n3. John Madsen");
                switch (readInt()){
                        case 1:
                                competitiveSwimmer.setTrainer(trainer1);
                                break;
                        case 2:
                                competitiveSwimmer.setTrainer(trainer2);
                                break;
                        case 3:
                                competitiveSwimmer.setTrainer(trainer3);
                                break;
                }

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

    public void sortCompetitiveSwimmers() throws FileNotFoundException {
        Filehandler filehandler = new Filehandler();
        List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
        for (int i = 0; i < competitiveSwimmers.size(); i++) {
            competitiveSwimmers.sort(Comparator.comparing(CompetitiveSwimmer::getDiscipline).thenComparing(CompetitiveSwimmer::getTime));
        }
        for ( CompetitiveSwimmer e : competitiveSwimmers ) {
            System.out.printf("\nName: %-10s\nDiscipline: %s\nTrainer: %s\nTime: %.2f\n", e.getName(), e.getDiscipline(), e.getTrainer(), e.getTime());
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
