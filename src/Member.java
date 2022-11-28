import java.util.Calendar;
import java.util.Scanner;

public abstract class Member {
    private String name;
    private int yeaOfBirth;
    private boolean active;
    private double debt;

    //Hej
    //HEjsa
    private int balance;
    private int year = Calendar.getInstance().get(Calendar.YEAR);

    public void Member(String name, int yeaOfBirth){
        setName("");
        setYeaOfBirth(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYeaOfBirth() {
        return yeaOfBirth;
    }

    public void setYeaOfBirth(int yeaOfBirth) {
        this.yeaOfBirth = yeaOfBirth;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void membership(){
        if((year - yeaOfBirth) > 18 && year - yeaOfBirth < 60 &&  active){
            setBalance(1600);
        }else if(year - yeaOfBirth < 18 && active) {
            setBalance(1000);
        }else if(year - yeaOfBirth >= 60 && active) {
            setBalance(1200);
        }else if(year - yeaOfBirth >= 60 && !active){
            setBalance(375);
        }else{
            setBalance(500);
        }
    }

   public void whichMembership(){
        System.out.println("1. Active\n 2. Passive");
        if(readInt() == 1){
            setActive(true);
        }else{
            setActive(false);
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

    public String membershipType(){
        if(isActive()){
            return "Active";
        }else{
            return "Passive";
        }
    }
}
