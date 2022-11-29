import java.util.ArrayList;
import java.util.Scanner;

public class ButterflyDisciplin {

    ArrayList<CompetitiveSwimmer> butterflyList = new ArrayList<>();
    double butterflyTime;
    public double getButterflyTime() {
        return butterflyTime;
    }

    public void setButterflyTime(double butterflyTime) {
        this.butterflyTime = butterflyTime;
    }

    public void registerButterflyTime(){
        System.out.println("What is your fastest time at butterfly swimming?");

        setButterflyTime(readDouble());

    }


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
