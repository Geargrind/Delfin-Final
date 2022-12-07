import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;

public class AccountantController {

    private boolean isPaid = false;

    private int priceJunior = 1000;
    private int priceSenior = 1600;

    private int pensionAge = 60;
    private double pensionerDiscount = 0.75;
    private double pricePensioner = 1600 * pensionerDiscount;
    private int pricePassiveMember = 500;

    private ChairmanController chairmanController;
    private UserInterface userInterface;

    public void setChairmanController(ChairmanController chairmanController) {
        this.chairmanController = chairmanController;
    }
    public AccountantController(UserInterface userinterface) {
        this.userInterface = userinterface;
    }


    public void showPayment() throws FileNotFoundException {
        Filehandler filehandler = new Filehandler();
        List<CompetitiveSwimmer> competitiveSwimmers = filehandler.getCompetitiveSwimmers();
        List<Motionist> motionists = filehandler.getMotionistSwimmers();
        for (int i = 0; i < competitiveSwimmers.size(); i++) {
            competitiveSwimmers.sort(Comparator.comparing(CompetitiveSwimmer::isHasPaid));
        }
        System.out.println("\n---COMPETITIVE-SWIMMERS---\n");
        for ( CompetitiveSwimmer e : competitiveSwimmers ) {
            System.out.printf("\nName: %-10s\nHas paid membership fee: %b\n", e.getName(), e.isHasPaid());
        }
        for (int i = 0; i < motionists.size(); i++) {
            motionists.sort(Comparator.comparing(Motionist::hasPaid));
        }
        System.out.println("\n-----MOTIONISTS-----");
        for ( Motionist m : motionists ) {
            System.out.printf("\nName: %s\nHas paid membership fee: %b\n", m.getName(), m.isHasPaid());
        }
    }



}







