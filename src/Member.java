import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Member {
    //Attributes-------------------------------------------------------------------------
    // attributes
    private String name;
    private int memberId;
    private String dateOfBirth;
    private int age;
    private boolean isActive;
    private boolean isCompetitiveSwimmer;
    private boolean hasPaid;
    private String location;


    //New instance of Chairman class------------------------------------------------------
    private ChairmanController chairman;


    public Member(String name, int memberId, boolean hasPaid, String dateOfBirth)
    {
        this.name = name;
        this.memberId = memberId;
        this.hasPaid = hasPaid;
        this.dateOfBirth = dateOfBirth;
    }

    public Member(String name, String dateOfBirth)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    //Getters-----------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getAge(){
        return age;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public boolean isCompetitiveSwimmer() {
        return isCompetitiveSwimmer;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //Setters-----------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompetitiveSwimmer(boolean competitiveSwimmer) {
        isCompetitiveSwimmer = competitiveSwimmer;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setisCompetitiveSwimmer(boolean isCompetitiveSwimmer) {
        this.isCompetitiveSwimmer = isCompetitiveSwimmer;
    }

    public void isPaid(boolean hasPaid)
    {
        this.hasPaid = hasPaid;
    }

    public boolean hasPaid()
    {
        return hasPaid;
    }

    public int getMemberId()
    {
        return memberId;
    }


    // Method that calculates age
    /*public void calculateAge() {

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
     */

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
    public char yesOrNo() throws FileNotFoundException {
        char answer = ' ';
        System.out.println("\nPress yes (Y) or no (N)");
        switch (readChar()){
            case 'Y':
                answer = 'Y';
                break;
            case 'N':
                answer = 'N';
                chairman.createMotionist();
                break;
        }
        return answer;
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
