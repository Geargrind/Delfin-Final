import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Main implements Comparator {

    //This prints the menu items out in a pretty format------------------------------------
    String[] menuItems = new String[]{
            "1. Chairman functions \uD83E\uDEAA ",
            "2. Trainer functions \uD83E\uDD47",
            "3. Accountant functions \uD83D\uDCB3❌ ",
            "9. Exit program"
    };
    void run() throws FileNotFoundException { //This is where we run are code------------------------------------------
        boolean keepRunning = true;
        Controller controller = new Controller("MENU", "" +
                "\uD83D\uDC2C\uD83C\uDF0AWelcome to the dolphins swimclub\uD83D\uDC2C\uD83C\uDF0A!\n\nPlease choose an option:\n", menuItems);
        ChairmanController chairman = new ChairmanController();
        TrainerController trainer = new TrainerController();
        CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer();
        Filehandler filehandler = new Filehandler();
        Scanner sc2 = new Scanner(System.in);
        UserInterface ui = new UserInterface();
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
                    ui.accountantMenu();
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
}

