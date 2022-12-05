import java.util.ArrayList;
import java.util.Scanner;

public class ButterflyDisciplin {
    //Attributes-------------------------------------------------------------------------
    ArrayList<CompetitiveSwimmer> butterflyList = new ArrayList<>();
    private double butterflyTime;

    //Getter------------------------------------------------------------------------------
    public double getButterflyTime() {
        return butterflyTime;
    }

    //Setter------------------------------------------------------------------------------
    public void setButterflyTime(double butterflyTime) {
        this.butterflyTime = butterflyTime;
    }

    //Method which registers the users fastest time at butterfly--------------------------
    public void registerButterflyTime(){
        System.out.println("What is your fastest time at butterfly swimming?");
        setButterflyTime(readDouble());
    }



    //A method which saves the element of swimmer in an arraylist called "butterflySvimmers"
    public static ArrayList<CompetitiveSwimmer> createButterflySvimmer() {
        ArrayList<CompetitiveSwimmer> butterflySwimmers = new ArrayList<>();
        CompetitiveSwimmer butterflySwimmer1 = new CompetitiveSwimmer("Ikhra","Hillerød","bedste dk", 12.23 );
        CompetitiveSwimmer butterflySwimmer2 = new CompetitiveSwimmer("Hannan","Horens","bedst sk", 22.29 );
        CompetitiveSwimmer butterflySwimmer3 = new CompetitiveSwimmer("Lasse","Holte","vm cup", 11.29 );
        CompetitiveSwimmer butterflySwimmer4 = new CompetitiveSwimmer("Hans","Holbæk","sjællands bedst", 20.29 );
        CompetitiveSwimmer butterflySwimmer5 = new CompetitiveSwimmer("Tom","Birkerød","bedste ever", 21.29 );

        butterflySwimmers.add(butterflySwimmer1);
        butterflySwimmers.add(butterflySwimmer2);
        butterflySwimmers.add(butterflySwimmer3);
        butterflySwimmers.add(butterflySwimmer4);
        butterflySwimmers.add(butterflySwimmer5);

        return butterflySwimmers;
    }

    public void print(){
        System.out.println("Name           Location       Competition              Time                       \n ");
        for (CompetitiveSwimmer butterfly : createButterflySvimmer()) {

            System.out.printf("%-12s%-10s%-10s%-10s%n", butterfly.getName(), butterfly.getLocation(),
                    butterfly.getCompetition(),butterfly.getTime()
                    );
        }
    }

    public void printButterflySwimmers() {
        System.out.println("-----------------------------------------------BUTTERFLY SWIMMERS-----------------------------------------------");
        createButterflySvimmer();
        print();

    }


    //Noget code jeg ikke ved om jeg får brug for senere....
    /*
    public void createButterflySvimmer(String location, String competition, double time){
        ArrayList<CompetitiveSwimmer> butterflyList = new ArrayList<>();
        butterflyList.add("Hillerød", "")
        CompetitiveSwimmer butterflySvimmer1 = new CompetitiveSwimmer("Hillerød", )
    }
     */


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

    //A method which read the intput and only accepts a char otherwise et keeps running
    public char readChar() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        char choice2 = ' ';
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextLine()) {
                choice2 = scanner.next().toUpperCase().charAt(0);
                validChoice = true;
            } else {
                System.err.println("Please input a character");
                scanner.nextLine();
            }
        }
        return choice2;
    }

    //A method which read the intput and only accepts a double otherwise et keeps running
    public double readDouble() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        double choice = -1;
        while (!validChoice) {
            System.out.print(" ");
            if (scanner.hasNextDouble()) {
                choice = scanner.nextDouble();
                validChoice = true;
            } else {
                System.err.println("Please input a number");
                scanner.nextLine();
            }
        }
        return choice;
    }
}
