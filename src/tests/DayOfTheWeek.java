/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author teena
 */
public class DayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String date = "08/05/2015"; 
        
        
        String day = dayOfWeek(2015, 8, 5); 
        System.out.println("Uses the Calendar class:");
        System.out.println("The day of the week for " + date + " is " + day);
        
        String day01 = dayOfWeekUsingLocalDate(2015, 8, 5); 
        System.out.println("\nUses the LocalDate class:");
        System.out.println("The day of the week for " + date + " is " + day01);

    }
    
    public static String dayOfWeek(int year, int month, int day){
        Calendar c  = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String [] daysArray = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"}; 
        return daysArray[dayOfWeek-1];
    }
    
    public static String dayOfWeekUsingLocalDate(int year, int month, int day){
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().name();
    }
       
}

