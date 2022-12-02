import java.util.ArrayList;
import java.util.Scanner;

public class CrawlDisciplin {

    ArrayList<CompetitiveSwimmer> crawlList = new ArrayList<>();
    double crawlTime;
    public double getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(double crawlTime) {
        this.crawlTime = crawlTime;
    }

    public void registerCrawlTime(){
        System.out.println("What is your fastest time at crawl swimming?");
        setCrawlTime(readDouble());
    }

    //A method which saves the element of swimmer in an arraylist called "crawlsvimmers"
    public static ArrayList<CompetitiveSwimmer> createCrawlSvimmer() {
        ArrayList<CompetitiveSwimmer> crawlSwimmers = new ArrayList<>();
        CompetitiveSwimmer crawlSwimmer1 = new CompetitiveSwimmer("Sine","Allerød","bedste dk", 12.23 );
        CompetitiveSwimmer crawlSwimmer2 = new CompetitiveSwimmer("Mads","Horens","bedst sk", 22.29 );
        CompetitiveSwimmer crawlSwimmer3 = new CompetitiveSwimmer("Lucas","Holte","vm cup", 11.29 );
        CompetitiveSwimmer crawlSwimmer4 = new CompetitiveSwimmer("Hansen","Østerbro","sjællands bedst", 20.29 );
        CompetitiveSwimmer crawlSwimmer5 = new CompetitiveSwimmer("Ditte","Holte","bedste ever", 21.29 );

        crawlSwimmers.add(crawlSwimmer1);
        crawlSwimmers.add(crawlSwimmer2);
        crawlSwimmers.add(crawlSwimmer3);
        crawlSwimmers.add(crawlSwimmer4);
        crawlSwimmers.add(crawlSwimmer5);



        return crawlSwimmers;
    }

    public void print(){
        System.out.println("Name        Location              Competition              Time                       \n ");
        for (CompetitiveSwimmer crawl : createCrawlSvimmer()) {

            System.out.printf("%-15s%-15s%-15s%-15s%n", crawl.getName(), crawl.getLocation(),
                    crawl.getCompetition(),crawl.getTime()
            );
        }
    }

    public void printCrawlSwimmers() {
        System.out.println("-----------------------------------------------CRAWL SWIMMERS-----------------------------------------------");
        createCrawlSvimmer();
        print();

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
