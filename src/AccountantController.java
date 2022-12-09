import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class AccountantController {

    //Attributes-------------------------------------------------------------------------------------------
    private double priceJunior = 1000;
    private double priceSenior = 1600;

    private double pensionAge = 60;
    private double pensionerDiscount = 0.75;
    private double pricePensionerActive = 1600 * pensionerDiscount;
    private double pricePensionerPassive = 500 * pensionerDiscount;
    private double pricePassiveMember = 500;

    public AccountantController() {
    }
    private ChairmanController chairmanController;

    public void setChairmanController(ChairmanController chairmanController) {
        this.chairmanController = chairmanController;
    }


    public void showPayment() throws IOException {//Ejerskab Lasse
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
}









