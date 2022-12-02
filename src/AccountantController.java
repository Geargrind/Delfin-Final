import java.util.Scanner;

public class AccountantController {
    private boolean hasPaid = false;
    private double expenses;

    private int priceJunior = 1000;
    private int priceSenior = 1600;

    private int pensionAge = 60;

    private UserInterface userinterface;



    //Method with a login system for accountant only----------------------------------------------
    public void loginAccountant() { //Ejerskab: Ikhra & Hannan

        String s = "";
        String p = "";
        Scanner in = new Scanner(System.in);
        int counter = 0;

        while (true) {

            System.out.println("Please enter your username:");
            s = in.nextLine();

            System.out.println("Please enter your password: ");
            p = in.nextLine();

            if (s.equalsIgnoreCase("Accountant") && p.equalsIgnoreCase("Accountant123")) {
                System.out.println("Succeed");
                System.out.println("You are logged in as Accountant");
                break;
            }

            else {
                System.out.println("Try again");
                counter++;
                if (counter == 3) {
                    System.out.println("You have reached limited amount of tries");
                    break;
                }
            }

        }

    }



  }






