import java.util.Scanner;

public class TrainerController {
        public void viewTopFive(){
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
