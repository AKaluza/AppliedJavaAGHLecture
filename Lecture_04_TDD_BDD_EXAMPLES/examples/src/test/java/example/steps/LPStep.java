package example.steps;

import example.LoyaltyPoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LPStep {
    private LoyaltyPoints lp;
    private int result;


    @When("I calculate {int} and {int} and {int} and {int}")
    public void calcualteLoyaltyPoints(int a, int b, int c, int d) throws Exception {
        result = LoyaltyPoints.calculate(a,
                LocalDate.of(b, c, d));
    }

    @Then("the result should be {int}")
    public void verifyResult(int expected) {
        assertEquals(expected, result);
    }
}

