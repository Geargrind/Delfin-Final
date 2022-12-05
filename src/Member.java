import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Member {
    //Attributes-------------------------------------------------------------------------
    private String name;
    private int yearOfBirth;
    private String dateOfBirth;
    private int age;
    private boolean active;
    private double debt;
    private int balance;

    private boolean isCompetitiveSwimmer;

    private int year = Calendar.getInstance().get(Calendar.YEAR);

    //New instance of Chairman class------------------------------------------------------
    ChairmanController chairman = new ChairmanController();


    // new contructor with calculates age method
    public Member()
    {
        this.name = name;

        this.dateOfBirth = dateOfBirth;

        this.active = active;

        this.isCompetitiveSwimmer = isCompetitiveSwimmer;



    }

    public Member(String name, int yearOfBirth) {
    }

    //Getters-----------------------------------------------------------------------------
    public String getName() {
        return name;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public boolean isActive() {
        return active;
    }

    public int getAge(){
        return age;
    }

    public double getDebt() {
        return debt;
    }
    public int getBalance() {
        return balance;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public boolean isCompetitiveSwimmer() {
        return isCompetitiveSwimmer;
    }

    //Setters-----------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setDebt(double debt) {
        this.debt = debt;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setCompetitiveSwimmer(boolean competitiveSwimmer) {
        this.isCompetitiveSwimmer = competitiveSwimmer;
    }

    //A method which checks which price the member has to pay for their membership---------
    public void membership(){
        if((year - yearOfBirth) > 18 && year - yearOfBirth < 60 &&  active){
            setBalance(1600);
        }else if(year - yearOfBirth < 18 && active) {
            setBalance(1000);
        }else if(year - yearOfBirth >= 60 && active) {
            setBalance(1200);
        }else if(year - yearOfBirth >= 60 && !active){
            setBalance(375);
        }else{
            setBalance(500);
        }
    }

    // Method that calculates age
    public void calculateAge() {

        int currentYear = LocalDateTime.now().getYear();
        int currentMonth = LocalDateTime.now().getMonthValue();
        int currentDay = LocalDateTime.now().getDayOfMonth();

        int year = Integer.parseInt(dateOfBirth.substring(6, 10));
        int month = Integer.parseInt(dateOfBirth.substring(3, 5));
        int day = Integer.parseInt(dateOfBirth.substring(0, 2));

        if (currentMonth >= month && currentDay >= day)
            age = currentYear - year;
        else
            age = currentYear - year - 1;
    }

    //Method which sets a member to active or passive membership--------------------------
    public void whichMembership(){
        System.out.println("1. Active\n2. Passive");
        if(readInt() == 1){
            setActive(true);
        }else{
            setActive(false);
        }
    }

    //Method which return the statement active or passive depending on their active or not
    public String membershipType(){
        if(isActive()){
            return "Active";
        }else{
            return "Passive";
        }
    }

    //Method which asks the user if the receipt looks correct------------------------------
    public void yesOrNo(){
        System.out.println("\nPress yes (Y) or no (N)");
        switch (readChar()){
            case 'Y':
                break;
            case 'N':
                chairman.createMotionist();
                break;
        }
    }

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




}
