import java.util.ArrayList;
import java.util.Scanner;

public class CompetitiveSwimmer extends Member {

    private int time;
    private boolean isSwimmingCrawl = false;
    private boolean isSwimmingBreast = false;
    private boolean isSwimmingButterfly = false;

    private TrainerController affiliatedTrainer;

    public String printTrainerAsAString(){
        TrainerController affiliatedTrainer = new TrainerController(" ");
        String affiliatedTrainerForReal = affiliatedTrainer.whichTrainerIsChosen();
        return affiliatedTrainerForReal;
    }


    //constructor
    public CompetitiveSwimmer(String name, int yearOfBirth) {
        this.setName(name);
        this.setYearOfBirth(yearOfBirth);
        this.time = time;

    }

    public static ArrayList<Member> butterfly() {
        ArrayList<CompetitiveSwimmer> CompSwim1 = new ArrayList<>();
        //CompSwim1.add("jejej","ejje","w");
        return null;
    }


    //Getters and setters:
    public boolean isSwimmingCrawl() {
        return isSwimmingCrawl;
    }


    public void setSwimmingCrawl(boolean swimmingCrawl) {
        isSwimmingCrawl = swimmingCrawl;
    }

    public boolean isSwimmingBreast() {
        return isSwimmingBreast;
    }

    public void setSwimmingBreast(boolean swimmingBreast) {
        isSwimmingBreast = swimmingBreast;
    }

    public boolean isSwimmingButterfly() {
        return isSwimmingButterfly;
    }

    public void setSwimmingButterfly(boolean swimmingButterfly) {
        isSwimmingButterfly = swimmingButterfly;
    }

    public TrainerController getAffiliatedTrainer() {
        return affiliatedTrainer;
    }

    public void setAffiliatedTrainer(TrainerController affiliatedTrainer) {
        this.affiliatedTrainer = affiliatedTrainer;
    }

    public boolean keepGoingMenu() {
        boolean keepGoing = true;
        System.out.println("Do you want to add another discipline?");
        System.out.println("1. Yes\n2. No");
        switch (readInt()) {
            case 1:
                keepGoing = true;
                break;
            case 2:
                keepGoing = false;
                break;
        }
        return keepGoing;
    }

    public void chooseDiscipline() {
        do {
            System.out.println("Please select the swimming styles you wish to practice: ");
            System.out.println("1. Breast\n2. Crawl\n3. Butterfly");
            switch (readInt()) {
                case 1:
                    chooseBreast();
                    break;
                case 2:
                    chooseCrawl();
                    break;
                case 3:
                    chooseButterfly();
                    break;
            }
        } while (keepGoingMenu());
    }

    public void chooseBreast() {
        CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(getName(), getYearOfBirth());
        BreastDiscipline breast = new BreastDiscipline();
        breast.registerBreastTime();
        isSwimmingBreast = true;
        breast.breastList.add(competitiveSwimmer);
        returnBreast();
    }

    public String returnBreast(){
        if(isSwimmingBreast){
            return "Chosen";
        }else{
            return "Not chosen";
        }
    }

    public void chooseCrawl() {
        CrawlDisciplin crawl = new CrawlDisciplin();
        crawl.registerCrawlTime();
        CompetitiveSwimmer competitiveSwimmer2 = new CompetitiveSwimmer(getName(), getYearOfBirth());
        isSwimmingCrawl = true;
        crawl.crawlList.add(competitiveSwimmer2);
    }

    public String returnCrawl(){
        if(isSwimmingCrawl){
            return "Chosen";
        }else{
            return "Not chosen";
        }
    }

    public void chooseButterfly() {
        ButterflyDisciplin butterfly = new ButterflyDisciplin();
        CompetitiveSwimmer competitiveSwimmer3 = new CompetitiveSwimmer(getName(), getYearOfBirth());
        butterfly.registerButterflyTime();
        isSwimmingButterfly = true;
        butterfly.butterflyList.add(competitiveSwimmer3);
    }

    public String returnButterfly(){
        if(isSwimmingButterfly){
            return "Chosen";
        }else{
            return "Not chosen";
        }
    }


    public void showCrawlList() {
        CrawlDisciplin crawl = new CrawlDisciplin();
        for (int i = 0; i < crawl.crawlList.size(); i++) {
            System.out.println(crawl.crawlList.get(i));
        }

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


    @Override
    public String toString() {
        return " ";
    }


}
