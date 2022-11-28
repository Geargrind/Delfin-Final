import java.util.ArrayList;
import java.util.Scanner;

public class CompetitiveSwimmer extends Member{

    private String diciplin;
    private int time;

    //constructor
    public CompetitiveSwimmer (String name,int yearOfBirth,String diciplin, int time){
        this.setName(name);
        this.setYearOfBirth(yearOfBirth);
        this.diciplin = diciplin;
        this.time = time;

    }

    public static ArrayList<Member> butterfly(){
        ArrayList<CompetitiveSwimmer> CompSwim1 = new ArrayList<>();
      //CompSwim1.add("jejej","ejje","w");
        return null;
    }









public void chooseDiscipline(){
    System.out.println("1. Crawl\n2. Backcrawl\n3. Breaststroke");
    switch (readInt()){
        case 1:

            break;
        case 2:

            break;
        case 3:

            break;
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









}
