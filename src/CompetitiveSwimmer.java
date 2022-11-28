import java.util.ArrayList;

public class CompetitiveSwimmer extends Member{

    private String diciplin;
    private int time;

    //constructor
    public CompetitiveSwimmer (String diciplin, int time, String name, int yearOfBirth){
        this.diciplin = diciplin;
        this.time = time;
        this.setName(name);



    }

    public static ArrayList<Member> createSwimmers(){
        ArrayList<CompetitiveSwimmer> CompSwim = new ArrayList<>();
       // CompSwim.add("s")


        return null;
    }












}
