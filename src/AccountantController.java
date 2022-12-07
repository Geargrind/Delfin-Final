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






}







