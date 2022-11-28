import java.util.Scanner;

public class ChairmanController {

    public void registerMember(){
        System.out.println("Please choose a type of member:\n1. Motionist\n2. Competitive swimmer");
        switch (readInt()){
            case 1:

                createMotionist();
                break;
            case 2:

                break;
            }
        }



        public void createCompetitiveSwimmer(){
           // CompetitiveSwimmer
        }

        public void createMotionist(){
        Motionist motionist = new Motionist();
            System.out.println("Please enter name:");
            motionist.setName(readString());
            System.out.println("Please enter year of birth: ");
            motionist.setYearOfBirth(readInt());
            motionist.whichMembership();
            motionist.membership();
            System.out.printf("Does this look correct?\nName: %s\nYear of birth: %d\nMembership: %s\nPrice per year: %d",
                    motionist.getName(), motionist.getYearOfBirth(),motionist.membershipType(), motionist.getBalance());
            motionist.yesOrNo();
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

}
