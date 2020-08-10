
package timeMinusMain;

import com.github.lgooddatepicker.optionalusertools.DateHighlightPolicy;
import com.github.lgooddatepicker.zinternaltools.HighlightInformation;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Month;


class MyHighlightPolicy implements DateHighlightPolicy {

    int day, year;
    String month, descriptionEvent;

    MyHighlightPolicy(int day, String month, int year, String descriptionEvent) {
        this.day = day;
        this.year = year;
        this.month = month;
        this.descriptionEvent = descriptionEvent;
    }

    

    
    
    @Override
    public HighlightInformation getHighlightInformationOrNull(LocalDate date) {
        LocalDate localDate = LocalDate.of(year, Month.valueOf(month),day );
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);
        
        
        if (date.getDayOfYear() == dayOfYear) {
            return new HighlightInformation(Color.BLUE, Color.WHITE, "ITCO221 Take Home Test 2");
        }  
        return null;
    }

    
    
}
