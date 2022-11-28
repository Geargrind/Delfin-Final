public class Main {

    String[] menuItems = new String[]{
            "1. Register member",
            "2. Competitive swimmers",
            "3. Member debt",
            "9. Exit program"
    };

    void run() {
        boolean keepRunning = true;
        Controller controller = new Controller("MENU", "" +
                "Welcome to the dolphins swimclub!\n\nPlease choose an option:\n", menuItems);
        ChairmanController chairman = new ChairmanController();
        do {
            controller.printMenu();
            switch (controller.readInt()) {
                case 1:
                    chairman.registerMember();
                    break;
                case 2:
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

        public static void main (String[]args){
            new Main().run();
        }
    }

