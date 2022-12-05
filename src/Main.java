import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //This prints the menu items out in a pretty format------------------------------------
    String[] menuItems = new String[]{
            "1. Register member \uD83E\uDEAA ",
            "2. Competitive swimmers \uD83E\uDD47",
            "3. Member debts \uD83D\uDCB3❌ ",
            "9. Exit program"
    };
    void run() { //This is where we run are code------------------------------------------
        boolean keepRunning = true;
        Controller controller = new Controller("MENU", "" +
                "\uD83D\uDC2C\uD83C\uDF0AWelcome to the dolphins swimclub\uD83D\uDC2C\uD83C\uDF0A!\n\nPlease choose an option:\n", menuItems);
        ChairmanController chairman = new ChairmanController();
        CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(" ", 2);
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

        new Main().run(); //This makes the code in the run method run and makes sure or main method dont crash
            Scanner sc = new Scanner(new File("motionistList.csv"));
            ArrayList<CompetitiveSwimmer> list = new ArrayList<>();
            sc.useDelimiter(";");
            while(sc.hasNext()){
            }
            sc.close();
        }
    }

