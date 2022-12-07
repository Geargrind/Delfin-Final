import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main{

    //This prints the menu items out in a pretty format------------------------------------
    String[] menuItems = new String[]{
            "1. Register member \uD83E\uDEAA ",
            "2. Competitive swimmers \uD83E\uDD47",
            "3. Member debts \uD83D\uDCB3❌ ",
            "4. Display motionists 🤽‍",
            "5. Display competitive swimmers 🏊‍",
            "9. Exit program"
    };
    void run() throws FileNotFoundException { //This is where we run are code------------------------------------------
        boolean keepRunning = true;
        Controller controller = new Controller("MENU", "" +
                "\uD83D\uDC2C\uD83C\uDF0AWelcome to the dolphins swimclub\uD83D\uDC2C\uD83C\uDF0A!\n\nPlease choose an option:\n", menuItems);
        ChairmanController chairman = new ChairmanController();
                CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(" ", "");
                Filehandler filehandler = new Filehandler();
        Scanner sc2 = new Scanner(System.in);
        do {
            controller.printMenu();
            switch (controller.readInt()) {
                case 1:
                   chairman.registerMember();
                    break;
                case 2:
                    competitiveSwimmer.competitiveSvimmer();
                    break;
                case 3:

                    break;
                case 4:
                    List<Motionist> motionists = filehandler.getMotionistSwimmers();
                    System.out.println(motionists);
                    break;
                case 5:
                    List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
                    System.out.println(competitiveSwimmers);
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

        public static void main (String[]args) throws FileNotFoundException { //The main method---------------------------
            //This makes the code in the run method run and makes sure or main method dont crash
            new Main().run();
        }

}

