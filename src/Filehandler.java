import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandler {
public void runFileHandler() throws FileNotFoundException {
        ArrayList<CompetitiveSwimmer> competitorList = new ArrayList<>();
        File competitiveSwimmerList = new File("competitiveSwimmersList.csv");
        Scanner sc = new Scanner(competitiveSwimmerList);
        String str;
        String [] tokens;
        while(sc.hasNext()){
            CompetitiveSwimmer e = new CompetitiveSwimmer("Lasse", 1, "2002", true,
                    12.43, SwimmingDisiplines.CRAWL
                    , "Hillerød", "World-Cup");
            str = sc.nextLine();
            tokens = str.split(",");
            String name = tokens[0];
            e.setName(tokens[0]);
            int memberId = Integer.parseInt(tokens[1]);
            e.setMemberId(Integer.parseInt(tokens[1]));
            String dateOfBirth = tokens[2];
            e.setDateOfBirth(tokens[2]);
            boolean hasPaid = Boolean.parseBoolean(tokens[3]);
            e.setHasPaid(Boolean.parseBoolean(tokens[3]));
            double time = Double.parseDouble(tokens[4]);
            e.setTime(Double.parseDouble(tokens[4]));
            SwimmingDisiplines disipline = SwimmingDisiplines.valueOf(tokens[5]);
            e.setDiscipline(SwimmingDisiplines.valueOf(tokens[5]));
            String location = tokens[6];
            e.setLocation(tokens[6]);
            String competition = tokens[7];
            e.setCompetition(tokens[7]);
            competitorList.add(e);
            //Eksempel = int clientID = integer.parseInt(token[0]);
            //Eksempel = String = name = tokens[0]
            //EKsempel objekt = CompetitiveSwimmer e = new CompetitiveSwimmer(String name,)
        }
        sc.close();
        System.out.println(competitorList.toString());
    }

    }




