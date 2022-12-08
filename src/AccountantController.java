import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class AccountantController {

    private boolean isPaid = false;

    private double priceJunior = 1000;
    private double priceSenior = 1600;

    private double pensionAge = 60;
    private double pensionerDiscount = 0.75;
    private double pricePensionerActive = 1600 * pensionerDiscount;
    private double pricePensionerPassive = 500 * pensionerDiscount;
    private double pricePassiveMember = 500;

    private ChairmanController chairmanController;
    private UserInterface userInterface;

    public void setChairmanController(ChairmanController chairmanController) {
        this.chairmanController = chairmanController;
    }

    public AccountantController(UserInterface userinterface) {
        this.userInterface = userinterface;
    }

    public AccountantController() {
    }
/*
    public void calculatePrice() throws IOException {
        Filehandler filehandler = new Filehandler();
        List<Motionist> motionists = filehandler.getMotionistSwimmers();
        Motionist motionist = new Motionist();

        for (int i = 0; i < motionists.size() - 1; i++) {
            if (motionists.get(i).getAge() > 18 && motionists.get(i).getAge() < 60 && motionists.get(i).isActive()) {
                motionists.get(i).setMembershipPrice(1600);
            } else if (motionists.get(i).getAge() > 18 && motionists.get(i).getAge() < 60 && !motionists.get(i).isActive()) {
                motionists.get(i).setMembershipPrice(pricePassiveMember);
            } else if (motionists.get(i).getAge() < 18 && motionists.get(i).isActive()) {
                motionists.get(i).setMembershipPrice(priceJunior);
            } else if (motionists.get(i).getAge() < 18 && !motionists.get(i).isActive()) {
                motionists.get(i).setMembershipPrice(pricePassiveMember);
            } else if (motionists.get(i).getAge() > 18 && motionists.get(i).getAge() > 60 && motionists.get(i).isActive()) {
                motionists.get(i).setMembershipPrice(pricePensionerActive);
            } else if ((motionists.get(i).getAge() > 18 && motionists.get(i).getAge() > 60 && !motionists.get(i).isActive())) {
                motionists.get(i).setMembershipPrice(pricePensionerPassive);
            }
        }
        try (FileWriter f = new FileWriter("motionistList.csv", true)) {
            f.write(Double.toString(motionist.getMembershipPrice()) + ":");
            f.write("\n");
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e.getMessage());
        }
    }

 */


    public void showPayment() throws IOException {
        Filehandler filehandler = new Filehandler();
        List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
        List<Motionist> motionists = filehandler.getMotionistSwimmers();
        for (int i = 0; i < competitiveSwimmers.size(); i++) {
            competitiveSwimmers.sort(Comparator.comparing(CompetitiveSwimmer::isHasPaid));
        }
        System.out.println("\n---COMPETITIVE-SWIMMERS---\n");
        for (CompetitiveSwimmer e : competitiveSwimmers) {
            if (!e.hasPaid()) {
                System.out.printf("\nName: %s\nHas paid membership fee: %b\nHas to pay: %f\n", e.getName(), e.isHasPaid(), e.getMembershipPrice());
            }
        }

        for (int i = 0; i < motionists.size(); i++) {
            motionists.sort(Comparator.comparing(Motionist::hasPaid));
        }
        System.out.println("\n-----MOTIONISTS-----");
        for (Motionist m : motionists) {
            if (!m.hasPaid()) {
                System.out.printf("\nName: %s\nHas paid membership fee: %b\nHas to pay: %f\n", m.getName(), m.isHasPaid(), m.getMembershipPrice());
            }
        }
    }

    public void showExpectedIncome() throws IOException {
        Filehandler filehandler = new Filehandler();
        List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
        List<Motionist> motionists = filehandler.getMotionistSwimmers();

        for (CompetitiveSwimmer e : competitiveSwimmers) {
            if (e.hasPaid()) {
                double payment = 0;
                double revenue = payment + e.getMembershipPrice();
                System.out.printf(String.valueOf(revenue));
            }
            for (Motionist m : motionists) {
                if (m.hasPaid()) {
                    double payment = 0;
                    double revenue = payment + e.getMembershipPrice();
                    System.out.printf(String.valueOf(revenue));
                }
            }
        }
    }
}








