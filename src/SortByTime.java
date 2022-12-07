import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class SortByTime implements Comparator<File> {
    @Override
    public int compare(File o1, File o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();

        String substr1 = name1.substring(name1.length()-24, name1.lastIndexOf('.'));
        String substr2 = name2.substring(name2.length()-24, name2.lastIndexOf('.'));

        //This is a file name format for example:
        //XXXXX_XXXX_24_Mar_2019_13_02_25.txt

        Date d1 = null, d2 = null;
        SimpleDateFormat sdf = new SimpleDateFormat( "dd_MMM_yyyy_hh_mm_ss" , Locale.ENGLISH);

        try {
            d1 = sdf.parse(substr1);
            d2 = sdf.parse(substr2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (int)(d1.getTime() - d2.getTime());
    }
    
}
