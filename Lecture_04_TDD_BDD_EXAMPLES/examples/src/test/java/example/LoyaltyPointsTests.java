package example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class LoyaltyPointsTests {

    private static final LocalDate MONDAY = LocalDate.of(2024, 9, 2);     // poniedziałek
    private static final LocalDate WEDNESDAY = LocalDate.of(2024, 9, 4);  // środa

    // 1. Rounds down to full tens: 29 -> 2
    @Test
    void roundDownToFullTens() throws Exception {
        assertEquals(2,LoyaltyPoints.calculate(29,MONDAY));
    }
    // 2. Exact multiple of ten: 30 -> 3
    @Test
    void exactMultipleOfTen() throws Exception{
        assertEquals(3,LoyaltyPoints.calculate(30,MONDAY));
    }
    // 3. Below threshold: 9 -> 0
    @Test
    void belowTreshold() throws Exception{
        assertEquals(0,LoyaltyPoints.calculate(9,MONDAY));
    }
    // 4. Boundary case: 19 -> 1
    @Test
    void boundaryTest() throws Exception{
        assertEquals(1,LoyaltyPoints.calculate(19,MONDAY));
    }
    // 5. Negative amount -> throws exception
    @Test
    void throwExeption() throws Exception{
        assertThrows(Exception.class, ()->LoyaltyPoints.calculate(-1,MONDAY));
    }
    // 6. On Wednesday points are doubled (x2)
    @Test
    void onWednesdayTest() throws Exception{
        assertEquals(4,LoyaltyPoints.calculate(29,WEDNESDAY));
    }
    // 7. On Wednesday, but with no full tens: 9 -> 0 (not 2x0 = 0)
    @Test
    void onWednesdayTestBoundary() throws Exception{
        assertEquals(0,LoyaltyPoints.calculate(9,WEDNESDAY));
    }




//    // 1. Zaokrąglenie w dół: 29 -> 2
//    @Test
//    void floorsToFullTens() {
//        assertEquals(2, LoyaltyPoints.calculate(29, MONDAY));
//    }
//
//    // 2. Dokładna wielokrotność: 30 -> 3
//    @Test
//    void exactMultipleOfTen() {
//        assertEquals(3, LoyaltyPoints.calculate(30, MONDAY));
//    }
//
//    // 3. Poniżej progu: 9 -> 0
//    @Test
//    void belowThresholdIsZero() {
//        assertEquals(0, LoyaltyPoints.calculate(9, MONDAY));
//    }
//
//    // 4. Granica: 19 -> 1
//    @Test
//    void boundaryAtNineteenGivesOne() {
//        assertEquals(1, LoyaltyPoints.calculate(19, MONDAY));
//    }
//
//    // 5. Ujemna kwota -> wyjątek
//    @Test
//    void negativeAmountThrows() {
//        assertThrows(IllegalArgumentException.class, () -> LoyaltyPoints.calculate(-1, MONDAY));
//    }
//
//    // 6. W środę punkty x2
//    @Test
//    void wednesdayDoublesPoints() {
//        assertEquals(6, LoyaltyPoints.calculate(30, WEDNESDAY)); // 3 * 2
//    }
//
//    // 7. W środę, ale bez pełnej dziesiątki: 9 -> 0 (nie 2x0 = 0)
//    @Test
//    void wednesdayStillZeroWhenNoFullTen() {
//        assertEquals(0, LoyaltyPoints.calculate(9, WEDNESDAY));
//    }
}
