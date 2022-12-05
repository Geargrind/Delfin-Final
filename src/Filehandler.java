import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Filehandler {


    public void run() {
        /*Try catch metode som læser og samtidige opretter en fil. Man kan indsætte noget tekst i en fil
        og så vil dette program udskrive det en consolen. Smart I know ;)
         */
        try {
            File fileReading = new File("Reading.txt");
            Scanner myReader = new Scanner(fileReading);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }



}



