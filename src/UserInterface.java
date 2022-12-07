import java.util.List;

public class UserInterface {


    //method for top 5 ved ikke om den virker helt

    public void displayTop5(List<CompetitiveSwimmer> disciplines, List<CompetitiveSwimmer> competitiveSwimmers) {
        for (int i = 0; i < disciplines.size(); i++) {
            for (int j = 0; j < 5; j++) {
                if (disciplines.get(i) == competitiveSwimmers.get(j))
                    System.out.println((i + 1) + "# " + disciplines.get(i).getName() + ", ID: " + disciplines.get(i).getMemberId() + ", Time: " + disciplines.get(i).getTime());
            }

        }

    }

    // accountant

    public void accountantMenu() {
        System.out.println("""    
                                
                Logged in as Accountant
                                
                1) View expected income
                2) View expected expenses
                3) View payments pending/outstanding
                9) Return to previous menu
                """);
    }
}
