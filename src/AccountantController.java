import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;

public class AccountantController {

    private boolean isPaid = false;

    private int priceJunior = 1000;
    private int priceSenior = 1600;

    private int pensionAge = 60;
    private double pensionerDiscount = 0.75;
    private double pricePensionerActive = 1600 * pensionerDiscount;
    private double pricePensionerPassive = 500 * pensionerDiscount;
    private int pricePassiveMember = 500;

    private ChairmanController chairmanController;
    private UserInterface userInterface;

    public void setChairmanController(ChairmanController chairmanController) {
        this.chairmanController = chairmanController;
    }
    public AccountantController(UserInterface userinterface) {
        this.userInterface = userinterface;
    }

    public void calculatePrice() throws FileNotFoundException {
        Filehandler filehandler = new Filehandler();
        List<Motionist> motionists = filehandler.getMotionistSwimmers();
        for (int i = 0; i < motionists.size()-1; i++) {
            if (motionists.get(i).getAge() > 18 && motionists.get(i).getAge() < 60 && motionists.get(i).isActive()) {
                motionists.get(i).setMembershipPrice(priceSenior);
            } else if (motionists.get(i).getAge() > 18 && motionists.get(i).getAge() < 60 && !motionists.get(i).isActive()) {
                motionists.get(i).setMembershipPrice(pricePassiveMember);
            } else if(motionists.get(i).getAge() < 18 && motionists.get(i).isActive()){
                motionists.get(i).setMembershipPrice(priceJunior);
            } else if(motionists.get(i).getAge() < 18 && !motionists.get(i).isActive()){
                motionists.get(i).setMembershipPrice(pricePassiveMember);
            } else if (motionists.get(i).getAge() > 18 && motionists.get(i).getAge() > 60 && motionists.get(i).isActive()){
                motionists.get(i).setMembershipPrice(pricePensionerActive);
            } else if((motionists.get(i).getAge() > 18 && motionists.get(i).getAge() > 60 && !motionists.get(i).isActive())){
                motionists.get(i).setMembershipPrice(pricePensionerPassive);
            }
        }
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







