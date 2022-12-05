import java.util.Random;

public class AccountantController {

    private boolean isPaid = false;
    private double expenses;

    private int priceJunior = 1000;
    private int priceSenior = 1600;

    private int pensionAge = 60;


    public void accountantMenu() {
        boolean loop = true;

        while (loop) {
            userinterface.accountantMenu();

            switch (userinterface.returnsUserInputInt()) {
                case 1:
                    userinterface.printTotalIncome(totalExpectedIncome());
                    break;
                case 2:
                    paymentList();
                    break;
                case 3:
                    userinterface.viewListOfMembers(chairmanController.getAllMembers());
                    break;
                case 4:

                    loop = false;
                    break;
            }
        }
    }

    public void memberPayment() {

        for (int i = 0; i < chairmanController.getPassiveMembers().size(); i++) {
            chairmanController.getPassiveMembers().get(i).setMembershipPrice(pricePassiveMember);
        }

        for (int i = 0; i < chairmanController.getJuniors().size(); i++) {
            if (chairmanController.getJuniors().get(i).isActive())
                chairmanController.getJuniors().get(i).setMembershipPrice(priceJunior);
        }

        for (int i = 0; i < chairmanController.getSeniors().size(); i++) {
            if (chairmanController.getSeniors().get(i).isActive())
                chairmanController.getSeniors().get(i).setMembershipPrice(priceSenior);
        }

        for (int i = 0; i < chairmanController.getPensioner().size(); i++) {
            if (chairmanController.getPensioner().get(i).isActive())
                chairmanController.getPensioner().get(i).setMembershipPrice(pricePensioner);
        }
    }

    public void paymentList() {
        memberPayment();
        paymentChecker();
        String paymentstatus;

        userinterface.paymentStatus();
        for (int i = 0; i < chairmanController.getAllMembers().size(); i++) {
            if (chairmanController.getAllMembers().get(i).isHasPaid() == true) {
                paymentstatus = "Has paid";
            } else {
                paymentstatus = "Not paid yet";
            }
            userinterface.printPaymentList(chairmanController.getAllMembers(),i,paymentstatus);
        }

    }

    public double totalExpectedIncome() {
        double totalIncome = 0;

        memberPayment();
        double memberPrice;
        for (int i = 0; i < chairmanController.getAllMembers().size(); i++) {
            memberPrice = chairmanController.getAllMembers().get(i).getMembershipPrice();
            totalIncome = totalIncome + memberPrice;
        }
        return totalIncome;

    }

    public void paymentChecker() {
        Random rand = new Random();

        for (int i = 0; i < chairmanController.getAllMembers().size(); i++) {
            int randNum = rand.nextInt((10) + 1);
            if (randNum < 2)
                Paid = false;
            else
                Paid = true;

            chairmanController.getAllMembers().get(i).setisPaid(Paid);

        }
    }


}







