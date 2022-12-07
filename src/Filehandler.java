import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Filehandler implements Comparator<CompetitiveSwimmer> {
public List<CompetitiveSwimmer> getCompetitiveSwimmers() throws FileNotFoundException {
        TrainerController trainerController = new TrainerController();
        ArrayList<CompetitiveSwimmer> competitorList = new ArrayList<>();
        File competitiveSwimmerFile = new File("competitiveSwimmersList.csv");
        Scanner sc = new Scanner(competitiveSwimmerFile);
        String str;
        String [] attributes;
        while(sc.hasNext()){
            str = sc.nextLine();
            attributes = str.split(":");
            String name = attributes[0];
            int memberId = Integer.parseInt(attributes[1]);
            String dateOfBirth = attributes[2];
            boolean hasPaid = Boolean.parseBoolean(attributes[3]);
            double time = Double.parseDouble(attributes[4]);
            String disipline = attributes[5];
            String location = attributes[6];
            String competition = attributes[7];
            String trainer = attributes[8];
            CompetitiveSwimmer competitiveSwimmer = new CompetitiveSwimmer(name, memberId, dateOfBirth, hasPaid, time, disipline, location, competition, trainer);
            competitorList.add(competitiveSwimmer);
            //Eksempel = int clientID = integer.parseInt(token[0]);
            //Eksempel = String = name = tokens[0]
            //EKsempel objekt = CompetitiveSwimmer e = new CompetitiveSwimmer(String name,)
        }
        sc.close();
        return competitorList;
    }
    public List<Motionist> getMotionistSwimmers() throws FileNotFoundException {
        ArrayList<Motionist> motionistList = new ArrayList<>();
        File motionistFile = new File("motionistList.csv");
        Scanner sc = new Scanner(motionistFile);
        String str;
        String [] attributes;
        while(sc.hasNext()){
            str = sc.nextLine();
            attributes = str.split(":");
            String name = attributes[0];
            int memberId = Integer.parseInt(attributes[1]);
            String dateOfBirth = attributes[2];
            boolean hasPaid = Boolean.parseBoolean(attributes[3]);;
            Motionist motionistSwimmer = new Motionist(name, memberId, dateOfBirth, hasPaid);
            motionistList.add(motionistSwimmer);
            //Eksempel = int clientID = integer.parseInt(token[0]);
            //Eksempel = String = name = tokens[0]
            //EKsempel objekt = CompetitiveSwimmer e = new CompetitiveSwimmer(String name,)
        }
        sc.close();
        return motionistList;
    }


    @Override
    public int compare(CompetitiveSwimmer o1, CompetitiveSwimmer o2) {
        return o1.getDiscipline().compareTo(o2.getDiscipline());
    }
}




