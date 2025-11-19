package example.steps;

import example.Calculator;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSteps {
    private Calculator calculator;
    private int result;

    @Given("the calculator is started")
    public void startCalculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void addNumbers(int a, int b) {
        result = calculator.add(a, b);
    }

    @Then("the result should be {int}")
    public void verifyResult(int expected) {
        assertEquals(expected, result);
    }

    @When("I subtruct {int} and {int}")
    public void iSubtructAnd(int arg0, int arg1) {
        result = calculator.subtract(arg0, arg1);
    }
}
