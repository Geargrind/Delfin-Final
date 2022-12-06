import java.util.Scanner;

public class TrainerController {
        //Attributes--------------------------------------------------------------------------------
        private boolean chooseTrainer1 = false;
        private boolean chooseTrainer2 = false;
        private boolean chooseTrainer3 = false;
        private String name;


        //Getter and Setter------------------------------------------------------------------------
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }



        //Constructor------------------------------------------------------------------------------
        public TrainerController(String name){
                setName(name);
        }

        public void viewTopFive(){
        }

        CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(" ", "2");

        public void chooseTrainer(){
                System.out.println("Please choose a swimming trainer: ");
                System.out.println("1. Niels Jørgensen\n2. Thomas Nielsen\n3. John Madsen");
                switch (readInt()){
                        case 1:
                                TrainerController trainer1 = new TrainerController("Niels Jørgensen");
                                competitiveSwimmer.setAffiliatedTrainer(trainer1);
                                chooseTrainer1 = true;
                                System.out.println(chooseTrainer1);
                                break;
                        case 2:
                                TrainerController trainer2= new TrainerController("Thomas Nielsen");
                                competitiveSwimmer.setAffiliatedTrainer(trainer2);
                                chooseTrainer2 = true;
                                break;
                        case 3:
                                TrainerController trainer3= new TrainerController("John Madsen");
                                competitiveSwimmer.setAffiliatedTrainer(trainer3);
                                chooseTrainer3 = true;
                                break;
                }
        }

        public String whichTrainerIsChosen() {
                 String trainerName = "Not specified";
         if (chooseTrainer1) {
                 trainerName = "Niels Jørgensen";
         } else if (chooseTrainer2) {
                 trainerName = "Thomas Nielsen";
         } else if (chooseTrainer3) {
                 trainerName = "John Madsen";
                }
        return trainerName;
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
