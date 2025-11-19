package example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LoyaltyPoints {
    public static int calculate(double price, LocalDate date) throws Exception {
        if (price<0){
            throw new Exception();
        }
        if (date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            return (int) 2*((int)   price/10);
        }
        return (int) price/10;
    }
}






//public static int calculate(int amount, LocalDate date) {
//    if (amount < 0) {
//        throw new IllegalArgumentException("Amount cannot be negative");
//    }
//
//    // Round down to nearest ten and divide by 10
//    int basePoints = amount / 10;
//
//    // Double points on Wednesday, but only if basePoints > 0
//    if (date.getDayOfWeek() == DayOfWeek.WEDNESDAY && basePoints > 0) {
//        basePoints *= 2;
//    }
//
//    return basePoints;
//}