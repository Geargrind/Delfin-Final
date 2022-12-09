import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Controller implements Comparator{
   //tester
    //Attributes---------------------------------------------------------------------------
    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    //Constructor overloading--------------------------------------------------------------
    public Controller(String menuHeader, String leadText, String[] menuItems) {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }
    public Controller() {

    }
    //Ejerskab Lasse, Ikhra
    void run() throws IOException { //This is where we run are code------------------------------------------
            boolean keepRunning = true;

        String[] menuItems = new String[]{ //Prints the Main menu out
                "1. Chairman functions \uD83E\uDEAA ",
                "2. Trainer functions \uD83E\uDD47",
                "3. Accountant functions \uD83D\uDCB3❌ ",
                "9. Exit program"
        };

            Controller controller = new Controller("MENU", "" +
                    "\uD83D\uDC2C\uD83C\uDF0AWelcome to the dolphins swimclub\uD83D\uDC2C\uD83C\uDF0A!\n\nPlease choose an option:\n", menuItems);
            ChairmanController chairman = new ChairmanController();
            TrainerController trainer = new TrainerController();
            CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer();
            Filehandler filehandler = new Filehandler();
            Scanner sc2 = new Scanner(System.in);

            AccountantController accountant = new AccountantController();
            do {
                controller.printMenu();
                switch (controller.readInt()) {
                    case 1:
                        System.out.println("1. Register Members\n2. View motionists\n3. Back");
                        switch (controller.readInt()){
                            case 1:
                                chairman.registerMember();
                                break;
                            case 2:
                                List<Motionist> motionists = filehandler.getMotionistSwimmers();
                                System.out.println(motionists);
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1. View competitive swimmers\n2. View top swimmers\n3. Back");
                        switch (controller.readInt()){
                            case 1:
                                List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
                                System.out.println(competitiveSwimmers);
                                break;
                            case 2:
                                trainer.sortCompetitiveSwimmers();
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("1. Show members in debt\n2. Back");
                        switch (controller.readInt()){
                            case 1:
                               accountant.showPayment();
                                break;
                            case 2:
                                break;
                        }
                        break;
                    case 4:
                        List<Motionist> motionists = filehandler.getMotionistSwimmers();
                        int j = 1;
                        for (int i = 0; i < motionists.size(); i++) {
                            motionists.get(i).calculateAge();
                            System.out.println("Motionist number " + j++ + "\nName: " + motionists.get(i).getName() + "\nAge:" + motionists.get(i).getAge());
                            System.out.println("Balance: " + motionists.get(i).getMembershipPrice()+ "\n");
                        }
                        break;
                    case 9:
                        System.out.println("Goodbye");
                        keepRunning = false;
                        break;
                    default:
                        System.err.println("Please enter a number");
                }
            } while (keepRunning);
        }


        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

        @Override
        public Comparator reversed() {
            return Comparator.super.reversed();
        }

        @Override
        public Comparator thenComparing(Comparator other) {
            return Comparator.super.thenComparing(other);
        }

        @Override
        public Comparator thenComparingInt(ToIntFunction keyExtractor) {
            return Comparator.super.thenComparingInt(keyExtractor);
        }

        @Override
        public Comparator thenComparingLong(ToLongFunction keyExtractor) {
            return Comparator.super.thenComparingLong(keyExtractor);
        }

        @Override
        public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
            return Comparator.super.thenComparingDouble(keyExtractor);
        }

        @Override
        public Comparator thenComparing(Function keyExtractor) {
            return Comparator.super.thenComparing(keyExtractor);
        }

        @Override
        public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
            return Comparator.super.thenComparing(keyExtractor, keyComparator);
        }




    //Method that prints the main menu out--------------------------------------------------
    public void printMenu() {
        String printString = menuHeader + "\n";
        printString = leadText;
        for (int i = 0; i < menuItems.length; i++) printString += menuItems[i] + "\n";
        System.out.println("\n" + printString);
    }

    //Method which read the users choice and force it to be an integer or keeps going
    public int readChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        int choice = -1;
        while (!validChoice) {
            System.out.print(leadText);
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







