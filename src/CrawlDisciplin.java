import java.util.Scanner;

public class CrawlDisciplin {
    double crawlTime;
    public double getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(double crawlTime) {
        this.crawlTime = crawlTime;
    }

    public void registerCrawlTime(){
        System.out.println("What is your fastest time at breast swimming?");
        setCrawlTime(readDouble());
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
