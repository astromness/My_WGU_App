package com.example.my_wgu_app.Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
     /**
     *
     * @param dateString A Date In The Format Of MM/DD/YYYY
     * @return A Date Object Representing
     * @throws ParseException If dateString is not in the proper format a ParseException will be thrown
     */
    public Date string_to_Date(String dateString) {
        try {
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            return date1;
        }
        catch (ParseException e) {
            System.out.println("Invalid Format: "+dateString+" Is Not Like MM/DD/YYY");
            return null;
        }
    }
}
