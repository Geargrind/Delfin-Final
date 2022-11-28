import java.util.ArrayList;
import java.util.Scanner;

public class CompetitiveSwimmer extends Member{

    private int time;
    private boolean isSwimmingCrawl = false;
    private boolean isSwimmingBreast = false;
    private boolean isSwimmingButterfly = false;

    //constructor
    public CompetitiveSwimmer (String name,int yearOfBirth, int time){
        this.setName(name);
        this.setYearOfBirth(yearOfBirth);
        this.time = time;

    }

    public static ArrayList<Member> butterfly(){
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

public boolean keepGoingMenu(){
        boolean keepGoing = true;
    System.out.println("Do you want to add another discipline?");
    System.out.println("1. Yes\n2. No");
    switch (readInt()){
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
                CrawlDisciplin crawl = new CrawlDisciplin();
                crawl.registerCrawlTime();
                isSwimmingCrawl = true;
                break;
            case 2:
                BreastDiscipline breast = new BreastDiscipline();
                breast.registerBreastTime();
                isSwimmingBreast = true;
                break;
            case 3:
                ButterflyDisciplin butterfly = new ButterflyDisciplin();
                butterfly.registerButterflyTime();
                isSwimmingButterfly = true;
                break;
        }
    }while(keepGoingMenu());
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









}
