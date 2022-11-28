import java.util.Scanner;

public class TrainerController {
        public void viewTopFive(){
        }

        public void createCompetitiveSwimmer(){
                CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(" ", 1999,  12);
                System.out.println("Please enter name:");
                competitiveSwimmer.setName(readString());
                System.out.println("Please enter year of birth: ");
                competitiveSwimmer.setYearOfBirth(readInt());
                competitiveSwimmer.whichMembership();
                competitiveSwimmer.membership();

                System.out.printf("Does this look correct?\nName: %s\nYear of birth: %d\nMembership: %s\nPrice per year: %d",
                        competitiveSwimmer.getName(), competitiveSwimmer.getYearOfBirth(),
                        competitiveSwimmer.membershipType(), competitiveSwimmer.getBalance());
                competitiveSwimmer.yesOrNo();
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
