import java.util.ArrayList;

public class UserInterface {


    //method for top 5 ved ikke om den virker helt

    public void displayTop5(ArrayList<CompetitiveSwimmer> disciplines, ArrayList<CompetitiveSwimmer> competitiveMembers) {
        for (int i = 0; i < disciplines.size(); i++) {
            for (int j = 0; j < 5; j++) {
                if (disciplines.get(i) == competitiveMembers.get(j))
                    System.out.println((i + 1) + "# " + disciplines.get(i).getName() + ", ID: " + disciplines.get(i).getMemberId() + ", Time: " + disciplines.get(i).getTime());
            }

        }

    }
}
