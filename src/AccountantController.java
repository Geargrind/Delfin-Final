public class accountantController {
    private boolean hasPaid = false;
    private double expenses;

    private int priceJunior = 1000;
    private int priceSenior = 1600;

    private int pensionerAge = 60;
    private double pensionerDiscount = 0.75;
    private double pricePensioner = 1600 * pensionerDiscount;
    private int pricePassiveMember = 500;

    private ChairmanController chairmanController;
    private UserInterface userinterface;

    public void setChairmanController(ChairmanController chairmanController) {
        this.chairmanController = chairmanController;

    }
